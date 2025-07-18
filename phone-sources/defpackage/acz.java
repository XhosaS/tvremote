package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acz implements bwz {
    private final jz a;
    private final cvi b;

    public acz(cvi cviVar) {
        this.b = cviVar;
        int i = ka.a;
        this.a = new jz((byte[]) null);
    }

    @Override // defpackage.bwz
    public final void a(bwy bwyVar) {
        jz jzVar = this.a;
        jzVar.e();
        ke keVar = bwyVar.a;
        Object[] objArr = keVar.b;
        long[] jArr = keVar.c;
        int i = keVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            Object objN = this.b.n(obj);
            int iC = jzVar.c(objN, 0);
            int i2 = (int) (j & 2147483647L);
            if (iC == 7) {
                bwyVar.remove(obj);
            } else {
                jzVar.g(objN, iC + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.bwz
    public final boolean b(Object obj, Object obj2) {
        cvi cviVar = this.b;
        return yks.e(cviVar.n(obj), cviVar.n(obj2));
    }
}
