package com.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ipl {
	@Value("rcb")
	private String teamName;
	@Value("virat")
	private String teamCaptain;
	@Value("#{temp}")
	private List<String> playerName;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCaptain() {
		return teamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
	
	public List<String> getPlayerName() {
		return playerName;
	}
	public void setPlayerName(List<String> playerName) {
		this.playerName = playerName;
	}
	/*@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + ", playerName=" + playerName + "]";
	}*/
	
	/*public Ipl() {
		
	}*/
	

}
