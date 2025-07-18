package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vza implements bbv {
    final /* synthetic */ bq a;
    final /* synthetic */ vzb b;

    public vza(vzb vzbVar, bq bqVar) {
        this.a = bqVar;
        this.b = vzbVar;
    }

    @Override // defpackage.bbv
    public final void b(bcl bclVar) {
        vzb vzbVar = this.b;
        vrl vrlVar = vzbVar.b;
        vrlVar.c();
        vrlVar.a();
        vze vzeVar = vzbVar.a;
        Iterator it = vzeVar.a.values().iterator();
        while (it.hasNext()) {
            ((vzq) it.next()).c();
        }
        Iterator it2 = vzeVar.b.values().iterator();
        while (it2.hasNext()) {
            ((vzq) it2.next()).c();
        }
        vrn vrnVar = vzeVar.c;
        uea.c();
        vrnVar.b.clear();
        vzeVar.d.clear();
    }

    @Override // defpackage.bbv
    public final void c(bcl bclVar) {
        vzb vzbVar = this.b;
        vzbVar.b.b();
        vze vzeVar = vzbVar.a;
        vrn vrnVar = vzeVar.c;
        uea.c();
        for (Map.Entry entry : vrnVar.c.entrySet()) {
            yqw.R(vrnVar.b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
        for (Integer num : vzeVar.b.keySet()) {
            yqw.P(vzeVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        vzbVar.a.e.b();
    }

    @Override // defpackage.bbv
    public final void d(bcl bclVar) {
        vzb vzbVar = this.b;
        vzbVar.a.e.c();
        vzbVar.b.c();
    }

    @Override // defpackage.bbv
    public final void eY(bcl bclVar) {
        bq bqVar = this.a;
        beu beuVar = new beu(bqVar.em());
        beuVar.b(bds.c, Bundle.EMPTY);
        bek bekVar = new bek(bqVar.el(), bqVar.dM(), beuVar);
        agwj agwjVar = agwi.a;
        this.b.a = (vze) bekVar.a(new agvq(vze.class));
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }
}
