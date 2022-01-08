
public class CerebusDecrypt implements Decrypt {
	private static final int CEREBUS_ONE = 18;
	private static final int CEREBUS_TWO = 31;
	private static final int CEREBUS_INIT_VALUE = 32;
	private static final int CEREBUS_ALPH_SIZE = 128;

	@Override
	public String decrypt(int am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in.toLowerCase();
		for(char a : use.toCharArray()) {
			out.append((char)(((a - am  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
		}
		return out.toString();
	}

	@Override
	public String decrypt(int[] am, String in) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
