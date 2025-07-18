package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfc implements Runnable {
    final /* synthetic */ lfg a;

    public lfc(lfg lfgVar) {
        this.a = lfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lfg lfgVar = this.a;
        lfgVar.c = lfgVar.h;
    }
}
