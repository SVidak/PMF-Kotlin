package com.kotlin.pmf

interface EmployeesApi {
    fun getEmployeesByDepartment(department: Department): List<Employee>
    fun findHighestPaidEmployee(): Employee?
    fun getEmployeesBySalaryRange(minSalary: Int, maxSalary: Int): List<Employee>
    fun calculateAverageSalaryByDepartment(department: Department): Double
    fun findMostCommonSkills(): List<String>
}