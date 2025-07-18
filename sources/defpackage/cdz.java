package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdz {
    public static final ceb a = a(ceb.d);

    private static ceb a(String[] strArr) {
        cek cekVar;
        try {
            cekVar = cel.a;
        } catch (NoClassDefFoundError unused) {
            cekVar = null;
        }
        if (cekVar != null) {
            return cekVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (ceb) Class.forName(str).getConstructor(null).newInstance(null);
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
