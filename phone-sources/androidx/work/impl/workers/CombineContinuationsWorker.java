package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.gli;
import defpackage.gpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final gli a() {
        return new gpl(g());
    }
}
