/*
* File: TodoService.java
* Author: Ragány Dávid Gergő
* Copyright: 2023, Ragány Dávid Gergő
* Group: Szoft II-1-E
* Date: 2024-01-12
* Github: https://github.com/raganydavid/Paclient
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class TodoService {
    public TodoService() {
        DataService dataService = new DataService();
        String todos  = dataService.getTodos();

        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);
        for(Todo todo: todoList) {
            System.out.println(todo.userId);
            System.out.println(todo.id);
            System.out.println(todo.title);
            System.out.println(todo.completed);
            System.out.println("");
        }
    }
}
