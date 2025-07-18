package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mln extends drn {
    final mlp a;
    private final String[] d;
    private final BitSet e;

    public mln(dru druVar, mlp mlpVar) {
        super(druVar, mlpVar);
        this.d = new String[]{"backgroundScheduler", "conversionContext", "crashOnTemplateResolutionError", "debuggerClient", "debuggerStatus", "devServerEnabled", "disableDogfoodCrashOnElementsError", "disposeSharedComponentOnComponentSpecDetach", "disposeSubscriptionOnRematerialization", "elementSource", "logger", "templatePerformanceLogger", "typeAndProperties"};
        BitSet bitSet = new BitSet(13);
        this.e = bitSet;
        this.a = mlpVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(13, this.e, this.d);
        return this.a;
    }

    public final void aa(mzj mzjVar) {
        this.a.s = mzjVar;
        this.e.set(4);
    }

    public final void ab() {
        this.e.set(2);
    }

    public final void ac() {
        this.e.set(3);
    }

    public final void ad() {
        this.e.set(5);
    }

    public final void ae() {
        this.e.set(6);
    }

    public final void af() {
        this.e.set(8);
    }

    public final void b(agfx agfxVar) {
        this.a.a = agfxVar;
        this.e.set(0);
    }

    public final void c(oal oalVar) {
        this.a.b = oalVar;
        this.e.set(1);
    }

    public final void d(boolean z) {
        this.a.c = z;
        this.e.set(7);
    }

    public final void e(agfo agfoVar) {
        this.a.d = agfoVar;
        this.e.set(9);
    }

    public final void f(oco ocoVar) {
        this.a.e = ocoVar;
        this.e.set(10);
    }

    public final void g(ofn ofnVar) {
        this.a.f = ofnVar;
        this.e.set(11);
    }

    public final void h(mmc mmcVar) {
        this.a.r = mmcVar;
        this.e.set(12);
    }
}
