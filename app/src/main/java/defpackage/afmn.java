package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmn implements Runnable {
    final /* synthetic */ afmp a;

    public afmn(afmp afmpVar) {
        this.a = afmpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afmp afmpVar = this.a;
        afvb afvbVar = afmpVar.b;
        afeh afehVar = afmpVar.h;
        afvbVar.e();
        afmpVar.h = afehVar;
        afmpVar.b.b();
    }
}
