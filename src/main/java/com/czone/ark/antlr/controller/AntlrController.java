package com.czone.ark.antlr.controller;

import com.czone.ark.antlr.service.AntlrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/antlr")
public class AntlrController {

    private AntlrService antlrService;

    @Autowired
    public AntlrController(AntlrService antlrService) {
        this.antlrService = antlrService;
    }

}
