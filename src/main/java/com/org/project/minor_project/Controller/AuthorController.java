package com.org.project.minor_project.Controller;

import com.org.project.minor_project.Model.Author;
import com.org.project.minor_project.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/getAuthorData")
    public Author getAuthorData(@RequestParam("authorEmail") String email){
        return authorService.getAuthorData(email);
    }
}