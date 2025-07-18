package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aibq implements Runnable {
    final /* synthetic */ aicf a;

    public aibq(aicf aicfVar) {
        this.a = aicfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aicf aicfVar = this.a;
        aicfVar.m = aicfVar.p;
        aicfVar.p = null;
        aicfVar.h();
    }
}
