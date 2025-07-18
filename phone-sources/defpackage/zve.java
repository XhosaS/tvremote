package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zve {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    protected zve(zvd zvdVar) {
        this.d = zvdVar.e;
        this.e = zvdVar.f;
        this.a = zvdVar.d;
        this.f = zvdVar.g;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        vxr.aU(this.d, bArr, 0);
        vxr.aW(this.e, bArr, 4);
        vxr.aU(this.a, bArr, 12);
        vxr.aU(this.f, bArr, 28);
        return bArr;
    }
}
