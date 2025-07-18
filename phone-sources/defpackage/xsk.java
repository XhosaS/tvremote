package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xsk extends xsj {
    private final xsl d;

    public xsk(String str, boolean z, xsl xslVar) {
        super(str, z);
        sij.v(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        xslVar.getClass();
        this.d = xslVar;
    }

    @Override // defpackage.xsj
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.xsj
    public final byte[] b(Object obj) {
        byte[] bArrB = this.d.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
