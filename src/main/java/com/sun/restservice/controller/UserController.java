package com.sun.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.restservice.entity.Recordings;
import com.sun.restservice.entity.ResponseEntity;
import com.sun.restservice.entity.User;
import com.sun.restservice.repository.RecordingRepositery;
import com.sun.restservice.repository.UserRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;
    
    @Autowired
    private RecordingRepositery rrepository;

//    @GetMapping
//    public ResponseEntity findAll() {
//    	ResponseEntity ref=new ResponseEntity();
//    	ref.setId(0);
//    	ref.setMessage("access denied");
//    	return ref;
//         }

    @PostMapping(path = "/{email_id}/{password}")
    public ResponseEntity userLogin(@PathVariable("email_id") String email_id,@PathVariable("password") String password) {
    	//System.out.println(emailid+"---------"+password);
    	User ua=repository.findOne(email_id);
    	ResponseEntity re=new ResponseEntity();
    	re.setStatus(0);;
    	re.setMessage("username and password Mismatch");
    	//System.out.println(ua.getEmailid()+"----object-----"+ua.getPassword());
    	try{
    	if(email_id.equalsIgnoreCase(ua.getEmail_id())&&password.equalsIgnoreCase(ua.getPassword())){
    		re.setStatus(1);
        	re.setMessage("User Login Success");
    		//System.out.println("in if Condition");
    	}
    	}catch(Exception e){
    		re.setStatus(3);
        	re.setMessage("user does not Exist");
    	}
        return re;
    }
   
  //    @GetMapping(path = "/{username}/{password}")
//    public User find(@PathVariable("username") String username,@PathVariable("password") String password) {
//        return repository.findOne(username);
//    }
   
    
    /** Used to insert user data into database */
    @PostMapping(consumes = "application/json")
    public ResponseEntity create(@RequestBody User user) {
    	System.out.println(user.getName()+""+user.getEmail_id()+""+user.getPregnancy_week()+""+user.isFirst_time_pregnancy()+""+user.isActive_status()+"geeting result from client");
    	user.getName();
    	ResponseEntity rec=new ResponseEntity();
    	rec.setStatus(0);
    	rec.setMessage("Used id already existed");
    	
    	if(!findByUser(user.getEmail_id())){
    		repository.save(user);
    		rec.setStatus(1);
        	rec.setMessage("Register success");
    		
    	}
    	        return rec;
    }
    
    
    public boolean findByUser(String emailid) {
    	boolean flag=false;
    	System.out.print(emailid);
    	User ua=repository.findOne(emailid);
    	try{
    	if(emailid.equalsIgnoreCase(ua.getEmail_id())){
    		flag=true;
    		System.out.println(flag+"in if Condition");
    	}
    	}catch(Exception e){ System.out.println(e+"exception in findByUser Method");}
		System.out.println(flag+"if outer");
        return flag;
    }
      
    
    		/**  method for store recording */
   
//    @PostMapping(consumes = "application/json")
//    public ResponseEntity createRecording(@RequestBody Recordings recb) {
//    	ResponseEntity rece=new ResponseEntity();
//    	rrepository.save(recb);
//    	return rece;
//    }
    
    
//    @DeleteMapping(path = "/{username}")
//    public void delete(@PathVariable("username") String username) {
//        repository.delete(username);
//    }

//    @PutMapping(path = "/{username}")
//    public User update(@PathVariable("username") String username, @RequestBody User user) throws BadHttpRequest {
//        if (repository.exists(username)) {
//            user.setEmailid(username);
//            return repository.save(user);
//        } else {
//            throw new BadHttpRequest();
//        }
//    }

}