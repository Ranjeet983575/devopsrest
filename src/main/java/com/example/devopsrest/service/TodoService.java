package com.example.devopsrest.service;

import com.example.devopsrest.entity.Todo;
import com.example.devopsrest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo todo) {

        Todo todo1 = new Todo();
        todo1.setId(1L);
        todo1.setTitle("Example Title");
        todo1.setStatus(false);
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, Todo todo) {
        if (todoRepository.existsById(id)) {
            todo.setId(id);
            return todoRepository.save(todo);
        } else {
            return null; // Or throw an exception
        }
    }

    public boolean deleteTodo(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
            return true;
        } else {
            return false; // Or throw an exception
        }
    }
}
