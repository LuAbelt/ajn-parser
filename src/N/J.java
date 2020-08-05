package N;

public class J {

   private K.A TRUX;
   private final int arraycopy;
   private int out;
   private int println;


   public J() {
      this(2048);
   }

   public J(int var1) {
      this.TRUX = new K.A();
      this.arraycopy = var1;
      this.TRUX.I(new F(this));
      this.out = 0;
      this.println = 0;
   }

   private F TRUX() {
      return (F)this.TRUX.Y();
   }

   private F arraycopy() {
      return (F)this.TRUX.i();
   }

   public final synchronized void I(int var1) {
      this.arraycopy().I[this.println] = (byte)var1;
      ++this.println;
      this.out();
   }

   private void out() {
      if(this.println == this.arraycopy) {
         this.println = 0;
         this.TRUX.I(new F(this));
      } else if(this.println > this.arraycopy) {
         System.out.println("invalid writepos in InternalByteArrayStream");
      }

   }

   public final synchronized void I(byte[] var1, int var2, int var3) {
      while(var3 > 0) {
         int var4 = this.arraycopy - this.println;
         if(var4 >= var3) {
            var4 = var3;
         }

         System.arraycopy(var1, var2, this.arraycopy().I, this.println, var4);
         this.println += var4;
         this.out();
         var2 += var4;
         var3 -= var4;
      }

   }

   public final synchronized int I() {
      if(this.println == this.out && this.arraycopy() == this.TRUX()) {
         return -1;
      } else {
         int var1;
         for(var1 = this.TRUX().I[this.out]; var1 < 0; var1 += 256) {
            ;
         }

         ++this.out;
         this.println();
         return var1;
      }
   }

   private void println() {
      if(this.out == this.arraycopy) {
         this.out = 0;
         this.TRUX.Z((K.E)null);
      }

   }

   public final synchronized long I(long var1) {
      int var3 = 0;

      while(var1 > 0L) {
         F var4 = this.TRUX();
         if(var4 == this.arraycopy()) {
            int var7 = this.println - this.out;
            if(var1 > (long)var7) {
               var1 = (long)var7;
            }

            var3 = (int)((long)var3 + var1);
            this.out = (int)((long)this.out + var1);
            this.println();
            break;
         }

         long var5 = (long)(this.arraycopy - this.out);
         if(var1 < var5) {
            var5 = var1;
         }

         this.out = (int)((long)this.out + var5);
         var3 = (int)((long)var3 + var5);
         var1 -= var5;
         this.println();
      }

      return (long)var3;
   }

   // hier wird der kram aus der Datei verarbeitet
   public final synchronized int Z(byte[] var1, int var2, int var3) {
      int var4 = 0;

      while(var3 > 0) {
         F var5 = this.TRUX();
         int var6;
         if(var5 == this.arraycopy()) {
            var6 = this.println - this.out;
            if(var3 > var6) {
               var3 = var6;
            }

            System.arraycopy(var5.I, this.out, var1, var2, var3);
            var4 += var3;
            this.out += var3;
            this.println();
            break;
         }

         var6 = this.arraycopy - this.out;
         if(var3 < var6) {
            var6 = var3;
         }

         System.arraycopy(var5.I, this.out, var1, var2, var6);
         this.out += var6;
         var4 += var6;
         var2 += var6;
         var3 -= var6;
         this.println();
      }

      return var4;
   }

   public final synchronized int Z() {
      int var1 = 0;

      F var2;
      for(var2 = this.TRUX(); var2 != this.arraycopy(); var2 = (F)var2.D) {
         if(var2 == this.TRUX()) {
            var1 += this.arraycopy - this.out;
         } else {
            var1 += this.arraycopy;
         }
      }

      if(var2 == this.TRUX()) {
         var1 += this.println - this.out;
      } else {
         var1 += this.println;
      }

      return var1;
   }

   public final synchronized int C(byte[] var1, int var2, int var3) {
      int var4 = 0;
      F var5 = this.TRUX();
      int var6 = this.out;

      while(var3 > 0) {
         int var7;
         if(var5 == this.arraycopy()) {
            var7 = this.println - var6;
            if(var3 > var7) {
               var3 = var7;
            }

            System.arraycopy(var5.I, var6, var1, var2, var3);
            var4 += var3;
            var6 += var3;
            if(var6 == this.arraycopy) {
               boolean var8 = false;
               var5 = (F)var5.D;
            }
            break;
         }

         var7 = this.arraycopy - var6;
         if(var3 < var7) {
            var7 = var3;
         }

         System.arraycopy(var5.I, var6, var1, var2, var7);
         var6 += var7;
         var4 += var7;
         var2 += var7;
         var3 -= var7;
         if(var6 == this.arraycopy) {
            var6 = 0;
            var5 = (F)var5.D;
         }
      }

      return var4;
   }

   public final synchronized boolean I(byte[] var1) {
      int var2 = 0;
      F var3 = this.TRUX();
      int var4 = this.out;

      while(true) {
         if(var4 == this.arraycopy) {
            var4 = 0;
            var3 = (F)var3.D;
         } else if(var3 == this.arraycopy() && var4 == this.println) {
            return false;
         }

         if(var3.I[var4] == var1[var2]) {
            ++var2;
            if(var2 == var1.length) {
               return true;
            }
         } else {
            var2 = 0;
         }

         ++var4;
      }
   }

   static final int I(J var0) {
      return var0.arraycopy;
   }
}
