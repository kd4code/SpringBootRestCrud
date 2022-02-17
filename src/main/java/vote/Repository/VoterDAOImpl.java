package vote.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vote.Exception.AgeNotValidException;
import vote.Exception.VoterExistException;
import vote.Exception.VoterNotFoundException;
import vote.Model.Voter;

@Repository
public class VoterDAOImpl implements VoterDAO {

	@Autowired
	SessionFactory sf;

	public int saveVoter(Voter v) {
		Session s = sf.openSession();
		s.beginTransaction();
		if (v.getAge() < 18)
			throw new AgeNotValidException();
		Voter v1 = s.get(Voter.class, v.getId());
		if (v1 != null)
			throw new VoterExistException();
		s.save(v);
		s.getTransaction().commit();
		s.close();
		return v.getId();
	}

	public Voter getVoter(int id) {
		Session s = sf.openSession();
		s.beginTransaction();
		Voter v1 = s.get(Voter.class, id);
		if (v1 == null)
			throw new VoterNotFoundException();
		s.getTransaction().commit();
		s.close();
		return v1;
	}

	@Override
	public void updateVoter(Voter v) {
		Session s = sf.openSession();
		System.out.println("Updated Data:"+v);
		s.beginTransaction();
		Voter v1 = s.get(Voter.class, v.getId());
		if (v1 == null)
			throw new VoterNotFoundException();
		v1.setAge(v.getAge());
		v1.setName(v.getName());
		s.update(v1);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void deleteVoter(int id) {
		Session s = sf.openSession();
		s.beginTransaction();
		Voter v1 = s.get(Voter.class, id);
		if (v1 == null)
			throw new VoterNotFoundException();
		s.delete(v1);
		s.getTransaction().commit();
		s.close();

	}

}
