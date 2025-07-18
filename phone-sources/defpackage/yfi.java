package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yfi extends yfe {
    private final AtomicInteger l;
    private xrv m;

    public yfi(xrp xrpVar) {
        super(xrpVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new xro(xrr.a);
    }

    private final xrv g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((yfc) it.next()).d);
        }
        return new yfh(arrayList, this.l);
    }

    private final void h(xqk xqkVar, xrv xrvVar) {
        if (xqkVar == this.k && xrvVar.equals(this.m)) {
            return;
        }
        this.h.f(xqkVar, xrvVar);
        this.k = xqkVar;
        this.m = xrvVar;
    }

    @Override // defpackage.yfe
    protected final yfc e(Object obj) {
        return new yfg(this, obj, this.j);
    }

    @Override // defpackage.yfe
    protected final void f() {
        ArrayList arrayList = new ArrayList();
        for (yfc yfcVar : this.g) {
            if (yfcVar.c == xqk.READY) {
                arrayList.add(yfcVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(xqk.READY, g(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            xqk xqkVar = ((yfc) it.next()).c;
            xqk xqkVar2 = xqk.CONNECTING;
            if (xqkVar == xqkVar2 || xqkVar == xqk.IDLE) {
                h(xqkVar2, new xro(xrr.a));
                return;
            }
        }
        h(xqk.TRANSIENT_FAILURE, g(this.g));
    }
}
