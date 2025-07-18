package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yab extends xrx {
    public final xrp f;
    public xqk g = xqk.IDLE;
    private xru h;

    public yab(xrp xrpVar) {
        this.f = xrpVar;
    }

    @Override // defpackage.xrx
    public final xtk a(xrt xrtVar) {
        xzy xzyVar;
        Boolean bool;
        List list = xrtVar.a;
        if (list.isEmpty()) {
            xtk xtkVarE = xtk.k.e("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + xrtVar.b.toString());
            b(xtkVarE);
            return xtkVarE;
        }
        Object obj = xrtVar.c;
        if ((obj instanceof xzy) && (bool = (xzyVar = (xzy) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Long l = xzyVar.b;
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        xru xruVar = this.h;
        if (xruVar == null) {
            xrp xrpVar = this.f;
            xrk xrkVar = new xrk();
            xrkVar.c(list);
            xru xruVarB = xrpVar.b(xrkVar.a());
            xruVarB.c(new xzx(this, xruVarB, 0));
            this.h = xruVarB;
            e(xqk.CONNECTING, new xzz(xrr.c(xruVarB)));
            xruVarB.a();
        } else {
            xruVar.d(list);
        }
        return xtk.b;
    }

    @Override // defpackage.xrx
    public final void b(xtk xtkVar) {
        xru xruVar = this.h;
        if (xruVar != null) {
            xruVar.b();
            this.h = null;
        }
        e(xqk.TRANSIENT_FAILURE, new xzz(xrr.b(xtkVar)));
    }

    @Override // defpackage.xrx
    public final void c() {
        xru xruVar = this.h;
        if (xruVar != null) {
            xruVar.a();
        }
    }

    @Override // defpackage.xrx
    public final void d() {
        xru xruVar = this.h;
        if (xruVar != null) {
            xruVar.b();
        }
    }

    public final void e(xqk xqkVar, xrv xrvVar) {
        this.g = xqkVar;
        this.f.f(xqkVar, xrvVar);
    }
}
