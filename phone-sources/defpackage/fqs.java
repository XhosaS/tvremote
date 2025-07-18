package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqs extends eay {
    private static final Object e = new Object();
    private final dzy f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final dzs j;
    private final long k;

    public fqs(fqt fqtVar) {
        this.f = fqtVar.ar();
        fqtVar.aC();
        this.g = fqtVar.a.t();
        fqtVar.aC();
        this.h = fqtVar.a.r();
        boolean z = false;
        if (!fqtVar.N().q() && fqtVar.N().p(fqtVar.bd(), new eax()).y) {
            z = true;
        }
        this.i = z;
        this.j = fqtVar.s() ? dzs.a : null;
        this.k = edt.y(fqtVar.d());
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        return e.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.eay
    public final int b() {
        return 1;
    }

    @Override // defpackage.eay
    public final int c() {
        return 1;
    }

    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        long j = this.k;
        Object obj = e;
        eavVar.m(obj, obj, j, 0L);
        eavVar.k = this.i;
        return eavVar;
    }

    @Override // defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        eaxVar.e(e, this.f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.g, this.h, this.j, 0L, this.k, 0, 0, 0L);
        eaxVar.y = this.i;
        return eaxVar;
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        return e;
    }
}
