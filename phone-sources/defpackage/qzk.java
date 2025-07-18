package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qzk extends yiz implements ykb {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzk(qzl qzlVar, yih yihVar) {
        super(4, yihVar);
        this.d = qzlVar;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        qzk qzkVar = new qzk(this.d, (yih) obj4);
        qzkVar.a = (rdp) obj;
        qzkVar.b = (vqu) obj2;
        qzkVar.c = (List) obj3;
        return qzkVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        List list = ((vqu) obj3).a;
        ?? r2 = this.c;
        List listAf = r2;
        if (!list.isEmpty()) {
            listAf = yfm.af(yfm.p(obj3), r2);
        }
        return obj2 == null ? listAf : yfm.af(yfm.p(new vqu(yfm.p(new vqw(((rdp) obj2).a)), new Integer(this.d.a))), listAf);
    }
}
