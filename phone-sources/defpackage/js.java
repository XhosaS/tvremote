package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class js extends yiy implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ jt f;
    final /* synthetic */ jv g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(jt jtVar, jv jvVar, yih yihVar) {
        super(yihVar);
        this.f = jtVar;
        this.g = jvVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((js) create((ymy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        js jsVar = new js(this.f, this.g, yihVar);
        jsVar.h = obj;
        return jsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ymy ymyVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        yio yioVar = yio.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            ymyVar = (ymy) this.h;
            ybn.f(obj);
            obj4 = obj5;
        } else {
            ybn.f(obj);
            ymyVar = (ymy) this.h;
            jt jtVar = this.f;
            obj2 = this.g;
            ke keVar = jtVar.a;
            obj3 = keVar.c;
            i = keVar.e;
            obj4 = jtVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((jv) obj2).a = i;
            Object obj6 = ((jt) obj4).a.b[i];
            this.h = ymyVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (ymyVar.a(obj6, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
