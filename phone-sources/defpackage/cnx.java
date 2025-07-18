package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnx extends ykt implements yjk {
    final /* synthetic */ yle a;
    final /* synthetic */ cny b;
    final /* synthetic */ cmg c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnx(yle yleVar, cny cnyVar, cmg cmgVar, long j, long j2) {
        super(0);
        this.a = yleVar;
        this.b = cnyVar;
        this.c = cmgVar;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        cny cnyVar = this.b;
        this.a.a = cnyVar.d.a(this.c, this.d, cnyVar.e, this.e);
        return ygi.a;
    }
}
