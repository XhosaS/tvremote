package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dij implements deh {
    private final deh a;
    private final int b;

    public dij(deh dehVar, int i) {
        this.a = dehVar;
        this.b = i;
    }

    @Override // defpackage.deh
    public final int a(byte[] bArr, int i) {
        deh dehVar = this.a;
        byte[] bArr2 = new byte[dehVar.b()];
        dehVar.a(bArr2, 0);
        int i2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.deh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.deh
    public final String c() {
        return this.a.c() + "/" + (this.b * 8);
    }

    @Override // defpackage.deh
    public final void d(byte b) {
        this.a.d(b);
    }

    @Override // defpackage.deh
    public final void e(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
