import java.util.*;

public class Team{
	
	private List<Worker> workers;
	private University college;	

	public Team(){
		workers = new ArrayList<Worker>();
	}
	public University getUniversity(){
		return college;
	}
	public void setUniversity(University college){
		this.college = college;
	}
	public List<Worker> getWorkers(){
		return workers;
	}
	public void setWorkers(List<Worker> workers){
		this.workers = workers;
	}

	public void addWorker(Worker worker){
		workers.add(worker);
	}

	public String consultWorkersTeam(){
		String chain = "";

		for(Worker work : getWorkers()){
			chain = work.getName();
			if(!(work instanceof Treasurer)){
				chain = chain  + "\n" + work.consultData();
			}			
		}
		return chain;		
	}
}