package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rnm implements yrp {
    boolean a;
    Object b;
    final /* synthetic */ yrp c;

    public rnm(yrp yrpVar) {
        this.c = yrpVar;
    }

    @Override // defpackage.yrp
    public final Object eV() {
        if (this.a) {
            return this.b;
        }
        Object objEV = this.c.eV();
        this.b = objEV;
        this.a = true;
        return objEV;
    }
}
