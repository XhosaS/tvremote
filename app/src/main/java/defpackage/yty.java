package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yty extends ytz {
    volatile long a;
    yuh b;
    yuh c;
    volatile long d;
    yuh e;
    yuh f;

    public yty(ReferenceQueue referenceQueue, Object obj, int i, yuh yuhVar) {
        super(referenceQueue, obj, i, yuhVar);
        this.a = Long.MAX_VALUE;
        int i2 = yug.x;
        ytl ytlVar = ytl.a;
        this.b = ytlVar;
        this.c = ytlVar;
        this.d = Long.MAX_VALUE;
        this.e = ytlVar;
        this.f = ytlVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final long c() {
        return this.d;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh f() {
        return this.b;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh g() {
        return this.e;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh h() {
        return this.c;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh i() {
        return this.f;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void l(yuh yuhVar) {
        this.b = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void m(yuh yuhVar) {
        this.e = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void n(yuh yuhVar) {
        this.c = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void o(yuh yuhVar) {
        this.f = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void q(long j) {
        this.d = j;
    }
}
