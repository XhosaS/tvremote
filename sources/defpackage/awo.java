package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awo {
    public awo() {
    }

    public static int a(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static void b(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        rj rjVar = new rj(level, th, str, objArr, 5);
        int i = bxr.a;
        executor.execute(new bxq(new cum(), bwv.b(), rjVar));
    }

    public static void c(Level level, Executor executor, String str, Object... objArr) {
        b(level, executor, null, str, objArr);
    }

    public static boolean d(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bxk] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static bxb f(String str, bxe bxeVar, boolean z) {
        boolean z2;
        ?? r0;
        bxk bxkVarG;
        bxj bxjVarA = bwv.a();
        Object obj = bxjVarA.b;
        int i = 0;
        if (obj == bxa.a) {
            r0 = 0;
            bwv.c(bxjVarA, null);
            z2 = true;
        } else {
            z2 = false;
            r0 = obj;
        }
        if (r0 == 0) {
            UUID uuidB = bww.a.b();
            String strAR = bwl.aR(uuidB);
            bwm bwmVar = bwx.a;
            cab cabVarD = bwv.d();
            if (!cabVarD.isEmpty()) {
                Iterable$EL.forEach(cabVarD, new bwy(i));
            }
            bxkVarG = new bwz(uuidB, strAR, str, bxeVar, bwmVar, z, bxjVarA);
        } else {
            bxkVarG = r0 instanceof bwo ? ((bwo) r0).g(str, bxeVar, z, bxjVarA) : r0.k(str, bxeVar, bxjVarA);
        }
        bwv.c(bxjVarA, bxkVarG);
        return new bxb(bxkVarG, z2);
    }

    public static bxb g(String str) {
        return f(str, bxd.a, true);
    }

    public awo(crv crvVar) {
        crvVar.getClass();
    }
}
