package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxg extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(qxr qxrVar, FrameLayout frameLayout, View view, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = qxrVar;
        this.b = frameLayout;
        this.d = view;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 3) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 4) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 5) {
            return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qxg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yqe] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.b;
            return new qxg((qyc) obj2, (vou) this.c, (qxh) this.d, yihVar, 0);
        }
        if (i == 1) {
            Object obj3 = this.b;
            return new qxg((qyc) obj3, (vou) this.c, (qxh) this.d, yihVar, 1, (byte[]) null);
        }
        if (i == 2) {
            Object obj4 = this.c;
            return new qxg((qxr) obj4, (FrameLayout) this.b, (View) this.d, yihVar, 2);
        }
        if (i == 3) {
            Object obj5 = this.c;
            return new qxg((qxr) obj5, (FrameLayout) this.b, (View) this.d, yihVar, 3, (byte[]) null);
        }
        if (i == 4) {
            return new qxg((yqe) this.c, (Exception) this.b, (xqb) this.d, yihVar, 4);
        }
        if (i != 5) {
            return new qxg((yvp) this.c, (ysy) this.b, this.d, yihVar, 6);
        }
        Object obj6 = this.b;
        return new qxg((upo) obj6, (xqb) this.d, (upo) this.c, yihVar, 5);
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, yqe] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = this.e;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj2 = this.b;
                qyc qycVar = (qyc) obj2;
                qxf qxfVar = new qxf(qycVar, (vou) this.c, (qxh) this.d, (yih) null, 0);
                this.a = 1;
                if (yoz.k(qxfVar, this) == yioVar) {
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
                Object obj3 = this.b;
                Object obj4 = this.c;
                qyc qycVar2 = (qyc) obj3;
                vou vouVar = (vou) obj4;
                yss yssVar = new yss(new dkg(vouVar, (tae) qycVar2.a.m.b, qycVar2.d, (yih) null, 8));
                jze jzeVar = new jze(this.d, 16);
                this.a = 1;
                if (yvl.h(yssVar, jzeVar, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        if (i == 2) {
            yio yioVar3 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj5 = this.c;
                qyn qynVar = ((qxr) obj5).i;
                if (qynVar == null) {
                    yks.c("appStateDataInterface");
                    qynVar = null;
                }
                aob aobVar = new aob(obj5, this.b, this.d, 5);
                this.a = 1;
                if (yvl.h((yvl) qynVar.c, aobVar, this) == yioVar3) {
                    return yioVar3;
                }
            }
            return ygi.a;
        }
        if (i == 3) {
            yio yioVar4 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r12 = this.c;
                Object obj6 = this.b;
                Object obj7 = this.d;
                dvd dvdVar = dvd.d;
                qxr qxrVar = (qxr) r12;
                qxg qxgVar = new qxg(qxrVar, (FrameLayout) obj6, (View) obj7, (yih) null, 2);
                this.a = 1;
                if (dvb.h(r12, dvdVar, qxgVar, this) == yioVar4) {
                    return yioVar4;
                }
            }
            return ygi.a;
        }
        if (i == 4) {
            Object obj8 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ?? r122 = this.c;
                Object obj9 = this.b;
                this.a = 1;
                yoz.y(r122, "Collection of responses completed exceptionally", (Throwable) obj9);
                Object objP = r122.p(this);
                if (objP != obj8) {
                    objP = ygi.a;
                }
                if (objP == obj8) {
                    return obj8;
                }
            }
            ((xqb) this.d).c("Collection of responses completed exceptionally", (Throwable) this.b);
            return ygi.a;
        }
        if (i != 5) {
            yio yioVar5 = yio.a;
            int i2 = this.a;
            ybn.f(obj);
            if (i2 == 0) {
                Object obj10 = this.c;
                Object obj11 = this.b;
                Object obj12 = this.d;
                this.a = 1;
                if (((yvp) obj10).e.a(obj11, obj12, this) == yioVar5) {
                    return yioVar5;
                }
            }
            return ygi.a;
        }
        yio yioVar6 = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj13 = this.b;
                Object obj14 = this.d;
                this.a = 1;
                ((xqb) obj14).f(((upo) obj13).a);
                if (ygi.a == yioVar6) {
                    return yioVar6;
                }
            }
            ((xqb) this.d).d();
            return ygi.a;
        } catch (Exception e) {
            ((xqb) this.d).c("Collection of requests completed exceptionally", e);
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(qxr qxrVar, FrameLayout frameLayout, View view, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = qxrVar;
        this.b = frameLayout;
        this.d = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(qyc qycVar, vou vouVar, qxh qxhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = qycVar;
        this.c = vouVar;
        this.d = qxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(qyc qycVar, vou vouVar, qxh qxhVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.b = qycVar;
        this.c = vouVar;
        this.d = qxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(upo upoVar, xqb xqbVar, upo upoVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = upoVar;
        this.d = xqbVar;
        this.c = upoVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(yqe yqeVar, Exception exc, xqb xqbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yqeVar;
        this.b = exc;
        this.d = xqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(yvp yvpVar, ysy ysyVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yvpVar;
        this.b = ysyVar;
        this.d = obj;
    }
}
