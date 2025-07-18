package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ljs extends ljx {
    final boolean a;
    final int b;
    final Integer c;

    public ljs(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
        this.c = null;
    }

    public ljs(Throwable th, int i, int i2) {
        super("Error during license request", th);
        this.a = true;
        this.b = i;
        this.c = Integer.valueOf(i2);
    }

    public ljs(String str, boolean z, int i) {
        super(str);
        this.a = z;
        this.b = i;
        this.c = null;
    }
}
