package Dao;

import java.sql.SQLException;
import java.util.List;
import pojos.Candidate;

public interface CandidateDao {
    List<Candidate> getAllCandidates() throws SQLException;
    void insertCandidate(Candidate c) throws SQLException;
    void updateCandidate(Candidate c) throws SQLException;
    void deleteCandidate(int id) throws SQLException;
}
