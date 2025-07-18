package defpackage;

import com.google.apps.tiktok.account.AccountId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etr extends evq {
    public final AccountId a;
    public final eup b;
    final aejl c;
    final aejl d;
    final aejl e;
    final aejl f;
    final aejl g;
    final aejl h;
    final aejl i;
    final aejl j;
    final aejl k;
    final aejl l;
    final aejl m;
    final aejl o;
    final aejl p;
    final aejl q;
    final aejl r;
    final aejl s;
    private final etr t = this;
    final aejl n = evh.a;

    public etr(eup eupVar, AccountId accountId) {
        this.b = eupVar;
        this.a = accountId;
        this.c = aejo.b(new etq(eupVar, this, 2));
        this.d = new etq(eupVar, this, 3);
        this.e = new etq(eupVar, this, 4);
        this.f = aejf.c(new etq(eupVar, this, 6));
        this.g = aejf.c(new etq(eupVar, this, 5));
        this.h = aejf.c(new etq(eupVar, this, 1));
        this.i = aejf.c(new etq(eupVar, this, 0));
        this.j = aejf.c(new etq(eupVar, this, 7));
        this.k = aejf.c(new etq(eupVar, this, 8));
        this.l = aejf.c(new etq(eupVar, this, 9));
        this.m = aejf.c(new etq(eupVar, this, 10));
        this.o = aejo.b(new etq(eupVar, this, 12));
        this.p = aejf.c(new etq(eupVar, this, 11));
        this.q = aejf.c(new etq(eupVar, this, 13));
        this.r = aejf.c(new etq(eupVar, this, 14));
        this.s = new etq(eupVar, this, 15);
    }

    @Override // defpackage.tbd
    public final ooz a() {
        return new ooz((yyr) Collection.EL.stream(((yyr) p()).entrySet()).collect(ywk.a(new Function() { // from class: tbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((acgd) ((Map.Entry) obj).getKey()).name();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: tbm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ujk) ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: tbn
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ujk) obj2;
            }
        })));
    }

    @Override // defpackage.tib
    public final roj b() {
        return (roj) this.g.a();
    }

    @Override // defpackage.tbd
    public final ros c() {
        ros rosVarA = ((tgf) this.i.a()).a(tfu.GELLER_AGSA);
        rosVarA.getClass();
        return rosVarA;
    }

    @Override // defpackage.tcy
    public final tam d() {
        eup eupVar = this.b;
        tbe tbeVar = (tbe) eupVar.bh.a();
        AccountId accountId = (AccountId) this.d.a();
        vjo vjoVar = (vjo) eupVar.bf.a();
        return new tam(tbeVar, accountId, vjoVar, (zyg) eupVar.w.a());
    }

    @Override // defpackage.tdi
    public final tdk e() {
        return (tdk) this.m.a();
    }

    @Override // defpackage.tdq
    public final tdp f() {
        eup eupVar = this.b;
        zyg zygVar = (zyg) eupVar.m.a();
        aejl aejlVar = eupVar.bf;
        zcp zcpVar = zcp.b;
        return new tdp(zygVar, zcpVar, (vjo) aejlVar.a(), new tbs((tbo) eupVar.bh.a(), eupVar.gc(), zcpVar, eupVar.fR(), (zyg) eupVar.m.a(), (zyg) eupVar.w.a(), (zyg) eupVar.A.a(), eupVar.fX(), eupVar.cI(), eupVar.hM(), afap.a(eupVar.P)), (tdk) this.m.a(), eupVar.cJ(), (AccountId) this.d.a(), (ltg) eupVar.nS.a(), eupVar.fJ(), Optional.empty());
    }

    final vos g() {
        eup eupVar = this.b;
        wmy wmyVar = (wmy) eupVar.aG.a();
        AccountId accountId = (AccountId) this.d.a();
        return new vos(wmyVar, accountId);
    }

    final vpo h() {
        return new vpo(g());
    }

    final vpp i() {
        eup eupVar = this.b;
        return new vpp(eupVar.w, h());
    }

    @Override // defpackage.tdi
    public final vsz j() {
        return (vsz) this.l.a();
    }

    @Override // defpackage.vui, defpackage.vuu
    public final vtv k() {
        wrs wrsVarEE = this.b.eE();
        aejg aejgVar = aejn.a;
        return new vwc(wrsVarEE, aejgVar, aejgVar);
    }

    @Override // defpackage.tdy
    public final wey l() {
        return this.b.et();
    }

    @Override // defpackage.tdy
    public final wey m() {
        wbm wbmVar = (wbm) this.p.a();
        wbm wbmVar2 = (wbm) this.q.a();
        wbmVar.getClass();
        wbmVar2.getClass();
        return new wgq(wbmVar2, wbmVar);
    }

    @Override // defpackage.wak
    public final wgo n() {
        eup eupVar = this.b;
        return new wgo((ScheduledExecutorService) eupVar.m.a(), (Map) eupVar.az.a(), (rgy) eupVar.N.a(), (yqt) eupVar.at.a(), (wbm) this.q.a(), (wbm) this.p.a(), eupVar.er(), (rfr) eupVar.av.a());
    }

    @Override // defpackage.wpw
    public final Map o() {
        return zcl.a;
    }

    @Override // defpackage.tbd
    public final Map p() {
        aejl aejlVar = this.j;
        return yyr.l(acgd.TNG_ASSISTANT_TOP_CONTACTS, (ujk) aejlVar.a(), acgd.ASSISTANT_UUDP_PROFILE, (ujk) this.k.a());
    }

    @Override // defpackage.tbd
    public final Map q() {
        return zcl.a;
    }

    @Override // defpackage.tib
    public final Set r() {
        return (Set) ((aejh) aejn.a).b;
    }

    @Override // defpackage.tef
    public final tep s() {
        return (tep) this.r.a();
    }

    @Override // defpackage.smz
    public final tgf t() {
        return (tgf) this.i.a();
    }

    @Override // defpackage.wpx
    public final wry u() {
        wrs wrsVarEE = this.b.eE();
        final zcp zcpVar = zcp.b;
        yqw.B(zcpVar.isEmpty(), "Can't provide Sync SyncSystemMonitor to any account level. Only application scoped SyncSystemMonitors may be provided");
        return new wry(wrsVarEE, new agow() { // from class: wrz
            @Override // defpackage.agow
            public final Object a() {
                return zcpVar;
            }
        }, this.s);
    }
}
