package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkf extends dkc {
    final dka c;
    public final dka d;

    public dkf(dke dkeVar, byte[] bArr) {
        super(true, dkeVar);
        int iA = dkeVar.a();
        int i = iA * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = iA + iA;
        this.c = new dka(dos.t(bArr, 0, iA), dos.t(bArr, iA, i2));
        int i3 = iA * 3;
        this.d = new dka(dos.t(bArr, i2, i3), dos.t(bArr, i3, i));
    }

    public final byte[] a() {
        dka dkaVar = this.c;
        byte[] bArr = (byte[]) dkaVar.a;
        byte[] bArr2 = (byte[]) dkaVar.b;
        dka dkaVar2 = this.d;
        return dos.q(new byte[][]{bArr, bArr2, (byte[]) dkaVar2.a, (byte[]) dkaVar2.b});
    }

    public dkf(dke dkeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, dkeVar);
        this.c = new dka(bArr, bArr2);
        this.d = new dka(bArr3, bArr4);
    }
}
