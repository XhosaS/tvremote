package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afvs implements Runnable {
    final /* synthetic */ afwb a;

    public afvs(afwb afwbVar) {
        this.a = afwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afwb afwbVar = this.a;
        afwbVar.l = null;
        if (afwbVar.i.d()) {
            afwbVar.c();
        }
    }
}
