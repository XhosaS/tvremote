package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fce implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ epm c;
    private final /* synthetic */ int d;

    public /* synthetic */ fce(epm epmVar, int i, long j, int i2) {
        this.d = i2;
        this.c = epmVar;
        this.b = i;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [fcf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            String str = edt.a;
            long j = this.a;
            this.c.b.cM(this.b, j);
            return;
        }
        String str2 = edt.a;
        int i = this.b;
        this.c.b.cQ(this.a, i);
    }

    public /* synthetic */ fce(epm epmVar, long j, int i, int i2) {
        this.d = i2;
        this.c = epmVar;
        this.a = j;
        this.b = i;
    }
}
