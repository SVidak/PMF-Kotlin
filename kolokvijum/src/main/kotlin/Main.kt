package com.kotlin.pmf

fun main() {
    val employees = parseEmployees("employees.csv")
    val portal = EmployeesPortal(employees)

    val department = Department("Engineering")
    println("Employees in Engineering Department: ${portal.getEmployeesByDepartment(department)}")
    println("Highest Paid Employee: ${portal.findHighestPaidEmployee()}")
    println("Employees with Salary between 50000 and 70000: ${portal.getEmployeesBySalaryRange(50000, 70000)}")
    println("Average Salary in Engineering Department: ${portal.calculateAverageSalaryByDepartment(department)}")
    println("Most Common Skills: ${portal.findMostCommonSkills()}")
}