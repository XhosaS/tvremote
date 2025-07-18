package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class and extends yiy implements yjz {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ yle c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public and(long j, yle yleVar, yih yihVar) {
        super(yihVar);
        this.b = j;
        this.c = yleVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((and) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        and andVar = new and(this.b, this.c, yihVar);
        andVar.d = obj;
        return andVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        btq btqVar;
        yio yioVar = yio.a;
        if (this.a != 0) {
            btqVar = (btq) this.d;
            ybn.f(obj);
        } else {
            ybn.f(obj);
            btq btqVar2 = (btq) this.d;
            long j = this.b;
            xa xaVar = new xa(this.c, 8);
            this.d = btqVar2;
            this.a = 1;
            Object objT = kv.t(btqVar2, j, xaVar, this);
            if (objT == yioVar) {
                return yioVar;
            }
            btqVar = btqVar2;
            obj = objT;
        }
        if (((bsz) obj) != null && (this.c.a & 9223372034707292159L) != 9205357640488583168L) {
            return amd.b;
        }
        bsz bszVar = (bsz) yfm.S(btqVar.o().a);
        if (!bny.F(bszVar)) {
            return amd.d;
        }
        bszVar.b();
        return amd.a;
    }
}
