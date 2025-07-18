package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krm extends Error {
    public final int a;

    public krm(String str) {
        super(str);
        this.a = 6;
    }

    public static int a(Throwable th) {
        if (th instanceof krm) {
            return ((krm) th).a;
        }
        return 1;
    }

    public krm(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
