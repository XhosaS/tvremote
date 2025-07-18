package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lee implements ldu {
    public volatile boolean a;
    private final ldu b;

    public lee(ldu lduVar) {
        this.b = lduVar;
    }

    @Override // defpackage.ldu
    public final void G(ieg iegVar, String str) {
        if (this.a) {
            return;
        }
        this.b.G(iegVar, str);
    }

    @Override // defpackage.ldu
    public final void H(ieg iegVar, Exception exc) {
        if (this.a) {
            return;
        }
        this.b.H(iegVar, exc);
    }

    @Override // defpackage.ldu
    public final void I(ieg iegVar) {
        if (this.a) {
            return;
        }
        this.b.I(iegVar);
    }
}
