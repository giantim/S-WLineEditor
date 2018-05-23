package original;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import junit.framework.*;
import java.io.*;

public class Cmd_DriverTest  {

//	@Test
//	public void Deletetest() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE       = new File_Buffer();
//		Init_Exit Start_End    = new Init_Exit(args,FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd temp = new UserCmd();
//		String comMsg[] = new String[5];
//		for (int i = 0; i < 4; i++)
//			comMsg[i] = FILE.GetLine(i);
//		temp.setCmdName('D');
//		temp.setIntArgs(10, 1);
//		testDriver.RunCmd(FILE, temp);
//		String afterMsg[] = new String[5];
//		for (int i = 0; i < 3; i++)
//			afterMsg[i] = FILE.GetLine(i);
//		for (int i = 0; i < 3; i++)
//			assertEquals(comMsg[i], afterMsg[i]);
//	}
	
//	@Test
//	public void EndNumtest() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End    = new Init_Exit(args,FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd temp = new UserCmd();
//		temp.setIntArgs(2, 1);
//		FILE.CLN = 3;
//		int i, CLN, end, count = 0;
//		CLN=FILE.GetCLN();
//        end=Math.min(CLN+temp.getIntArgs(1)-1,FILE.NumLins());
//        for(i=CLN; i<end; i++)
//        {
//            FILE.DelLine(CLN);
//            count++;
//        }
//        FILE.SetCLN( Math.min(CLN,FILE.NumLins()) );
//		assertEquals(2, count);
//	}
	
//	@Test
//	public void ValidLinesOk1test() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End    = new Init_Exit(args,FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd temp = new UserCmd();
//		temp.setCmdName('Z');
//		temp.setIntArgs(0, 1);
//		boolean Ok1 = true;
//		Ok1 = (temp.getIntArgs(1) >= 1);
//		assertEquals(true, !Ok1);
//	}
	
//	@Test
//	public void Findtest() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		testCmd.setIntArgs(3, 1);
//		testCmd.setStrArgs("", 1);
//		int i, CLN, end;
//		CLN=FILE.GetCLN();
//		end=Math.min(CLN+testCmd.getIntArgs(1),FILE.NumLins());
//		assertEquals(3, end);
//		System.out.println(end);
//		System.out.println(CLN);
//		for(i=CLN; i<=end; i++) 
//        {
//           if((FILE.GetLine(i)).indexOf(testCmd.getStrArgs(1)) >= 0) 
//           {
//              Msg.wMsg("" + i + ": ");
//              Msg.wLMsg(FILE.GetLine(i));
//           }
//        }
//	}
//	
//	@Test
//	public void Replacetest1() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		String comStr = FILE.GetLine(4);
//		testCmd.setCmdName('R');
//		testCmd.setStrArgs("strawberry", 1);
//		testCmd.setStrArgs("pencil", 2);
//		testCmd.setIntArgs(4, 1);
//		testDriver.RunCmd(FILE, testCmd);
//		String afterStr = FILE.GetLine(4);
//		assertEquals(comStr, afterStr);
//	}
//	
//	@Test
//	public void Replacetest2() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		String comStr = FILE.GetLine(4);
//		testCmd.setCmdName('R');
//		testCmd.setStrArgs("pencil", 1);
//		testCmd.setStrArgs("grapefruit", 2);
//		testCmd.setIntArgs(3, 1);
//		testDriver.RunCmd(FILE,  testCmd);
//		String afterStr = FILE.GetLine(4);
//		assertEquals(comStr, afterStr);
//	}
//	
//	@Test
//	public void Replacetest3() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		String comStr = FILE.GetLine(2);
//		testCmd.setCmdName('R');
//		testCmd.setStrArgs("banana", 1);
//		testCmd.setStrArgs("ananan", 2);
//		testCmd.setIntArgs(2,1);
//		testDriver.RunCmd(FILE, testCmd);
//		String afterStr = FILE.GetLine(2);
//		assertEquals(comStr, afterStr);
//	}
//	
//	@Test
//	public void Ordertest1() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		String comStr[] = new String[4];
//		comStr[0] = "apple";
//		comStr[1] = "banana";
//		comStr[2] = "grape";
//		comStr[3] = "strawberry";
//		testCmd.setCmdName('O');
//		testCmd.setIntArgs(4, 1);
//		testDriver.RunCmd(FILE, testCmd);
//		String afterStr[] = new String[4];
//		for (int i = 1; i <= 4; i++)
//			afterStr[i-1] = FILE.GetLine(i);
//		assertEquals(comStr, afterStr);
//	}
//	
//	@Test
//	public void Ordertest2() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		String comStr[] = new String[3];
//		comStr[0] = "apple";
//		comStr[1] = "grape";
//		comStr[2] = "strawberry";
//		testCmd.setCmdName('O');
//		testCmd.setIntArgs(3, 1);
//		testDriver.RunCmd(FILE, testCmd);
//		String afterStr[] = new String[3];
//		for (int i = 1; i <= 3; i++)
//			afterStr[i-1] = FILE.GetLine(i);
//		assertEquals(comStr, afterStr);
//	}
//	
//	@Test
//	public void Margintest() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		testCmd.setCmdName('M');
//		testCmd.setIntArgs(10, 1);
//		testCmd.setIntArgs(50, 2);
//		testDriver.RunCmd(FILE, testCmd);
//		assertEquals(10, testDriver.Margin_Left);
//		assertEquals(50, testDriver.Margin_Right);
//	}
//	
//	@Test
//	public void DefaultMargintest() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		assertEquals(1, testDriver.Margin_Left);
//		assertEquals(80, testDriver.Margin_Right);
//	}
	
//	@Test
//	public void Helptest1() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		testCmd.setCmdName('H');
//		testCmd.setOptArgs(null, 1);
//		testDriver.RunCmd(FILE, testCmd);
//	}
//	
//	@Test
//	public void Helptest2() throws IOException
//	{
//		String args[] = {"f"};
//		File_Buffer FILE = new File_Buffer();
//		Init_Exit Start_End = new Init_Exit(args, FILE);
//		Cmd_Driver testDriver = new Cmd_Driver();
//		UserCmd testCmd = new UserCmd();
//		testCmd.setCmdName('H');
//		testCmd.setOptArgs("a", 1);
//		testDriver.RunCmd(FILE, testCmd);
//	}
	
	@Test
	public void DoUpdatetest() throws IOException
	{
		String args[] = {"f"};
		File_Buffer FILE = new File_Buffer();
		Init_Exit Start_End = new Init_Exit(args, FILE);
		Cmd_Driver testDriver = new Cmd_Driver();
		UserCmd testCmd = new UserCmd();
		int i, Nlines, comp;
		int count = 0;
		Nlines=FILE.NumLins();
		comp = Nlines;
        if (Nlines == 0)
           Msg.ERROR(2);
        else
           for(i=1; i<Nlines; i++)
               count++;
        assertEquals(comp, count);
	}
}
