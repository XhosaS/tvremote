package com.google.android.apps.play.movies.common.service.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.gpm;
import defpackage.krd;
import defpackage.ldl;
import defpackage.lxd;
import defpackage.ues;
import defpackage.ufn;
import defpackage.ugk;
import defpackage.uhi;
import defpackage.uhp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MoviesWorkerWrapper extends gpm {
    public final WorkerParameters a;
    private final lxd b;

    public MoviesWorkerWrapper(Context context, WorkerParameters workerParameters, lxd lxdVar) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = lxdVar;
    }

    @Override // defpackage.gpm
    public final uhp d() {
        WorkerParameters workerParameters = this.a;
        krd.e("Starting worker with tags: ".concat(workerParameters.c.toString()));
        uhi uhiVarV = uhi.v(this.b.a(workerParameters));
        ldl ldlVar = new ldl(this, 16);
        ugk ugkVar = ugk.a;
        return ues.i(ufn.i(uhiVarV, ldlVar, ugkVar), Throwable.class, new ldl(this, 17), ugkVar);
    }

    @Override // defpackage.gpm
    public final void e() {
        krd.f("Worker was stopped for task with tags: ".concat(this.a.c.toString()));
    }
}
