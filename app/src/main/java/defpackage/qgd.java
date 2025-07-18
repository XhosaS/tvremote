package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgd implements vtg {
    public final Set a;
    private final Context b;
    private final pjn c;
    private final zyg d;
    private final yrp e;
    private final String f;
    private final vtm g;

    public qgd(Context context, pjn pjnVar, yqt yqtVar, zyg zygVar, Set set, String str, vtm vtmVar) {
        this.b = context;
        this.c = pjnVar;
        this.d = zygVar;
        this.e = (yrp) ((yqz) yqtVar).a;
        this.a = set;
        this.f = str;
        this.g = vtmVar;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(WorkerParameters workerParameters) {
        if (!((Boolean) this.e.eV()).booleanValue()) {
            return zxn.h(new cbt(caz.b));
        }
        if (!this.f.equals(rnu.b())) {
            zyd zydVarB = this.g.b(workerParameters.a);
            yqi yqiVar = new yqi() { // from class: qga
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return new cbr(caz.b);
                }
            };
            return zuz.g(zydVarB, wyo.a(yqiVar), zwk.a);
        }
        workerParameters.b.a("MDD_TASK_TAG_KEY");
        Context context = this.b;
        pjn pjnVar = this.c;
        zyg zygVar = this.d;
        return qfr.c(new PeriodicWorker(context, workerParameters, pjnVar, zygVar).b()).e(new yqi() { // from class: qgb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                cbu cbuVar = (cbu) obj;
                zdm zdmVarListIterator = ((yxy) this.a.a).f().listIterator(0);
                while (zdmVarListIterator.hasNext()) {
                    try {
                        ((qgm) zdmVarListIterator.next()).a();
                    } catch (Exception unused) {
                    }
                }
                return cbuVar;
            }
        }, zygVar).a(Throwable.class, new yqi() { // from class: qgc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                zdm zdmVarListIterator = ((yxy) this.a.a).f().listIterator(0);
                while (zdmVarListIterator.hasNext()) {
                    ((qgm) zdmVarListIterator.next()).b();
                }
                return new cbr(caz.b);
            }
        }, zygVar);
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
