package K;

public class A extends S {

   private int C = 0;


   public final void I(E var1) {
      ++this.C;
      super.I(var1);
   }

   public final void Z(E var1) {
      --this.C;
      super.Z(var1);
   }

   public final int B() {
      return this.C;
   }

   public final void z() {
      this.C = 0;
      super.z();
   }
}
