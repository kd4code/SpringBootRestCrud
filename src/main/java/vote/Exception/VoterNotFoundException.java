package vote.Exception;

public class VoterNotFoundException extends RuntimeException {

	public VoterNotFoundException() {
		super("Voter Is Not Listed Yet");
	}

}
