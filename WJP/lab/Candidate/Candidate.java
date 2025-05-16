package pojos;

public class Candidate {
    private int id;
    private String name;
    private String party;
    private int votes;

    // No-arg constructor
    public Candidate() {}

    // Parameterized constructor
    public Candidate(int id, String name, String party, int votes) {
        this.id = id;
        this.name = name;
        this.party = party;
        this.votes = votes;
    }

    // Getters and setters
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

    // toString for display
    @Override
    public String toString() {
        return id + "\t" + name + "\t\t" + party + "\t\t" + votes;
    }
}
