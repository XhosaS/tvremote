package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlm extends dlv {
    public final int a;
    public final int b;

    public dlm(dll dllVar) {
        super(dllVar);
        this.a = dllVar.a;
        this.b = dllVar.b;
    }

    @Override // defpackage.dlv
    public final byte[] a() {
        byte[] bArrA = super.a();
        dos.g(0, bArrA, 16);
        dos.g(this.a, bArrA, 20);
        dos.g(this.b, bArrA, 24);
        return bArrA;
    }
}
