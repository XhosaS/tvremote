package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znx extends znu {
    public znx() {
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
        i();
        return 48;
    }

    @Override // defpackage.znp
    public final int b() {
        return 48;
    }

    @Override // defpackage.znp
    public final String c() {
        return "SHA-384";
    }

    @Override // defpackage.znu
    public final void i() {
        super.i();
        this.b = -3766243637369397544L;
        this.c = 7105036623409894663L;
        this.d = -7973340178411365097L;
        this.e = 1526699215303891257L;
        this.f = 7436329637833083697L;
        this.g = -8163818279084223215L;
        this.h = -2662702644619276377L;
        this.i = 5167115440072839076L;
    }
}
