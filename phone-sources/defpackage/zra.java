package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zra extends zqx {
    final byte[] c;
    final byte[] d;

    public zra(zqy zqyVar, byte[] bArr) {
        super(false, zqyVar);
        this.c = vxr.bh(bArr, 0, 32);
        this.d = vxr.bh(bArr, 32, bArr.length);
    }

    public final byte[] a() {
        return vxr.bf(this.c, this.d);
    }

    public final byte[] b() {
        return vxr.bd(this.d);
    }

    public zra(zqy zqyVar, byte[] bArr, byte[] bArr2) {
        super(false, zqyVar);
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
    }
}
