package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aha implements coa {
    private final coa a;
    private cmh b;
    private cmi c;
    private cmh d;
    private cmf e;

    public aha(coa coaVar) {
        this.a = coaVar;
    }

    @Override // defpackage.coa
    public final long a(cmg cmgVar, long j, cmi cmiVar, long j2) {
        cmh cmhVar;
        cmh cmhVar2;
        cmf cmfVar = this.e;
        if (cmfVar != null && (cmhVar = this.b) != null && a.s(cmhVar.a, j) && this.c == cmiVar && (cmhVar2 = this.d) != null && a.s(cmhVar2.a, j2)) {
            return cmfVar.a;
        }
        long jA = this.a.a(cmgVar, j, cmiVar, j2);
        this.b = new cmh(j);
        this.c = cmiVar;
        this.d = new cmh(j2);
        this.e = new cmf(jA);
        return jA;
    }
}
