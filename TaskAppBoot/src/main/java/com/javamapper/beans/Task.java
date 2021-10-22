package com.javamapper.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
 *  task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;
    
    private String title;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "due_date")
    private Date dueDate;
    
    private Integer status;
    
    private Long priority;

    private String description;

    
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "task")
    private CheckList checkList;

    public Task() {
	}

	public Task(Date startDate, Date dueDate, Integer status, Long priority, String description,
			CheckList checkList) {
		super();
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.status = status;
		this.priority = priority;
		this.description = description;
		this.checkList = checkList;
	}
	
	

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CheckList getCheckList() {
		return checkList;
	}

	public void setCheckList(CheckList checkList) {
		this.checkList = checkList;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", startDate=" + startDate + ", dueDate=" + dueDate + ", status=" + status
				+ ", priority=" + priority + ", description=" + description + ", checkList=" + checkList + "]";
	}
    

}
