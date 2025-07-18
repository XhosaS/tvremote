package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnu {
    public static final nsf a = new nsf("ApplicationAnalytics");
    public final nnr b;
    public final nod c;
    public final nnw d;
    public final SharedPreferences e;
    public nnv f;
    public nmq g;
    private final Handler i = new ogh(Looper.getMainLooper());
    private final Runnable h = new mpz(this, 12);

    public nnu(SharedPreferences sharedPreferences, nnr nnrVar, nod nodVar, Bundle bundle, String str) {
        this.e = sharedPreferences;
        this.b = nnrVar;
        this.c = nodVar;
        this.d = new nnw(bundle, str);
    }

    public static String a() {
        nmg nmgVarC = nmg.c();
        ocv.aF(nmgVarC);
        return nmgVarC.f().d;
    }

    private final void i(CastDevice castDevice) {
        nnv nnvVar = this.f;
        if (nnvVar == null) {
            return;
        }
        nnvVar.d = castDevice.j;
        nnvVar.h = castDevice.a();
        nnvVar.i = castDevice.e;
        nnvVar.o = castDevice.b();
        nru nruVarD = castDevice.d();
        if (nruVarD != null) {
            String str = nruVarD.d;
            if (str != null) {
                nnvVar.j = str;
            }
            String str2 = nruVarD.e;
            if (str2 != null) {
                nnvVar.k = str2;
            }
            String str3 = nruVarD.f;
            if (str3 != null) {
                nnvVar.l = str3;
            }
            String str4 = nruVarD.g;
            if (str4 != null) {
                nnvVar.m = str4;
            }
            String str5 = nruVarD.h;
            if (str5 != null) {
                nnvVar.n = str5;
            }
        }
    }

    private final boolean j() {
        String str;
        if (this.f == null) {
            nsf.e();
            return false;
        }
        String strA = a();
        if (strA == null || (str = this.f.c) == null || !TextUtils.equals(str, strA)) {
            nsf.e();
            return false;
        }
        ocv.aF(this.f);
        return true;
    }

    public final void b() {
        this.i.removeCallbacks(this.h);
    }

    public final void c() {
        if (!j()) {
            a.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            d();
            return;
        }
        nmq nmqVar = this.g;
        CastDevice castDeviceC = nmqVar != null ? nmqVar.c() : null;
        if (castDeviceC != null && !TextUtils.equals(this.f.d, castDeviceC.j)) {
            i(castDeviceC);
        }
        ocv.aF(this.f);
    }

    public final void d() {
        nsf.e();
        nnv nnvVarA = nnv.a(this.c);
        this.f = nnvVarA;
        ocv.aF(nnvVarA);
        nmq nmqVar = this.g;
        nnvVarA.p = nmqVar != null && nmqVar.m();
        nnv nnvVar = this.f;
        ocv.aF(nnvVar);
        nnvVar.c = a();
        nmq nmqVar2 = this.g;
        CastDevice castDeviceC = nmqVar2 == null ? null : nmqVar2.c();
        if (castDeviceC != null) {
            i(castDeviceC);
        }
        nnv nnvVar2 = this.f;
        ocv.aF(nnvVar2);
        nmq nmqVar3 = this.g;
        nnvVar2.q = nmqVar3 != null ? nmqVar3.p() : 0;
        ocv.aF(this.f);
    }

    public final void e(int i) {
        nsf.e();
        c();
        this.b.a(this.d.b(this.f, i), 228);
        b();
        this.f = null;
    }

    public final void f() {
        SharedPreferences sharedPreferences = this.e;
        nnv nnvVar = this.f;
        if (sharedPreferences == null) {
            return;
        }
        nsf.e();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", nnvVar.c);
        editorEdit.putString("receiver_metrics_id", nnvVar.d);
        editorEdit.putLong("analytics_session_id", nnvVar.e);
        editorEdit.putInt("event_sequence_number", nnvVar.f);
        editorEdit.putString("receiver_session_id", nnvVar.g);
        editorEdit.putInt("device_capabilities", nnvVar.h);
        editorEdit.putString("device_model_name", nnvVar.i);
        editorEdit.putString("manufacturer", nnvVar.j);
        editorEdit.putString("product_name", nnvVar.k);
        editorEdit.putString("build_type", nnvVar.l);
        editorEdit.putString("cast_build_version", nnvVar.m);
        editorEdit.putString("system_build_number", nnvVar.n);
        editorEdit.putInt("device_category", nnvVar.o);
        editorEdit.putInt("analytics_session_start_type", nnvVar.q);
        editorEdit.putBoolean("is_output_switcher_enabled", nnvVar.p);
        editorEdit.apply();
    }

    public final void g() {
        Runnable runnable = this.h;
        ocv.aF(runnable);
        this.i.postDelayed(runnable, 300000L);
    }

    public final boolean h(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        ocv.aF(this.f);
        if (str != null && (str2 = this.f.g) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        nsf.e();
        return false;
    }
}
