package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsw extends yiz implements yjv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsw(dti dtiVar, SessionWorker sessionWorker, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.b = dtiVar;
        this.a = sessionWorker;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.c != 0) {
            Object obj2 = this.a;
            return new dsw((mr) obj2, this.b, (yih) obj, 1).invokeSuspend(ygi.a);
        }
        Object obj3 = this.b;
        return new dsw((dti) obj3, (SessionWorker) this.a, (yih) obj, 0).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        if (this.c != 0) {
            return new dsw((mr) this.a, this.b, yihVar, 1);
        }
        return new dsw((dti) this.b, (SessionWorker) this.a, yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.c == 0) {
            ybn.f(obj);
            ((dti) this.b).b(((SessionWorker) this.a).c.c);
            return ygi.a;
        }
        ybn.f(obj);
        mr mrVar = (mr) this.a;
        mrVar.g();
        mz mzVar = mrVar.a;
        Object objB = mrVar.b(this.b);
        mzVar.c(objB);
        mrVar.i(objB);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsw(mr mrVar, Object obj, yih yihVar, int i) {
        super(1, yihVar);
        this.c = i;
        this.a = mrVar;
        this.b = obj;
    }
}
