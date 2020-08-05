package M;

import java.io.IOException;

public class F extends IOException {

   public F() {
      super("not enough in buffer");
   }

   public F(int var1, int var2) {
      super("not enough in buffer (" + var1 + ") need" + var2);
   }
}
