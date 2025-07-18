package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apb implements bns {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public apb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bxu, java.lang.Object] */
    @Override // defpackage.bns
    public final long a() {
        int i = this.b;
        if (i == 0) {
            return ((apc) this.a).a;
        }
        if (i == 1) {
            ?? r0 = this.a;
            long jA = ((aof) r0).a.a();
            if (jA != 16) {
                return jA;
            }
            aoz aozVar = (aoz) fh.P(r0, apa.a);
            if (aozVar != null) {
                long j = aozVar.a;
                if (j != 16) {
                    return j;
                }
            }
            long j2 = ((bnq) fh.P(r0, anx.a)).h;
            return (((anp) fh.P(r0, anq.a)).m() || ((double) bny.g(j2)) >= 0.5d) ? j2 : bnq.c;
        }
        if (i != 2) {
            return ((ato) this.a).a;
        }
        ?? r02 = this.a;
        long jA2 = ((arx) r02).c.a();
        if (jA2 != 16) {
            return jA2;
        }
        atl atlVar = (atl) fh.P(r02, atn.a);
        if (atlVar != null) {
            long j3 = atlVar.a;
            if (j3 != 16) {
                return j3;
            }
        }
        return ((bnq) fh.P(r02, arr.a)).h;
    }
}
