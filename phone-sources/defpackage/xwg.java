package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xwg extends xwj {
    public final xrs a;
    public final xqo b = xqo.b();
    public final xqe[] c;
    public volatile xtk d;
    final /* synthetic */ xwh e;

    public xwg(xwh xwhVar, xrs xrsVar, xqe[] xqeVarArr) {
        this.e = xwhVar;
        this.a = xrsVar;
        this.c = xqeVarArr;
    }

    @Override // defpackage.xwj
    protected final void b() {
        int i = 0;
        while (true) {
            xqe[] xqeVarArr = this.c;
            if (i >= xqeVarArr.length) {
                return;
            }
            xqe xqeVar = xqeVarArr[i];
            i++;
        }
    }

    @Override // defpackage.xwj, defpackage.xvk
    public final void g(xxi xxiVar) {
        if (this.a.a.h()) {
            xxiVar.a("wait_for_ready");
            xtk xtkVar = this.d;
            if (xtkVar != null && !xtkVar.g()) {
                xxiVar.b("Last Pick Failure", xtkVar);
            }
        }
        super.g(xxiVar);
    }

    @Override // defpackage.xwj, defpackage.xvk
    public final void h(xtk xtkVar) {
        super.h(xtkVar);
        xwh xwhVar = this.e;
        synchronized (xwhVar.a) {
            if (xwhVar.e != null) {
                boolean zRemove = xwhVar.g.remove(this);
                if (!xwhVar.g() && zRemove) {
                    xtq xtqVar = xwhVar.b;
                    xtqVar.b(xwhVar.d);
                    if (xwhVar.h.a != null) {
                        xtqVar.b(xwhVar.e);
                        xwhVar.e = null;
                    }
                }
            }
        }
        this.e.b.a();
    }
}
