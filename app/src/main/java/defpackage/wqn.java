package defpackage;

import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqn implements vtg {
    public final vtm a;
    public final zyg b;
    private final woh c;
    private final wqe d;
    private final boolean e;

    public wqn(woh wohVar, vtm vtmVar, wqe wqeVar, zyg zygVar, boolean z) {
        this.c = wohVar;
        this.a = vtmVar;
        this.d = wqeVar;
        this.b = zygVar;
        this.e = z;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(final WorkerParameters workerParameters) {
        return !this.e ? zxn.h(new cbt(caz.b)) : this.d instanceof wrc ? zuz.g(this.c.b(), wyo.a(new yqi() { // from class: wql
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new cbt(caz.b);
            }
        }), zwk.a) : zuz.h(this.c.a(), wyo.c(new zvi() { // from class: wqm
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final wqn wqnVar = this.a;
                vtm vtmVar = wqnVar.a;
                final WorkerParameters workerParameters2 = workerParameters;
                return vqv.a(zuz.h(vtmVar.d("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), wyo.c(new zvi() { // from class: wqi
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final WorkerParameters workerParameters3 = workerParameters2;
                            final wqn wqnVar2 = wqnVar;
                            if (!it.hasNext()) {
                                return zxn.a(arrayList).b(wyo.b(new zvh() { // from class: wqk
                                    @Override // defpackage.zvh
                                    public final zyd a() {
                                        return wqnVar2.a.b(workerParameters3.a);
                                    }
                                }), wqnVar2.b);
                            }
                            ccr ccrVar = (ccr) it.next();
                            UUID uuid = workerParameters3.a;
                            UUID uuid2 = ccrVar.a;
                            if (!uuid.equals(uuid2)) {
                                arrayList.add(wqnVar2.a.b(uuid2));
                            }
                        }
                    }
                }), wqnVar.b), new Callable() { // from class: wqj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new cbr(caz.b);
                    }
                }, zwk.a);
            }
        }), this.b);
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
