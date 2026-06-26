package Java.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class GameData {
    public static void main(String[] args) {
        JSONObject character = new JSONObject();
        character.put("name", "Lara");
        character.put("class", "Croft");
        character.put("level", 14);
        character.put("isAlive", true);
        
        JSONArray inventory = new JSONArray();
        
        JSONObject item1 = new JSONObject();
        item1.put("itemName", "Phoenix Staff");
        item1.put("type", "Weapon");
        item1.put("damage", 45);
        
        JSONObject item2 = new JSONObject();
        item2.put("itemName", "Mana Potion");
        item2.put("type", "Consumable");
        item2.put("damage", 0);
        
        inventory.put(item1);
        inventory.put(item2);
        
        character.put("inventory", inventory);
        
        JSONObject gameProfile = new JSONObject();
        gameProfile.put("characterProfile", character);
        
        System.out.println(gameProfile.toString(4));
    }
}
