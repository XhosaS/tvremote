package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zuv extends zve {
    public final int a;
    public final int b;

    public zuv(zuu zuuVar) {
        super(zuuVar);
        this.a = zuuVar.a;
        this.b = zuuVar.b;
    }

    @Override // defpackage.zve
    public final byte[] a() {
        byte[] bArrA = super.a();
        vxr.aU(0, bArrA, 16);
        vxr.aU(this.a, bArrA, 20);
        vxr.aU(this.b, bArrA, 24);
        return bArrA;
    }
}
