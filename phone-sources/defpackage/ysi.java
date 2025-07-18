package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysi extends yrp {
    private final yih f;

    public ysi(yil yilVar, yrz yrzVar, yjz yjzVar) {
        super(yilVar, yrzVar, false);
        this.f = wcq.R(yjzVar, this, this);
    }

    @Override // defpackage.yql
    protected final void K() throws Throwable {
        wae.J(this.f, this);
    }

    @Override // defpackage.ysa, defpackage.ysn
    public final Object a(Object obj, yih yihVar) {
        y();
        Object objA = super.a(obj, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.ysa, defpackage.ysn
    public final Object b(Object obj) {
        y();
        return super.b(obj);
    }

    @Override // defpackage.ysa, defpackage.ysn
    public final boolean e(Throwable th) {
        boolean zE = super.e(th);
        y();
        return zE;
    }
}
