package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwr extends xzn {
    private boolean b;
    private final xtk c;
    private final xvl d;
    private final xqe[] e;

    public xwr(xtk xtkVar, xvl xvlVar, xqe[] xqeVarArr) {
        sij.o(!xtkVar.g(), "error must not be OK");
        this.c = xtkVar;
        this.d = xvlVar;
        this.e = xqeVarArr;
    }

    @Override // defpackage.xzn, defpackage.xvk
    public final void g(xxi xxiVar) {
        xxiVar.b("error", this.c);
        xxiVar.b("progress", this.d);
    }

    @Override // defpackage.xzn, defpackage.xvk
    public final void o(xvm xvmVar) {
        sij.x(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            xqe[] xqeVarArr = this.e;
            if (i >= xqeVarArr.length) {
                xvmVar.a(this.c, this.d, new xsm());
                return;
            } else {
                xqe xqeVar = xqeVarArr[i];
                i++;
            }
        }
    }

    public xwr(xtk xtkVar, xqe[] xqeVarArr) {
        this(xtkVar, xvl.PROCESSED, xqeVarArr);
    }
}
