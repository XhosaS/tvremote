package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bng implements cpm {
    final /* synthetic */ bnh a;
    private final /* synthetic */ int b;

    public bng(bnh bnhVar, int i) {
        this.b = i;
        this.a = bnhVar;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? new bni(this.a.b, 2) : new bni(this.a.b, 3) : new bni(this.a.b, 1) : new bni(this.a.b, 0);
    }
}
