package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqb extends yiz implements yjz {
    int a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqb(yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b != 0) {
            return new pqb((yih) obj2, 1, null).invokeSuspend(ygi.a);
        }
        return new pqb((yih) obj2, 0).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.b != 0 ? new pqb(yihVar, 1, null) : new pqb(yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.b != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                this.a = 1;
                if (cyg.h(this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.a == 0) {
            ybn.f(obj);
            this.a = 1;
            if (yoz.e(this) == yioVar2) {
                return yioVar2;
            }
        } else {
            ybn.f(obj);
        }
        throw new yfs();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqb(yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
    }
}
