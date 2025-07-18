package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rni implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public rni(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        Looper looper;
        switch (this.b) {
            case 0:
                return xpl.a.get().a((Context) ((xcn) this.a).a);
            case 1:
                return xpi.a.get().a((Context) ((xcn) this.a).a);
            case 2:
                return xpo.a.get().a((Context) ((xcn) this.a).a);
            case 3:
                return Boolean.valueOf(xpo.a.get().b((Context) ((xcn) this.a).a));
            case 4:
                return Boolean.valueOf(xpo.a.get().d((Context) ((xcn) this.a).a));
            case 5:
                return Boolean.valueOf(xpo.a.get().c((Context) ((xcn) this.a).a));
            case 6:
                return Boolean.valueOf(xoy.a.get().e((Context) ((xcn) this.a).a));
            case 7:
                return new rnv(xcl.a(this.a), 0);
            case 8:
                Boolean bool = (Boolean) ((tst) ((xcn) this.a).a).e(false);
                bool.booleanValue();
                return bool;
            case 9:
                return new roy((rqb) this.a.b());
            case 10:
                return new ulp((roy) this.a.b(), (byte[]) null);
            case 11:
                return new rpb((Context) ((xcn) this.a).a);
            case 12:
                return new rqb(xcl.a(this.a));
            case 13:
                Context context = (Context) ((xcn) this.a).a;
                int i = nvk.c;
                return Integer.valueOf(nwb.a(context));
            case 14:
                Context context2 = (Context) ((xcn) this.a).a;
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new zuw(packageInfo.versionName, packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                    ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", 92, "PrimesCoreMetricDaggerModule.java")).v("Failed to get PackageInfo for: %s", packageName);
                    return new zuw((String) null, 0);
                }
            case 15:
                return new rqk((tts) this.a.b());
            case 16:
                ImmutableSet immutableSetOf = Build.VERSION.SDK_INT >= 30 ? ImmutableSet.of((rqf) this.a.b()) : ImmutableSet.of();
                immutableSetOf.getClass();
                return immutableSetOf;
            case 17:
                tst tstVar = (tst) ((xcn) this.a).a;
                if (tstVar.g()) {
                    looper = (Looper) tstVar.c();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 18:
                return new rth(this.a);
            case 19:
                tst tstVar2 = (tst) ((xcn) this.a).a;
                trk trkVar = trk.a;
                return (rtp) tstVar2.e(new rtp(trkVar, trkVar));
            default:
                return ImmutableSet.of((rqf) this.a.b());
        }
    }
}
