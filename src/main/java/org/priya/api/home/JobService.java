package org.priya.api.home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    ArrayList<Job> jobs = new ArrayList<>();

    public List<Job> getAllJobs() {
        return  jobs;
    }

    public String createJob(Job job){
        jobs.add(job);
        return "Job Created";
    }

    public Job findById(Integer id){
        for(Job j : jobs) {
            if(j.getId() == id) return j;
        }
        return null;
    }
}
