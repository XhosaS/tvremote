package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxm extends yiz implements yjz {
    int a;
    final /* synthetic */ pxn b;
    final /* synthetic */ qen c;
    final /* synthetic */ List d;
    final /* synthetic */ qdo e;
    final /* synthetic */ pvi f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxm(pxn pxnVar, qen qenVar, List list, qdo qdoVar, pvi pviVar, boolean z, boolean z2, yih yihVar, int i) {
        super(2, yihVar);
        this.i = i;
        this.b = pxnVar;
        this.c = qenVar;
        this.d = list;
        this.e = qdoVar;
        this.f = pviVar;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            return ((pxm) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((pxm) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.i != 0 ? new pxm(this.b, this.c, this.d, this.e, this.f, this.g, this.h, yihVar, 1, null) : new pxm(this.b, this.c, this.d, this.e, this.f, this.g, this.h, yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                pxn pxnVar = this.b;
                pxm pxmVar = new pxm(pxnVar, this.c, this.d, this.e, this.f, this.g, this.h, null, 1, null);
                this.a = 1;
                if (ykr.l(pxnVar.b, pxmVar, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            pxn pxnVar2 = this.b;
            qen qenVar = this.c;
            List list = this.d;
            qdo qdoVar = this.e;
            pvi pviVar = this.f;
            boolean z = this.g;
            boolean z2 = this.h;
            this.a = 1;
            if (pxk.b(pxnVar2.a, qenVar, list, qdoVar, pviVar, z, false, z2, this) == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxm(pxn pxnVar, qen qenVar, List list, qdo qdoVar, pvi pviVar, boolean z, boolean z2, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.i = i;
        this.b = pxnVar;
        this.c = qenVar;
        this.d = list;
        this.e = qdoVar;
        this.f = pviVar;
        this.g = z;
        this.h = z2;
    }
}
