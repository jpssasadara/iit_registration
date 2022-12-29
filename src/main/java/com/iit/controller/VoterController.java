package com.iit.controller;

import com.iit.model.Voter;
import com.iit.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voters")
public class VoterController {

    @Autowired
    private VoterService voterService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Voter createVoter(@RequestBody Voter voter){
        return voterService.addVoter(voter);
    }

    @GetMapping
    public List<Voter> getVoters(){
        return voterService.findAllVoters();
    }

    @GetMapping("/{voterId}")
    public Voter getVoterByNic(@PathVariable String voterId ){
        return voterService.getVoterByVoterId(voterId);
    }

}
