package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ame implements coa {
    private final bkd a;
    private final amg b;
    private long c = 0;

    public ame(bkd bkdVar, amg amgVar) {
        this.a = bkdVar;
        this.b = amgVar;
    }

    @Override // defpackage.coa
    public final long a(cmg cmgVar, long j, cmi cmiVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return cmf.d(cmf.d(cmgVar.d(), cme.d(jA)), this.a.a(j2, 0L, cmiVar));
    }
}
