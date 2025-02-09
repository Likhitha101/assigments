package trainingtasks;
class try {
	public static void main(String args[]) {
	String name;
	name="anurag";
	for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if( i%2==0) {
				ch=Character.toUpperCase(ch);
			}
			else {
				ch=Character.toLowerCase(ch);
			}
}
}
}