package vote.Exception;

public class VoterExistException extends RuntimeException {

	public VoterExistException() {
		super("Voter Exist ALready ");
	}
}
