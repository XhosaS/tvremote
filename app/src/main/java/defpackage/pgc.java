package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgc extends Exception {
    public final yyk a;

    private pgc(String str, Throwable th, yyk yykVar) {
        super(str, th);
        this.a = yykVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? a(cause) : th;
    }

    public static void b(Collection collection, Object... objArr) throws pgc {
        Iterator it = collection.iterator();
        yyf yyfVar = null;
        while (it.hasNext()) {
            try {
                zxn.o((zyd) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (yyfVar == null) {
                    int i = yyk.e;
                    yyfVar = new yyf(4);
                }
                yyfVar.g(a(e));
            }
        }
        if (yyfVar == null) {
            return;
        }
        yyk yykVarF = yyfVar.f();
        String strConcat = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i2 = ((zcg) yykVarF).d;
        if (i2 > 1) {
            String str = strConcat + "\n" + i2 + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str);
                        int i3 = 0;
                        while (i3 < i2) {
                            Throwable th = (Throwable) yykVarF.get(i3);
                            i3++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i3));
                            printWriter.println(c(th, 1));
                        }
                        printWriter.println("-------------------------------------------");
                        strConcat = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                strConcat = "Failed to build string from throwables: ".concat(th2.toString());
            }
        }
        throw new pgc(strConcat, (Throwable) yykVarF.get(0), yykVarF);
    }

    private static String c(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + c(cause, i + 1);
    }
}
