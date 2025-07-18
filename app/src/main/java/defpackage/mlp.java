package defpackage;

import android.os.Trace;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlp extends dxv {
    public static final /* synthetic */ int t = 0;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    agfx a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    agfo d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofn f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mmc r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mzj s;

    private mlp() {
        super("ComponentType");
    }

    public static mln aA(dru druVar) {
        return new mln(druVar, new mlp());
    }

    private final mlo aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mlo) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mlo mloVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        oca ocaVar = (oca) druVar.g(oca.class);
        aggh agghVar = (aggh) druVar.g(aggh.class);
        obk obkVar = (obk) druVar.g(obk.class);
        mmc mmcVar = this.r;
        agfo agfoVar = this.d;
        oal oalVar = this.b;
        oco ocoVar = this.e;
        mpp mppVar = mmd.a;
        mos mosVar = new mos(ocoVar, ocaVar, oalVar, obkVar, agghVar);
        dxzVar.a = mosVar;
        mmd.a(mosVar, druVar, oalVar, mmcVar, agfoVar, ocoVar);
        agghVar.a(mosVar);
        mloVarAB.b = (mos) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        mlo mloVarAB = aB(druVar);
        boolean z = this.c;
        agfx agfxVar = this.a;
        mos mosVar = mloVarAB.b;
        mpp mppVar = mmd.a;
        if (z) {
            mosVar.c(agfxVar);
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        mlo mloVar = (mlo) dxxVar;
        mlo mloVar2 = (mlo) dxxVar2;
        mloVar2.a = mloVar.a;
        mloVar2.b = mloVar.b;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    protected final void ao() {
        mzj mzjVar = this.s;
        mpp mppVar = mmd.a;
        mzjVar.a();
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        dru druVar2;
        drq drqVarA;
        mlo mloVarAB = aB(druVar);
        mos mosVar = mloVarAB.b;
        int i = mloVarAB.a;
        mmc mmcVar = this.r;
        agfo agfoVar = this.d;
        oal oalVar = this.b;
        aghb aghbVar = ((nyx) oalVar).f;
        boolean z = aghbVar instanceof aggh;
        oco ocoVar = this.e;
        ofn ofnVar = this.f;
        mpp mppVar = mmd.a;
        if (z) {
            mosVar.d((aggh) aghbVar);
        }
        if (mosVar.f != agfoVar) {
            if (mmcVar != null && (drqVarA = mosVar.a()) != null) {
                mor morVar = mosVar.e;
                mmc mmcVar2 = morVar != null ? morVar.a : null;
                if (mmcVar2 != null && !mosVar.f() && mmcVar.equals(mmcVar2)) {
                    mosVar.e(druVar);
                    Trace.beginSection("onCreateLayout(CACHE_HIT): eml=".concat(String.valueOf(oalVar.S("UNDEFINED"))));
                    Trace.endSection();
                    return drqVarA.l();
                }
            }
            mosVar.dispose();
        }
        if (mosVar.f()) {
            druVar2 = druVar;
            mmd.a(mosVar, druVar2, oalVar, mmcVar, agfoVar, ocoVar);
            if (aghbVar != null) {
                aghbVar.a(mosVar);
            }
        } else {
            druVar2 = druVar;
            mosVar.e(druVar2);
        }
        drq drqVarA2 = mosVar.a();
        if (drqVarA2 == null) {
            ofnVar.d(true);
            Trace.beginSection("onCreateLayout(ERROR): eml=".concat(String.valueOf(oalVar.S("UNDEFINED"))));
            Trace.endSection();
            return efx.aA(druVar2).a;
        }
        ofnVar.d(false);
        Trace.beginSection("onCreateLayout(CACHE_MISS): eml=".concat(String.valueOf(oalVar.S("UNDEFINED"))));
        Trace.endSection();
        return drqVarA2.l();
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (mlp) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mlo();
    }
}
