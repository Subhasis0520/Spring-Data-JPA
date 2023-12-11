package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.dao.AccountDao;
import com.org.entity.Account;
import com.org.entity.CompositeId;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountDao dao = context.getBean(AccountDao.class);
		
		CompositeId cid = new CompositeId();
		cid.setAid(101);
		cid.setAccountNumber(1342010);
		
		Account ac = new Account();
		ac.setAHolderName("Gopal ghosh");
		ac.setBranch("PNB");
		ac.setId(cid);
		
		dao.save(ac);
	}

}
