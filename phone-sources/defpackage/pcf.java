package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pcf implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vnw vnwVar = (vnw) obj;
        vtw vtwVarM = uyo.a.m();
        if ((vnwVar.b & 1) != 0) {
            boolean z = vnwVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyo uyoVar = (uyo) vtwVarM.b;
            uyoVar.b |= 1;
            uyoVar.c = z;
        }
        if ((vnwVar.b & 2) != 0) {
            tsl tslVar = pdl.a;
            vnl vnlVar = vnwVar.d;
            if (vnlVar == null) {
                vnlVar = vnl.a;
            }
            Object objApply = tslVar.apply(vnlVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyo uyoVar2 = (uyo) vtwVarM.b;
            objApply.getClass();
            uyoVar2.d = (uyc) objApply;
            uyoVar2.b |= 2;
        }
        if ((vnwVar.b & 8) != 0) {
            tsl tslVar2 = pdl.b;
            vnv vnvVar = vnwVar.e;
            if (vnvVar == null) {
                vnvVar = vnv.b;
            }
            Object objApply2 = tslVar2.apply(vnvVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyo uyoVar3 = (uyo) vtwVarM.b;
            objApply2.getClass();
            uyoVar3.e = (uyn) objApply2;
            uyoVar3.b |= 8;
        }
        return (uyo) vtwVarM.r();
    }
}
