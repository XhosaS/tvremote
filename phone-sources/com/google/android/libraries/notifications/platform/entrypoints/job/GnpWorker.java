package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.gox;
import defpackage.gpj;
import defpackage.qez;
import defpackage.qhj;
import defpackage.qjk;
import defpackage.tvk;
import defpackage.tvn;
import defpackage.yfo;
import defpackage.yih;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GnpWorker extends CoroutineWorker {
    private static final tvn b = tvn.n("GnpSdk");
    public qez a;
    private final WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.c = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(yih yihVar) {
        yfo yfoVar = (yfo) qhj.a(this.e).Z().get(GnpWorker.class);
        if (yfoVar == null) {
            ((tvk) b.g()).s("Failed to inject dependencies.");
            return new gpj();
        }
        Object objB = yfoVar.b();
        objB.getClass();
        ((qjk) objB).a(this);
        qez qezVar = this.a;
        if (qezVar == null) {
            yks.c("gnpWorkerHandler");
            qezVar = null;
        }
        WorkerParameters workerParameters = this.c;
        gox goxVar = workerParameters.b;
        goxVar.getClass();
        return qezVar.a(goxVar, workerParameters.d, yihVar);
    }
}
