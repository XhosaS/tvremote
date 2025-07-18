package defpackage;

import com.google.android.apps.googletv.app.player.PlayerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jms extends yiz implements yjz {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jms(PlayerActivity playerActivity, boolean z, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = playerActivity;
        this.b = z;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((jms) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((jms) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 2) {
            return ((jms) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((jms) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.d;
        if (i == 0) {
            return new jms((jmq) this.c, this.b, yihVar, 0);
        }
        if (i == 1) {
            return new jms((PlayerActivity) this.c, this.b, yihVar, 1);
        }
        if (i != 2) {
            return new jms((mdw) this.c, this.b, yihVar, 3);
        }
        return new jms((jmq) this.c, this.b, yihVar, 2, null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ldv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yvc yvcVar;
        Object objD;
        Object objE;
        int i = this.d;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj2 = this.c;
                boolean z = this.b;
                this.a = 1;
                obj = ((jmq) obj2).a(true ^ z, this);
                if (obj == yioVar) {
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
                kuw kuwVar = ((PlayerActivity) this.c).o;
                if (kuwVar == null) {
                    yks.c("pipStateTracker");
                    kuwVar = null;
                }
                boolean z2 = this.b;
                this.a = 1;
                Object obj3 = kuwVar.b;
                do {
                    yvcVar = (yvc) obj3;
                    objD = yvcVar.d();
                    ((Boolean) objD).booleanValue();
                } while (!yvcVar.f(objD, Boolean.valueOf(z2)));
                if (ygi.a == yioVar2) {
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
                Object obj4 = this.c;
                boolean z3 = this.b;
                this.a = 1;
                obj = ((jmq) obj4).a(z3, this);
                if (obj == yioVar3) {
                    return yioVar3;
                }
            }
            return ygi.a;
        }
        yio yioVar4 = yio.a;
        int i2 = this.a;
        ybn.f(obj);
        if (i2 != 0) {
            return obj;
        }
        Object obj5 = this.c;
        boolean z4 = this.b;
        this.a = 1;
        isy isyVar = (isy) ((mdw) obj5).b;
        if (isyVar.b.a().l()) {
            Object obj6 = isyVar.a;
            vtw vtwVarM = wxc.a.m();
            vtwVarM.getClass();
            vtw vtwVarM2 = wxb.a.m();
            vtwVarM2.getClass();
            wxe.c(wxe.a(vtwVarM2), vtwVarM);
            kdj kdjVar = (kdj) obj6;
            objE = ((hfx) kdjVar.b.b()).c(new ahk(kdjVar, wxe.b(vtwVarM), (yih) null, 12), this);
        } else if (z4) {
            objE = hur.c((iom) ((hfx) isyVar.d).a, isyVar.c, this);
        } else {
            objE = ((hfx) isyVar.d).e(isyVar.c, this);
        }
        return objE == yioVar4 ? yioVar4 : objE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jms(jmq jmqVar, boolean z, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = jmqVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jms(jmq jmqVar, boolean z, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = jmqVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jms(mdw mdwVar, boolean z, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = mdwVar;
        this.b = z;
    }
}
