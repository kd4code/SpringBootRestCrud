package vote;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import vote.Exception.AgeNotValidException;
import vote.Exception.VoterExistException;
import vote.Exception.VoterNotFoundException;

@Component
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value=VoterNotFoundException.class)
	public ResponseEntity<?> handleException(VoterNotFoundException vn)
	{
		return new ResponseEntity<>(vn.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=VoterExistException.class)
	public ResponseEntity<?> handleException(VoterExistException ve)
	{
		return new ResponseEntity<>(ve.getMessage(),HttpStatus.ALREADY_REPORTED);
	}

	@ExceptionHandler(value=AgeNotValidException.class)
	public ResponseEntity<?> handleException(AgeNotValidException an)
	{
		return new ResponseEntity<>(an.getMessage(),HttpStatus.CONFLICT);
	}
}
