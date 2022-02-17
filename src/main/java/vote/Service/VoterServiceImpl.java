package vote.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.Model.Voter;
import vote.Repository.VoterDAO;

@Service
public class VoterServiceImpl implements VoterService {

	@Autowired
	VoterDAO vd;

	public int saveVoter(Voter v) {
		return vd.saveVoter(v);
	}

	public Voter getVoter(int id) {
		return vd.getVoter(id);
	}

	@Override
	public void updateVoter(Voter v) {
		vd.updateVoter(v);

	}

	@Override
	public void deleteVoter(int id) {
		vd.deleteVoter(id);

	}

}
