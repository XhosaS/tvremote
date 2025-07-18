package androidx.work;

import android.content.Context;
import defpackage.agum;
import defpackage.cbu;
import defpackage.cbv;
import defpackage.cde;
import defpackage.zyd;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends cbv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.cbv
    public final zyd a() {
        Executor executor = this.b.e;
        executor.getClass();
        return cde.a(executor, new agum() { // from class: ccy
            @Override // defpackage.agum
            public final Object a() {
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            }
        });
    }

    @Override // defpackage.cbv
    public final zyd b() {
        Executor executor = this.b.e;
        executor.getClass();
        return cde.a(executor, new agum() { // from class: ccx
            @Override // defpackage.agum
            public final Object a() {
                return this.a.c();
            }
        });
    }

    public abstract cbu c();
}
