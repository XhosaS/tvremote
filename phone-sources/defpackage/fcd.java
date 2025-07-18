package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fcd implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fcd(Object obj, String str, long j, long j2, int i) {
        this.e = i;
        this.d = obj;
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [els, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            String str = edt.a;
            long j = this.c;
            ((dwi) this.d).a.j(this.a, j);
            return;
        }
        String str2 = edt.a;
        long j2 = this.c;
        ((epm) this.d).b.cV(this.a, j2);
    }
}
