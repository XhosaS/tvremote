package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afwx implements Runnable {
    final /* synthetic */ afwy a;

    public afwx(afwy afwyVar) {
        this.a = afwyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.a.f;
        afyfVar.G = true;
        afog afogVar = afyfVar.C;
        afxs afxsVar = afyfVar.A;
        afogVar.a(afxsVar.a, afxsVar.b, afxsVar.c);
    }
}
