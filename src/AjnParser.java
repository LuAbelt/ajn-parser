import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class AjnParser {

    private long TRUX;
    private int add = 0;
    private Vector append = new Vector();

    public static void main(String[] args) {

        try {
            new AjnParser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AjnParser() {
        this.I();
    }

    public final synchronized void I() {
        this.append.clear();
        this.TRUX = 0L;
        N.J var1 = new N.J(512);
        N.J var2 = new N.J(512);
        N.I var3 = new N.I(var1);
        N.Z var4 = new N.Z(var1);
        N.Z var5 = new N.Z(var2);
        N.C var6 = new N.C(new N.D(new N.I(var2)));

        try {
            System.out.print("parse ajn.txt \n");
            FileInputStream var7 = new FileInputStream("ajn.txt");
            byte[] var8 = new byte[2048];

            int var9;
            while (var7.available() > 0) {
                var9 = var7.read(var8);
                var4.write(var8, 0, var9);
            }

            var7.close();
            I.J.Z(var3, var5);
            var9 = var6.I();
            if (var9 <= 1) {
                this.TRUX = G.Z.I(var6.B());
                this.add = var6.Z();

                for (int var10 = var6.Z(); var10 > 0; --var10) {
                    byte[] var11 = new byte[16];
                    var6.I(var11);
                    int var12 = var6.Z();
                    Z var13 = new Z(new H.I(var11), var12);
                    System.out.print("hash: " + var13.I.toString() + " | size: " + var13.Z + "\n");
                    this.append.add(var13);
                }
            } else {
                System.err.println(" unknown type:" + var9);
            }
        } catch (FileNotFoundException var13) {
            ;
        } catch (IOException var14) {
            var14.printStackTrace();
        }

        System.out.printf("read finished");
    }
}
