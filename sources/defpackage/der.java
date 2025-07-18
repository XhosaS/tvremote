package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class der extends dem {
    public der() {
        dnx.X(this);
        def.a();
        i();
    }

    @Override // defpackage.deh
    public final int a(byte[] bArr, int i) {
        f();
        dos.i(this.b, bArr, i);
        dos.i(this.c, bArr, i + 8);
        dos.i(this.d, bArr, i + 16);
        dos.i(this.e, bArr, i + 24);
        dos.i(this.f, bArr, i + 32);
        dos.i(this.g, bArr, i + 40);
        dos.i(this.h, bArr, i + 48);
        dos.i(this.i, bArr, i + 56);
        i();
        return 64;
    }

    @Override // defpackage.deh
    public final int b() {
        return 64;
    }

    @Override // defpackage.deh
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.dem
    public final void i() {
        super.i();
        this.b = 7640891576956012808L;
        this.c = -4942790177534073029L;
        this.d = 4354685564936845355L;
        this.e = -6534734903238641935L;
        this.f = 5840696475078001361L;
        this.g = -7276294671716946913L;
        this.h = 2270897969802886507L;
        this.i = 6620516959819538809L;
    }
}
