package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haf implements gyi {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask");
    public final agow a;
    private final hag c;
    private final agow d;
    private final gyx e;
    private final Set f;
    private final Set g;

    public haf(agow agowVar, hag hagVar, agow agowVar2) {
        agowVar.getClass();
        hagVar.getClass();
        agowVar2.getClass();
        this.a = agowVar;
        this.c = hagVar;
        this.d = agowVar2;
        this.e = gyx.J;
        this.f = hag.a;
        this.g = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = null;
            List historicalProcessExitReasons = ((ActivityManager) this.a.a()).getHistoricalProcessExitReasons(null, 0, 10);
            historicalProcessExitReasons.getClass();
            Iterator it = historicalProcessExitReasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (agvy.c(ms$$ExternalSyntheticApiModelOutline0.m(next).getProcessName(), this.d.a())) {
                    obj = next;
                    break;
                }
            }
            ApplicationExitInfo applicationExitInfoM = ms$$ExternalSyntheticApiModelOutline0.m(obj);
            if (applicationExitInfoM != null) {
                switch (applicationExitInfoM.getReason()) {
                    case 0:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 78, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_UNKNOWN", new qsk(this.c));
                        break;
                    case 1:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 83, "ProcessExitReasonTask.kt")).F("%s was restarted due to REASON_EXIT_SELF(%s)", new qsk(this.c), new qsg(applicationExitInfoM.getStatus()));
                        break;
                    case 2:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 92, "ProcessExitReasonTask.kt")).F("%s was restarted due to REASON_SIGNALED(%s)", new qsk(this.c), new qsg(applicationExitInfoM.getStatus()));
                        break;
                    case 3:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 99, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_LOW_MEMORY", new qsk(this.c));
                        break;
                    case 4:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 102, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_CRASH", new qsk(this.c));
                        break;
                    case 5:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 105, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_CRASH_NATIVE", new qsk(this.c));
                        break;
                    case 6:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 108, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_ANR", new qsk(this.c));
                        break;
                    case 7:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 113, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_INITIALIZATION_FAILURE", new qsk(this.c));
                        break;
                    case 8:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 118, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_PERMISSION_CHANGE", new qsk(this.c));
                        break;
                    case 9:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 123, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_EXCESSIVE_RESOURCE_USAGE", new qsk(this.c));
                        break;
                    case 10:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 128, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_USER_REQUESTED", new qsk(this.c));
                        break;
                    case 11:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 131, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_USER_STOPPED", new qsk(this.c));
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 136, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_DEPENDENCY_DIED", new qsk(this.c));
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 139, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_OTHER", new qsk(this.c));
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 142, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_FREEZER", new qsk(this.c));
                        break;
                    case 15:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 147, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_PACKAGE_STATE_CHANGE", new qsk(this.c));
                        break;
                    case 16:
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 152, "ProcessExitReasonTask.kt")).x("%s was restarted due to REASON_PACKAGE_UPDATED", new qsk(this.c));
                        break;
                    default:
                        ((zdv) b.d().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 157, "ProcessExitReasonTask.kt")).D("%s was restarted due to unknown reason %s", new qsk(this.c), applicationExitInfoM.getReason());
                        break;
                }
            } else {
                ((zdv) b.d().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 167, "ProcessExitReasonTask.kt")).I("%s was restarted, but exit reason wasn't in the first %s of historical processes: %s", new qsk(this.c), new qsg(10L), new zea() { // from class: hae
                    @Override // defpackage.zea
                    public final Object a() {
                        List historicalProcessExitReasons2 = ((ActivityManager) this.a.a.a()).getHistoricalProcessExitReasons(null, 0, 0);
                        historicalProcessExitReasons2.getClass();
                        ArrayList arrayList = new ArrayList(agqq.i(historicalProcessExitReasons2, 10));
                        Iterator it2 = historicalProcessExitReasons2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(ms$$ExternalSyntheticApiModelOutline0.m(it2.next()).getProcessName());
                        }
                        return arrayList;
                    }
                });
            }
        } else {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/process/ProcessExitReasonTask", "run", 184, "ProcessExitReasonTask.kt")).x("%s was restarted, but exit reason isn't supported", new qsk(this.c));
        }
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
