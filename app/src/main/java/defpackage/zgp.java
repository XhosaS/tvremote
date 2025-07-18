package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgp {
    public static final zgr a = a(zgr.d);

    private static zgr a(String[] strArr) {
        zhb zhbVar;
        try {
            zhbVar = zhc.a;
        } catch (NoClassDefFoundError unused) {
            zhbVar = null;
        }
        if (zhbVar != null) {
            return zhbVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zgr) Class.forName(str).getConstructor(null).newInstance(null);
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
