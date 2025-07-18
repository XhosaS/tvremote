package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icp {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask");
    private static final Duration h;
    public final Context b;
    public final glk c;
    public ics d;
    public final ScheduledExecutorService e;
    public ServiceConnection f;
    public volatile int g;
    private final Handler i;
    private final iat j;

    static {
        Duration durationOfMillis = Duration.ofMillis(200L);
        durationOfMillis.getClass();
        h = durationOfMillis;
    }

    public icp(Context context, glk glkVar, iat iatVar) {
        context.getClass();
        glkVar.getClass();
        this.b = context;
        this.c = glkVar;
        this.j = iatVar;
        this.g = 1;
        this.i = new Handler(Looper.getMainLooper());
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        this.e = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public final zyd a(Collection collection, int i, zyu zyuVar) {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "start", 80, "MirrorSearchSettingsTask.kt")).v("Kicking off MirrorSearchSettingsTask. Retries Left=%d", i);
        if (this.d == null) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "start", 82, "MirrorSearchSettingsTask.kt")).u("No attached MirroredSettings Receiver to notify.");
            return zxy.a;
        }
        ico icoVar = new ico(this, collection, i, zyuVar);
        iat iatVar = this.j;
        Intent intent = new Intent("SearchSettingsServiceBind");
        ComponentName componentName = irm.a;
        if (iatVar.a.bindService(intent.setComponent(irm.w), icoVar, 65)) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "start", 138, "MirrorSearchSettingsTask.kt")).u("Binding to SearchSettingsService.");
            this.g = 2;
        } else {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "start", 141, "MirrorSearchSettingsTask.kt")).u("Failed to connect to SearchSettingsService.");
            b(collection, i, zyuVar);
        }
        this.f = icoVar;
        return zyuVar;
    }

    public final void b(final Collection collection, final int i, final zyu zyuVar) {
        if (zyuVar.isDone()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "maybeRetry", 161, "MirrorSearchSettingsTask.kt")).u("Already completed search setting mirroring");
        } else if (i <= 0) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "maybeRetry", 165, "MirrorSearchSettingsTask.kt")).u("Out of task retries for search setting mirroring");
            zyuVar.cancel(true);
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/settings/mirror/MirrorSearchSettingsTask", "maybeRetry", 171, "MirrorSearchSettingsTask.kt")).v("Retrying search setting mirroring. [Number of retries left=%d]", i);
            feq.e(this.i, h, new Runnable() { // from class: icm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(collection, i - 1, zyuVar);
                }
            });
        }
    }
}
