package com.javamapper.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "checklists")
public class CheckList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***
	 * todo_id INT AUTO_INCREMENT, task_id INT, todo VARCHAR(255) NOT NULL,
	 * is_completed BOOLEAN NOT NULL DEFAULT FALSE, PRIMARY KEY (todo_id , task_id),
	 * FOREIGN KEY (task_id) REFERENCES tasks (task_id) ON UPDATE RESTRICT ON DELETE
	 * CASCADE
	 */
	 @EmbeddedId
	 private CheckListID checkListID;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todo_id", insertable = false, updatable = false)
	private Long todoId;
	
	private String todo;

	@Column(name = "is_completed")
	private Boolean completed;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "task_id", nullable = false, insertable = false, updatable = false)
	@JsonBackReference
	private Task task;


	public Long getTodoId() {
		return todoId;
	}
	
	public void setTodoId(Long todoId) {
		this.todoId = todoId;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public CheckListID getCheckListID() {
		return checkListID;
	}

	public void setCheckListID(CheckListID checkListID) {
		this.checkListID = checkListID;
	}
	
}
