package info.blakehawkins.controllers;

import info.blakehawkins.JobSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Optional;

@RestController
public class NewJobController
{
    private CassandraTemplate template;

    @Autowired
    public NewJobController(CassandraTemplate template)
    {
        this.template = template;
    }

    @RequestMapping(value = "/new_job", method = RequestMethod.POST)
    public JobSpec newJob(@RequestBody final Optional<String> jobName)
    {
        // If new job data has been passed, generate just a key.
        return new JobSpec();
    }
}
