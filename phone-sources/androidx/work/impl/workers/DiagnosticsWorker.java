package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.gli;
import defpackage.gpl;
import defpackage.gpn;
import defpackage.grs;
import defpackage.guk;
import defpackage.guo;
import defpackage.gux;
import defpackage.gvg;
import defpackage.gwg;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final gli a() throws IOException {
        grs grsVarH = grs.h(this.e);
        WorkDatabase workDatabase = grsVarH.c;
        workDatabase.getClass();
        gux guxVarD = workDatabase.D();
        guo guoVarB = workDatabase.B();
        gvg gvgVarE = workDatabase.E();
        guk gukVarA = workDatabase.A();
        Object obj = grsVarH.h.e;
        List listF = guxVarD.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listG = guxVarD.g();
        List listV = guxVarD.v();
        if (!listF.isEmpty()) {
            gpn.b();
            int i = gwg.a;
            gpn.b();
            gwg.a(guoVarB, gvgVarE, gukVarA, listF);
        }
        if (!listG.isEmpty()) {
            gpn.b();
            int i2 = gwg.a;
            gpn.b();
            gwg.a(guoVarB, gvgVarE, gukVarA, listG);
        }
        if (!listV.isEmpty()) {
            gpn.b();
            int i3 = gwg.a;
            gpn.b();
            gwg.a(guoVarB, gvgVarE, gukVarA, listV);
        }
        return new gpl();
    }
}
