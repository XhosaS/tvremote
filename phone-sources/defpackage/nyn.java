package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyn extends nyy {
    final /* synthetic */ nyr a;
    final /* synthetic */ onl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyn(nyx nyxVar, nyr nyrVar, onl onlVar) {
        super(nyxVar);
        this.a = nyrVar;
        this.b = onlVar;
    }

    @Override // defpackage.nyy
    public final void a() {
        nyr nyrVar = this.a;
        if (nyrVar.l(0)) {
            onl onlVar = this.b;
            nve nveVar = onlVar.b;
            if (!nveVar.c()) {
                if (!nyrVar.n(nveVar)) {
                    nyrVar.j(nveVar);
                    return;
                } else {
                    nyrVar.i();
                    nyrVar.k();
                    return;
                }
            }
            obz obzVar = onlVar.c;
            ocv.aF(obzVar);
            nve nveVar2 = obzVar.c;
            if (!nveVar2.c()) {
                String strValueOf = String.valueOf(String.valueOf(nveVar2));
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                nyrVar.j(nveVar2);
                return;
            }
            nyrVar.f = true;
            obm obmVarA = obzVar.a();
            ocv.aF(obmVarA);
            nyrVar.k = obmVarA;
            nyrVar.g = obzVar.d;
            nyrVar.h = obzVar.e;
            nyrVar.k();
        }
    }
}
