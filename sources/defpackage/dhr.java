package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhr extends dho {
    final byte[] c;
    final byte[] d;

    public dhr(dhp dhpVar, byte[] bArr) {
        super(false, dhpVar);
        this.c = dos.t(bArr, 0, 32);
        this.d = dos.t(bArr, 32, bArr.length);
    }

    public final byte[] a() {
        return dos.r(this.c, this.d);
    }

    public final byte[] b() {
        return dos.p(this.d);
    }

    public dhr(dhp dhpVar, byte[] bArr, byte[] bArr2) {
        super(false, dhpVar);
        this.c = dos.p(bArr);
        this.d = dos.p(bArr2);
    }
}
