package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdv {
    public static final boolean a;
    public static final abbe b;
    public static final abbe c;
    public static final abbe d;

    static {
        boolean z;
        abbe abbeVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            int i = abdt.a;
            int i2 = abdu.a;
            b = abdo.a;
            c = abdq.a;
            abbeVar = abds.a;
        } else {
            abbeVar = null;
            b = null;
            c = null;
        }
        d = abbeVar;
    }
}
