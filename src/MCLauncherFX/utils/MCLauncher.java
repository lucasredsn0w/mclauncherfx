package MCLauncherFX.utils;
import java.io.*;
import java.awt.Graphics;
import java.util.*;
import com.sun.management.OperatingSystemMXBean; 
import sun.management.ManagementFactoryHelper;




public class MCLauncher {
    public static final int mb=1048576;
    public static int GetProperMemory(){
        OperatingSystemMXBean osmxb =  (OperatingSystemMXBean) ManagementFactoryHelper.getOperatingSystemMXBean(); 
        long totalmem = osmxb.getFreePhysicalMemorySize()/mb;
        
                
        if(totalmem<=512)
            return 256;
        else if(totalmem<=1024)
            return 512;
        else if(totalmem<=2048)
            return 1024;
        else if (totalmem<=4096)
            return 2048;
        return 1;
                
    }
    public static int getjavaversion()
    {
        String javaVersion = System.getProperty("java.version");  
        // version String should look like "1.4.2_10"   
        if (javaVersion.contains("1.7.")) {  
            return 17; 
        }  
        else if (javaVersion.contains("1.6.")) {  
           return 16;
        }  
        else {  
            // else leave 1.5 as default (it's either 1.5 or unknown)   
           return 1;
        }  
      

    }
    
    
        
    
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
