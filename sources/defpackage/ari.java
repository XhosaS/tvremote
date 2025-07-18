package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ari implements cpi {
    private final cpm a;
    private final /* synthetic */ int b;

    public ari(cpm cpmVar, int i) {
        this.b = i;
        this.a = cpmVar;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        Looper looper;
        int i = 0;
        switch (this.b) {
            case 0:
                return new arh(cph.b(this.a));
            case 1:
                return Boolean.valueOf(crc.a.aL().e((Context) ((cpj) this.a).a));
            case 2:
                return new arw((arx) this.a.a());
            case 3:
                Boolean bool = (Boolean) ((byg) ((cpj) this.a).a).d(false);
                bool.booleanValue();
                return bool;
            case 4:
                return new asw((auc) this.a.a());
            case 5:
                return new att((asw) this.a.a());
            case 6:
                return new asz((Context) ((cpj) this.a).a);
            case 7:
                return new auc(cph.b(this.a));
            case 8:
                Context context = (Context) ((cpj) this.a).a;
                int i2 = aev.b;
                boolean z = afp.a;
                try {
                    i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                }
                return Integer.valueOf(i);
            case 9:
                Context context2 = (Context) ((cpj) this.a).a;
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new dln(packageInfo.versionName, packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                    ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", 92, "PrimesCoreMetricDaggerModule.java")).t("Failed to get PackageInfo for: %s", packageName);
                    return new dln((String) null, 0);
                }
            case 10:
                return new aun((byu) this.a.a());
            case 11:
                Object cbfVar = Build.VERSION.SDK_INT >= 30 ? new cbf((auh) this.a.a()) : cbd.a;
                cbfVar.getClass();
                return cbfVar;
            case 12:
                byg bygVar = (byg) ((cpj) this.a).a;
                if (bygVar.f()) {
                    looper = (Looper) bygVar.b();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 13:
                return new axt(this.a);
            case 14:
                return new cbf((auh) this.a.a());
            case 15:
                return new awn((char[]) null);
            case 16:
                return new bmn((Context) ((cpj) this.a).a);
            case 17:
                return new bnt((Context) ((cpj) this.a).a);
            case 18:
                return new bny((Context) ((cpj) this.a).a);
            case 19:
                return new bqe((Context) ((cpj) this.a).a);
            default:
                return new btf((Context) ((cpj) this.a).a);
        }
    }
}
