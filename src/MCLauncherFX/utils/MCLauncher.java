package MCLauncherFX.utils;
import java.io.*;
import java.awt.Graphics;
public class MCLauncher {
	public static void start(String username,int maxmem,String javapath,boolean isjavaboot)throws IOException{
		
		
                

            Process pid = null; 
		String cmddebug = "java -Xmx"+maxmem+"M -cp .\\.minecraft\\bin\\jinput.jar;.\\.minecraft\\bin\\lwjgl.jar;.\\.minecraft\\bin\\lwjgl_util.jar;.\\.minecraft\\bin\\minecraft.jar -Djava.library.path=\".\\.minecraft\\bin\\natives\" net.minecraft.client.Minecraft "+username;
		String cmd = "javaw -Xmx"+maxmem+"M -cp .\\.minecraft\\bin\\jinput.jar;.\\.minecraft\\bin\\lwjgl.jar;.\\.minecraft\\bin\\lwjgl_util.jar;.\\.minecraft\\bin\\minecraft.jar -Djava.library.path=\".\\.minecraft\\bin\\natives\" net.minecraft.client.Minecraft "+username;
		Runtime run = Runtime.getRuntime();
                if(isjavaboot==true)
                {
		Process process = run.exec(cmddebug);
                }
                else
                {
                Process process = run.exec(cmd);
                }
	}
       
}
