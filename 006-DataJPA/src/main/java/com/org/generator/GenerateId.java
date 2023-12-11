package com.org.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class GenerateId implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix="Course";
		String suffix = "";
		int i= 100;
		i = ++i;
		suffix = String.valueOf(i);
		return prefix+suffix;
	}

}
