package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytr extends ysq {
    final Object g;
    final int h;
    final yuh i;
    volatile ytv j = yug.b;

    public ytr(Object obj, int i, yuh yuhVar) {
        this.g = obj;
        this.h = i;
        this.i = yuhVar;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final int a() {
        return this.h;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final ytv d() {
        return this.j;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final yuh e() {
        return this.i;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.ysq, defpackage.yuh
    public final void p(ytv ytvVar) {
        this.j = ytvVar;
    }
}
