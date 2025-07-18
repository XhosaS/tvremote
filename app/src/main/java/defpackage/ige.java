package defpackage;

import android.os.Bundle;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ige extends gf implements aeja {
    private aeiq l;
    private volatile aeia m;
    private final Object n = new Object();
    private boolean o = false;

    public ige() {
        this.f.a(new igd(this));
    }

    @Override // defpackage.aeja
    /* renamed from: as, reason: merged with bridge method [inline-methods] */
    public final aeia cO() {
        if (this.m == null) {
            synchronized (this.n) {
                if (this.m == null) {
                    this.m = new aeia(this);
                }
            }
        }
        return this.m;
    }

    protected void at() {
        if (this.o) {
            return;
        }
        this.o = true;
        AssistantSetupActivity assistantSetupActivity = (AssistantSetupActivity) this;
        etb etbVar = (etb) cO().dN();
        eup eupVar = etbVar.c;
        assistantSetupActivity.q = eupVar.gG();
        assistantSetupActivity.aZ = (eyp) eupVar.gT.a();
        assistantSetupActivity.r = (iax) eupVar.gb.a();
        assistantSetupActivity.s = etbVar.h();
        assistantSetupActivity.t = etbVar.b();
        assistantSetupActivity.u = eupVar.cg();
        assistantSetupActivity.v = eupVar.gJ();
        assistantSetupActivity.bf = eupVar.bx();
        assistantSetupActivity.w = (fda) eupVar.fS.a();
        assistantSetupActivity.x = etbVar.a();
        assistantSetupActivity.y = (agte) eupVar.p.a();
        assistantSetupActivity.z = (ahbt) eupVar.q.a();
        assistantSetupActivity.A = eupVar.km;
        assistantSetupActivity.B = eupVar.ou;
        assistantSetupActivity.C = eupVar.bw;
        assistantSetupActivity.D = etbVar.c();
        assistantSetupActivity.E = eupVar.gI();
        assistantSetupActivity.bb = 2;
        assistantSetupActivity.F = eupVar.bj();
        assistantSetupActivity.bg = new ewo();
        assistantSetupActivity.G = eupVar.cB();
        assistantSetupActivity.H = etbVar.g();
        assistantSetupActivity.I = (ffp) eupVar.by.a();
        assistantSetupActivity.J = eupVar.g();
        assistantSetupActivity.K = (gtu) eupVar.bE.a();
        assistantSetupActivity.L = etbVar.f();
        assistantSetupActivity.M = (zyh) eupVar.A.a();
        assistantSetupActivity.N = (zyh) eupVar.m.a();
        assistantSetupActivity.O = (agte) eupVar.bW.a();
        assistantSetupActivity.P = eupVar.ov;
        assistantSetupActivity.Q = etbVar.d();
        assistantSetupActivity.R = eupVar.fU;
        assistantSetupActivity.S = eupVar.ow;
        assistantSetupActivity.ba = (fcu) eupVar.fb.a();
        assistantSetupActivity.T = eupVar.k();
        assistantSetupActivity.U = (gte) eupVar.bA.a();
        assistantSetupActivity.V = eupVar.gg;
        assistantSetupActivity.W = eupVar.ox;
        assistantSetupActivity.X = eupVar.oy;
        assistantSetupActivity.Y = eupVar.oz;
        assistantSetupActivity.Z = etbVar.i();
        assistantSetupActivity.aa = (idl) eupVar.ga.a();
        assistantSetupActivity.ab = (idu) eupVar.fZ.a();
        assistantSetupActivity.ac = eupVar.gN();
        assistantSetupActivity.ad = (ipe) eupVar.oB.a();
        assistantSetupActivity.ae = eupVar.ce();
        assistantSetupActivity.af = (irh) etbVar.g.a();
        assistantSetupActivity.ag = eupVar.oC;
        assistantSetupActivity.ah = eupVar.oD;
        assistantSetupActivity.ai = eupVar.gl;
        assistantSetupActivity.aj = eupVar.bs();
        assistantSetupActivity.ak = (vtm) eupVar.hU.a();
        assistantSetupActivity.al = (ghp) eupVar.ar.a();
        assistantSetupActivity.am = (ghr) eupVar.fg.a();
        assistantSetupActivity.an = etbVar.e();
        assistantSetupActivity.ao = (ffo) eupVar.fu.a();
        assistantSetupActivity.ap = (Executor) eupVar.aR.a();
        assistantSetupActivity.aq = eupVar.ge;
    }

    @Override // defpackage.tt, defpackage.bbz
    public final beg dM() {
        return aehs.a(this, super.dM());
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof aeiz) {
            aeiq aeiqVarC = cO().c();
            this.l = aeiqVarC;
            if (aeiqVarC.a()) {
                this.l.a = em();
            }
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aeiq aeiqVar = this.l;
        if (aeiqVar != null) {
            aeiqVar.a = null;
        }
    }
}
