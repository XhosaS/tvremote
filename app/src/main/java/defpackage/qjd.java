package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qjd {
    public final int a;
    public final String b;
    public final Throwable c;
    public final int d;

    public qjd(int i, int i2, String str, Throwable th) {
        this.d = i;
        this.a = i2;
        this.b = str;
        this.c = th;
    }

    public static qjd a(int i, Throwable th) {
        return new qjd(i, -1, th.getMessage(), th);
    }
}
