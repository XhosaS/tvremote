package androidx.work.impl.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.caz;
import defpackage.cbt;
import defpackage.cbu;
import defpackage.cbx;
import defpackage.ccn;
import defpackage.cfq;
import defpackage.ckg;
import defpackage.ckr;
import defpackage.cle;
import defpackage.cmm;
import defpackage.cos;
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
    public final cbu c() {
        cfq cfqVarJ = cfq.j(this.a);
        WorkDatabase workDatabase = cfqVarJ.e;
        workDatabase.getClass();
        cle cleVarD = workDatabase.D();
        ckr ckrVarB = workDatabase.B();
        cmm cmmVarE = workDatabase.E();
        ckg ckgVarA = workDatabase.A();
        ccn ccnVar = cfqVarJ.d.i;
        List listF = cleVarD.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listG = cleVarD.g();
        List listV = cleVarD.v();
        if (!listF.isEmpty()) {
            cbx.c();
            String str = cos.a;
            Log.i(str, "Recently completed work:\n\n");
            cbx.c();
            Log.i(str, cos.a(ckrVarB, cmmVarE, ckgVarA, listF));
        }
        if (!listG.isEmpty()) {
            cbx.c();
            String str2 = cos.a;
            Log.i(str2, "Running work:\n\n");
            cbx.c();
            Log.i(str2, cos.a(ckrVarB, cmmVarE, ckgVarA, listG));
        }
        if (!listV.isEmpty()) {
            cbx.c();
            String str3 = cos.a;
            Log.i(str3, "Enqueued work:\n\n");
            cbx.c();
            Log.i(str3, cos.a(ckrVarB, cmmVarE, ckgVarA, listV));
        }
        return new cbt(caz.b);
    }
}
