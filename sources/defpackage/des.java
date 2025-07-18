package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class des extends del implements deh {
    public des() {
        super(128);
    }

    @Override // defpackage.del, defpackage.deh
    public final int a(byte[] bArr, int i) {
        int iB = b();
        l(bArr, i, iB);
        return iB;
    }

    @Override // defpackage.del, defpackage.deh
    public final int b() {
        return this.e >> 2;
    }

    @Override // defpackage.del, defpackage.deh
    public final String c() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.del
    protected final void k() {
        c();
    }

    public final void l(byte[] bArr, int i, int i2) {
        if (!this.f) {
            h(15, 4);
        }
        j(bArr, i, i2 * 8);
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public des(int i) {
        super(i);
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(b.h(i, "'bitStrength' ", " not supported for SHAKE"));
        }
    }
}
