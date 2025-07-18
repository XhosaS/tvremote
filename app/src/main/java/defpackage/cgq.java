package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgq implements cea, chv, cdk {
    private static final String b = cbx.d("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final cgo e;
    private boolean f;
    private final cdy i;
    private final cak j;
    private final cic l;
    private final cgs m;
    private final cfo n;
    private final coe o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final ceh h = ceh.a.a(true);
    private final Map k = new HashMap();

    public cgq(Context context, cak cakVar, cjh cjhVar, cdy cdyVar, cfo cfoVar, coe coeVar) {
        this.c = context;
        ccm ccmVar = cakVar.e;
        this.e = new cgo(this, ccmVar);
        this.m = new cgs(ccmVar, cfoVar);
        this.o = coeVar;
        this.l = new cic(cjhVar);
        this.j = cakVar;
        this.i = cdyVar;
        this.n = cfoVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(cnl.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // defpackage.cdk
    public final void a(ckp ckpVar, boolean z) {
        ahdl ahdlVar;
        cee ceeVarA = this.h.a(ckpVar);
        if (ceeVarA != null) {
            this.m.a(ceeVarA);
        }
        synchronized (this.g) {
            ahdlVar = (ahdl) this.d.remove(ckpVar);
        }
        if (ahdlVar != null) {
            cbx cbxVarC = cbx.c();
            String str = b;
            Objects.toString(ckpVar);
            cbxVarC.a(str, "Stopping tracking for ".concat(ckpVar.toString()));
            ahdlVar.s(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(ckpVar);
        }
    }

    @Override // defpackage.cea
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            cbx.c();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        cbx.c().a(b, "Cancelling work ID ".concat(String.valueOf(str)));
        cgo cgoVar = this.e;
        if (cgoVar != null && (runnable = (Runnable) cgoVar.d.remove(str)) != null) {
            cgoVar.c.a(runnable);
        }
        for (cee ceeVar : this.h.d(str)) {
            this.m.a(ceeVar);
            cfm.a(this.n, ceeVar);
        }
    }

    @Override // defpackage.cea
    public final void c(cld... cldVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            cbx.c();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<cld> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (cld cldVar : cldVarArr) {
            ckp ckpVarA = cmk.a(cldVar);
            ceh cehVar = this.h;
            if (!cehVar.e(ckpVarA)) {
                synchronized (this.g) {
                    ckp ckpVarA2 = cmk.a(cldVar);
                    Map map = this.k;
                    cgp cgpVar = (cgp) map.get(ckpVarA2);
                    if (cgpVar == null) {
                        int i = cldVar.m;
                        ccn ccnVar = this.j.i;
                        cgpVar = new cgp(i, System.currentTimeMillis());
                        map.put(ckpVarA2, cgpVar);
                    }
                    jMax = cgpVar.b + (Math.max((cldVar.m - cgpVar.a) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(cldVar.a(), jMax);
                ccn ccnVar2 = this.j.i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (cldVar.d == ccq.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        cgo cgoVar = this.e;
                        if (cgoVar != null) {
                            String str = cldVar.c;
                            Map map2 = cgoVar.d;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                cgoVar.c.a(runnable);
                            }
                            cgn cgnVar = new cgn(cgoVar, cldVar);
                            map2.put(str, cgnVar);
                            cgoVar.c.b(jMax2 - System.currentTimeMillis(), cgnVar);
                        }
                    } else if (cldVar.c()) {
                        caq caqVar = cldVar.l;
                        if (caqVar.d) {
                            cbx.c().a(b, a.c(cldVar, "Ignoring ", ". Requires device idle."));
                        } else if (caqVar.a()) {
                            cbx.c().a(b, a.c(cldVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(cldVar);
                            hashSet2.add(cldVar.c);
                        }
                    } else if (!cehVar.e(cmk.a(cldVar))) {
                        cbx.c().a(b, "Starting work for ".concat(cldVar.c));
                        cee ceeVarC = cehVar.c(cldVar);
                        this.m.b(ceeVarC);
                        this.n.a(ceeVarC, null);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                cbx.c().a(b, a.j(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (cld cldVar2 : hashSet) {
                    ckp ckpVarA3 = cmk.a(cldVar2);
                    Map map3 = this.d;
                    if (!map3.containsKey(ckpVarA3)) {
                        map3.put(ckpVarA3, cif.a(this.l, cldVar2, this.o.b, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.cea
    public final boolean d() {
        return false;
    }

    @Override // defpackage.chv
    public final void e(cld cldVar, chl chlVar) {
        boolean z = chlVar instanceof chj;
        ckp ckpVarA = cmk.a(cldVar);
        if (z) {
            ceh cehVar = this.h;
            if (cehVar.e(ckpVarA)) {
                return;
            }
            cbx cbxVarC = cbx.c();
            String str = b;
            Objects.toString(ckpVarA);
            cbxVarC.a(str, "Constraints met: Scheduling work ID ".concat(ckpVarA.toString()));
            cee ceeVarB = cehVar.b(ckpVarA);
            this.m.b(ceeVarB);
            this.n.a(ceeVarB, null);
            return;
        }
        cbx cbxVarC2 = cbx.c();
        String str2 = b;
        Objects.toString(ckpVarA);
        cbxVarC2.a(str2, "Constraints not met: Cancelling work ID ".concat(ckpVarA.toString()));
        cee ceeVarA = this.h.a(ckpVarA);
        if (ceeVarA != null) {
            this.m.a(ceeVarA);
            this.n.b(ceeVarA, ((chk) chlVar).a);
        }
    }
}
