package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbx {
    public static final Object b = new Object();
    public static volatile cbx c;

    public static cbx c() {
        cbx cbxVar;
        synchronized (b) {
            if (c == null) {
                c = new cbw(3);
            }
            cbxVar = c;
        }
        return cbxVar;
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);
}
