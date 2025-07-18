package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwu implements Runnable {
    final /* synthetic */ afwv a;

    public afwu(afwv afwvVar) {
        this.a = afwvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afwv afwvVar = this.a;
        afwt afwtVar = new afwt(afwvVar);
        afkc afkcVar = (afkc) afwvVar.b;
        afkcVar.c(afwtVar);
        afkcVar.b();
    }
}
