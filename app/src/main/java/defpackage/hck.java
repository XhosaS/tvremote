package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentResolver;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hck implements wlk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/providers/launcher/WidgetInfoUpdateReceiver");
    private static final Duration b;
    private static final Duration c;
    private final ContentResolver d;
    private final JobScheduler e;

    static {
        Duration durationOfHours = Duration.ofHours(2L);
        durationOfHours.getClass();
        Duration durationOfMinutes = Duration.ofMinutes(30L);
        durationOfMinutes.getClass();
        Duration durationPlus = durationOfHours.plus(durationOfMinutes);
        durationPlus.getClass();
        b = durationPlus;
        Duration durationOfHours2 = Duration.ofHours(12L);
        durationOfHours2.getClass();
        c = durationOfHours2;
    }

    public hck(ContentResolver contentResolver, JobScheduler jobScheduler) {
        this.d = contentResolver;
        this.e = jobScheduler;
    }

    private final void b(Duration duration) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/providers/launcher/WidgetInfoUpdateReceiver", "scheduleJob", 70, "WidgetInfoUpdateReceiver.kt")).x("scheduleJob in %s", duration);
        ComponentName componentName = irm.a;
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(12, irm.B).setRequiredNetworkType(1);
        requiredNetworkType.getClass();
        this.e.schedule(feq.a(requiredNetworkType, duration).build());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // defpackage.wlk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd a(android.content.Intent r5) {
        /*
            r4 = this;
            r5.getClass()
            r5.getAction()
            java.lang.String r5 = r5.getAction()
            if (r5 == 0) goto L7e
            int r0 = r5.hashCode()
            r1 = 0
            switch(r0) {
                case -880535073: goto L6f;
                case -19011148: goto L57;
                case 798292259: goto L4e;
                case 1142807947: goto L1e;
                case 1737074039: goto L15;
                default: goto L14;
            }
        L14:
            goto L7e
        L15:
            java.lang.String r0 = "android.intent.action.MY_PACKAGE_REPLACED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7e
            goto L77
        L1e:
            java.lang.String r0 = "com.google.android.katniss.action.START_SUGGESTION_STRINGS_UPDATES"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7e
            j$.util.concurrent.ThreadLocalRandom r5 = j$.util.concurrent.ThreadLocalRandom.current()
            r5.getClass()
            j$.time.Duration r0 = defpackage.hck.b
            j$.time.Duration r1 = defpackage.hck.c
            r0.getClass()
            r1.getClass()
            long r2 = r0.toMillis()
            long r0 = r1.toMillis()
            long r0 = r5.nextLong(r2, r0)
            j$.time.Duration r5 = j$.time.Duration.ofMillis(r0)
            r5.getClass()
            r4.b(r5)
            goto L7e
        L4e:
            java.lang.String r0 = "android.intent.action.BOOT_COMPLETED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7e
            goto L77
        L57:
            java.lang.String r0 = "android.intent.action.LOCALE_CHANGED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7e
            android.content.ContentResolver r5 = r4.d
            android.net.Uri r0 = defpackage.hcm.a
            r5.notifyChange(r0, r1)
            j$.time.Duration r5 = j$.time.Duration.ZERO
            r5.getClass()
            r4.b(r5)
            goto L7e
        L6f:
            java.lang.String r0 = "com.google.android.tvsearch.action.ASSISTANT_CAPABILITY_UPDATES"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L7e
        L77:
            android.content.ContentResolver r5 = r4.d
            android.net.Uri r0 = defpackage.hcm.a
            r5.notifyChange(r0, r1)
        L7e:
            zyd r5 = defpackage.zxy.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hck.a(android.content.Intent):zyd");
    }
}
