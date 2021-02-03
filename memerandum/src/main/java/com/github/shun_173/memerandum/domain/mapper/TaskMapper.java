package com.github.shun_173.memerandum.domain.mapper;

import com.github.shun_173.memerandum.domain.entity.Task;

public interface TaskMapper {

    public void insert(Task entity);

    public Task selectById(String taskId);

}
