package pojos;

public class Candidate {
	private int id;
	private String name, party;
	private int votes;
	
	public Candidate(int id, String name, String party, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}
	
	public Candidate(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}

	public Candidate(String name, String party) {
		super();
		this.name = name;
		this.party = party;
	}

	@Override
	public String toString() {
		return "Candidate Name : " + name + ", Party : " + party + ", Votes : " + votes;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParty() {
		return party;
	}
	
	public void setParty(String party) {
		this.party = party;
	}
	
	public int getVotes() {
		return votes;
	}
	
	public void setVotes(int votes) {
		this.votes = votes;
	}
}
