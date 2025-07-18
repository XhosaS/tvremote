package defpackage;

import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mig implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ mig(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((HomeLauncherActivity) obj).finishAndRemoveTask();
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    int i = kqc.i;
                    rwl.b();
                    break;
                }
                break;
            case 2:
                ((tvk) pec.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/SqliteClearcutEventsStore", "cleanupEventsBeforeTimestampMs", 229, "SqliteClearcutEventsStore.java")).v("Deleted %d Clearcut events", (Integer) obj);
                break;
            case 3:
                ((tvk) pec.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/SqliteClearcutEventsStore", "cleanupEventsForAccountsNotOnDevice", 246, "SqliteClearcutEventsStore.java")).v("Deleted %d Visual Elements events for accounts not on device", (Integer) obj);
                break;
            case 4:
                ((tvk) pel.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/SqliteVisualElementEventsStore", "cleanupEventsBeforeTimestampMs", 190, "SqliteVisualElementEventsStore.java")).v("Deleted %d Visual Elements events for accounts not on device", (Integer) obj);
                break;
            case 5:
                ((tvk) pel.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/SqliteVisualElementEventsStore", "clearAll", 172, "SqliteVisualElementEventsStore.java")).v("Deleted %d Visual Element events", (Integer) obj);
                break;
            case 6:
                ((tvk) ((tvk) ((tvk) pgh.a.g()).i((Throwable) obj)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "persistUserChoice", 156, "UserActionUtilImpl.java")).s("Failed to persist dialog button click.");
                break;
            case 7:
                ((tvk) pie.a.f()).v("Failed to increase permission request count", (Throwable) obj);
                break;
            case 8:
                tpx tpxVar = tqi.a;
                ((tqv) obj).a();
                break;
            default:
                ((tqv) obj).a();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
