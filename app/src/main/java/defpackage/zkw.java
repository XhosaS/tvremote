package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkw implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    zkv d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ zkx h;
    volatile int i = 2;

    public zkw(zkx zkxVar, int i) {
        this.h = zkxVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(zkv zkvVar) {
        int i = this.e;
        if (i < 5) {
            zkvVar.a = this.d;
            zkvVar.b = this.a;
            this.d = zkvVar;
            this.e = i + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r3 = 1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkw.run():void");
    }
}
