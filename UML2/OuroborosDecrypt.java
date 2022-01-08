
public class OuroborosDecrypt implements Decrypt {

	@Override
	public String decrypt(int am, String in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decrypt(int[] am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in+"";
		for(int i = 0; i < use.length(); i += am.length) {
			char[] next = new char[am.length];
			for(int j = 0; j < am.length; j++) {
				next[am[j]] = use.charAt(i + j);
			}
			out.append(new String(next));
		}
		return out.toString();
	}

}
