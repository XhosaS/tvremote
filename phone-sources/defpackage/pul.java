package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pul implements puj {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final pvg c;
    public final qoj d;
    private final Set e;
    private final qgq f;

    public pul(Context context, Set set, qgq qgqVar, pvg pvgVar, qoj qojVar) {
        set.getClass();
        qgqVar.getClass();
        pvgVar.getClass();
        qojVar.getClass();
        this.b = context;
        this.e = set;
        this.f = qgqVar;
        this.c = pvgVar;
        this.d = qojVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.puj
    public final boolean a(final JobParameters jobParameters, final JobService jobService) {
        jobParameters.getClass();
        final int jobId = jobParameters.getJobId();
        final PersistableBundle extras = jobParameters.getExtras();
        extras.getClass();
        try {
            final String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            qsx qsxVar = null;
            if (string != null && string.length() != 0) {
                Iterator it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (yks.e(((qsx) next).d(), string)) {
                        qsxVar = next;
                        break;
                    }
                }
                qsxVar = qsxVar;
            }
            final qsx qsxVar2 = qsxVar;
            if (qsxVar2 == null) {
                ((tvk) a.f()).x("ChimeTask NOT found. Job ID: '%d', key: '%s'", jobId, string);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            a.l().x("Starting job execution. Job ID: '%d', key: '%s'", jobId, string);
            this.f.d(new Runnable() { // from class: puk
                @Override // java.lang.Runnable
                public final void run() {
                    JobService jobService2 = jobService;
                    JobParameters jobParameters2 = jobParameters;
                    PersistableBundle persistableBundle = extras;
                    qsx qsxVar3 = qsxVar2;
                    pul pulVar = this.a;
                    if (xdk.b()) {
                        pulVar.c.c().a();
                    }
                    boolean z = false;
                    try {
                        psy psyVarB = qsxVar3.b(new Bundle(persistableBundle));
                        pulVar.d.a(pulVar.b.getPackageName(), Build.VERSION.SDK_INT, false, qsxVar3.d(), false, psyVarB.c());
                        int i = psyVarB.c;
                        if (i == 0) {
                            throw new yfu();
                        }
                        String str = string;
                        int i2 = jobId;
                        int i3 = i - 1;
                        if (i3 == 1) {
                            ((tvk) ((tvk) pul.a.g()).i(psyVarB.b)).x("Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", i2, new uuf(uue.NO_USER_DATA, str));
                            z = true;
                        } else if (i3 != 2) {
                            pul.a.l().x("Job finished with SUCCESS code. Job ID: '%d', key: '%s'", i2, str);
                        } else {
                            ((tvk) ((tvk) pul.a.g()).i(psyVarB.b)).x("Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", i2, new uuf(uue.NO_USER_DATA, str));
                        }
                    } finally {
                        jobService2.jobFinished(jobParameters2, false);
                    }
                }
            }, qdo.b(180000L));
            return true;
        } catch (IllegalArgumentException e) {
            ((tvk) ((tvk) a.f()).i(e)).t("Error retrieving handler key for Job. Job ID: '%d'", jobId);
            return false;
        } catch (NullPointerException e2) {
            ((tvk) ((tvk) a.f()).i(e2)).t("Error retrieving handler key for Job. Job ID: '%d'", jobId);
            return false;
        }
    }

    @Override // defpackage.puj
    public final void b(JobParameters jobParameters) {
        jobParameters.getClass();
    }
}
