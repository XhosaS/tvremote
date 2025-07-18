package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqr extends yid implements yqe {
    public static final yqr a = new yqr();

    private yqr() {
        super(yqe.c);
    }

    @Override // defpackage.yqe
    @yfp
    public final Object p(yih yihVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.yqe
    @yfp
    public final CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.yqe
    @yfp
    public final ypm r(yjv yjvVar) {
        return yqs.a;
    }

    @Override // defpackage.yqe
    @yfp
    public final ypm s(boolean z, boolean z2, yjv yjvVar) {
        return yqs.a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.yqe
    public final boolean u() {
        return true;
    }

    @Override // defpackage.yqe
    public final boolean v() {
        return false;
    }

    @Override // defpackage.yqe
    public final boolean w() {
        throw null;
    }

    @Override // defpackage.yqe
    @yfp
    public final yoj x(yql yqlVar) {
        return yqs.a;
    }

    @Override // defpackage.yqe
    @yfp
    public final void y() {
    }

    @Override // defpackage.yqe
    @yfp
    public final void t(CancellationException cancellationException) {
    }
}
