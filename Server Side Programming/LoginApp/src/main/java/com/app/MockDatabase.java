package com.app;
import java.util.HashMap;

public class MockDatabase {
    // Stores Username (Key) and Password (Value)
    public static HashMap<String, String> users = new HashMap<>();
    
    // Let's add a default admin user just for testing
    static {
        users.put("admin", "1234");
    }
}