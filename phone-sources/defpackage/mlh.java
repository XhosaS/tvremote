package defpackage;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlh implements kke {
    final /* synthetic */ Observable a;
    final /* synthetic */ scf b;
    final /* synthetic */ ulp c;
    private final /* synthetic */ int d;

    public /* synthetic */ mlh(jvt jvtVar, ulp ulpVar, ixi ixiVar, int i) {
        this.d = i;
        this.b = jvtVar;
        this.c = ulpVar;
        this.a = ixiVar;
    }

    @Override // defpackage.kke
    public final void d(List list) {
        if (this.d == 0) {
            mlc mlcVar = (mlc) this.a;
            Iterator it = mlcVar.b.iterator();
            list.getClass();
            if (Iterators.elementsEqual(it, list.iterator())) {
                return;
            }
            ((mle) this.b).b(list);
            mlcVar.b = list;
            ulp ulpVar = this.c;
            String str = mlcVar.a.a;
            ulpVar.az(new mlk());
            return;
        }
        if (list != null) {
            ((jvt) this.b).r(list);
        }
        Observable observable = this.a;
        vtw vtwVarM = wod.a.m();
        wot wotVar = ((wue) ((ixi) observable).b).c;
        if (wotVar == null) {
            wotVar = wot.a;
        }
        wos wosVar = wotVar.c;
        if (wosVar == null) {
            wosVar = wos.a;
        }
        String str2 = wosVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wod wodVar = (wod) vtwVarM.b;
        str2.getClass();
        wodVar.b = str2;
        List listAn = list != null ? yfm.an(list) : null;
        ulp ulpVar2 = this.c;
        listAn.getClass();
        vtwVarM.aO(listAn);
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        ulpVar2.az(new ixv((wod) vucVarR));
    }

    public mlh(mlc mlcVar, mle mleVar, ulp ulpVar, int i) {
        this.d = i;
        this.a = mlcVar;
        this.b = mleVar;
        this.c = ulpVar;
    }
}
