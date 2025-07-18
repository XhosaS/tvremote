package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfr extends Exception {
    public final int a;

    public mfr(int i, String str) {
        super(str);
        this.a = i;
    }

    public static boolean a(Throwable th) {
        return (th instanceof mfr) && ((mfr) th).a == 401;
    }
}
