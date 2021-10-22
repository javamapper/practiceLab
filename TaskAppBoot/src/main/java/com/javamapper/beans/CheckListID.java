package com.javamapper.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CheckListID implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "todo_id")
	private Long todoId;
    @Column(name = "task_id")
	private Long taskId;
	public Long getTodoId() {
		return todoId;
	}
	
	public CheckListID() {
	}
	
	public CheckListID(Long todoId, Long taskId) {
		super();
		this.todoId = todoId;
		this.taskId = taskId;
	}

	public void setTodoId(Long todoId) {
		this.todoId = todoId;
	}
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	
    
}
