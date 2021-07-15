package io.javabrains.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository <Team, Long>{
    // Because CrudRepository already has a similar method and because Team
    // is an entity, it will automatically find a team for us when we execute this method
    Team findByTeamName(String teamName);
}
