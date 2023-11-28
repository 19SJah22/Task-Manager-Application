package com.mycompany.fa2;
import java.io.Serializable;

public class TaskDataBase implements Serializable{
    private String taskName;
    private String dueDate;
    private String category;
    private String description;
    private String completionStatus;

    public TaskDataBase() {
       
    }

    public TaskDataBase(String taskName, String dueDate, String category, String description, String completionStatus) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.category = category;
        this.description = description;
        this.completionStatus = completionStatus;
    }

    // Getter method for taskName
    public String getTaskName() {
        return taskName;
    }

    // Setter method for taskName
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // Getter method for dueDate
    public String getDueDate() {
        return dueDate;
    }

    // Setter method for dueDate
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Getter method for category
    public String getCategory() {
        return category;
    }

    // Setter method for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter method for description
    public String getDescription() {
        return description;
    }

    // Setter method for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter method for completionStatus
    public String isCompletionStatus() {
        return completionStatus;
    }

    // Setter method for completionStatus
    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }
}
