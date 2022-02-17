package vote;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import vote.Contoller.Controller;
import vote.Model.Voter;
import vote.Repository.VoterDAO;
import vote.Repository.VoterDAOImpl;
import vote.Service.VoterServiceImpl;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstDemoApplication.class, args);
	}

}
