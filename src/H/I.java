package H;


public class I {

   private byte[] TRUX;


   public I(byte[] var1) {
      this.TRUX = new byte[var1.length];
      System.arraycopy(var1, 0, this.TRUX, 0, var1.length);
   }

   public I() {
      byte[] var1 = new byte[16];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = 0;
      }

      this.TRUX = var1;
   }

   public final byte[] I() {
      return this.TRUX;
   }

   public final int I(I var1) {
      if(this.I().length != var1.I().length) {
         return this.I().length - var1.I().length;
      } else {
         for(int var2 = 0; var2 < this.I().length; ++var2) {
            int var3;
            for(var3 = this.I()[var2]; var3 < 0; var3 += 256) {
               ;
            }

            int var4;
            for(var4 = var1.I()[var2]; var4 < 0; var4 += 256) {
               ;
            }

            if(var3 != var4) {
               return var3 - var4;
            }
         }

         return 0;
      }
   }

   public final String toString() {
      String var1 = "";

      for(int var2 = 0; var2 < this.I().length; ++var2) {
         int var3 = this.I()[var2];
         if(var3 < 0) {
            var3 += 256;
         }

         String var4 = Integer.toHexString(var3);
         if(var4.length() < 2) {
            var4 = 0 + var4;
         }

         var1 = var1 + var4;
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      return var1 instanceof I?this.I((I)var1) == 0:super.equals(var1);
   }

   public final I Z(I var1) {
      byte[] var2 = new byte[this.TRUX.length];
      System.arraycopy(this.TRUX, 0, var2, 0, this.TRUX.length);
      byte[] var3 = var1.I();
      int var4 = 0;

      for(int var5 = this.TRUX.length - 1; var5 >= 0; --var5) {
         int var6;
         for(var6 = var2[var5]; var6 < 0; var6 += 256) {
            ;
         }

         int var7;
         for(var7 = var3[var5]; var7 < 0; var7 += 256) {
            ;
         }

         var6 = var6 + var7 + var4;

         for(var4 = 0; var6 > 255; ++var4) {
            var6 -= 256;
         }

         var2[var5] = (byte)var6;
      }

      return new I(var2);
   }
}
