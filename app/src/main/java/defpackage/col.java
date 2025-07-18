package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class col extends agtu implements agvb {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;
    final /* synthetic */ cbv c;
    final /* synthetic */ cic d;
    final /* synthetic */ cld e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public col(ConstraintTrackingWorker constraintTrackingWorker, cbv cbvVar, cic cicVar, cld cldVar, agsw agswVar) {
        super(2, agswVar);
        this.b = constraintTrackingWorker;
        this.c = cbvVar;
        this.d = cicVar;
        this.e = cldVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((col) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ConstraintTrackingWorker constraintTrackingWorker = this.b;
        cbv cbvVar = this.c;
        cic cicVar = this.d;
        cld cldVar = this.e;
        this.a = 1;
        Object objF = constraintTrackingWorker.f(cbvVar, cicVar, cldVar, this);
        return objF == agtgVar ? agtgVar : objF;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new col(this.b, this.c, this.d, this.e, agswVar);
    }
}
