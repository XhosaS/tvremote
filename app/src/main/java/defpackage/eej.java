package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eej implements eli {
    final /* synthetic */ edf a;

    public eej(edf edfVar) {
        this.a = edfVar;
    }

    @Override // defpackage.eli
    public final void a(int i, int i2, int i3, int i4, int i5) {
        ecq ecqVar;
        edf edfVar = this.a;
        synchronized (edfVar) {
            ecqVar = edfVar.i;
        }
        if (ecqVar != null) {
            edfVar.l(ecqVar, i, i2, i3, i4, i5);
        }
    }
}
