package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ztp extends ztl {
    private final ztj c;

    public ztp(ztn ztnVar, byte[] bArr) {
        super(false, ztnVar);
        int iA = ztnVar.a();
        int i = iA + iA;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.c = new ztj(vxr.bh(bArr, 0, iA), vxr.bh(bArr, iA, i));
    }

    public final byte[] a() {
        ztj ztjVar = this.c;
        return vxr.bf((byte[]) ztjVar.a, (byte[]) ztjVar.b);
    }
}
