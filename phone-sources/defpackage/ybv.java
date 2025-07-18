package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ybv {
    public static final ybv a;

    static {
        xxj xxjVar;
        try {
            Class.forName("java.time.Instant");
            xxjVar = new xxj(0);
        } catch (ClassNotFoundException unused) {
            xxjVar = new xxj(1);
        }
        a = xxjVar;
    }

    long a();
}
