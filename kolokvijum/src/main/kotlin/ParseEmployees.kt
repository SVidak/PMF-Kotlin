package com.kotlin.pmf

import FileReader

fun parseEmployees(fileName: String): List<Employee> {
    return FileReader.readFileInResources(fileName).drop(1).map { line ->
        val columns = line.split(",")
        val id = EmployeeID(columns[0])
        val name = columns[1]
        val department = Department(columns[2])
        val salary = columns[3].toInt()
        val skills = columns[4].split("|")

        Employee(id, name, department, salary, skills)
    }
}