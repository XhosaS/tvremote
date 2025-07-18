package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zrs implements znp {
    private final znp a;
    private final int b;

    public zrs(znp znpVar, int i) {
        this.a = znpVar;
        this.b = i;
    }

    @Override // defpackage.znp
    public final int a(byte[] bArr, int i) {
        znp znpVar = this.a;
        byte[] bArr2 = new byte[znpVar.b()];
        znpVar.a(bArr2, 0);
        int i2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.znp
    public final int b() {
        return this.b;
    }

    @Override // defpackage.znp
    public final String c() {
        return this.a.c() + "/" + (this.b * 8);
    }

    @Override // defpackage.znp
    public final void d(byte b) {
        this.a.d(b);
    }

    @Override // defpackage.znp
    public final void e(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
