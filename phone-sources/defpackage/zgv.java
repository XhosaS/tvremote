package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgv extends zhq {
    public zhq a;

    public zgv(zhq zhqVar) {
        zhqVar.getClass();
        this.a = zhqVar;
    }

    @Override // defpackage.zhq
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.zhq
    public final long h() {
        return this.a.h();
    }

    @Override // defpackage.zhq
    public final zhq i() {
        return this.a.i();
    }

    @Override // defpackage.zhq
    public final zhq j(long j) {
        return this.a.j(j);
    }

    @Override // defpackage.zhq
    public final zhq k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.k(10000L, timeUnit);
    }

    @Override // defpackage.zhq
    public final void l() throws InterruptedIOException {
        this.a.l();
    }

    @Override // defpackage.zhq
    public final zhq m() {
        return this.a.m();
    }
}
