public class Ex {
    int x = m1();
    int m1() {
    	System.out.println("m1 : x");
    	return 10 ;
    }
    {
    	System.out.println("NSB1");
    }
    public Ex() {
        System.out.println("NPC");

	}
    Ex(String s){
    	System.out.println("SPC");
    }
    int y =20 ;
    {
    	System.out.println("NSB2");
    }
    int z = 40 ;
}
/*
   compiler adding changes to NSMs in .classfile
Compiled from "Ex.java"
public class Ex {
  int x;

  int y;

  int z;

  int m1();
    Code:
       0: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #7                  // String m1 : x
       5: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: bipush        10
      10: ireturn

  public Ex();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_0
       6: invokevirtual #21                 // Method m1:()I
       9: putfield      #27                 // Field x:I
      12: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      15: ldc           #31                 // String NSB1
      17: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      20: aload_0
      21: bipush        20
      23: putfield      #33                 // Field y:I
      26: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      29: ldc           #36                 // String NSB2
      31: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      34: aload_0
      35: bipush        40
      37: putfield      #38                 // Field z:I
      40: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      43: ldc           #41                 // String NPC
      45: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      48: return

  Ex(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_0
       6: invokevirtual #21                 // Method m1:()I
       9: putfield      #27                 // Field x:I
      12: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      15: ldc           #31                 // String NSB1
      17: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      20: aload_0
      21: bipush        20
      23: putfield      #33                 // Field y:I
      26: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      29: ldc           #36                 // String NSB2
      31: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      34: aload_0
      35: bipush        40
      37: putfield      #38                 // Field z:I
      40: getstatic     #1                  // Field java/lang/System.out:Ljava/io/PrintStream;
      43: ldc           #43                 // String SPC
      45: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      48: return
}
*/
