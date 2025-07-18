package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytp extends ytr {
    volatile long a;
    yuh b;
    yuh c;

    public ytp(Object obj, int i, yuh yuhVar) {
        super(obj, i, yuhVar);
        this.a = Long.MAX_VALUE;
        int i2 = yug.x;
        ytl ytlVar = ytl.a;
        this.b = ytlVar;
        this.c = ytlVar;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final yuh f() {
        return this.b;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final yuh h() {
        return this.c;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final void l(yuh yuhVar) {
        this.b = yuhVar;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final void n(yuh yuhVar) {
        this.c = yuhVar;
    }
}
