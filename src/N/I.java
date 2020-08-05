package N;

import java.io.InputStream;

public class I extends InputStream {

   private J TRUX;


   public I(J var1) {
      this.TRUX = var1;
   }

   public final int read() {
      return this.TRUX.I();
   }

   public final int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public final int read(byte[] var1, int var2, int var3) {
      return this.TRUX.Z(var1, var2, var3);
   }

   public final int I(byte[] var1) {
      return this.TRUX(var1, 0, var1.length);
   }

   public final int TRUX(byte[] var1, int var2, int var3) {
      return this.TRUX.C(var1, var2, var3);
   }

   public final int available() {
      return this.TRUX.Z();
   }

   public final boolean Z(byte[] var1) {
      return this.TRUX.I(var1);
   }

   public final long skip(long var1) {
      return this.TRUX.I(var1);
   }
}
