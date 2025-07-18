package androidx.work;

import android.content.Context;
import defpackage.agsw;
import defpackage.agte;
import defpackage.agvy;
import defpackage.ahbm;
import defpackage.ahdn;
import defpackage.car;
import defpackage.cas;
import defpackage.cat;
import defpackage.cbp;
import defpackage.cbv;
import defpackage.zyd;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends cbv {
    private final WorkerParameters e;
    private final ahbm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = car.a;
    }

    @Override // defpackage.cbv
    public final zyd a() {
        return cbp.b(this.f.plus(new ahdn(null)), new cas(this, null));
    }

    @Override // defpackage.cbv
    public final zyd b() {
        agte agteVar = this.f;
        if (agvy.c(agteVar, car.a)) {
            agteVar = this.e.f;
        }
        agteVar.getClass();
        return cbp.b(agteVar.plus(new ahdn(null)), new cat(this, null));
    }

    public abstract Object c(agsw agswVar);
}
