package com.google.android.libraries.notifications.scheduled.impl.workmanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.gli;
import defpackage.gox;
import defpackage.gpj;
import defpackage.gpk;
import defpackage.gpl;
import defpackage.psy;
import defpackage.qhj;
import defpackage.qhk;
import defpackage.tvk;
import defpackage.tvn;
import defpackage.uue;
import defpackage.uuf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeScheduledTaskWorker extends Worker {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;

    public ChimeScheduledTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = context;
    }

    @Override // androidx.work.Worker
    public final gli a() {
        qhk qhkVarA;
        byte[] bArrC;
        Bundle bundle;
        int length;
        try {
            qhkVarA = qhj.a(this.b);
        } catch (IllegalStateException e) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "getGnpComponent", 'U', "ChimeScheduledTaskWorker.java")).s("Failed to get GnpComponent for ChimeScheduledTaskWorker");
            qhkVarA = null;
        }
        if (qhkVarA == null) {
            return new gpj();
        }
        qhkVarA.x().a(this.b);
        gox goxVarG = g();
        String strA = goxVarG.a("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (goxVarG == null || (bArrC = goxVarG.c("notifications.scheduled.impl.workmanager.extraskey")) == null || (length = bArrC.length) == 0) {
            bundle = new Bundle();
        } else {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrC, 0, length);
            parcelObtain.setDataPosition(0);
            bundle = new Bundle();
            bundle.readFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
        psy psyVarA = qhkVarA.u().a(strA, bundle);
        int i = psyVarA.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            ((tvk) a.l().j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "doWork", 73, "ChimeScheduledTaskWorker.java")).v("Work finished with SUCCESS code. Job key: '%s'", strA);
            return new gpl();
        }
        if (i2 == 1) {
            ((tvk) ((tvk) ((tvk) a.g()).i(psyVarA.b)).j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "doWork", 62, "ChimeScheduledTaskWorker.java")).v("Work finished with TRANSIENT_FAILURE. Job key: '%s'", new uuf(uue.NO_USER_DATA, strA));
            return new gpk();
        }
        if (i2 != 2) {
            return new gpl();
        }
        ((tvk) ((tvk) ((tvk) a.g()).i(psyVarA.b)).j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeScheduledTaskWorker", "doWork", 68, "ChimeScheduledTaskWorker.java")).v("Work finished with PERMANENT_FAILURE. Job key: '%s'", new uuf(uue.NO_USER_DATA, strA));
        return new gpj();
    }
}
