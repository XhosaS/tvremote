package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nns implements nnn {
    final /* synthetic */ nnu a;

    public nns(nnu nnuVar) {
        this.a = nnuVar;
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void a(nnl nnlVar, int i) {
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.e(i);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void b(nnl nnlVar) {
        this.a.g = (nmq) nnlVar;
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void c(nnl nnlVar, int i) {
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.e(i);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void d(nnl nnlVar, boolean z) {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.c();
        ocv.aF(nnuVar.f);
        vtw vtwVarC = nnuVar.d.c(nnuVar.f);
        nnw.d(vtwVarC, z);
        nnuVar.b.a((uco) vtwVarC.r(), 227);
        nnuVar.f();
        nnuVar.g();
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void e(nnl nnlVar, String str) {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        if (nnuVar.h(str)) {
            nsf.e();
            ocv.aF(nnuVar.f);
        } else {
            SharedPreferences sharedPreferences = nnuVar.e;
            nod nodVar = nnuVar.c;
            long j = nnv.a;
            nnv nnvVar = null;
            boolean z = false;
            if (sharedPreferences != null) {
                nnv nnvVar2 = new nnv(nodVar);
                nnvVar2.p = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    nnvVar2.c = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        nnvVar2.d = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            nnvVar2.e = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                nnvVar2.f = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    nnvVar2.g = sharedPreferences.getString("receiver_session_id", "");
                                    nnvVar2.h = sharedPreferences.getInt("device_capabilities", 0);
                                    nnvVar2.i = sharedPreferences.getString("device_model_name", "");
                                    nnvVar2.j = sharedPreferences.getString("manufacturer", "");
                                    nnvVar2.k = sharedPreferences.getString("product_name", "");
                                    nnvVar2.l = sharedPreferences.getString("build_type", "");
                                    nnvVar2.m = sharedPreferences.getString("cast_build_version", "");
                                    nnvVar2.n = sharedPreferences.getString("system_build_number", "");
                                    nnvVar2.o = sharedPreferences.getInt("device_category", 0);
                                    nnvVar2.q = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    nnvVar = nnvVar2;
                                }
                            }
                        }
                    }
                }
            }
            nnuVar.f = nnvVar;
            if (nnuVar.h(str)) {
                nsf.e();
                ocv.aF(nnuVar.f);
                nnv.a = nnuVar.f.e + 1;
            } else {
                nsf.e();
                nnuVar.f = nnv.a(nodVar);
                nnv nnvVar3 = nnuVar.f;
                ocv.aF(nnvVar3);
                nmq nmqVar = nnuVar.g;
                if (nmqVar != null && nmqVar.m()) {
                    z = true;
                }
                nnvVar3.p = z;
                nnv nnvVar4 = nnuVar.f;
                ocv.aF(nnvVar4);
                nnvVar4.c = nnu.a();
                nnv nnvVar5 = nnuVar.f;
                ocv.aF(nnvVar5);
                nnvVar5.g = str;
            }
        }
        ocv.aF(nnuVar.f);
        vtw vtwVarC = nnuVar.d.c(nnuVar.f);
        ucn ucnVar = ((uco) vtwVarC.b).k;
        if (ucnVar == null) {
            ucnVar = ucn.a;
        }
        vtw vtwVarN = ucn.a.n(ucnVar);
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        ucn ucnVar2 = (ucn) vtwVarN.b;
        ucnVar2.b |= 64;
        ucnVar2.f = 10;
        ucn ucnVar3 = (ucn) vtwVarN.r();
        if (!vtwVarC.b.A()) {
            vtwVarC.u();
        }
        uco ucoVar = (uco) vtwVarC.b;
        ucnVar3.getClass();
        ucoVar.k = ucnVar3;
        ucoVar.c |= 2;
        nnw.d(vtwVarC, true);
        nnuVar.b.a((uco) vtwVarC.r(), 226);
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void f(nnl nnlVar, int i) {
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.e(i);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void g(nnl nnlVar, String str) {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.c();
        nnv nnvVar = nnuVar.f;
        nnvVar.g = str;
        nnuVar.b.a(nnuVar.d.a(nnvVar), 222);
        nnuVar.f();
        nnuVar.g();
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void h(nnl nnlVar) {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        if (nnuVar.f != null) {
            nsfVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        nnuVar.d();
        nnw nnwVar = nnuVar.d;
        nnv nnvVar = nnuVar.f;
        vtw vtwVarC = nnwVar.c(nnvVar);
        if (nnvVar.q == 1) {
            ucn ucnVar = ((uco) vtwVarC.b).k;
            if (ucnVar == null) {
                ucnVar = ucn.a;
            }
            vtw vtwVarN = ucn.a.n(ucnVar);
            if (!vtwVarN.b.A()) {
                vtwVarN.u();
            }
            ucn ucnVar2 = (ucn) vtwVarN.b;
            ucnVar2.b |= 64;
            ucnVar2.f = 17;
            ucn ucnVar3 = (ucn) vtwVarN.r();
            if (!vtwVarC.b.A()) {
                vtwVarC.u();
            }
            uco ucoVar = (uco) vtwVarC.b;
            ucnVar3.getClass();
            ucoVar.k = ucnVar3;
            ucoVar.c |= 2;
        }
        nnuVar.b.a((uco) vtwVarC.r(), 221);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void i(nnl nnlVar, int i) {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.g = (nmq) nnlVar;
        nnuVar.c();
        ocv.aF(nnuVar.f);
        nnuVar.b.a(nnuVar.d.b(nnuVar.f, i), 225);
        nnuVar.f();
        nnuVar.b();
    }
}
