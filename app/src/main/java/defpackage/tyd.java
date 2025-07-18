package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyd implements tyf {
    @Override // defpackage.tyf
    public final void a(adkf adkfVar, twb twbVar) {
        int iA = adke.a(adkfVar.b);
        if (iA == 0 || iA == 1) {
            abxc abxcVar = adkn.b;
            if (abxcVar.a != adkf.a) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            if (adkfVar.n.n(abxcVar.d)) {
                twbVar.e();
            }
        }
    }
}
