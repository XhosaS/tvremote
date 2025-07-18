package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itd extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ita d;
    final /* synthetic */ kw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd(kw kwVar, ita itaVar, yih yihVar) {
        super(3, yihVar);
        this.e = kwVar;
        this.d = itaVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        itd itdVar = new itd(this.e, this.d, (yih) obj3);
        itdVar.b = (ink) obj;
        itdVar.c = (vvj) obj2;
        return itdVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, vvj] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Exception e;
        yio yioVar = yio.a;
        if (this.a != 0) {
            obj3 = this.c;
            obj2 = this.b;
            try {
                ybn.f(obj);
            } catch (Exception e2) {
                e = e2;
                krd.c("Store caught exception " + e + " while writing value " + obj3 + " for key " + obj2);
                return ygi.a;
            }
        } else {
            ybn.f(obj);
            obj2 = this.b;
            ?? r8 = this.c;
            try {
                Object obj4 = this.e.a;
                ita itaVar = this.d;
                inl inlVarA = itaVar.a(r8);
                wlp wlpVarC = itaVar.c(r8);
                this.b = obj2;
                this.c = r8;
                this.a = 1;
                if (((ihq) obj4).i((ink) obj2, inlVarA, wlpVarC, this) == yioVar) {
                    return yioVar;
                }
            } catch (Exception e3) {
                obj3 = r8;
                e = e3;
                krd.c("Store caught exception " + e + " while writing value " + obj3 + " for key " + obj2);
                return ygi.a;
            }
        }
        return ygi.a;
    }
}
