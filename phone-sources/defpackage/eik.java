package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eik implements ttm {
    private final /* synthetic */ int a;

    public /* synthetic */ eik(int i) {
        this.a = i;
    }

    @Override // defpackage.ttm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ehz(new ezp(65536), 50000, 50000, 1000, 2000, -1, false);
            case 1:
                ttm ttmVar = eeu.a;
                return sfy.v(Executors.newSingleThreadExecutor());
            case 2:
                return elg.b();
            case 3:
                int i = fbp.a;
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 4:
                nsf nsfVar = noa.a;
                nmg nmgVarC = nmg.c();
                ocv.aF(nmgVarC);
                return nmgVarC.f().d;
            case 5:
                return new eik(6);
            case 6:
                return null;
            case 7:
                return a.p();
            case 8:
                return rrx.ao();
            case 9:
                return rtd.a();
            case 10:
                ttm ttmVar2 = ClearcutMetricSnapshotTransmitter.a;
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
            case 11:
                return new zai();
            case 12:
                Context context = rwv.a;
                return sfy.w(Executors.newSingleThreadScheduledExecutor(new rhw(2)));
            case 13:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i2 = runningAppProcessInfo.importance;
                } catch (RuntimeException e2) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
                }
                boolean z = runningAppProcessInfo.importance >= 400;
                return Boolean.valueOf(z);
            case 14:
                return trk.a;
            case 15:
                throw new IllegalStateException();
            case 16:
                return a.p();
            case 17:
                long j = uqv.a;
                return a.p();
            default:
                return true;
        }
    }
}
