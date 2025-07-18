package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgy implements jlt {
    final /* synthetic */ jhh a;
    final /* synthetic */ Runnable b;

    public jgy(jhh jhhVar, Runnable runnable) {
        this.a = jhhVar;
        this.b = runnable;
    }

    @Override // defpackage.jlt
    public final void l(jlv jlvVar) {
        if (jlvVar == jlv.INVOCATION_TYPE_NOT_INVOKED) {
            this.a.aq(this);
            this.b.run();
        }
    }
}
