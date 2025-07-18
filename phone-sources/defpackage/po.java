package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class po implements nf {
    private final /* synthetic */ int a;
    private final Object b;

    public po(ne neVar, float f, float f2, int i) {
        this.a = i;
        int iB = neVar.b();
        nr[] nrVarArr = new nr[iB];
        for (int i2 = 0; i2 < iB; i2++) {
            nrVarArr[i2] = new nr(f, f2, neVar.a(i2));
        }
        this.b = nrVarArr;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, nq] */
    @Override // defpackage.nf
    public final /* synthetic */ nq a(int i) {
        return this.a != 0 ? ((nr[]) this.b)[i] : this.b;
    }

    public po(float f, float f2, int i) {
        this.a = i;
        this.b = new nr(f, f2, 4);
    }
}
