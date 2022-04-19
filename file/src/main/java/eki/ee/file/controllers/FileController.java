package eki.ee.file.controllers;

import eki.ee.file.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/file")
@Controller
// controller class which makes http api
public class FileController {


    @Autowired
    FileService fileService  ;


    //  this method reads accounts
    @GetMapping(value = "/readJsonFile", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity getJsonFile () throws Exception {
        return new ResponseEntity(fileService.readJsonFile(), HttpStatus.OK);
    }
  }