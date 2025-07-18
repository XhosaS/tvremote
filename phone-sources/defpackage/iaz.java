package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaz extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaz(yih yihVar, int i) {
        super(3, yihVar);
        this.c = i;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.c == 0) {
            iaz iazVar = new iaz((yih) obj3, 0);
            iazVar.b = (ity) obj2;
            return iazVar.invokeSuspend(ygi.a);
        }
        ((Boolean) obj2).booleanValue();
        iaz iazVar2 = new iaz((yih) obj3, 1, null);
        iazVar2.b = (dcc) obj;
        return iazVar2.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws IOException {
        if (this.c != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i != 0) {
                return obj;
            }
            Object obj2 = this.b;
            this.a = 1;
            dcc dccVar = (dcc) obj2;
            dccVar.b();
            Object objH = cwq.h(dccVar.a, new dcb(dccVar, (yih) null, 0), this);
            return objH == yioVar ? yioVar : objH;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            Object obj3 = this.b;
            this.a = 1;
            Object objF = ((icl) ((ity) obj3).a().b).f(this);
            if (objF != yioVar2) {
                objF = ygi.a;
            }
            if (objF != yioVar2) {
                objF = ygi.a;
            }
            if (objF == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaz(yih yihVar, int i, byte[] bArr) {
        super(3, yihVar);
        this.c = i;
    }
}
