package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfd implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ lfg b;

    public lfd(lfg lfgVar, long j) {
        this.a = j;
        this.b = lfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lfg lfgVar = this.b;
        lbk lbkVar = lfgVar.y;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        kstVar.e(this.a);
        lfgVar.c = null;
    }
}
