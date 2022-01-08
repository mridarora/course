import java.util.Random;

public abstract class CAI {
	protected static final int SIZE_OUROBOROS_KEYS = 2;
	protected static final int SIZE_CEREBUS_KEYS = 2;
		
	//---  Instance Variables   -------------------------------------------------------------------
		
	/** Index reference values for which protocol to use for each encryption type*/
	protected static final int OUROBOROS_KEY_ONE = 0;
	protected static final int OUROBOROS_KEY_TWO = 1;
	protected static final int CEREBUS_KEY_ONE = 0;
	protected static final int CEREBUS_KEY_TWO = 1;
	
	/**Assigned index reference value for which protocol the security site should use for that particular type*/
	protected int securitySiteOneCerebus;
	protected int securitySiteOneOuroboros;
	protected int securitySiteTwoCerebus;
	protected int securitySiteTwoOuroboros;
	protected int securitySiteThreeCerebus;
	protected int securitySiteThreeOuroboros;
		
	protected Random rand;
		
	//---  Constructors   -------------------------------------------------------------------------
		
	public CAI() {
		rand = new Random();
	}
	
}
