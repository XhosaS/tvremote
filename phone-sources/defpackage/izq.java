package defpackage;

import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izq implements izo {
    private static final gou a;
    private final gpz b;
    private final ldv c;
    private final ihi d;
    private final isi e;

    static {
        gos gosVar = new gos();
        gosVar.c(2);
        a = gosVar.a();
    }

    public izq(gpz gpzVar, ldv ldvVar, ihi ihiVar, isi isiVar) {
        gpzVar.getClass();
        ldvVar.getClass();
        isiVar.getClass();
        this.b = gpzVar;
        this.c = ldvVar;
        this.d = ihiVar;
        this.e = isiVar;
    }

    private final void g(List list, boolean z) {
        if (this.d.a()) {
            ieg iegVarA = this.c.a();
            if (iegVarA.l()) {
                return;
            }
            String str = ((ksn) iegVarA.g()).a;
            vtw vtwVarM = kpu.a.m();
            vtwVarM.getClass();
            jyv.o(str, vtwVarM);
            jyv.p(z, vtwVarM);
            DesugarCollections.unmodifiableList(((kpu) vtwVarM.b).d).getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kpu kpuVar = (kpu) vtwVarM.b;
            vun vunVar = kpuVar.d;
            if (!vunVar.c()) {
                kpuVar.d = vuc.s(vunVar);
            }
            vsf.h(list, kpuVar.d);
            kpu kpuVarN = jyv.n(vtwVarM);
            gpz gpzVar = this.b;
            String str2 = "library_sync_" + str + "_" + list;
            gpo gpoVar = new gpo(WorkerWrapper.class);
            gpoVar.c(a);
            yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "library_sync_worker_key"), new yfw("library_sync_worker_data_key", kpuVarN.h())};
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < 2; i++) {
                yfw yfwVar = yfwVarArr[i];
                gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
            }
            gpoVar.e(gli.y(linkedHashMap));
            gpzVar.g(str2, 2, gpoVar.f());
        }
    }

    @Override // defpackage.izo
    public final void a(boolean z) {
        if (this.d.a()) {
            ieg iegVarA = this.c.a();
            if (iegVarA.l()) {
                return;
            }
            String str = ((ksn) iegVarA.g()).a;
            vtw vtwVarM = kpu.a.m();
            vtwVarM.getClass();
            jyv.o(str, vtwVarM);
            jyv.p(z, vtwVarM);
            gpz gpzVar = this.b;
            kpu kpuVarN = jyv.n(vtwVarM);
            gpo gpoVar = new gpo(WorkerWrapper.class);
            gpoVar.c(a);
            yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "library_sync_worker_key"), new yfw("library_sync_worker_data_key", kpuVarN.h())};
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < 2; i++) {
                yfw yfwVar = yfwVarArr[i];
                gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
            }
            String strConcat = "library_sync_".concat(str);
            gpoVar.e(gli.y(linkedHashMap));
            gpzVar.g(strConcat, 2, gpoVar.f());
        }
    }

    @Override // defpackage.izo
    public final void b() {
        ihi ihiVar = this.d;
        if (ihiVar.a()) {
            a(ihiVar.c());
        }
    }

    @Override // defpackage.izo
    public final void c(List list) {
        list.getClass();
        ihi ihiVar = this.d;
        if (ihiVar.a()) {
            g(list, ihiVar.c());
        }
    }

    @Override // defpackage.izo
    public final void d() {
        ieg iegVarA = this.c.a();
        if (iegVarA.l()) {
            return;
        }
        String str = ((ksn) iegVarA.g()).a;
        ihi ihiVar = this.d;
        String strConcat = "library_periodic_sync_".concat(str);
        if (!ihiVar.a()) {
            this.b.a(strConcat);
            return;
        }
        vtw vtwVarM = kpu.a.m();
        vtwVarM.getClass();
        jyv.o(str, vtwVarM);
        xmp xmpVar = ihiVar.a;
        kpu kpuVarN = jyv.n(vtwVarM);
        long jLongValue = ((Long) xmq.a.c(10, "UmpLibraryV2Feature__library_sync_job_interval_millis", 86400000L).et(((xmq) xmpVar).b)).longValue();
        gpv gpvVar = new gpv(WorkerWrapper.class, jLongValue, TimeUnit.MILLISECONDS);
        gpvVar.c(a);
        yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "library_sync_worker_key"), new yfw("library_sync_worker_data_key", kpuVarN.h())};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 2; i++) {
            yfw yfwVar = yfwVarArr[i];
            gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
        }
        gpvVar.e(gli.y(linkedHashMap));
        if (!this.e.i.i) {
            a(false);
            gpvVar.d(jLongValue, TimeUnit.MILLISECONDS);
        }
        if (ihiVar.e()) {
            gpvVar.d(jLongValue, TimeUnit.MILLISECONDS);
        }
        this.b.f(strConcat, 2, gpvVar.f());
    }

    @Override // defpackage.izo
    public final void e(ksy ksyVar) {
        ihi ihiVar = this.d;
        if (ihiVar.a()) {
            g(yfm.p(hju.t(ksyVar)), ((Boolean) xmq.a.e(4, "UmpLibraryV2Feature__enable_strong_reads_on_post_purchase_sync", true).et(((xmq) ihiVar.a).b)).booleanValue());
        }
    }

    @Override // defpackage.izo
    public final void f(wni wniVar) {
        ksy ksyVarR = hju.r(wniVar);
        ksyVarR.getClass();
        e(ksyVarR);
    }
}
