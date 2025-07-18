package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pro implements pru, prv {
    public final Map a = Maps.newLinkedHashMap();
    public final Object b = new Object();
    public final Context c;
    public final tko d;
    public final nsf e;
    public final ntp f;
    private final nsf g;

    public pro(nsf nsfVar, Context context, nsf nsfVar2, ntp ntpVar, tko tkoVar) {
        this.g = nsfVar;
        this.c = context;
        this.e = nsfVar2;
        this.f = ntpVar;
        this.d = tkoVar;
    }

    public static boolean h(prt prtVar) {
        prs prsVar = prtVar.c;
        if (prsVar == null) {
            prsVar = prs.a;
        }
        return !prsVar.equals(prs.a);
    }

    public static boolean i(prt prtVar) {
        return !prt.a.equals(prtVar);
    }

    public static boolean j(prt prtVar, prk prkVar) {
        uzr uzrVar = prtVar.b;
        if (uzrVar == null) {
            uzrVar = uzr.a;
        }
        tpo tpoVarBA = ocv.bA(uzrVar);
        if (tpoVarBA != null) {
            return prkVar.a || !tpoVarBA.e;
        }
        return false;
    }

    public final tst a() {
        this.g.p();
        return trk.a;
    }

    public final uhp b(prk prkVar, int i) {
        return szg.m(c(), new prm(this, prkVar, i, 1), ugk.a);
    }

    public final uhp c() {
        return szg.m(this.g.p(), new pbb(this, 10), ugk.a);
    }

    public final uhp d() {
        return trf.d(this.f.p()).b(IOException.class, new pbb(this, 8), ugk.a);
    }

    public final void e(prj prjVar, Executor executor) {
        executor.getClass();
        synchronized (this.b) {
            this.a.put(prjVar, executor);
        }
    }

    @Override // defpackage.pru
    public final void f() {
        ImmutableMap immutableMapCopyOf;
        synchronized (this.b) {
            immutableMapCopyOf = ImmutableMap.copyOf(this.a);
        }
        UnmodifiableIterator it = immutableMapCopyOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            prj prjVar = (prj) entry.getKey();
            prjVar.getClass();
            executor.execute(trc.f(new pqi(prjVar, 7)));
        }
    }

    @Override // defpackage.prv
    public final void g() {
        ImmutableMap immutableMapCopyOf;
        synchronized (this.b) {
            immutableMapCopyOf = ImmutableMap.copyOf(this.a);
        }
        UnmodifiableIterator it = immutableMapCopyOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            prj prjVar = (prj) entry.getKey();
            prjVar.getClass();
            executor.execute(trc.f(new pqi(prjVar, 6)));
        }
    }
}
