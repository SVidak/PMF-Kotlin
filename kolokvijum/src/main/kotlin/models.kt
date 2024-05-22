package com.kotlin.pmf

data class Department(val departmentName: String)

@JvmInline
value class EmployeeID(val id: String)

data class Employee(
    val employeeId: EmployeeID,
    val name: String,
    val department: Department,
    val salary: Int,
    val skills: List<String>
)