package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fer implements fef {
    final /* synthetic */ fes a;
    private final long b;

    public fer(fes fesVar, long j) {
        this.a = fesVar;
        this.b = j;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        fes fesVar = this.a;
        fed fedVarC = fesVar.a[0].c(j);
        int i = 1;
        while (true) {
            fev[] fevVarArr = fesVar.a;
            if (i >= fevVarArr.length) {
                return fedVarC;
            }
            fed fedVarC2 = fevVarArr[i].c(j);
            if (fedVarC2.a.c < fedVarC.a.c) {
                fedVarC = fedVarC2;
            }
            i++;
        }
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
