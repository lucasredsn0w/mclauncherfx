package MCLauncherFX.utils;
import java.io.*;
import java.awt.Graphics;
import java.util.*;
import com.sun.management.OperatingSystemMXBean; 
import sun.management.ManagementFactoryHelper;
import java.util.*;
import java.net.*;
import javax.swing.*;

public class MCLauncher {
    public static final int mb=1048576;
    public int GetProperMemory(){
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
    public int getjavaversion()
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
            if(username.matches(""))
            {
                int number;
                Random rand = new Random();
                number=rand.nextInt();
                username="Steve"+number;
                
                
                
            }
            else
            {
                
            }
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
	public void checkforupdate() throws IOException{
        URL url=new URL("http://lucasredsn0w.cscces.net/MCLauncherFX.txt");
        //读取MCLauncherFX.txt
        InputStreamReader isr=new InputStreamReader(url.openStream());
        BufferedReader br=new BufferedReader(isr);
        String s,version="beta2(0.1.3)";
        while((s=br.readLine())!=null){
            if(version.equals(s)==false){
            int n = JOptionPane.showConfirmDialog(null, "已经有新版本发布："+s+"是否更新？", "有新版本啦！",JOptionPane.YES_NO_OPTION);
            if(n==0){
                URL url1=new URL("http://lucasredsn0w.cscces.net/"+s+".jar");
  HttpURLConnection conn=(HttpURLConnection)url1.openConnection();
  conn.connect();
  //保存输入流的部分
  byte[] bytes=new byte[1024];
  BufferedInputStream bif=new BufferedInputStream(conn.getInputStream());
  int iNum=0;
  //将数据保存至硬盘
  String fileName=s+".jar";
  File file=new File("MCLauncherFX"+s+".jar");
  FileOutputStream fos=new FileOutputStream(file);
  while((iNum=bif.read(bytes,0,1024))!=-1){
   fos.write(bytes,0,iNum);   
  }
  //关闭输入流、输出流
  bif.close();
  fos.close();
  //提示用户
  JOptionPane.showMessageDialog(null,"更新完毕！请在本文件夹打开MCLauncherFX"+s+".jar");
            }
            }
        }
        br.close();
    }
       
}
