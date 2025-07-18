package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znz extends znu {
    public znz() {
        wef.Z(this);
        znn.a();
        i();
    }

    @Override // defpackage.znp
    public final int a(byte[] bArr, int i) {
        f();
        vxr.aW(this.b, bArr, i);
        vxr.aW(this.c, bArr, i + 8);
        vxr.aW(this.d, bArr, i + 16);
        vxr.aW(this.e, bArr, i + 24);
        vxr.aW(this.f, bArr, i + 32);
        vxr.aW(this.g, bArr, i + 40);
        vxr.aW(this.h, bArr, i + 48);
        vxr.aW(this.i, bArr, i + 56);
        i();
        return 64;
    }

    @Override // defpackage.znp
    public final int b() {
        return 64;
    }

    @Override // defpackage.znp
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.znu
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
