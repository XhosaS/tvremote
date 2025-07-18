package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agci implements agaf {
    public final ahwx a;
    private int b;
    private int c;

    public agci(ahwx ahwxVar, int i) {
        this.a = ahwxVar;
        this.b = i;
    }

    @Override // defpackage.agaf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.agaf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.agaf
    public final void c(byte b) {
        this.a.u(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.agaf
    public final void d(byte[] bArr, int i, int i2) {
        this.a.s(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
