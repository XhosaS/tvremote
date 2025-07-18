package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxy implements Runnable {
    final /* synthetic */ afyc a;

    public afxy(afyc afycVar) {
        this.a = afycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.a.b;
        afyfVar.G = true;
        afog afogVar = afyfVar.C;
        afxs afxsVar = afyfVar.A;
        afogVar.a(afxsVar.a, afxsVar.b, afxsVar.c);
    }
}
