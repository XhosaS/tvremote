package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zoa extends znt implements znp {
    public zoa() {
        super(128);
    }

    @Override // defpackage.znt, defpackage.znp
    public final int a(byte[] bArr, int i) {
        int iB = b();
        l(bArr, i, iB);
        return iB;
    }

    @Override // defpackage.znt, defpackage.znp
    public final int b() {
        return this.e >> 2;
    }

    @Override // defpackage.znt, defpackage.znp
    public final String c() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.znt
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
    public zoa(int i) {
        super(i);
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(a.cd(i, "'bitStrength' ", " not supported for SHAKE"));
        }
    }
}
