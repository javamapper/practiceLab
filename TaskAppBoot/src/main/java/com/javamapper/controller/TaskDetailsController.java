package com.javamapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javamapper.beans.CheckList;
import com.javamapper.beans.CheckListID;
import com.javamapper.beans.Status;
import com.javamapper.beans.Task;
import com.javamapper.beans.TaskRequest;
import com.javamapper.beans.TaskResponse;
import com.javamapper.repository.CheckListRepository;
import com.javamapper.repository.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskDetailsController {
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	CheckListRepository checkListRepository;

	@RequestMapping("/alltask")
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}
	
	@PostMapping("/savetask")
	public TaskResponse saveTask(@RequestBody TaskRequest taskRequest) {
		Task task;
		try {
		 task = taskRepository.save(taskRequest.getRequestBody().getTask());
		}catch(Exception e) {
			e.printStackTrace();
			return new TaskResponse(new Status("Failed", 500));
		}
		return new TaskResponse(new Status("Succcessfully saved Id:"+task.getTaskId(), 200));
	}
	
	@PostMapping("/savetaskWithCheckList")
	public TaskResponse saveTaskWithCkeckList(@RequestBody TaskRequest taskRequest) {
		Task task;
		Task requestTask = taskRequest.getRequestBody().getTask();
		CheckList requestCheckList = requestTask.getCheckList();
		requestTask.setCheckList(null);
		try {
		 task = taskRepository.save(requestTask);
		 checkListRepository.save(requestCheckList);
		}catch(Exception e) {
			return new TaskResponse(new Status("Failed", 500));
		}
		return new TaskResponse(new Status("Succcessfully saved Id:"+task.getTaskId(), 200));
	}
	
	@RequestMapping("/checklist")
	public CheckList getCheckList(@RequestParam("todoId") String todoId,@RequestParam("taskId") String taskId) {
		return checkListRepository.findById(new CheckListID(Long.valueOf(todoId),Long.valueOf(taskId))).orElse(new CheckList());
	}
	
	@RequestMapping("/checklist/{todoId}")
	public CheckList getCheckListOfTaskId(@PathVariable("todoId") String todoId) {
		return checkListRepository.findByTodoId(Long.valueOf(todoId)).orElse(new CheckList());
	}
}
