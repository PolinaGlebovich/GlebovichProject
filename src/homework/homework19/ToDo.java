package homework.homework19;
public class ToDo {
    private String date;
    private String task;
    private String priority;
    private String status;

    public ToDo(String date, String tasks, String priority, String status) {
        this.date = date;
        this.task = tasks;
        this.priority = priority;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "date='" + date + '\'' +
                ", Tasks='" + task + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public ToDo() {
    }
}

