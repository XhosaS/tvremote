package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gai extends yiz implements yka {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(fzx fzxVar, yih yihVar) {
        super(3, yihVar);
        this.c = fzxVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gai gaiVar = new gai(this.c, (yih) obj3);
        gaiVar.a = (fzn) obj;
        gaiVar.b = (fzn) obj2;
        return gaiVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        obj3.getClass();
        obj2.getClass();
        fzx fzxVar = this.c;
        fzxVar.getClass();
        fzn fznVar = (fzn) obj3;
        int i = fznVar.a;
        fzn fznVar2 = (fzn) obj2;
        int i2 = fznVar2.a;
        return i > i2 ? true : i < i2 ? false : fus.w(fznVar.b, fznVar2.b, fzxVar) ? obj3 : obj2;
    }
}
