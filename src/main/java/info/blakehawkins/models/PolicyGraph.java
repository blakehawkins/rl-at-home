package info.blakehawkins.models;

import info.blakehawkins.Action;
import info.blakehawkins.State;
import info.blakehawkins.models.Job;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import java.util.HashMap;
import java.util.Set;
import org.apache.commons.lang3.tuple.ImmutablePair;

@Table
public class PolicyGraph
{
    @PrimaryKey
    Job job;

    Set<State>  states;
    Set<Action> actions;

    HashMap<ImmutablePair<State, Action>, State> graph;
}
