package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkc implements rjq {
    private final rjk a;
    private final prj b = new rkb(this);
    private final List c = new ArrayList();
    private final rjv d;
    private final riv e;
    private final rzy f;
    private final vvd g;

    public rkc(Context context, riv rivVar, rjk rjkVar, tst tstVar, rju rjuVar) {
        context.getClass();
        rivVar.getClass();
        this.e = rivVar;
        this.a = rjkVar;
        this.d = rjuVar.a(context, rjkVar, new klo(this, 2));
        this.g = new vvd(context, rivVar, rjkVar, tstVar);
        this.f = new rzy(rivVar, context);
    }

    public static uhp g(uhp uhpVar) {
        return szg.l(uhpVar, new prn(19), ugk.a);
    }

    @Override // defpackage.rjq
    public final uhp a() {
        return this.g.e(new prn(20));
    }

    @Override // defpackage.rjq
    public final uhp b() {
        return this.g.e(new rke(1));
    }

    @Override // defpackage.rjq
    public final void c(rjp rjpVar) {
        List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                this.d.a();
                szg.n(this.a.a(), new qvj(this, 4), ugk.a);
            }
            list.add(rjpVar);
        }
    }

    @Override // defpackage.rjq
    public final void d(rjp rjpVar) {
        List list = this.c;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(rjpVar);
            if (list.isEmpty()) {
                this.d.b();
            }
        }
    }

    @Override // defpackage.rjq
    public final uhp e(String str, int i) {
        return this.f.i(new rka(1), str, i);
    }

    @Override // defpackage.rjq
    public final uhp f(String str, int i) {
        return this.f.i(new rka(0), str, i);
    }

    public final void h(Account account) {
        pro proVarA = this.e.a(account);
        Object obj = proVarA.b;
        prj prjVar = this.b;
        synchronized (obj) {
            proVarA.a.remove(prjVar);
        }
        proVarA.e(prjVar, ugk.a);
    }

    public final void i() {
        List list = this.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((rjp) it.next()).a();
            }
        }
    }
}
