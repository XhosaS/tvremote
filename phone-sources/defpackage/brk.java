package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brk extends bri {
    public final bqk a;
    public String b;
    public boolean c;
    public yjk d;
    public final bcb e;
    public final bcb f;
    public float g;
    public float h;
    private final bqi i;
    private bnr j;
    private long k;
    private final yjv l;

    public brk(bqk bqkVar) {
        this.a = bqkVar;
        bqkVar.e = new brj(this, 1);
        this.b = "";
        this.c = true;
        this.i = new bqi();
        this.d = bmf.d;
        bcz bczVar = bcz.c;
        this.e = new bci(null, bczVar);
        this.f = new bci(new bna(0L), bczVar);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new brj(this, 0);
    }

    @Override // defpackage.bri
    public final void b(bpq bpqVar) {
        g(bpqVar, 1.0f, null);
    }

    public final long c() {
        return ((bna) this.f.a()).a;
    }

    public final bnr d() {
        return (bnr) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.bpq r26, float r27, defpackage.bnr r28) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brk.g(bpq, float, bnr):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (c() & 4294967295L)) + "\n";
    }
}
