package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fih implements fin {
    public final long a;
    public final long b;
    public final fiq c;
    public long d;
    private final fim e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public fih(fiq fiqVar, long j, long j2, long j3, long j4, boolean z) {
        a.H(j >= 0 && j2 > j);
        this.c = fiqVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new fim();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    @Override // defpackage.fin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.fdq r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fih.a(fdq):long");
    }

    @Override // defpackage.fin
    public final /* bridge */ /* synthetic */ fef b() {
        if (this.d != 0) {
            return new fig(this);
        }
        return null;
    }

    @Override // defpackage.fin
    public final void c(long j) {
        this.h = edt.t(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
