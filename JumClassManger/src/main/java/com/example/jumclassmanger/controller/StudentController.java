package com.example.jumclassmanger.controller;

import com.example.jumclassmanger.bean.Student;
import com.example.jumclassmanger.bean.StudentVo;
import com.example.jumclassmanger.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "学生管理部分")
public class StudentController {
    @Autowired
    StudentService studentService;

    /**
     * 得到所有学生的信息
     *
     * @return
     */
    @ApiOperation("获取所有学生所有消息")
    @GetMapping("/getAllMsgs")
    public List<StudentVo> getAllMsgs() {
        return studentService.selectAllStudent();
    }

    @ApiOperation("通过学号获取学生所有消息")
    @GetMapping("/getAllMsgsBySno")
    public List<StudentVo> getAllMsgsBySno(String sno){
        return studentService.getAllMsgsBySno(sno);
    }

    @ApiOperation("通过课程号获取学生所有消息")
    @GetMapping("/getAllMsgsByCno")
    public List<StudentVo> getAllMsgsByCno(String cno){
        return studentService.getAllMsgsByCno(cno);
    }

    @ApiOperation("通过学生名字获取学生消息")
    @GetMapping("/getStudentByName")
    public Student searchStudentByName(String name) {
        return studentService.searchStudentByName(name);
    }

    @ApiOperation("通过班级查询学生")
    @GetMapping("/getStudentByClass")
    public List<Student> searchStudentByClass(Integer classid) {
        return studentService.searchStudentByClass(classid);
    }

    @ApiOperation("更新学生信息")
    @PutMapping("/updateStudent")
    public String updateStudent(Student student) throws JSONException {
        int flag =  studentService.updateByPrimaryKey(student);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "学生修改成功");
        } else {
            check.put("check", "学生修改失败");
        }
        return check.toString();
    }

    @ApiOperation("获取所有学生")
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentService.selectAll();
    }

    @ApiOperation("添加学生")
    @PutMapping("/addStudent")
    public String addStudent(Student student) throws JSONException {
        int flag = studentService.insert(student);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "学生添加成功");
        } else {
            check.put("check", "学生添加失败");
        }
        return check.toString();
    }

    @ApiOperation("通过学号删除学生")
    @DeleteMapping("/deleteStudentBySno")
    public String deleteStudentBySno(String sno) throws JSONException {

        int flag = studentService.deleteByPrimaryKey(sno);
        JSONObject check = new JSONObject();
        if (flag == 1) {
            check.put("check", "学生删除成功");
        } else {
            check.put("check", "学生删除失败");
        }
        return check.toString();
    }

    @ApiOperation("通过学号获取学生信息")
    @GetMapping("/getStudentBySno")
    public List<Student> getStudentBySno(String sno) throws JSONException {
        List<Student> students = new ArrayList<Student>();

        students.add(studentService.selectByPrimaryKey(sno));
        return students;

    }

}
