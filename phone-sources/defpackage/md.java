package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class md extends ykt implements yjv {
    final /* synthetic */ bwj a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ yjv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(bwj bwjVar, long j, long j2, yjv yjvVar) {
        super(1);
        this.a = bwjVar;
        this.b = j;
        this.c = j2;
        this.d = yjvVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        long j = this.b;
        int iB = cmf.b(j);
        long j2 = this.c;
        int iB2 = cmf.b(j2);
        ((bwi) obj).A(this.a, cmf.a(j) + cmf.a(j2), iB + iB2, this.d);
        return ygi.a;
    }
}
