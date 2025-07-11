# Task Tracker CLI

A simple command-line application to manage your tasks using a JSON file for storage. Supports adding, updating, deleting, and listing tasks with status tracking (todo, in-progress, done).

## Features

- Add new tasks
- Update task descriptions
- Delete tasks
- Mark tasks as in-progress or done
- List all tasks or filter by status

## Usage

Run commands from the terminal:

task-cli add "Buy groceries"  
task-cli update 1 "Buy groceries and cook dinner"  
task-cli delete 1  
task-cli mark-in-progress 1  
task-cli mark-done 1  
task-cli list  
task-cli list done

## Storage

Tasks are saved in tasks.json in the current directory.

## Requirements

- Java 8 or higher
- No external libraries needed
