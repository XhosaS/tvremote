package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afko implements bcj {
    final /* synthetic */ afji a;

    public afko(afji afjiVar) {
        this.a = afjiVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        if (bceVar == bce.ON_DESTROY) {
            bclVar.ek().c(this);
            this.a.a();
        }
    }
}
