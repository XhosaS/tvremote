package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euq {
    public static final int a;
    public final ComponentName b;
    public final JobScheduler c;

    static {
        a = (Build.VERSION.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    public euq(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = new ComponentName(applicationContext, (Class<?>) eup.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.c = jobScheduler;
    }
}
