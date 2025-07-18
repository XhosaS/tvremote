package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zuz extends zve {
    public final int a;
    public final int b;
    public final int c;

    public zuz(zuy zuyVar) {
        super(zuyVar);
        this.a = zuyVar.a;
        this.b = zuyVar.b;
        this.c = zuyVar.c;
    }

    @Override // defpackage.zve
    public final byte[] a() {
        int i = this.a;
        byte[] bArrA = super.a();
        vxr.aU(i, bArrA, 16);
        vxr.aU(this.b, bArrA, 20);
        vxr.aU(this.c, bArrA, 24);
        return bArrA;
    }
}
