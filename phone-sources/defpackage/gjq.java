package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjq extends gjv {
    public boolean b;
    public boolean c;
    public Runnable e;
    public final /* synthetic */ gju f;
    public dhb g;
    public long a = -1;
    public int d = 0;
    public final nuh h = new nuh((byte[]) null);

    public gjq(gju gjuVar) {
        this.f = gjuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjq.k():void");
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void a(gju gjuVar) {
        this.c = true;
    }

    public final long h() {
        return this.f.o;
    }

    public final void i() {
        if (this.b) {
            k();
            this.g.d(h() + 1);
        } else {
            this.d = 1;
            this.e = null;
        }
    }

    public final void j(Runnable runnable) {
        this.e = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.g.d(0.0f);
        }
    }
}
