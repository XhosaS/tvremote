package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afvr implements Runnable {
    final /* synthetic */ afwb a;

    public afvr(afwb afwbVar) {
        this.a = afwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afwb afwbVar = this.a;
        afwbVar.p = null;
        afwbVar.i.b = 0;
        afwbVar.c();
    }
}
