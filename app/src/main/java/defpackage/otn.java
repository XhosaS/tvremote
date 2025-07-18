package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otn {
    public static zyd a(lvf lvfVar) {
        final otm otmVar = new otm(lvfVar);
        lvfVar.l(zwk.a, new luu() { // from class: otl
            @Override // defpackage.luu
            public final void a(lvf lvfVar2) {
                boolean z = ((lvn) lvfVar2).a;
                otm otmVar2 = otmVar;
                if (z) {
                    otmVar2.cancel(false);
                    return;
                }
                if (lvfVar2.i()) {
                    otmVar2.p(lvfVar2.e());
                    return;
                }
                Exception excD = lvfVar2.d();
                if (excD == null) {
                    throw new IllegalStateException();
                }
                otmVar2.q(excD);
            }
        });
        return otmVar;
    }
}
