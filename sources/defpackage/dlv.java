package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dlv {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    protected dlv(dlu dluVar) {
        this.d = dluVar.e;
        this.e = dluVar.f;
        this.a = dluVar.d;
        this.f = dluVar.g;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        dos.g(this.d, bArr, 0);
        dos.i(this.e, bArr, 4);
        dos.g(this.a, bArr, 12);
        dos.g(this.f, bArr, 28);
        return bArr;
    }
}
