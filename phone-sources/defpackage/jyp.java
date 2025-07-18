package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyp implements yjk {
    final /* synthetic */ bje a;
    final /* synthetic */ wnu b;
    final /* synthetic */ int c;
    final /* synthetic */ isy d;
    final /* synthetic */ mdw e;
    private final /* synthetic */ int f;

    public jyp(bje bjeVar, mdw mdwVar, isy isyVar, wnu wnuVar, int i, int i2) {
        this.f = i2;
        this.a = bjeVar;
        this.e = mdwVar;
        this.d = isyVar;
        this.b = wnuVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        if (this.f == 0) {
            isy isyVar = this.d;
            int size = isyVar.d.size() - 1;
            int i = this.c;
            jys.x(this.a, this.e, isyVar, this.b, i == size, i);
            return ygi.a;
        }
        wnu wnuVar = this.b;
        wnuVar.getClass();
        isy isyVar2 = this.d;
        int size2 = isyVar2.d.size() - 1;
        int i2 = this.c;
        jys.x(this.a, this.e, isyVar2, wnuVar, i2 == size2, i2);
        return ygi.a;
    }
}
