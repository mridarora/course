
public class SiteTwo extends CAI {
	private static final int[] OUROBOROS_ONE = new int[] {3, 1, 0, 2};
	private static final int[] OUROBOROS_TWO = new int[] {2, 5, 4, 1, 3, 0};
	private static final int CEREBUS_ONE = 18;
	private static final int CEREBUS_TWO = 31;
	
	public SiteTwo() {
		super();
	}
	
	public void simulateCAI() {
		assignSiteTwoCerebusKey(rand.nextInt(SIZE_CEREBUS_KEYS));
		assignSiteTwoOuroborosKey(rand.nextInt(SIZE_OUROBOROS_KEYS));
	}
	
	public String receiveOuroborosMessageSiteTwo(String in) {
		return decryptMessageOuroboros(securitySiteTwoOuroboros, in);
	}
	
	public String receiveCerebusMessageSiteTwo(String in) {
		return decryptMessageCerebus(securitySiteTwoCerebus, in);
	}
	
	public String sendOuroborosMessageSiteTwo(String in) {
		return encryptMessageOuroboros(securitySiteTwoOuroboros, in);
	}
	
	public String encryptMessageOuroboros(int type, String message) {
		OuroborosEncrypt o = new OuroborosEncrypt();
		switch(type) {
			case OUROBOROS_KEY_ONE:
				return o.encrypt(OUROBOROS_ONE, message);
			case OUROBOROS_KEY_TWO:
				return o.encrypt(OUROBOROS_TWO, message);
			default:
				return null;
		}
	}
	
	public String decryptMessageCerebus(int type, String message) {
		CerebusDecrypt c = new CerebusDecrypt();
		switch(type) {
			case OUROBOROS_KEY_ONE:
				return c.decrypt(CEREBUS_ONE, message);
			case OUROBOROS_KEY_TWO:
				return c.decrypt(CEREBUS_TWO, message);
			default:
				return null;
		}
	}
	
	public String decryptMessageOuroboros(int type, String message) {
		OuroborosDecrypt o = new OuroborosDecrypt();
		switch(type) {
			case OUROBOROS_KEY_ONE:
				return o.decrypt(OUROBOROS_ONE, message);
			case OUROBOROS_KEY_TWO:
				return o.decrypt(OUROBOROS_TWO, message);
			default:
				return null;
		}
	}
	
	public String sendCerebusMessageSiteTwo(String in) {
		return encryptMessageCerebus(securitySiteOneCerebus, in);
	}
	
	public String encryptMessageCerebus(int type, String message) {
		CerebusEncrypt c = new CerebusEncrypt();
		switch(type) {
			case CEREBUS_KEY_ONE:
				return c.encrypt(CEREBUS_ONE, message);
			case CEREBUS_KEY_TWO:
				return c.encrypt(CEREBUS_TWO, message);
			default:
				return null;
		}
	}
	
	private void assignSiteTwoCerebusKey(int type) {
		securitySiteTwoCerebus = type;
	}
	
	private void assignSiteTwoOuroborosKey(int type) {
		securitySiteTwoOuroboros = type;
	}
}

