package ch.fhnw.openci.modules.mymodulebundle;

import org.openci.core.OpenCI;

public class Launcher {

	public static void main(String[] args) {
		OpenCI.main(args);
		OpenCI.register(Test.class);
	}

}
