package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjf extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjf(pvd pvdVar, qen qenVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.f = pvdVar;
        this.e = qenVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((qjf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qjf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.g != 0) {
            return new qjf((pvd) this.f, (qen) this.e, yihVar, 1);
        }
        return new qjf((qji) this.e, (qjb) this.f, yihVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        yyk yykVar;
        Object obj7;
        Throwable th;
        if (this.g == 0) {
            yio yioVar = yio.a;
            if (this.d != 0) {
                obj3 = this.c;
                obj2 = this.b;
                obj4 = this.a;
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj8 = this.e;
                tvn tvnVar = qji.a;
                Object obj9 = this.f;
                yyk yykVar2 = ((qji) obj8).g;
                this.a = yykVar2;
                this.b = obj8;
                this.c = obj9;
                this.d = 1;
                if (yykVar2.b(this) == yioVar) {
                    return yioVar;
                }
                obj2 = obj8;
                obj3 = obj9;
                obj4 = yykVar2;
            }
            try {
                tvn tvnVar2 = qji.a;
                return (ypc) ((qji) obj2).e.remove(obj3);
            } finally {
                ((yyk) obj4).d();
            }
        }
        yio yioVar2 = yio.a;
        int i = this.d;
        try {
            if (i == 0) {
                ybn.f(obj);
                obj5 = this.f;
                obj6 = this.e;
                yykVar = ((pvd) obj5).a;
                this.a = yykVar;
                this.b = obj5;
                this.c = obj6;
                this.d = 1;
                if (yykVar.b(this) != yioVar2) {
                }
                return yioVar2;
            }
            if (i != 1) {
                obj7 = this.a;
                try {
                    ybn.f(obj);
                    ((yyk) obj7).d();
                    return ygi.a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            obj6 = this.c;
            obj5 = this.b;
            Object obj10 = this.a;
            ybn.f(obj);
            yykVar = obj10;
            int i2 = pvd.b;
            ((pvd) obj5).b((qen) obj6, true);
            this.a = yykVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (pvd.d((pvd) obj5, (qen) obj6, false, this) != yioVar2) {
                obj7 = yykVar;
                ((yyk) obj7).d();
                return ygi.a;
            }
            return yioVar2;
        } catch (Throwable th3) {
            obj7 = yykVar;
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjf(qji qjiVar, qjb qjbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.e = qjiVar;
        this.f = qjbVar;
    }
}
