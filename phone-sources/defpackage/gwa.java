package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwa extends yiv {
    public /* synthetic */ Object a;
    final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwa(ConstraintTrackingWorker constraintTrackingWorker, yih yihVar) {
        super(yihVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, null, null, this);
    }
}
