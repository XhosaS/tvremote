package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xtc extends wbb {
    public final wbb f;

    protected xtc(wbb wbbVar) {
        super(null);
        this.f = wbbVar;
    }

    @Override // defpackage.wbb
    public void c(xsm xsmVar) {
        this.f.c(xsmVar);
    }

    @Override // defpackage.wbb
    public void d(Object obj) {
        this.f.d(obj);
    }

    @Override // defpackage.wbb
    public final void e() {
        this.f.e();
    }

    public final String toString() {
        wbb wbbVar = this.f;
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", wbbVar);
        return tssVarH.toString();
    }
}
