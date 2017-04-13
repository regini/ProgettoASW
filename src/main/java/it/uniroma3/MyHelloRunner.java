package it.uniroma3;

   import org.springframework.stereotype.Component;
   import org.springframework.boot.CommandLineRunner;
   
   @Component
   public class MyHelloRunner implements CommandLineRunner {
	   
      public void run(String[] args) {
          System.out.println("Hello, world!");
      }
}
