package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fym extends yiz implements yjz {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fyc c;
    final /* synthetic */ bdy d;
    final /* synthetic */ bcb e;
    final /* synthetic */ bdl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fym(fyc fycVar, bdy bdyVar, bdl bdlVar, bcb bcbVar, yih yihVar) {
        super(2, yihVar);
        this.c = fycVar;
        this.d = bdyVar;
        this.f = bdlVar;
        this.e = bcbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fym) create((ysx) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        fym fymVar = new fym(this.c, this.d, this.f, this.e, yihVar);
        fymVar.b = obj;
        return fymVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        fwr fwrVar;
        fwr fwrVar2;
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                fwrVar2 = (fwr) this.b;
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ysx ysxVar = (ysx) this.b;
                bdy bdyVar = this.d;
                if (a.i(bdyVar).size() > 1) {
                    this.f.h(0.0f);
                    fwrVar = (fwr) yfm.X(a.i(bdyVar));
                    fyc fycVar = this.c;
                    fwrVar.getClass();
                    fycVar.h(fwrVar);
                    fycVar.h((fwr) a.i(bdyVar).get(a.i(bdyVar).size() - 2));
                } else {
                    fwrVar = null;
                }
                aob aobVar = new aob(bdyVar, this.e, this.f, 3);
                this.b = fwrVar;
                this.a = 1;
                if (ysxVar.a(aobVar, this) == yioVar) {
                    return yioVar;
                }
                fwrVar2 = fwrVar;
            }
            if (a.i(this.d).size() > 1) {
                this.e.b(Boolean.valueOf(false));
                fyc fycVar2 = this.c;
                fwrVar2.getClass();
                fycVar2.g(fwrVar2, false);
            }
        } catch (CancellationException unused) {
            if (a.i(this.d).size() > 1) {
                this.e.b(Boolean.valueOf(false));
            }
        }
        return ygi.a;
    }
}
