package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yst extends yvl {
    private final ysm d;
    private final boolean e;
    private final ynr f;

    public yst(ysm ysmVar, boolean z, yil yilVar, int i, int i2) {
        super(yilVar, i, i2);
        this.d = ysmVar;
        this.e = z;
        this.f = new ynr(false, ynv.a);
    }

    private final void g() {
        if (this.e) {
            if (ynr.a.getAndSet(this.f, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
        }
    }

    @Override // defpackage.yvl, defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) throws Throwable {
        if (this.b == -3) {
            g();
            Object objL = vyf.L(ysyVar, this.d, this.e, yihVar);
            if (objL == yio.a) {
                return objL;
            }
        } else {
            Object objH = yvl.h(this, ysyVar, yihVar);
            if (objH == yio.a) {
                return objH;
            }
        }
        return ygi.a;
    }

    @Override // defpackage.yvl
    public final Object b(ysk yskVar, yih yihVar) throws Throwable {
        Object objL = vyf.L(new ywd(yskVar), this.d, this.e, yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    @Override // defpackage.yvl
    protected final yvl c(yil yilVar, int i, int i2) {
        return new yst(this.d, this.e, yilVar, i, i2);
    }

    @Override // defpackage.yvl
    protected final String d() {
        ysm ysmVar = this.d;
        Objects.toString(ysmVar);
        return "channel=".concat(ysmVar.toString());
    }

    @Override // defpackage.yvl
    public final ysm e(yow yowVar) {
        g();
        return this.b == -3 ? this.d : super.e(yowVar);
    }

    @Override // defpackage.yvl
    public final ysx f() {
        return new yst(this.d, this.e);
    }

    public /* synthetic */ yst(ysm ysmVar, boolean z) {
        this(ysmVar, z, yim.a, -3, 1);
    }
}
