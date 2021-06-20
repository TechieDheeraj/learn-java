class Demo {
  static { // JVM executes this block first
    System.out.println("Hello world");
  }
  // Static methods are called without creating class objects
  // String args[] -> input as string
  /*
   * Different ways of writing main method
   * 1. static public void main(String args[])
   * 2. static public void main(String []args)
   * 3. static public void main(String ...args)
   *
   */
  public static void main(String args[]) { // then main will be executed
    System.out.println("Wassup ?");
  }
}
