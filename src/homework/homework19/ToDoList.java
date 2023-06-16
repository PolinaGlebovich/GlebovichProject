package homework.homework19;

import java.util.List;

public class ToDoList {
    private List<ToDo> toDo;

    private int number;
    public ToDoList(List<ToDo> toDo, int number) {
        this.toDo = toDo;
        this.number = number;
    }
    public List<ToDo> getToDo() {
        return toDo;
    }

    public void setToDo(List<ToDo> toDo) {
        this.toDo = toDo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ToDoList() {
    }

}
