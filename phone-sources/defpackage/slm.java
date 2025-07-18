package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slm implements ufw {
    public final List a;
    public final Executor b;

    public slm(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.ufw
    public final /* bridge */ /* synthetic */ uhp a(Object obj) {
        zft zftVar = (zft) obj;
        List<slq> list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (slq slqVar : list) {
            arrayList.add(sfy.F(new rjs(slqVar, 8), slqVar.b));
        }
        ufw ufwVarC = trc.c(new prm(this, arrayList, size, 3));
        tpv tpvVar = ((smc) zftVar.a).c;
        ugk ugkVar = ugk.a;
        return ufn.j(sil.c(ufn.j(sfy.D(tpvVar.c()), trc.c(new oyy(zftVar, ufwVarC, ugkVar, 11, (byte[]) null)), ugkVar)), trc.c(new prm(this, size, arrayList, 4)), ugkVar);
    }
}
