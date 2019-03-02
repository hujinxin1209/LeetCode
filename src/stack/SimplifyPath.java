package stack;

import org.xml.sax.helpers.ParserAdapter;

//In a UNIX-style file system, a period . refers to the current directory. 
//Furthermore, a double period .. moves the directory up a level
//Input: "/home/"
//Output: "/home"
//Explanation: Note that there is no trailing slash after the last directory name.
//Input: "/../"
//Output: "/"
//Explanation: Going one level up from the root directory is a no-op, 
//as the root level is the highest level you can go.
public class SimplifyPath {
	public static String simplifyPath(String path) {
		String[] dir = path.split("/");
		String[] stack = new String[dir.length];
		int ptr = 0;
		
		for(int i = 0; i < dir.length; i++) {
			if(dir[i].equals(".") || dir[i].equals("")) {
				continue;
			} else if(dir[i].equals("..")) {
				if(ptr > 0) ptr--;
			} else {
				stack[ptr] = dir[i];
				ptr++;
			}
		}
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < ptr; i++) {
			builder.append("/");
			builder.append(stack[i]);
		}
		
		return builder.length() == 0 ? "/" : builder.toString();
	}
	public static void main(String[] args) {
		String string = "/a/./b/../../c/";
		System.out.println(simplifyPath(string));
	}
}
