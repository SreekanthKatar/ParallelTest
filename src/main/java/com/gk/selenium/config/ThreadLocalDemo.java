package com.gk.selenium.config;
 
import org.testng.annotations.Test;
 
public class ThreadLocalDemo {
    @Test
    public void testMethod1() {
        invokeBrowser("http://www.ndtv.com");
    }
 
    @Test
    public void testMethod2() {
        invokeBrowser("http://www.facebook.com");
 
    }
    
    @Test
    public void testMethod3() {
        invokeBrowser("http://www.google.com");
 
    }
    
    @Test
    public void testMethod4() {
        invokeBrowser("http://www.mail.google.com");
 
    }
    
    @Test
    public void testMethod5() {
        invokeBrowser("http://www.rediff.com");
 
    }
 
    private void invokeBrowser(String url) {
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
        LocalDriverManager.getDriver().get(url);
 
    }
}