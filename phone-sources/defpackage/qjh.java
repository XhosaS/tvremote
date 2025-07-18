package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjh extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ qji f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjh(qji qjiVar, String str, String str2, yih yihVar) {
        super(2, yihVar);
        this.f = qjiVar;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qjh) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qjh(this.f, this.g, this.h, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        yio yioVar = yio.a;
        if (this.e != 0) {
            obj3 = this.d;
            obj2 = this.c;
            Object obj6 = this.b;
            Object obj7 = this.a;
            ybn.f(obj);
            obj5 = obj6;
            obj4 = obj7;
        } else {
            ybn.f(obj);
            if (!xez.b()) {
                return this.f.b(this.g, this.h);
            }
            qji qjiVar = this.f;
            obj2 = this.g;
            String str = this.h;
            yyk yykVar = qjiVar.f;
            this.a = yykVar;
            this.b = qjiVar;
            this.c = obj2;
            this.d = str;
            this.e = 1;
            if (yykVar.b(this) == yioVar) {
                return yioVar;
            }
            obj3 = str;
            obj5 = qjiVar;
            obj4 = yykVar;
        }
        try {
            tvn tvnVar = qji.a;
            return ((qji) obj5).h((String) obj2, (String) obj3);
        } finally {
            ((yyk) obj4).d();
        }
    }
}
