package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tws {
    public static final twu a = a(twu.d);

    private static twu a(String[] strArr) {
        txd txdVar;
        try {
            txdVar = txe.a;
        } catch (NoClassDefFoundError unused) {
            txdVar = null;
        }
        if (txdVar != null) {
            return txdVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (twu) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
