package springangular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springangular.domain.Employee;
import springangular.repository.EmployeeRespository;

import java.util.List;

/**
 * Created by kiran on 4/28/2015.
 */
@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @Autowired
    private EmployeeRespository employeeRespository;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> fetchAllEmployees(Model model){

        return employeeRespository.findAll();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public void saveEmployee(@RequestBody Employee employee,Model model){

        employeeRespository.save(employee);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id")Long id,Model model){
        Employee employee=employeeRespository.findOne(id);
        employeeRespository.delete(employee);
    }


}
