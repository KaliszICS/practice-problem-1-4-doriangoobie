import java.io.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getName(int line, String file) {
	    if (line > 3 || line < 1) {
	        return "";
	    }
	    FileReader a = null;
	    String b = "";
	    int c = 4 * line - 4;
	    try {
	        a = new FileReader(file);
	        int e;
	        int f = 0;
	        while (f < 2 + c) {
	            e = a.read();
	            if (e == 32 || e == 10) {
	                f += 1;
	            }
	            if (c - 1 < f && f < c + 2) {
	               b += (char)e;
	            }
	        }
	    }
	    catch (Exception e) {
	        System.out.println(e);
	    }
	    finally {
	        try {
	            if (a != null) {
	                a.close();
	            }
	        }
	   catch (Exception e) {
	        System.out.println(e);
	    }
	   }
	   if (line > 1) {
	       b = b.substring(1, b.length());
	   }
	   return b;
	}

public static int getNumber(int line, String file) {
	    if (line > 3 || line < 1) {
	        return -1;
	    }
	    FileReader a = null;
	    String b = "";
	    int c = 4 * line - 4;
	    try {
	        a = new FileReader(file);
	        int e;
	        int f = 0;
	        while (f < 4 + c) {
	            e = a.read();
	            if (e == 32 || e == 10) {
	                f += 1;
	            }
	            if (c + 2 < f && f < c + 4) {
	               b += (char)e;
	            }
	        }
	    }
	    catch (Exception e) {
	        System.out.println(e);
	    }
	    finally {
	        try {
	            if (a != null) {
	                a.close();
	            }
	        }
	   catch (Exception e) {
	        System.out.println(e);
	    }
	   }
	   if (line > 0 && line < 4) {
	       b = b.substring(1, b.length());
	   }
	   int m = Integer.parseInt(b);
	   return m;
	}
public static int getAge(int line, String file) {
	    if (line > 3 || line < 1) {
	        return -1;
	    }
	    FileReader a = null;
	    String b = "";
	    int c = 4 * line - 4;
	    try {
	        a = new FileReader(file);
	        int e;
	        int f = 0;
	        while (f < 3 + c) {
	            e = a.read();
	            if (e == 32 || e == 10) {
	                f += 1;
	            }
	            if (c + 1 < f && f < c + 3) {
	               b += (char)e;
	            }
	        }
	    }
	    catch (Exception e) {
	        System.out.println(e);
	    }
	    finally {
	        try {
	            if (a != null) {
	                a.close();
	            }
	        }
	   catch (Exception e) {
	        System.out.println(e);
	    }
	   }
	   if (line > 0 && line < 4) {
	       b = b.substring(1, b.length());
	   }
	   int m = Integer.parseInt(b);
	   return m;
	}
	public static void fileAppend(String output, String filename) {
	    PrintWriter a = null;
	    try {
	        a = new PrintWriter(new FileWriter(filename, true));
	        a.print(output);
	    }
	    catch (Exception e) {
	        System.out.println(e);
	    }
	    finally {
	        if (a != null) {
	            a.close();
	        }
	    }
	}
}
