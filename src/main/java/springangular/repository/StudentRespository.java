package springangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import springangular.domain.Employee;
import springangular.domain.Student;

/**
 * Created by kiran on 4/28/2015.
 */
@Repository
public interface StudentRespository extends JpaSpecificationExecutor<Student>,JpaRepository<Student, Long> {
}
