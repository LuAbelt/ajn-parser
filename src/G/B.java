package G;

public class B {

   public static final int I(int var0, int var1) throws C {
      if(var1 < 0) {
         throw new C("invalid divider" + var1);
      } else {
         for(var0 %= var1; var0 < 0; var0 += var1) {
            ;
         }

         return var0;
      }
   }
}
