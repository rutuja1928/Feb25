package tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Dao.CandidateDao;
import Dao.CandidateDaoimpl;
import pojos.Candidate;

public class FetchCandidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandidateDao dao = new CandidateDaoimpl();

        try {
            // Insert a new candidate
            System.out.println("=== Insert New Candidate ===");
            System.out.print("Enter Candidate ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Party: ");
            String party = sc.nextLine();

            System.out.print("Enter Votes: ");
            int votes = sc.nextInt();

            Candidate c = new Candidate();
            c.setId(id);
            c.setName(name);
            c.setParty(party);
            c.setVotes(votes);

            dao.insertCandidate(c);
            
            // Update candidate (updating the candidate just inserted)
            System.out.println("=== Update Candidate ===");
            System.out.print("Enter Candidate ID to update: ");
            int updateId = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter new Name: ");
            String newName = sc.nextLine();

            System.out.print("Enter new Party: ");
            String newParty = sc.nextLine();

            System.out.print("Enter new Votes: ");
            int newVotes = sc.nextInt();

            Candidate updatedCandidate = new Candidate();
            updatedCandidate.setId(updateId);
            updatedCandidate.setName(newName);
            updatedCandidate.setParty(newParty);
            updatedCandidate.setVotes(newVotes);

            dao.updateCandidate(updatedCandidate);
            
            
         // Delete candidate
            System.out.println("=== Delete Candidate ===");
            System.out.print("Enter Candidate ID to delete: ");
            int deleteId = sc.nextInt();

            dao.deleteCandidate(deleteId);
            
            
            // Fetch and display all candidates
            System.out.println("\n=== All Candidates ===");
            List<Candidate> candidates = dao.getAllCandidates();

            System.out.println("\nID\tName\t\tParty\t\tVotes");
            System.out.println("----------------------------------------------------");
            for (Candidate candidate : candidates) {
                System.out.println(candidate);
            }

        } catch (SQLException e) {
            System.out.println(" Error: " + e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}
