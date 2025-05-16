package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbconnection.CandidateDBConnection;
import pojos.Candidate;

public class CandidateDaoimpl implements CandidateDao {

    @Override
    public void insertCandidate(Candidate c) throws SQLException {
        CandidateDBConnection.openConnection();
        Connection connection = CandidateDBConnection.getConnection();

        String query = "INSERT INTO candidates (id, name, party, votes) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setInt(1, c.getId());
        pst.setString(2, c.getName());
        pst.setString(3, c.getParty());
        pst.setInt(4, c.getVotes());

        pst.executeUpdate();
        System.out.println("✅ Candidate inserted successfully.");

        pst.close();
        CandidateDBConnection.closeConnection();
    }

    @Override
    public void updateCandidate(Candidate c) throws SQLException {
        CandidateDBConnection.openConnection();
        Connection con = CandidateDBConnection.getConnection();

        // Updated query: now includes 4 placeholders.
        String query = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, c.getName());
        pst.setString(2, c.getParty());
        pst.setInt(3, c.getVotes());
        pst.setInt(4, c.getId());

        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("✅ Candidate updated successfully.");
        } else {
            System.out.println("⚠️ Candidate with ID " + c.getId() + " not found.");
        }

        pst.close();
        CandidateDBConnection.closeConnection();
    }
    
    

    @Override
	public void deleteCandidate(int id) throws SQLException {
    	CandidateDBConnection.openConnection();
        Connection con = CandidateDBConnection.getConnection();

        
        String query = "delete from candidates WHERE id=?";
        PreparedStatement pst = con.prepareStatement(query);

        
        pst.setInt(1, id);

        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(" Candidate deleted successfully.");
        } else {
            System.out.println("Candidate with ID " +id+ " not found.");
        }

        pst.close();
        CandidateDBConnection.closeConnection();
    }
		
	

	@Override
    public List<Candidate> getAllCandidates() throws SQLException {
        List<Candidate> list = new ArrayList<>();
        CandidateDBConnection.openConnection();
        Connection con = CandidateDBConnection.getConnection();

        String query = "SELECT * FROM candidates";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            Candidate c = new Candidate(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("party"),
                rs.getInt("votes")
            );
            list.add(c);
        }

        rs.close();
        stmt.close();
        CandidateDBConnection.closeConnection();
        return list;
    }
}
