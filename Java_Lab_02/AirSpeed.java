package Java_Lab_02;
import java.util.Scanner;
public class AirSpeed {

    //Creating a constructor to initilize the variables:
    AirSpeed(int airSpeed, int waterSpeed, int steelSpeed){


    }

    //Methods for returning an particular values:
    static void getSeedAir(){

    }

    static void getSpeedWater(){

    }

    static void getSpeedInSteel(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        The following table shows the approximate speed of sound in air, water and steel.
			Medium 				Speed
			Air					1100 feet per second.
			Water				4900 feet per second.
			Steel				16,400 feet per second.

			Note: 
			->class DistanceField{
				getSpeedAir(){

				}
				getSpeeddWater(){

				}
				getSpeedInSteel(){

				}

			}
		Design a class that stores in a distance field the distance, in feet, traveled by
		a sound wave. The class should have the appropriate accessor ad mutator methods for 
		this fields.In addition, the class should have the following methods:
		-->getSpeedAir: This method should returns the number of seconds it would take a 
						sound wave to travel, in air, the distance stored in the distance 
						field.The formula to calculate the amount of time it will take the 
						sound wave to travel the specified distance in air is:
						Time = distance/1100
		-->getSpeedWater:This method should returns the number of sounds it would take a sound 
						 wave to travel, in water, the distance stored in the distance field.
						 The formula to calculate the amount of time it will take the sound wave
						 to travel the specified distance in water is:
						 Time = distance/4900
		-->getSpeedInSteel: This method should return the number of seconds it would take a 
							sound wave to travel, in steel, the distance stored in the distance
							field.The formula to calculate the amount of time it will take the 
							sound wave to travel the specified distance in air is:
							Time = distance/16400
		Write a program to demostrates the class. The program should display a menu allowing the 
		user to select air, water or steel.Once the user has made a selection, he or she should
		be asked to enter the distance a sound wave will travel in the selected medium.The program
		will then display the amount of time it will take. Check that the user has selected one of
		the available choices from the menu.
		 */
        

        sc.close();
    }
}
