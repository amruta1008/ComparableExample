package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.team.Team;

public class DisplayMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		final Set<Team> st = new TreeSet<Team>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			String str = sc.nextLine();
			list.add(str);
			String[] strarr = str.split("\\|");
			Team t = new Team(strarr[0]);
			st.add(t);
		}
		Iterator<Team> i = st.iterator();
		while (i.hasNext()) {
			Team team = new Team();
			Team t = i.next();
			String str = t.getName();
			for (int j = 0; j < list.size() ; j++) {
				String[] strarr = list.get(j).split("\\|");
				Team t1 = new Team(strarr[0]);
				String str1 = t1.getName();
				if (str.equals(str1)) {
					team.addPlayer(strarr[1]);
				}

			}
			System.out.println(t);
			Collections.sort(team.getPlayerList());
			for (int j = 0; j < team.getPlayerList().size(); j++) {
				System.out.println(team.getPlayerList().get(j));
			}

		}
	}
}
