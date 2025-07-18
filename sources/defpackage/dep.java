package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dep extends dem {
    public dep() {
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
        i();
        return 48;
    }

    @Override // defpackage.deh
    public final int b() {
        return 48;
    }

    @Override // defpackage.deh
    public final String c() {
        return "SHA-384";
    }

    @Override // defpackage.dem
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
