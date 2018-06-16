import java.io.IOException;
import java.security.NoSuchProviderException;
import org.bouncycastle.openpgp.PGPException;


public class Test {

	public static void main(String[] args) throws Exception {
		
		
		TestBCOpenPGP ob1 = new TestBCOpenPGP();
		ob1.encrypt();
		ob1.decrypt();
		ob1.signAndVerify();
	}

}
