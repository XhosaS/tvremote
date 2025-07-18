package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytz extends WeakReference implements yuh {
    final int g;
    final yuh h;
    volatile ytv i;

    public ytz(ReferenceQueue referenceQueue, Object obj, int i, yuh yuhVar) {
        super(obj, referenceQueue);
        this.i = yug.b;
        this.g = i;
        this.h = yuhVar;
    }

    @Override // defpackage.yuh
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yuh
    public final ytv d() {
        return this.i;
    }

    @Override // defpackage.yuh
    public final yuh e() {
        return this.h;
    }

    public yuh f() {
        throw new UnsupportedOperationException();
    }

    public yuh g() {
        throw new UnsupportedOperationException();
    }

    public yuh h() {
        throw new UnsupportedOperationException();
    }

    public yuh i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yuh
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(yuh yuhVar) {
        throw new UnsupportedOperationException();
    }

    public void m(yuh yuhVar) {
        throw new UnsupportedOperationException();
    }

    public void n(yuh yuhVar) {
        throw new UnsupportedOperationException();
    }

    public void o(yuh yuhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yuh
    public final void p(ytv ytvVar) {
        this.i = ytvVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
