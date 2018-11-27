package us.mattgreen.teams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import us.mattgreen.teams.service.TeamService;

import java.util.List;

@RestController
public class TeamsController {

    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getThanks() {
        return teamService.getAllTeams();
    }
    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeam(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/teams")
    public void addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
    }

}
