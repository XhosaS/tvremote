package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lc extends ykt implements yjv {
    final /* synthetic */ bwj[] a;
    final /* synthetic */ ld b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(bwj[] bwjVarArr, ld ldVar, int i, int i2) {
        super(1);
        this.a = bwjVarArr;
        this.b = ldVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bwi bwiVar = (bwi) obj;
        int i = 0;
        while (true) {
            bwj[] bwjVarArr = this.a;
            if (i >= bwjVarArr.length) {
                return ygi.a;
            }
            bwj bwjVar = bwjVarArr[i];
            if (bwjVar != null) {
                long jA = this.b.a.b.a((bwjVar.a << 32) | (bwjVar.b & 4294967295L), (this.d & 4294967295L) | (this.c << 32), cmi.a);
                bwiVar.r(bwjVar, cmf.a(jA), cmf.b(jA), 0.0f);
            }
            i++;
        }
    }
}
