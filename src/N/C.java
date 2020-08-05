package N;

import java.io.IOException;

public class C {

   private A TRUX;


   public C(A var1) {
      this.TRUX = var1;
   }

   public final int I() throws IOException {
      return this.TRUX.I();
   }

   public final int I(byte[] var1) throws IOException {
      return this.TRUX.I(var1);
   }

   public final int Z() throws IOException {
      int var1 = this.I();
      var1 += this.I() << 8;
      var1 += this.I() << 16;
      var1 += this.I() << 24;
      return var1;
   }

   public final long C() throws IOException {
      long var1 = 0L;
      var1 += (long)this.I();
      var1 += (long)this.I() << 8;
      var1 += (long)this.I() << 16;
      var1 += (long)this.I() << 24;
      var1 += (long)this.I() << 32;
      var1 += (long)this.I() << 40;
      var1 += (long)this.I() << 48;
      var1 += (long)this.I() << 56;
      return var1;
   }

   public final double B() throws IOException {
      return Double.longBitsToDouble(this.C());
   }

   public final int D() throws IOException {
      int var1 = this.TRUX();
      if(var1 < 0) {
         var1 += 65536;
      }

      return var1;
   }

   public final int TRUX() throws IOException {
      int var1 = this.I();

      for(var1 += this.I() << 8; var1 >= 32767; var1 -= 65536) {
         ;
      }

      return var1;
   }

   public final boolean F() throws IOException {
      return this.TRUX.Z();
   }

   public final String J() throws IOException {
      StringBuffer var1 = new StringBuffer();

      while(true) {
         int var2 = this.I();
         if(var2 == -1) {
            System.out.print("end of stream");
           // throw new IOException("end of stream");
         }

         if(var2 != 10 && var2 != 13) {
            var1.append((char)var2);
         } else if(var2 == 10) {
            return var1.toString();
         }
      }
   }
}
