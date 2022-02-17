package vote.Service;

import vote.Model.Voter;

public interface VoterService {
  
	public int saveVoter(Voter v);
	public Voter getVoter(int id);
	public void updateVoter(Voter v);
	public void deleteVoter(int id);
}
