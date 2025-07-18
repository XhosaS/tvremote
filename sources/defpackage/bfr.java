package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr implements cht {
    public final List a;
    public final Executor b;

    public bfr(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.cht
    public final /* bridge */ /* synthetic */ cja a(Object obj) {
        List list = this.a;
        byj byjVar = (byj) obj;
        int i = ((cax) list).c;
        ArrayList arrayList = new ArrayList(i);
        cbk it = ((bzs) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((bfo) it.next()).b());
        }
        cht chtVarB = bxr.b(new bfq(this, arrayList, i, 1));
        bwk bwkVar = ((bgc) byjVar.a).b;
        chz chzVar = chz.a;
        return chk.i(wz.d(chk.i(qm.L(bwkVar.c()), bxr.b(new bfx(byjVar, chtVarB, chzVar, 3)), chzVar)), bxr.b(new bfq(this, i, arrayList, 0)), chzVar);
    }
}
