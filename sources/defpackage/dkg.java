package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkg extends dkc {
    private final dka c;

    public dkg(dke dkeVar, byte[] bArr) {
        super(false, dkeVar);
        int iA = dkeVar.a();
        int i = iA + iA;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.c = new dka(dos.t(bArr, 0, iA), dos.t(bArr, iA, i));
    }

    public final byte[] a() {
        dka dkaVar = this.c;
        return dos.r((byte[]) dkaVar.a, (byte[]) dkaVar.b);
    }
}
