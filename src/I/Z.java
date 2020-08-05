package I;

import G.C;
import M.F;

import java.io.IOException;
import java.io.OutputStream;

public abstract class Z {

   private int[] TRUX;
   private int longBitsToDouble;


   protected final void I() throws F {
      this.TRUX = new int[8];

      for(int var1 = 0; var1 < this.TRUX.length; ++var1) {
         this.TRUX[var1] = this.Z();
         if(this.TRUX[var1] < 0) {
            throw new F();
         }
      }

      this.longBitsToDouble = 0;
   }

   protected abstract int Z() throws F;

   protected abstract void I(byte[] var1) throws F;

   protected abstract void I(int var1) throws F;

   public final int C() throws F, C {
      int var1 = 0;

      var1 = this.TRUX(this.Z());

      return var1;
   }

   public final int B() throws F, C {
      this.I(4);
      int var1 = this.C();
      var1 += this.C() << 8;
      var1 += this.C() << 16;
      var1 += this.C() << 24;
      return var1;
   }

   public final long D() throws F, C {
      this.I(8);
      long var1 = (long)this.C();
      var1 += (long)this.C() << 8;
      var1 += (long)this.C() << 16;
      var1 += (long)this.C() << 24;
      var1 += (long)this.C() << 32;
      var1 += (long)this.C() << 40;
      var1 += (long)this.C() << 48;
      var1 += (long)this.C() << 56;
      return var1;
   }

   public final double F() throws F, C {
      this.I(8);
      long var1 = this.D();
      return Double.longBitsToDouble(var1);
   }

   public final int J() throws F, C {
      this.I(2);
      int var1 = this.C();
      var1 += this.C() << 8;
      return var1;
   }

   public final String S() throws F, C {
      int var1 = this.J();
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = (char)this.C();
      }

      return new String(var2);
   }

   public final void Z(byte[] var1) throws F, C {
      this.I(var1.length);
      this.I(var1);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (byte)this.longBitsToDouble(var1[var2]);
      }

   }

   public final void I(byte[] var1, int var2, int var3) throws F, C {
      this.I(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var2 + var4] = (byte)this.C();
      }

   }

   public final void I(OutputStream var1, int var2) throws IOException, C {
      this.I(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.write(this.C());
      }

   }

   protected final int TRUX(int var1) throws F, C {
      if(var1 == -1) {
         throw new F();
      } else {
         ++this.longBitsToDouble;
         return G.B.I(var1 + this.longBitsToDouble, 256) ^ this.TRUX[G.B.I(this.longBitsToDouble, this.TRUX.length)];
      }
   }

   protected final int longBitsToDouble(int var1) throws C {
      if(var1 < 0) {
         var1 += 256;
      }

      ++this.longBitsToDouble;
      return G.B.I(var1 + this.longBitsToDouble, 256) ^ this.TRUX[G.B.I(this.longBitsToDouble, this.TRUX.length)];
   }

   public final void Z(int var1) throws F {
      this.I(var1);
   }
}
