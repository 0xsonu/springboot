package org.priya.api.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobsController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        return jobService.createJob(job);
    }

    @PutMapping("/jobs/{id}")
    public Job updateJob(@RequestBody Job job, @PathVariable int id){
        // perform update job operation here
        return job;
    }

    @DeleteMapping("/jobs/{id}")
    public String deleteJob(@PathVariable int id){
        // perform delete operation here
        return "Job " + id + " Deleted!";
    }


}
