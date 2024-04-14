package org.priya.api.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobsController {

    @Autowired
    private JobService jobService;
    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        return jobService.createJob(job);
    }

    @PutMapping("/jobs/{id}")
    public Job updateJob(@RequestBody Job job, @PathVariable Long id){
        // perform update job operation here
        jobService.updateJob(id, job);
        return job;
    }

    @DeleteMapping("/jobs/{id}")
    public String deleteJob(@PathVariable Long id){
        // perform delete operation here
        jobService.deleteJob(id);
        return "Job " + id + " Deleted!";
    }
}
