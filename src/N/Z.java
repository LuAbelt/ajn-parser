package N;

import java.io.OutputStream;

public class Z extends OutputStream {

   private J TRUX;


   public Z(J var1) {
      this.TRUX = var1;
   }

   public final void write(int var1) {
      this.TRUX.I(var1);
   }

   public final void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   public final void write(byte[] var1, int var2, int var3) {
      this.TRUX.I(var1, var2, var3);
   }
}
