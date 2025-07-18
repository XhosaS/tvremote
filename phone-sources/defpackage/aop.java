package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aop implements yjz {
    public final /* synthetic */ yjz a;
    public final /* synthetic */ yjk b;
    public final /* synthetic */ bkp c;
    public final /* synthetic */ bol d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ aoc h;
    private final /* synthetic */ int i;

    public /* synthetic */ aop(yjk yjkVar, bkp bkpVar, bol bolVar, long j, long j2, aoc aocVar, yjz yjzVar, int i, int i2) {
        this.i = i2;
        this.b = yjkVar;
        this.c = bkpVar;
        this.d = bolVar;
        this.e = j;
        this.f = j2;
        this.h = aocVar;
        this.a = yjzVar;
        this.g = i;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i = this.g;
            yjz yjzVar = this.a;
            aoc aocVar = this.h;
            long j = this.f;
            long j2 = this.e;
            bol bolVar = this.d;
            kv.E(this.b, this.c, bolVar, j2, j, aocVar, yjzVar, baoVar, bdi.n(i | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.g;
        aoc aocVar2 = this.h;
        long j3 = this.f;
        long j4 = this.e;
        bol bolVar2 = this.d;
        bkp bkpVar = this.c;
        kv.F(this.a, this.b, bkpVar, bolVar2, j4, j3, aocVar2, baoVar2, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ aop(yjz yjzVar, yjk yjkVar, bkp bkpVar, bol bolVar, long j, long j2, aoc aocVar, int i, int i2) {
        this.i = i2;
        this.a = yjzVar;
        this.b = yjkVar;
        this.c = bkpVar;
        this.d = bolVar;
        this.e = j;
        this.f = j2;
        this.h = aocVar;
        this.g = i;
    }
}
