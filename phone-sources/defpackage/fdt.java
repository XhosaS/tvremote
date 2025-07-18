package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdt implements fef {
    private final fdu a;
    private final long b;

    public fdt(fdu fduVar, long j) {
        this.a = fduVar;
        this.b = j;
    }

    private final feg d(long j, long j2) {
        return new feg((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.fef
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        fdu fduVar = this.a;
        fse fseVar = fduVar.k;
        eci.e(fseVar);
        Object obj = fseVar.b;
        Object obj2 = fseVar.a;
        long[] jArr = (long[]) obj;
        int iAz = edt.az(jArr, fduVar.b(j), false);
        feg fegVarD = d(iAz == -1 ? 0L : jArr[iAz], iAz != -1 ? ((long[]) obj2)[iAz] : 0L);
        if (fegVarD.b == j || iAz == jArr.length - 1) {
            return new fed(fegVarD, fegVarD);
        }
        int i = iAz + 1;
        return new fed(fegVarD, d(jArr[i], ((long[]) obj2)[i]));
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
