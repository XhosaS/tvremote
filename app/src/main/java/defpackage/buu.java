package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class buu extends bvd {
    public boolean b;
    public boolean c;
    public aqn e;
    public Runnable g;
    public final /* synthetic */ bvc h;
    public long a = -1;
    public int d = 0;
    public final bvn f = new bvn();

    public buu(bvc bvcVar) {
        this.h = bvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buu.k():void");
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void a(bvc bvcVar) {
        this.c = true;
    }

    public final void h() {
        if (this.b) {
            k();
            this.e.d(this.h.r + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void i(Runnable runnable) {
        this.g = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.e.d(0.0f);
        }
    }

    public final void j(float f) {
        bvc bvcVar = this.h;
        long jMax = Math.max(-1L, Math.min(bvcVar.r + 1, Math.round(f)));
        bvcVar.y(jMax, this.a);
        this.a = jMax;
    }
}
