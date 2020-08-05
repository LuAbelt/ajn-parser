package I;

import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class J {

   public static final void I(N.I var0, N.Z var1) {
      Deflater var2 = new Deflater(-1);
      byte[] var3 = new byte[1024];
      byte[] var4 = new byte[1024];
      if(var0.available() == 0) {
         var2.finish();
      }

      while(!var2.finished()) {
         int var5;
         if(var2.needsInput() && var0.available() > 0) {
            var5 = Math.min(var0.available(), var3.length);
            var0.read(var3, 0, var5);
            var2.setInput(var3, 0, var5);
            if(var0.available() == 0) {
               var2.finish();
            }
         }

         var5 = var2.deflate(var4);
         var1.write(var4, 0, var5);
      }

   }

   public static final void Z(N.I var0, N.Z var1) {
      Inflater var2 = new Inflater();
      byte[] var3 = new byte[1024];
      byte[] var4 = new byte[1024];
      int var5 = var0.read(var3);
      var2.setInput(var3, 0, var5);

      while(!var2.finished()) {
         if(var2.needsInput()) {
            var5 = var0.read(var3);
            var2.setInput(var3, 0, var5);
         }

         try {
            int var6 = var2.inflate(var4);
            var1.write(var4, 0, var6);
         } catch (DataFormatException var7) {
            System.out.print("invalid data");
            // throw new IOException(I.I(1797)); // invalid data
         }
      }

   }
}
