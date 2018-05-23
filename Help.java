package original;

import java.io.*;

public class Help
/****************************************************************************
*  AUTH:  Truly, Yours                    DATE:  Oct. 1999                  *
*  DEPT:  Computer Science, CS-200        ORG.:  Colorado State University  *
*****************************************************************************
*                                                                           *
*  FILE:  Help.java                                                         *
*                                                                           *
*  DESC:  Contains the member functions for the Help Class.        .        *
*                                                                           *
****************************************************************************/
{

  //***************************************************************************
  public static void General()
  {
	  Msg.wMsg(
			  "Write with valid command");
	  System.out.println();
  }

  //***************************************************************************
  public static void Command(char cmd)
  {
	  switch (Character.toUpperCase(cmd))
	  {
	  case 'Q':
		  Msg.wMsg(
				  "Terminates editing and updates the edit fle with the editing changes");
		  break;
	  case 'X':
		  Msg.wMsg(
				  "Terminates editing and does NOT update the edit fle. The changes are ignored.");
		  break;
	  case 'T':
		  Msg.wMsg(
				  "Positions CLN to the top of the file");
		  break;
	  case 'E':
		  Msg.wMsg(
				  "Positions CLN to the end/bottom of the file");
		  break;
	  case 'N':
		  Msg.wMsg(
				  "Moves CLN number of lines forward / down the file");
		  break;
	  case 'B':
		  Msg.wMsg(
				  "Moves CLN number of lines backwards/up the file");
		  break;
	  case 'W':
		  Msg.wMsg(
				  "Prints At Edit File Line x where x is the value of CLN");
		  break;
	  case 'C':
		  Msg.wMsg(
				  "Prints Total Edit File Lines: x where x is number iof lines in the edit file");
		  break;
	  case 'L':
		  Msg.wMsg(
				  "List/Print number of file lines starting at CLN");
		  break;
	  case 'S':
		  Msg.wMsg(
				  "Show/Prints number of file lines starting at CLN");
		  break;
	  case 'D':
		  Msg.wMsg(
				  "Deletes the number of file lines starting at CLN leaves CLN positioned to the line after the last line deleted");
		  break;
	  case 'A':
		  Msg.wMsg(
				  "Add lines to the edit file AFTER the CLN line number");
		  break;
	  case 'F':
		  Msg.wMsg(
				  "Finds and prints the line, or lines staring at CLN that contain one or more occurrences of the string");
		  break;
	  case 'R':
		  Msg.wMsg(
				  "Finds and replaces all occurrences of the old string with the new string starting at CLN");
		  break;
	  case 'Y':
		  Msg.wMsg(
				  "Yanks and COPIES the lines starting at CLN to the internal line buffer");
		  break;
	  case 'Z':
		  Msg.wMsg(
				  "Yanks and DELETES the lines starting at CLN to the internal line buffer");
		  break;
	  case 'P':
		  Msg.wMsg(
				  "Puts the entire contents of the internal line buffer after the CLN and leaves CLN positioned to the last line put");
		  break;
	  case 'I':
		  Msg.wMsg(
				  "Indexes the keywords at the top of the edit file");
		  break;
	  case 'K':
		  Msg.wMsg(
				  "Keyword prints the line numbers from the keyword table created by the I");
		  break;
	  case 'O':
		  Msg.wMsg(
				  "Orders/Sorts the lines L-H lexicographically stating at the CLN");
		  break;
	  case 'M':
		  Msg.wMsg(
				  "Sets column margins/window, does not affet CLN");
		  break;
	  default:
		  Msg.wMsg(
				  "Not valid command");
		  break;
	  }
	  System.out.println();
  }

} // EndClass Help
