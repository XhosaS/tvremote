package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fii implements fin {
    private final fdu b;
    private final fse d;
    public long a = -1;
    private long c = -1;

    public fii(fdu fduVar, fse fseVar) {
        this.b = fduVar;
        this.d = fseVar;
    }

    @Override // defpackage.fin
    public final long a(fdq fdqVar) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        this.c = -1L;
        return -(j + 2);
    }

    @Override // defpackage.fin
    public final fef b() {
        a.ab(this.a != -1);
        return new fdt(this.b, this.a);
    }

    @Override // defpackage.fin
    public final void c(long j) {
        long[] jArr = (long[]) this.d.b;
        this.c = jArr[edt.az(jArr, j, true)];
    }
}
