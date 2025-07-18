package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class puy {
    public static volatile boolean a = false;
    public final Context b;
    public final qbv c;
    public final prj d;
    public final prk e;
    public final pxv f;
    public final pxy g;
    public final pnj h;
    public final pkn i;
    public final qds j;
    public final qca k;
    public final qcu l;
    public final yqt m;
    public final Executor n;
    public final yqt o;
    public final phg p;
    public final qcf q;
    public final qba r;

    public puy(Context context, qbv qbvVar, pxv pxvVar, pxy pxyVar, prj prjVar, prk prkVar, pnj pnjVar, pkn pknVar, qds qdsVar, qca qcaVar, qcu qcuVar, yqt yqtVar, Executor executor, yqt yqtVar2, phg phgVar, qcf qcfVar, qba qbaVar) {
        this.b = context;
        this.c = qbvVar;
        this.f = pxvVar;
        this.g = pxyVar;
        this.d = prjVar;
        this.e = prkVar;
        this.h = pnjVar;
        this.i = pknVar;
        this.j = qdsVar;
        this.k = qcaVar;
        this.l = qcuVar;
        this.m = yqtVar;
        this.n = executor;
        this.o = yqtVar2;
        this.p = phgVar;
        this.q = qcfVar;
        this.r = qbaVar;
    }

    public final zyd a() {
        return zuz.h(this.f.a(), wyo.c(new zvi() { // from class: ptv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final puy puyVar = this.a;
                return zuz.h(puyVar.g.a(), wyo.c(new zvi() { // from class: ptu
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return puyVar.e.b();
                    }
                }), puyVar.n);
            }
        }), this.n);
    }

    public final zyd b(pia piaVar) {
        return this.r.b("mdd_" + piaVar.s);
    }

    public final zyd c(final boolean z, final zvi zviVar) {
        int i = qce.a;
        return zuz.h(d(), wyo.c(new zvi() { // from class: puv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                puy puyVar = this.a;
                if (!puyVar.p.P()) {
                    return zxy.a;
                }
                final zvi zviVar2 = zviVar;
                final boolean z2 = z;
                puyVar.c.k(1031);
                final prj prjVar = puyVar.d;
                return zuz.h(prjVar.d.d(), wyo.c(wyo.c(new zvi() { // from class: por
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final prj prjVar2 = prjVar;
                            if (!it.hasNext()) {
                                return qft.a(arrayList).a(new Callable() { // from class: pqn
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, prjVar2.h);
                            }
                            final piy piyVar = (piy) it.next();
                            if (!piyVar.g) {
                                final zvi zviVar3 = zviVar2;
                                final boolean z3 = z2;
                                zyd zydVarG = prjVar2.d.g(piyVar);
                                zvi zviVar4 = new zvi() { // from class: pqm
                                    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
                                    @Override // defpackage.zvi
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final defpackage.zyd a(java.lang.Object r10) {
                                        /*
                                            Method dump skipped, instructions count: 243
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqm.a(java.lang.Object):zyd");
                                    }
                                };
                                arrayList.add(zuz.h(zydVarG, wyo.c(zviVar4), prjVar2.h));
                            }
                        }
                    }
                })), prjVar.h);
            }
        }), this.n);
    }

    public final zyd d() {
        if (a) {
            return zxy.a;
        }
        qfr qfrVarC = qfr.c(zxy.a);
        zvi zviVar = new zvi() { // from class: puj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                puy puyVar = this.a;
                final SharedPreferences sharedPreferencesA = qer.a(puyVar.b, "gms_icing_mdd_manager_metadata", puyVar.m);
                if (sharedPreferencesA.getBoolean("mdd_migrated_to_offroad", false)) {
                    return zxy.a;
                }
                int i = qce.a;
                zyd zydVarA = puyVar.a();
                yqi yqiVar = new yqi() { // from class: pto
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        boolean z = puy.a;
                        sharedPreferencesA.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                        return null;
                    }
                };
                return zuz.g(zydVarA, wyo.a(yqiVar), puyVar.n);
            }
        };
        Executor executor = this.n;
        return qfrVarC.g(zviVar, executor).g(new zvi() { // from class: puk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final puy puyVar = this.a;
                pxv pxvVar = puyVar.f;
                Context context = pxvVar.a;
                SharedPreferences sharedPreferencesA = qer.a(context, "gms_icing_mdd_shared_file_manager_metadata", pxvVar.j);
                if (sharedPreferencesA.contains("migrated_to_new_file_key")) {
                    if (sharedPreferencesA.getBoolean("migrated_to_new_file_key", false)) {
                        ptn.d(context);
                    }
                    sharedPreferencesA.edit().remove("migrated_to_new_file_key").commit();
                }
                zyd zydVarH = zxn.h(true);
                zvi zviVar2 = new zvi() { // from class: pua
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return zxy.a;
                        }
                        puy puyVar2 = puyVar;
                        qce.h("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                        return puyVar2.a();
                    }
                };
                return zuz.h(zydVarH, wyo.c(zviVar2), puyVar.n);
            }
        }, executor).g(new zvi() { // from class: pul
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final puy puyVar = this.a;
                return zuz.h(puyVar.g.d(), wyo.c(new zvi() { // from class: ptz
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return zxy.a;
                        }
                        puy puyVar2 = puyVar;
                        qce.h("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                        return puyVar2.a();
                    }
                }), puyVar.n);
            }
        }, executor).g(new zvi() { // from class: pum
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.e.f();
            }
        }, executor).e(new yqi() { // from class: pun
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                puy.a = true;
                return null;
            }
        }, executor);
    }
}
