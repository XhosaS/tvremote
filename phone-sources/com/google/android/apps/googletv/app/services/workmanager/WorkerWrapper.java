package com.google.android.apps.googletv.app.services.workmanager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.kmj;
import defpackage.tui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkerWrapper extends CoroutineWorker {
    private static final tui a = tui.l("com/google/android/apps/googletv/app/services/workmanager/WorkerWrapper");
    private final WorkerParameters b;
    private final kmj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper(Context context, WorkerParameters workerParameters, kmj kmjVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        kmjVar.getClass();
        this.b = workerParameters;
        this.c = kmjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r8) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper.a(yih):java.lang.Object");
    }
}
