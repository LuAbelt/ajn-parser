package K;

public class S {

   protected E J = null;
   protected E S = null;


   public void I(E var1) {
      if(this.S == null) {
         this.J = var1;
         this.S = var1;
         var1.D = null;
      } else {
         this.S.D = var1;
         this.S = var1;
         var1.D = null;
      }

   }

   public final E Y() {
      return this.J;
   }

   public final E i() {
      return this.S;
   }

   public void Z(E var1) {
      if(var1 == null) {
         if(this.S == this.J) {
            this.S = null;
         }

         this.J = this.J.D;
      } else if(var1.D != null) {
         var1.D = var1.D.D;
         if(var1.D == null) {
            this.S = var1;
         }
      }

   }

   public void z() {
      this.J = null;
      this.S = null;
   }
}
