package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ydf implements yby {
    public final zgk a;
    private int b;
    private int c;

    public ydf(zgk zgkVar, int i) {
        this.a = zgkVar;
        this.b = i;
    }

    @Override // defpackage.yby
    public final int a() {
        return this.c;
    }

    @Override // defpackage.yby
    public final int b() {
        return this.b;
    }

    @Override // defpackage.yby
    public final void c(byte b) {
        this.a.M(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.yby
    public final void d(byte[] bArr, int i, int i2) {
        this.a.K(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
