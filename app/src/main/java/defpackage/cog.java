package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cog extends agtu implements agvb {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cog(ConstraintTrackingWorker constraintTrackingWorker, agsw agswVar) {
        super(2, agswVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cog) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
        this.a = 1;
        Object objG = constraintTrackingWorker.g(this);
        return objG == agtgVar ? agtgVar : objG;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cog(this.b, agswVar);
    }
}
