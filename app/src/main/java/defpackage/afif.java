package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afif extends afid {
    private final afig d;

    public afif(String str, boolean z, afig afigVar) {
        super(str, z);
        yqw.J(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        afigVar.getClass();
        this.d = afigVar;
    }

    @Override // defpackage.afid
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.afid
    public final byte[] b(Object obj) {
        byte[] bArrB = this.d.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
