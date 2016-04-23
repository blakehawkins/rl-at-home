package info.blakehawkins.controllers;

import info.blakehawkins.JobSpec;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Optional;

@Controller
public class NewJobController
{
    @RequestMapping("/new_job")
    public @ResponseBody
    JobSpec newJob(@RequestBody final Optional<String> jobName)
    {
        // If new job data has been passed, generate just a key.
        return new JobSpec();
    }
}
