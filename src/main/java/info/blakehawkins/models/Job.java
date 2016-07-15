package info.blakehawkins.models;

import info.blakehawkins.Status;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.mapping.Indexed;
import java.util.Optional;
import java.util.UUID;

@Table
public class Job
{
    @PrimaryKey UUID id;
    @Indexed Optional<String> properName;

    Optional<PolicyGraph> policyGraph = Optional.empty();

    public Job()
    {
        this.id         = UUID.randomUUID();
        this.properName = Optional.empty();
    }

    public Job(String properName)
    {
        this.id         = UUID.randomUUID();
        this.properName = Optional.of(properName);
    }

    public Status addPolicyGraph(PolicyGraph pg)
    {
        this.policyGraph = Optional.of(pg);

        return new Status("Okay.");
    }
}
