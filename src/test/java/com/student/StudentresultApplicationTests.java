package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.student.controller.ResultController;
import com.student.model.Result;
import com.student.repository.ResultRepo;

@SpringBootTest
class StudentresultApplicationTests {

    @Autowired
    private ResultController restController;

    @MockBean
    private ResultRepo resultRepo;

    @Test
    void contextLoads() {
        Result actualValue = new Result();
        actualValue.setHallticketno("22ne67876");
        actualValue.setStudentName("rafi");
        actualValue.setJavamMarks("60");
        actualValue.setPythonMarks("80");
        actualValue.setDevopsMarks("80");

        when(resultRepo.save(any(Result.class))).thenReturn(actualValue);

        Result expectedValue = actualValue;
        
        assertEquals(expectedValue, restController.add(actualValue));
    }
}
