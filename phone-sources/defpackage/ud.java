package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ud extends yiz implements yjz {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(qap qapVar, long j, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = qapVar;
        this.b = j;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((ud) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((ud) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ud) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.e;
        if (i == 0) {
            ud udVar = new ud((ue) this.c, this.b, yihVar, 0);
            udVar.d = obj;
            return udVar;
        }
        if (i != 1) {
            ud udVar2 = new ud((qap) this.c, this.b, yihVar, 2);
            udVar2.d = obj;
            return udVar2;
        }
        ud udVar3 = new ud((ue) this.c, this.b, yihVar, 1, null);
        udVar3.d = obj;
        return udVar3;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object objE;
        int i = this.e;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                yow yowVar = (yow) this.d;
                Object obj2 = this.c;
                long j = this.b;
                ue ueVar = (ue) obj2;
                yka ykaVar = ueVar.l;
                long jC = cmm.c(j, ueVar.m ? -1.0f : 1.0f);
                uv uvVar = ueVar.i;
                yka ykaVar2 = ub.a;
                Float f = new Float(uvVar == uv.a ? cmm.b(jC) : cmm.a(jC));
                this.a = 1;
                if (ykaVar.a(yowVar, f, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        if (i == 1) {
            yio yioVar2 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                yow yowVar2 = (yow) this.d;
                Object obj3 = this.c;
                long j2 = this.b;
                yka ykaVar3 = ((ue) obj3).k;
                bmx bmxVar = new bmx(j2);
                this.a = 1;
                if (ykaVar3.a(yowVar2, bmxVar, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        yio yioVar3 = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj4 = this.c;
                long j3 = this.b;
                qay qayVarY = ((qap) obj4).b.y();
                long epochMilli = Instant.now().toEpochMilli() - j3;
                this.a = 1;
                if (gez.l(((qbc) qayVarY).a, false, true, new dth(epochMilli, 5), this) == yioVar3) {
                    return yioVar3;
                }
            }
            objE = ygi.a;
        } catch (Throwable th) {
            objE = ybn.e(th);
        }
        Throwable thA = yfy.a(objE);
        if (thA != null) {
            ((tvk) ((tvk) qap.a.g()).i(thA)).s("Exception thrown on thread storage periodic cleanup.");
        }
        return new yfy(objE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(ue ueVar, long j, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = ueVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(ue ueVar, long j, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = ueVar;
        this.b = j;
    }
}
