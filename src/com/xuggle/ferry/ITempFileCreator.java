package com.xuggle.ferry;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ayache
 */
public interface ITempFileCreator {
   
   File createTempFile(String prefix, String suffix, File directory) throws IOException;
   
   static class DefaultTempFileCreator implements ITempFileCreator{

        @Override
        public File createTempFile(String prefix, String suffix, File directory) throws IOException {
            return File.createTempFile(prefix, suffix, directory);
        }
       
   }
   
   static final class Builder{
       private static ITempFileCreator CREATOR = new DefaultTempFileCreator();

       static synchronized ITempFileCreator getDefault(){
           return CREATOR;
       }
       
       public static synchronized void setDefault(ITempFileCreator creator){
           CREATOR = creator;
       }
   }
}
