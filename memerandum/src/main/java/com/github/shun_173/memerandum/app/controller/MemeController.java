package com.github.shun_173.memerandum.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.shun_173.memerandum.domain.entity.Task;
import com.github.shun_173.memerandum.domain.mapper.TaskMapper;

@Controller
public class MemeController {

    private TaskMapper taskMapper;

    public MemeController(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    public String create(@PathVariable("id") String id, Model model) {
        Task task = taskMapper.selectById(id);
        model.addAttribute("title", task.getTitle());
        return "index";
    }

}
