package com.Rock.springboot;

import akka.actor.Props;
import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import org.springframework.batch.item.ItemProcessor;
import com.Rock.springboot.model.JobDetails;

public class JobDetailsItemProcessor implements ItemProcessor<JobDetails, JobDetails>{

	public JobDetails process(JobDetails result) throws Exception {
		
		
		System.out.println("Processing result :"+result);
		
		return result;
	}
	
			  static public class WhoToGreet {
				  
			    public final String who;

			    public WhoToGreet(String who) {
			    	
			        this.who = who;
			        
			    }
			  }

			  static public class Greet {
				  
			    public Greet() {
			    	
			    }
			  }
			  static public Props props() {
					
					return null;

						//return Props.create(JobDetailsItemProcessor.class, () -> new JobDetailsItemProcessor(message, printerActor));
						  }


}
