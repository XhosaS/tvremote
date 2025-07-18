package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fja implements ecq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fja(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ecq
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            fit fitVar = (fit) obj;
            jdw jdwVar = new jdw(fitVar.b, fki.c(fitVar.a, fitVar.c), 1);
            fjb fjbVar = (fjb) this.a;
            fjbVar.a.add(jdwVar);
            long j = fjbVar.b;
            if (j == -9223372036854775807L || fitVar.d >= j) {
                fjbVar.h(jdwVar);
                return;
            }
            return;
        }
        if (i == 1) {
            ((eph) obj).x((Exception) this.a);
            return;
        }
        if (i == 2) {
            fqt fqtVar = (fqt) obj;
            fqtVar.aC();
            fqtVar.a.ac((eai) this.a);
            return;
        }
        if (i == 3) {
            fqt fqtVar2 = (fqt) obj;
            fqtVar2.aC();
            fqtVar2.a.ag((Surface) this.a);
            return;
        }
        fqt fqtVar3 = (fqt) obj;
        fqtVar3.aC();
        eao eaoVar = fqtVar3.a;
        eiz eizVar = (eiz) eaoVar;
        eizVar.aG();
        eab eabVar = eizVar.q;
        eab eabVar2 = (eab) this.a;
        if (eabVar2.equals(eabVar)) {
            return;
        }
        eizVar.q = eabVar2;
        eizVar.H.h(15, new ein(eaoVar, 5));
    }
}
