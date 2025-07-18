package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqz extends zqx {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public zqz(zqy zqyVar, byte[] bArr, zra zraVar) {
        super(true, zqyVar);
        zqw zqwVar = new zqw(zqyVar.d);
        this.c = vxr.bh(bArr, 0, 32);
        this.d = vxr.bh(bArr, 32, 64);
        this.e = vxr.bh(bArr, 64, 128);
        int i = (zqwVar.c * zqwVar.a) + 128;
        this.f = vxr.bh(bArr, 128, i);
        int i2 = (zqwVar.b * zqwVar.a) + i;
        this.g = vxr.bh(bArr, i, i2);
        this.h = vxr.bh(bArr, i2, (zqwVar.b * 416) + i2);
        if (zraVar != null) {
            this.i = zraVar.b();
        } else {
            this.i = null;
        }
    }

    public zqz(zqy zqyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, zqyVar);
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
        this.e = vxr.bd(bArr3);
        this.f = vxr.bd(bArr4);
        this.g = vxr.bd(bArr5);
        this.h = vxr.bd(bArr6);
        this.i = vxr.bd(bArr7);
    }
}
