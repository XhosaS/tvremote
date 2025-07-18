package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ysa extends ynw implements yrz {
    public final yrz b;

    public ysa(yil yilVar, yrz yrzVar, boolean z, boolean z2) {
        super(yilVar, z, z2);
        this.b = yrzVar;
    }

    @Override // defpackage.ysm
    public final boolean B() {
        return this.b.B();
    }

    @Override // defpackage.ysm
    public final yrr C() {
        return this.b.C();
    }

    @Override // defpackage.yql
    public final void H(Throwable th) {
        yrz yrzVar = this.b;
        CancellationException cancellationExceptionR = yql.R(this, th);
        yrzVar.t(cancellationExceptionR);
        M(cancellationExceptionR);
    }

    @Override // defpackage.ysn
    public Object a(Object obj, yih yihVar) {
        return this.b.a(obj, yihVar);
    }

    @Override // defpackage.ysn
    public Object b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.ysn
    public boolean e(Throwable th) {
        return this.b.e(th);
    }

    @Override // defpackage.ysn
    public final void eL(yjv yjvVar) {
        this.b.eL(yjvVar);
    }

    @Override // defpackage.ysn
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.ysm
    public final Object i(yih yihVar) {
        throw null;
    }

    @Override // defpackage.ysm
    public final Object j(yih yihVar) {
        throw null;
    }

    @Override // defpackage.ysm
    public final Object m() {
        return this.b.m();
    }

    @Override // defpackage.yql, defpackage.yqe
    public final void t(CancellationException cancellationException) {
        if (v()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new yqf(g(), null, this);
        }
        H(cancellationException);
    }

    public final yrz d() {
        return this;
    }
}
