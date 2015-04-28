package springangular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springangular.domain.Student;
import springangular.repository.StudentRespository;

import java.util.List;

/**
 * Created by kiran on 4/28/2015.
 */
@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentRespository studentRespository;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> fetchAllStudents(Model model){

        return studentRespository.findAll();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student,Model model){

        studentRespository.save(student);

    }
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id")Long id,Model model){
        Student student=studentRespository.findOne(id);
        studentRespository.delete(student);
    }

}
