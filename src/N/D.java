package N;

import java.io.IOException;
import java.io.InputStream;

public class D implements A {

   private InputStream TRUX;


   public D(InputStream var1) {
      this.TRUX = var1;
   }

   public final int I() throws IOException {
      return this.TRUX.read();
   }

   public final int I(byte[] var1) throws IOException {
      return this.TRUX.read(var1);
   }

   public final boolean Z() throws IOException {
      return this.TRUX.available() > 0;
   }
}
