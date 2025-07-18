package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.libraries.notifications.scheduled.impl.workmanager.ChimeScheduledTaskWorker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtd implements qsy {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    private final cb c;

    public qtd(Context context, cb cbVar) {
        this.b = context;
        this.c = cbVar;
    }

    private final void f(qen qenVar, int i, qsx qsxVar, Bundle bundle, long j) {
        byte[] bArrMarshall;
        gps gpsVarG;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gli.D("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", qsxVar.d(), linkedHashMap);
        if (bundle == null || bundle.isEmpty()) {
            bArrMarshall = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
        }
        if (bArrMarshall != null) {
            gli.C("notifications.scheduled.impl.workmanager.extraskey", bArrMarshall, linkedHashMap);
        }
        gos gosVar = new gos();
        gosVar.c(2);
        gou gouVarA = gosVar.a();
        String strE = e(qenVar != null ? Long.valueOf(qenVar.a) : null, i);
        if (qsxVar.e()) {
            gox goxVarY = gli.y(linkedHashMap);
            gpv gpvVar = new gpv(ChimeScheduledTaskWorker.class, qsxVar.a(), TimeUnit.MILLISECONDS);
            gpvVar.e(goxVarY);
            gpvVar.c(gouVarA);
            gpsVarG = fki.aV(this.b).f(strE, 1, gpvVar.f());
        } else {
            gox goxVarY2 = gli.y(linkedHashMap);
            gpo gpoVar = new gpo(ChimeScheduledTaskWorker.class);
            gpoVar.e(goxVarY2);
            gpoVar.c(gouVarA);
            if (j != 0) {
                gpoVar.d(j, TimeUnit.MILLISECONDS);
            }
            gpsVarG = fki.aV(this.b).g(strE, 1, gpoVar.f());
        }
        sfy.K(((gpt) gpsVarG).c, new qtc(this, qenVar, i), ugk.a);
    }

    @Override // defpackage.qsy
    public final void a(qen qenVar, int i) {
        String strE = e(qenVar == null ? null : Long.valueOf(qenVar.a), i);
        tvk tvkVar = (tvk) a.l().j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeTaskSchedulerApiImpl", "cancel", 96, "ChimeTaskSchedulerApiImpl.java");
        Context context = this.b;
        tvkVar.E("Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", context.getApplicationContext().getPackageName(), strE, Integer.valueOf(i));
        fki.aV(context).a(strE);
    }

    @Override // defpackage.qsy
    public final void b(qen qenVar, int i, qsx qsxVar, Bundle bundle) {
        f(qenVar, i, qsxVar, bundle, 0L);
    }

    @Override // defpackage.qsy
    public final void c(qen qenVar, int i, qsx qsxVar, Bundle bundle, long j) {
        sij.r(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        f(qenVar, i, qsxVar, bundle, j);
    }

    @Override // defpackage.qsy
    public final boolean d() {
        try {
            List list = (List) fki.aV(this.b).b(e(null, 7)).get();
            return (list == null || list.isEmpty()) ? false : true;
        } catch (InterruptedException | ExecutionException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeTaskSchedulerApiImpl", "isScheduled", 'U', "ChimeTaskSchedulerApiImpl.java")).s("Failed to check pending WorkInfos.");
            return false;
        }
    }

    public final String e(Long l, int i) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
            sij.r(jLongValue >= 0, "accountId must be >= 0, got: %s.", jLongValue);
            sij.r(jLongValue <= 998, "accountId must be <= 998, got: %s.", jLongValue);
        } else {
            jLongValue = 999;
        }
        cb cbVar = this.c;
        sij.q(true, "jobType must be >= 0, got: %s.", i);
        sij.q(true, "jobType must be <= 999, got: %s.", i);
        Integer num = ((qei) cbVar.a).g;
        num.getClass();
        num.intValue();
        return Integer.toString((i * 1000) + 111000000 + ((int) jLongValue));
    }
}
