package com.kotlin.pmf

class EmployeesPortal(private val employees: List<Employee>) : EmployeesApi {

    override fun getEmployeesByDepartment(department: Department): List<Employee> {
        return employees.filter { it.department == department }
    }

    override fun findHighestPaidEmployee(): Employee? {
        return employees.maxByOrNull { it.salary }
    }

    override fun getEmployeesBySalaryRange(minSalary: Int, maxSalary: Int): List<Employee> {
        return employees.filter { it.salary in minSalary..maxSalary }
    }

    override fun calculateAverageSalaryByDepartment(department: Department): Double {
        val departmentEmployees = employees.filter { it.department == department }
        return departmentEmployees.map { it.salary }.average()
    }

    override fun findMostCommonSkills(): List<String> {
        val skillFrequency = employees.flatMap { it.skills }.groupingBy { it }.eachCount()
        val maxFrequency = skillFrequency.values.maxOrNull() ?: 0
        return skillFrequency.filter { it.value == maxFrequency }.keys.toList()
    }
}
