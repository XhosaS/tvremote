package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ry extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ rv f;
    final /* synthetic */ yjz g;
    final /* synthetic */ Object h;
    final /* synthetic */ bhi i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(rv rvVar, bhi bhiVar, yjz yjzVar, Object obj, yih yihVar) {
        super(2, yihVar);
        this.f = rvVar;
        this.i = bhiVar;
        this.g = yjzVar;
        this.h = obj;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ry) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ry ryVar = new ry(this.f, this.i, this.g, this.h, yihVar);
        ryVar.j = obj;
        return ryVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        bhi bhiVar;
        Object obj2;
        bhi bhiVar2;
        yjz yjzVar;
        Object obj3;
        bhi bhiVar3;
        Throwable th;
        yio yioVar = yio.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    ybn.f(obj);
                    yow yowVar = (yow) this.j;
                    rv rvVar = this.f;
                    yij yijVar = yowVar.c().get(yqe.c);
                    yijVar.getClass();
                    bhi bhiVar4 = new bhi(rvVar, (yqe) yijVar, (byte[]) null);
                    bhiVar = this.i;
                    bhiVar.H(bhiVar4);
                    yjz yjzVar2 = this.g;
                    obj2 = this.h;
                    this.j = bhiVar4;
                    Object obj4 = bhiVar.a;
                    this.a = obj4;
                    this.b = yjzVar2;
                    this.c = obj2;
                    this.d = bhiVar;
                    this.e = 1;
                    if (((yyk) obj4).b(this) != yioVar) {
                        bhiVar2 = bhiVar4;
                        yjzVar = yjzVar2;
                        obj3 = obj4;
                    }
                    return yioVar;
                }
                if (r1 != 1) {
                    bhiVar3 = (bhi) this.b;
                    obj3 = this.a;
                    bhiVar2 = (bhi) this.j;
                    try {
                        ybn.f(obj);
                        a.u((AtomicReference) bhiVar3.b, bhiVar2);
                        ((yyk) obj3).d();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        a.u((AtomicReference) bhiVar3.b, bhiVar2);
                        throw th;
                    }
                }
                Object obj5 = this.d;
                Object obj6 = this.c;
                yjzVar = (yjz) this.b;
                Object obj7 = this.a;
                bhi bhiVar5 = (bhi) this.j;
                ybn.f(obj);
                bhiVar = obj5;
                obj3 = obj7;
                obj2 = obj6;
                bhiVar2 = bhiVar5;
                this.j = bhiVar2;
                this.a = obj3;
                this.b = bhiVar;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objA = yjzVar.a(obj2, this);
                if (objA != yioVar) {
                    bhiVar3 = bhiVar;
                    obj = objA;
                    a.u((AtomicReference) bhiVar3.b, bhiVar2);
                    ((yyk) obj3).d();
                    return obj;
                }
                return yioVar;
            } catch (Throwable th3) {
                bhiVar3 = bhiVar;
                th = th3;
                a.u((AtomicReference) bhiVar3.b, bhiVar2);
                throw th;
            }
        } catch (Throwable th4) {
            ((yyk) r1).d();
            throw th4;
        }
    }
}
