package gr.atc.training.hashMapList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UsersHashMap {

	private ArrayList<User> users = null;
	private HashMap<String,User> usersHM = null;
	
	public UsersHashMap() {
		
		FileInputStream f = null;
		try {
			f = new FileInputStream(new File("users.json"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(f));
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson jsonReader = new Gson();
		UserListWrapper ulw = jsonReader.fromJson(line, new TypeToken<UserListWrapper>(){}.getType());
		users = (ArrayList<User>) ulw.getUsers();
		
		// Create users hashmap
		usersHM = new HashMap<String,User>();
		for (int i = 0; i < users.size(); i++) {
			String uname = users.get(i).getUsername();
			if (usersHM.get(uname) != null) {
				System.out.println("WARNING, duplicate usernames");
			}
			usersHM.put(uname,users.get(i));
		}
	}
	
	public void printUsers() {
		System.out.println("Total users: " + users.size());
		for (int i=0; i<users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
	
	
	public User getUserByUsername(String username) {
		return usersHM.get(username);
	}
}
