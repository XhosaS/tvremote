package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhq extends dho {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public dhq(dhp dhpVar, byte[] bArr, dhr dhrVar) {
        super(true, dhpVar);
        dhn dhnVar = new dhn(dhpVar.d);
        this.c = dos.t(bArr, 0, 32);
        this.d = dos.t(bArr, 32, 64);
        this.e = dos.t(bArr, 64, 128);
        int i = (dhnVar.c * dhnVar.a) + 128;
        this.f = dos.t(bArr, 128, i);
        int i2 = (dhnVar.b * dhnVar.a) + i;
        this.g = dos.t(bArr, i, i2);
        this.h = dos.t(bArr, i2, (dhnVar.b * 416) + i2);
        if (dhrVar != null) {
            this.i = dhrVar.b();
        } else {
            this.i = null;
        }
    }

    public dhq(dhp dhpVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dhpVar);
        this.c = dos.p(bArr);
        this.d = dos.p(bArr2);
        this.e = dos.p(bArr3);
        this.f = dos.p(bArr4);
        this.g = dos.p(bArr5);
        this.h = dos.p(bArr6);
        this.i = dos.p(bArr7);
    }
}
