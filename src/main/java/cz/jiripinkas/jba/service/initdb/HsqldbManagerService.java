package cz.jiripinkas.jba.service.initdb;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Service;

import cz.jiripinkas.jba.annotation.DevProfile;

@DevProfile
@Service
public class HsqldbManagerService {

//	@PostConstruct
//	public void getDbManager(){
//	   DatabaseManagerSwing.main(
//		new String[] { "--url", "jdbc:mysql:mem:test", "--user", "root", "--password", "root", "--noexit"});
//	}

}
