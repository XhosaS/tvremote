package defpackage;

import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.AccountId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvs implements vtg {
    public static final zdy a = zdy.h("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker");
    public static final zxe b = new vvn();
    public final Executor c;
    public final vvf d;
    private final vhq f;
    private final zxe g = new vvo();
    private final zxe h = new vvp();
    public final zxe e = new vvq();
    private final zxe i = new vvr();

    public vvs(vhq vhqVar, Executor executor, vvf vvfVar) {
        this.f = vhqVar;
        this.c = executor;
        this.d = vvfVar;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(WorkerParameters workerParameters) {
        final zyd zydVarE = this.d.a.e(ccu.a.b("tiktok_account_work"));
        final zyd zydVarD = this.f.d();
        xaa xaaVarD = xab.d(zydVarE, zydVarD);
        Callable callable = new Callable() { // from class: vvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set set = (Set) zxn.o(zydVarD);
                Collection collection = (Collection) zxn.o(zydVarE);
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AccountId accountIdA = vvv.a(((ccr) it.next()).c);
                    if (!set.contains(accountIdA)) {
                        yyfVar.g(vvv.b(accountIdA));
                    }
                }
                return yyfVar.f();
            }
        };
        Executor executor = this.c;
        zyd zydVarA = xaaVarD.a(callable, executor);
        zxn.p(zydVarA, wyo.f(this.g), executor);
        zyd zydVarG = zuz.g(zydVarA, wyo.a(new yqi() { // from class: vvm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    vvs vvsVar = this.a;
                    zyd zydVarG2 = zuz.g(vvsVar.d.a.a((String) it.next()), new yqi() { // from class: vva
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, zwk.a);
                    zxn.p(zydVarG2, wyo.f(vvsVar.e), vvsVar.c);
                    yyfVar.g(zydVarG2);
                }
                return yyfVar.f();
            }
        }), executor);
        zxn.p(zydVarG, wyo.f(this.h), executor);
        zyd zydVarH = zuz.h(zydVarG, wyo.c(new zvi() { // from class: vvj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                vvf vvfVar = this.a.d;
                return zuz.g(vvfVar.a.f(), new yqi() { // from class: vvd
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, vvfVar.b);
            }
        }), executor);
        zxn.p(zydVarH, wyo.f(this.i), executor);
        return xab.d(zydVarG, zydVarH).a(new Callable() { // from class: vvk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new cbt(caz.b);
            }
        }, executor);
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
