package net.projectsync.surveylink.repo;

import net.projectsync.surveylink.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
