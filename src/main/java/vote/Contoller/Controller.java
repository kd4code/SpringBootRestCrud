package vote.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vote.Model.Voter;
import vote.Service.VoterService;

@RestController
public class Controller {
   @Autowired
   VoterService vs;
   
   @PostMapping("/check")
   public String check()
   {
	 return "Successfully Executed";  
   }
   @PostMapping("/register")
   public ResponseEntity<?> saveVoter(@RequestBody Voter v)
   {
	 int id=vs.saveVoter(v); 
	 return new ResponseEntity<>("Data Registered Successfully with Id:"+v.getId(),HttpStatus.ACCEPTED);
   }
   
   @GetMapping("/voter/{id}")
   public ResponseEntity<Voter> getVoter(@PathVariable int id)
   {
	 Voter v1=vs.getVoter(id);
	 return new ResponseEntity<Voter>(v1,HttpStatus.OK);
   }
   
   @PutMapping("/update")
   public ResponseEntity<?> updateVoter(@RequestBody Voter v)
   {
     vs.updateVoter(v);
     return new ResponseEntity<>("Voter Data Updated Successfully",HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<?> deleteVoter(@PathVariable int id)
   {
     vs.deleteVoter(id);
     return new ResponseEntity<>("Voter Data Deleted Successfully",HttpStatus.OK);
   }
}
