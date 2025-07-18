package defpackage;

import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqx implements vtg {
    public static final zdy a = zdy.h("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    static final vtq b = new vte(1, TimeUnit.DAYS);
    public final vtm c;
    public final wqe d;
    public final rnw e;
    public final zyg f;
    private final woh g;
    private final boolean h;

    public wqx(woh wohVar, vtm vtmVar, wqe wqeVar, zyg zygVar, rnw rnwVar, boolean z) {
        this.g = wohVar;
        this.c = vtmVar;
        this.d = wqeVar;
        this.f = zygVar;
        this.e = rnwVar;
        this.h = z;
    }

    static String e(yqt yqtVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat("");
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(final WorkerParameters workerParameters) {
        if (!this.h) {
            return c(workerParameters);
        }
        if (!(this.d instanceof wrj)) {
            zyd zydVarA = this.g.a();
            zvi zviVarC = wyo.c(new zvi() { // from class: wqw
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return this.a.c(workerParameters);
                }
            });
            return zuz.h(zydVarA, wyo.c(zviVarC), this.f);
        }
        zyd zydVarB = this.g.b();
        zvi zviVar = new zvi() { // from class: wqt
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                wqx wqxVar = this.a;
                wrj wrjVar = (wrj) wqxVar.d;
                if (wqxVar.e.a()) {
                    WorkerParameters workerParameters2 = workerParameters;
                    if (!workerParameters2.c.contains(wqx.e(wrjVar.c()))) {
                        ((zdv) ((zdv) wqx.a.b()).q("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 141, "SyncPeriodicWorker.java")).u("Cancelling Sync worker since it has the wrong tag");
                        return wqxVar.c.b(workerParameters2.a);
                    }
                }
                return zxy.a;
            }
        };
        zyd zydVarH = zuz.h(zydVarB, wyo.c(zviVar), this.f);
        yqi yqiVar = new yqi() { // from class: wqu
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                zdy zdyVar = wqx.a;
                return new cbt(caz.b);
            }
        };
        zwk zwkVar = zwk.a;
        return zud.g(zuz.g(zydVarH, wyo.a(yqiVar), zwkVar), Throwable.class, wyo.a(new yqi() { // from class: wqv
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                zdy zdyVar = wqx.a;
                return new cbs();
            }
        }), zwkVar);
    }

    public final zyd c(final WorkerParameters workerParameters) {
        Iterator it = workerParameters.c.iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker")) {
                zyd zydVarD = this.c.d(str);
                zvi zviVar = new zvi() { // from class: wqr
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((List) obj).iterator();
                        while (true) {
                            final WorkerParameters workerParameters2 = workerParameters;
                            final wqx wqxVar = this.a;
                            if (!it2.hasNext()) {
                                return xab.a(arrayList).b(new zvh() { // from class: wqq
                                    @Override // defpackage.zvh
                                    public final zyd a() {
                                        return wqxVar.c.b(workerParameters2.a);
                                    }
                                }, wqxVar.f);
                            }
                            ccr ccrVar = (ccr) it2.next();
                            UUID uuid = workerParameters2.a;
                            UUID uuid2 = ccrVar.a;
                            if (!uuid.equals(uuid2)) {
                                arrayList.add(wqxVar.c.b(uuid2));
                            }
                        }
                    }
                };
                return vqv.a(zuz.h(zydVarD, wyo.c(zviVar), this.f), new Callable() { // from class: wqs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new cbr(caz.b);
                    }
                }, zwk.a);
            }
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
