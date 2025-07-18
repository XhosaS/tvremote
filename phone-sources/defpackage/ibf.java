package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibf extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibf(wh whVar, tf tfVar, tb tbVar, yqe yqeVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = whVar;
        this.d = tfVar;
        this.e = tbVar;
        this.c = yqeVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((ibf) create((pku) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ibf) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, tb] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yqe] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.g != 0) {
            Object obj2 = this.b;
            wh whVar = (wh) obj2;
            ibf ibfVar = new ibf(whVar, (tf) this.d, (tb) this.e, (yqe) this.c, yihVar, 1);
            ibfVar.f = obj;
            return ibfVar;
        }
        ibf ibfVar2 = new ibf((ysx) this.c, yihVar, this.b, (iom) this.d, (iaq) this.e, 0);
        ibfVar2.f = obj;
        return ibfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.g == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ysy ysyVar = (ysy) this.f;
                ?? r12 = this.c;
                ibe ibeVar = new ibe(ysyVar, this.b, (iom) this.d, (iaq) this.e, 0);
                this.a = 1;
                if (r12.a(ibeVar, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            pku pkuVar = (pku) this.f;
            Object obj2 = this.b;
            Object obj3 = this.d;
            ?? r5 = this.e;
            wh whVar = (wh) obj2;
            whVar.e = ((tf) obj3).b(r5);
            gk gkVar = new gk(obj3, this.c, pkuVar, 2);
            bg bgVar = new bg(obj3, obj2, (Object) r5, 2, (char[]) null);
            this.a = 1;
            if (whVar.a(gkVar, bgVar, this) == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibf(ysx ysxVar, yih yihVar, Object obj, iom iomVar, iaq iaqVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.c = ysxVar;
        this.b = obj;
        this.d = iomVar;
        this.e = iaqVar;
    }
}
