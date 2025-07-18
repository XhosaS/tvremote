package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxa extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(Object obj, sbv sbvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = obj;
        this.b = sbvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((qxa) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sbn] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, qyf] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.d) {
            case 0:
                return new qxa((qxc) this.b, (qxj) this.c, yihVar, 0);
            case 1:
                return new qxa((rbi) this.b, (qyf) this.c, yihVar, 1);
            case 2:
                return new qxa((qxr) this.b, (ray) this.c, yihVar, 2);
            case 3:
                return new qxa((qxr) this.b, (ray) this.c, yihVar, 3, null);
            case 4:
                return new qxa((qya) this.b, (vrn) this.c, yihVar, 4);
            case 5:
                return new qxa((rbi) this.b, (ysk) this.c, yihVar, 5);
            case 6:
                return new qxa((yjz) this.c, (sbn) this.b, yihVar, 6);
            default:
                return new qxa(this.c, (sbv) this.b, yihVar, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                yio yioVar = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                Object obj2 = this.b;
                Object obj3 = this.c;
                this.a = 1;
                int i = qxc.b;
                Object objC = ((qxc) obj2).c(((qxj) obj3).a, this);
                return objC == yioVar ? yioVar : objC;
            case 1:
                yio yioVar2 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj4 = this.b;
                    Object obj5 = this.c;
                    this.a = 1;
                    obj = ((qyb) ((rbi) obj4).a).a.b.b((qxk) obj5, this);
                    if (obj == yioVar2) {
                        return yioVar2;
                    }
                }
                return ygi.a;
            case 2:
                yio yioVar3 = yio.a;
                if (this.a == 0) {
                    ybn.f(obj);
                    Object obj6 = this.b;
                    yva yvaVar = ((qxr) obj6).a().a;
                    wp wpVar = new wp(obj6, this.c, 19, null);
                    this.a = 1;
                    if (yvaVar.a(wpVar, this) == yioVar3) {
                        return yioVar3;
                    }
                } else {
                    ybn.f(obj);
                }
                throw new yfs();
            case 3:
                yio yioVar4 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ?? r9 = this.b;
                    Object obj7 = this.c;
                    dvd dvdVar = dvd.d;
                    qxa qxaVar = new qxa((qxr) r9, (ray) obj7, (yih) null, 2);
                    this.a = 1;
                    if (dvb.h(r9, dvdVar, qxaVar, this) == yioVar4) {
                        return yioVar4;
                    }
                }
                return ygi.a;
            case 4:
                yio yioVar5 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                Object obj8 = this.b;
                String str = ((vrn) this.c).c;
                str.getClass();
                this.a = 1;
                Object objD = ((qya) obj8).a.d(str, this);
                return objD == yioVar5 ? yioVar5 : objD;
            case 5:
                yio yioVar6 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj9 = this.b;
                    this.a = 1;
                    obj = ((rbi) obj9).a(this);
                    if (obj == yioVar6) {
                        return yioVar6;
                    }
                }
                ((ysa) this.c).b((List) obj);
                return ygi.a;
            case 6:
                yio yioVar7 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ?? r92 = this.c;
                    Object obj10 = this.b;
                    this.a = 1;
                    if (r92.a(obj10, this) == yioVar7) {
                        return yioVar7;
                    }
                }
                return ygi.a;
            default:
                yio yioVar8 = yio.a;
                int i2 = this.a;
                ybn.f(obj);
                if (i2 == 0) {
                    Object obj11 = this.c;
                    irv irvVar = new irv(this.b, 12);
                    this.a = 1;
                    if (((yva) obj11).a(irvVar, this) == yioVar8) {
                        return yioVar8;
                    }
                }
                throw new yfs();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(qxc qxcVar, qxj qxjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qxcVar;
        this.c = qxjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(qxr qxrVar, ray rayVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qxrVar;
        this.c = rayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(qxr qxrVar, ray rayVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.b = qxrVar;
        this.c = rayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(qya qyaVar, vrn vrnVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qyaVar;
        this.c = vrnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(rbi rbiVar, qyf qyfVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = rbiVar;
        this.c = qyfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(rbi rbiVar, ysk yskVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = rbiVar;
        this.c = yskVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(yjz yjzVar, sbn sbnVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = yjzVar;
        this.b = sbnVar;
    }
}
