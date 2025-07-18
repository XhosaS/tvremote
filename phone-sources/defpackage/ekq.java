package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ekq implements ecw {
    public final /* synthetic */ ekl a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    private final /* synthetic */ int e;

    public /* synthetic */ ekq(ekl eklVar, int i, long j, long j2, int i2) {
        this.e = i2;
        this.a = eklVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        if (this.e != 0) {
            long j = this.d;
            long j2 = this.c;
            ((ekm) obj).h(this.a, this.b, j2, j);
            return;
        }
        long j3 = this.d;
        long j4 = this.c;
        ((ekm) obj).g(this.a, this.b, j4, j3);
    }
}
