package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlq extends dlv {
    public final int a;
    public final int b;
    public final int c;

    public dlq(dlp dlpVar) {
        super(dlpVar);
        this.a = dlpVar.a;
        this.b = dlpVar.b;
        this.c = dlpVar.c;
    }

    @Override // defpackage.dlv
    public final byte[] a() {
        int i = this.a;
        byte[] bArrA = super.a();
        dos.g(i, bArrA, 16);
        dos.g(this.b, bArrA, 20);
        dos.g(this.c, bArrA, 24);
        return bArrA;
    }
}
