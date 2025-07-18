package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aeit implements bcj {
    final /* synthetic */ aeiu a;

    public aeit(aeiu aeiuVar) {
        this.a = aeiuVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        if (bceVar == bce.ON_DESTROY) {
            aeiu aeiuVar = this.a;
            aeiuVar.a = null;
            aeiuVar.b = null;
            aeiuVar.c = null;
        }
    }
}
