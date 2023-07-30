package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		
		//UserSave Code
		
// 		User user1=new User();
//		user1.setName("Nishita Maheshwari");
//    	user1.setCity("Delhi");
//    	user1.setStatus("I am java Programming");
//    	
//    	
//		
//		User user2=new User();
//		user2.setName("Nishitavbn");
//		user2.setCity("Bomby");
//		user2.setStatus("I am java");
//
//		
//		
//		//User resultUser=userRepository.save(user2);
//		
//		//saving single user
//		List<User> users=List.of(user1,user2);
//		Iterable<User>result=userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//			
//		});
//		
//		
//	//	System.out.println("saved user"+ resultUser);
//		System.out.println("done");
		
		
		
		
		
		//Update the user of id 3
		
		
//		
//        Optional<User> optional=userRepository.findById(3);
//        User user=optional.get();
//        
//        user.setName("Nishiita");
//        
//        User result = userRepository.save(user);
//        
//        System.out.println(result);
		
		
		
		
		//how to get the data
		//findById(id) -return optional Containing your data
		
		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
		
		//second method
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//				
//			}
//			
//		});
		
		
		
		//method 3 Using lambda function
		
//		itr.forEach(user -> { System.out.println(user);} );
		
		
		
		
		
		
		
		
		
		//Deleting the user element
		
		
//		userRepository.deleteById(3);
//		System.out.println("deleted");
		
	//method 2	
//		Iterable<User> allusers=userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		
//		userRepository.deleteAll(allusers);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<User> users=userRepository.findByName("Nishita");		
//		users.forEach(e->System.out.println(e));
		
		List<User> allUser= userRepository.getAllUser();
		allUser.forEach(e->{
			System.out.println(e);
			
		});
		
		System.out.println("---------------------------");
		
		List<User> userByName= userRepository.getUserByName("Karan");
		userByName.forEach(e->{
			System.out.println(e);
			
		});
	
		
		System.out.println("");
		userRepository.getUsers().forEach(e-> System.out.println(e));
	}

}
