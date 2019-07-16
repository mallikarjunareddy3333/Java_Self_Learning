package com.arjun.java.innerclasses;

public interface OuterInterface {

	interface Entry {
		public Object getKey();
		public Object getValue();	
		public Object getValue(Object value);
	}

}

class Test1 implements OuterInterface.Entry {

	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValue(Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
