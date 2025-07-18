package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yew extends wbb {
    public final yev a;
    private Object b;
    private boolean c;

    public yew() {
        throw null;
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        if (!xtkVar.g()) {
            this.a.e(new xtn(xtkVar, xsmVar));
            return;
        }
        if (!this.c) {
            this.a.e(new xtn(xtk.j.e("No value received for unary call"), xsmVar));
        }
        this.a.b(this.b);
    }

    @Override // defpackage.wbb
    public final void d(Object obj) {
        if (this.c) {
            throw new xtn(xtk.j.e("More than one value received for unary call"));
        }
        this.b = obj;
        this.c = true;
    }

    public yew(yev yevVar) {
        super(null);
        this.c = false;
        this.a = yevVar;
    }

    @Override // defpackage.wbb
    public final void c(xsm xsmVar) {
    }
}
