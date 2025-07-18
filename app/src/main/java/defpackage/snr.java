package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snr implements smy {
    public static final zfh a = zfh.i();
    public final aehf b;
    public final Executor c;
    public final yrp d;
    public final yrx e;

    public snr(aehf aehfVar, Executor executor, final Context context, yrx yrxVar) {
        this.b = aehfVar;
        this.c = executor;
        this.e = yrxVar;
        this.d = yru.a(new yrp() { // from class: snl
            @Override // defpackage.yrp
            public final Object eV() {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager == null) {
                    return "undefined";
                }
                activityManager.getMemoryInfo(memoryInfo);
                long j = memoryInfo.totalMem;
                return j <= 1073741824 ? "1" : j <= 2147483648L ? "2" : j <= 3221225472L ? "3" : j <= 4294967296L ? "4" : j <= 6442450944L ? "6" : j <= 8589934592L ? "8" : j <= 17179869184L ? "16" : ">16";
            }
        });
    }

    @Override // defpackage.smy
    public final void a() {
        ((uqo) ((sor) this.b.a()).d.eV()).a(1L, (String) this.d.eV());
    }

    @Override // defpackage.smy
    public final void b(sgo sgoVar, String str) {
        if (sgn.b(sgoVar.b) != 1) {
            return;
        }
        ((uqo) ((sor) this.b.a()).i.eV()).a(1L, str);
        ((zfd) ((zfd) a.d()).q("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl", "maybeLogClientInfoUndefined", 488, "MonitoringLoggerImpl.java")).x("#audio# Please specify the correct client info for %s as it will lead to failure in the future.", str);
    }
}
