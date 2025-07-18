package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface agaa {
    public static final agaa a;

    static {
        agaa afosVar;
        try {
            Class.forName("java.time.Instant");
            afosVar = new afrz();
        } catch (ClassNotFoundException unused) {
            afosVar = new afos();
        }
        a = afosVar;
    }

    long a();
}
