package edu.handong.csee.java.lab06;

import java.util.Scanner;

public class BugInfestation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double vol_house = 0;
		double GROWTH_RATE = 0.95;
		double vol_aRoach = 0.002;
		double init_num_roach = 0;
		double total_num_roach = 0;
		double total_vol_roach = 0;
		int cnt_week = 0;
		double new_num_roach = 0;
		double new_vol_roach = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Type in volume of house: ");
		vol_house = keyboard.nextDouble();

		System.out.print("Type in start population of roaches: ");
		init_num_roach = keyboard.nextDouble();

		System.out.print("Start population of roaches is " + init_num_roach + ".\n");
		System.out.print("Volume of house is " + vol_house + ".\n");

		total_num_roach = init_num_roach;
		total_vol_roach = total_num_roach * vol_aRoach;

		while (total_vol_roach < vol_house) {
			new_num_roach = total_num_roach * GROWTH_RATE;
			new_vol_roach = new_num_roach * vol_aRoach;
			total_num_roach = total_num_roach + new_num_roach;
			total_vol_roach = total_vol_roach + new_vol_roach;
			cnt_week++;
		}

		System.out.print("Weeks lasted till roaches overflow is " + cnt_week + ".\n");
		System.out.print("Total population of roaches is " + total_num_roach + ".\n");
		System.out.print("Total volume of roaches is " + total_vol_roach + ".\n");
	}

}
