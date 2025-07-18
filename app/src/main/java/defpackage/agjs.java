package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjs extends agfo {
    final Iterable a;
    final aggz b;
    final int c;

    public agjs(Iterable iterable, aggz aggzVar, int i) {
        this.a = iterable;
        this.b = aggzVar;
        this.c = i;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        agfr[] agfrVarArr = new agfo[8];
        int i = 0;
        for (agfr agfrVar : this.a) {
            if (i == agfrVarArr.length) {
                agfr[] agfrVarArr2 = new agfr[(i >> 2) + i];
                System.arraycopy(agfrVarArr, 0, agfrVarArr2, 0, i);
                agfrVarArr = agfrVarArr2;
            }
            agfrVarArr[i] = agfrVar;
            i++;
        }
        if (i == 0) {
            aghe.c(agfsVar);
            return;
        }
        agjr agjrVar = new agjr(agfsVar, this.b, i, this.c);
        agjq[] agjqVarArr = agjrVar.c;
        agfs agfsVar2 = agjrVar.a;
        int length = agjqVarArr.length;
        agfsVar2.d(agjrVar);
        for (int i2 = 0; i2 < length && !agjrVar.g && !agjrVar.f; i2++) {
            agfrVarArr[i2].m(agjqVarArr[i2]);
        }
    }
}
