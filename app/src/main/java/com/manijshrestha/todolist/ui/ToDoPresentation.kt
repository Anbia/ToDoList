package com.manijshrestha.todolist.ui

import com.manijshrestha.todolist.data.Task

interface ToDoPresentation {

    fun showTasks(tasks: List<Task>)

    fun taskAddedAt(position: Int)

    fun scrollTo(position: Int)
}