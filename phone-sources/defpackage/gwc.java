package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwc extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwc(ConstraintTrackingWorker constraintTrackingWorker, yih yihVar) {
        super(yihVar);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(this);
    }
}
