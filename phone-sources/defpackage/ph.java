package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ph extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ pj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(pj pjVar, yih yihVar) {
        super(2, yihVar);
        this.d = pjVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ph) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ph(this.d, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        yio yioVar = yio.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj4 = this.a;
            ybn.f(obj);
            obj3 = obj4;
        } else {
            ybn.f(obj);
            pj pjVar = this.d;
            op opVar = (op) pjVar;
            opVar.n();
            yyk yykVar = opVar.j;
            this.a = yykVar;
            this.b = pjVar;
            this.c = 1;
            if (yykVar.b(this) == yioVar) {
                return yioVar;
            }
            obj2 = pjVar;
            obj3 = yykVar;
        }
        try {
            op opVar2 = (op) obj2;
            opVar2.b = opVar2.b();
            yoe yoeVar = opVar2.e;
            if (yoeVar != null) {
                yoeVar.resumeWith(opVar2.b());
            }
            opVar2.e = null;
            ((yyk) obj3).d();
            return ygi.a;
        } catch (Throwable th) {
            ((yyk) obj3).d();
            throw th;
        }
    }
}
