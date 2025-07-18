package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zto extends ztl {
    final ztj c;
    public final ztj d;

    public zto(ztn ztnVar, byte[] bArr) {
        super(true, ztnVar);
        int iA = ztnVar.a();
        int i = iA * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = iA + iA;
        this.c = new ztj(vxr.bh(bArr, 0, iA), vxr.bh(bArr, iA, i2));
        int i3 = iA * 3;
        this.d = new ztj(vxr.bh(bArr, i2, i3), vxr.bh(bArr, i3, i));
    }

    public final byte[] a() {
        ztj ztjVar = this.c;
        byte[] bArr = (byte[]) ztjVar.a;
        byte[] bArr2 = (byte[]) ztjVar.b;
        ztj ztjVar2 = this.d;
        return vxr.be(new byte[][]{bArr, bArr2, (byte[]) ztjVar2.a, (byte[]) ztjVar2.b});
    }

    public zto(ztn ztnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, ztnVar);
        this.c = new ztj(bArr, bArr2);
        this.d = new ztj(bArr3, bArr4);
    }
}
