import java.util.*;

public class Staff{

	private List<Team> teams;
	
	public Staff(){
		teams = new ArrayList<Team>();
	}
	public List<Team> getTeams(){
		return teams;
	}
	public void setTeams(List<Team> teams){
		this.teams = teams;
	}	
}