package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btk implements cpi {
    private final cpm a;
    private final /* synthetic */ int b;

    public btk(cpm cpmVar, int i) {
        this.b = i;
        this.a = cpmVar;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new btj((buf) ((cpj) this.a).a);
            case 1:
                return new bth((buf) ((cpj) this.a).a);
            case 2:
                SharedPreferences sharedPreferences = ((Context) ((cpj) this.a).a).createDeviceProtectedStorageContext().getSharedPreferences("primes", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 3:
                return new adx((aqg) this.a.a(), (byte[]) null);
            case 4:
                dka dkaVarA = ((buj) this.a).a();
                axa axaVarD = axb.d();
                axaVarD.e = true == dkaVarA.f("primes_memory_metric_enabled", false) ? 3 : 2;
                return axaVarD.a();
            case 5:
                dka dkaVarA2 = ((buj) this.a).a();
                ayg aygVarD = aut.d();
                aygVarD.d(dkaVarA2.f("primes_crash_metric_enabled", true));
                return aygVarD.c();
            case 6:
                dka dkaVarA3 = ((buj) this.a).a();
                ayc aycVarD = ayd.d();
                aycVarD.c = true == dkaVarA3.f("primes_package_stats_metric_enabled", false) ? 3 : 2;
                return aycVarD.a();
            case 7:
                dka dkaVarA4 = ((buj) this.a).a();
                ayg aygVarD2 = ayh.d();
                aygVarD2.b(dkaVarA4.f("primes_timer_metric_enabled", true));
                return aygVarD2.a();
            default:
                return Boolean.valueOf(((buj) this.a).a().f("low_power_mode_support", true));
        }
    }
}
