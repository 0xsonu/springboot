package org.priya.api.job;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
//    ArrayList<Job> jobs = new ArrayList<>();
    @Autowired
    JobRepository jobRepository;


    public List<Job> getAllJobs() {
        return  jobRepository.findAll();
    }

    public String createJob(Job job){
        jobRepository.save(job);
        return "Job Created";
    }

    public Job findById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    public boolean updateJob(Long id, Job updatedJob){
        Optional<Job> job = jobRepository.findById(id);
        if(job.isPresent()){
            Job newJob = job.get();
            newJob.setTitle(updatedJob.getTitle());
            newJob.setDescription(updatedJob.getDescription());
            newJob.setMaxSalary(updatedJob.getMaxSalary());
            newJob.setMinSalary(updatedJob.getMinSalary());
            newJob.setLocation(updatedJob.getLocation());
            jobRepository.save(newJob);
            return true;
        }
        return false;
    }

    public boolean deleteJob(Long id){
        try {
            jobRepository.deleteById(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
