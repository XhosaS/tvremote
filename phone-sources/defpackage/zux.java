package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zux extends zve {
    public final int a;
    public final int b;
    public final int c;

    public zux(zuy zuyVar) {
        super(zuyVar);
        this.a = zuyVar.b;
        this.b = zuyVar.c;
        this.c = zuyVar.a;
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
