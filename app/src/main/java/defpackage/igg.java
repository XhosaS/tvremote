package defpackage;

import android.content.Context;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import com.google.android.apps.tvsearch.setup.AssistantSetupForSetupWizardActivity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class igg extends AssistantSetupActivity {
    private boolean bh = false;

    public igg() {
        this.f.a(new igf(this));
    }

    @Override // defpackage.ige
    protected final void at() {
        if (this.bh) {
            return;
        }
        this.bh = true;
        AssistantSetupForSetupWizardActivity assistantSetupForSetupWizardActivity = (AssistantSetupForSetupWizardActivity) this;
        etb etbVar = (etb) cO().dN();
        eup eupVar = etbVar.c;
        ((AssistantSetupActivity) assistantSetupForSetupWizardActivity).q = eupVar.gG();
        assistantSetupForSetupWizardActivity.aZ = (eyp) eupVar.gT.a();
        ((AssistantSetupActivity) assistantSetupForSetupWizardActivity).r = (iax) eupVar.gb.a();
        ((AssistantSetupActivity) assistantSetupForSetupWizardActivity).s = etbVar.h();
        assistantSetupForSetupWizardActivity.t = etbVar.b();
        assistantSetupForSetupWizardActivity.u = eupVar.cg();
        assistantSetupForSetupWizardActivity.v = eupVar.gJ();
        assistantSetupForSetupWizardActivity.bf = eupVar.bx();
        assistantSetupForSetupWizardActivity.w = (fda) eupVar.fS.a();
        assistantSetupForSetupWizardActivity.x = etbVar.a();
        assistantSetupForSetupWizardActivity.y = (agte) eupVar.p.a();
        assistantSetupForSetupWizardActivity.z = (ahbt) eupVar.q.a();
        assistantSetupForSetupWizardActivity.A = eupVar.km;
        assistantSetupForSetupWizardActivity.B = eupVar.ou;
        assistantSetupForSetupWizardActivity.C = eupVar.bw;
        assistantSetupForSetupWizardActivity.D = etbVar.c();
        assistantSetupForSetupWizardActivity.E = eupVar.gI();
        assistantSetupForSetupWizardActivity.bb = 2;
        assistantSetupForSetupWizardActivity.F = eupVar.bj();
        assistantSetupForSetupWizardActivity.bg = new ewo();
        assistantSetupForSetupWizardActivity.G = eupVar.cB();
        assistantSetupForSetupWizardActivity.H = etbVar.g();
        assistantSetupForSetupWizardActivity.I = (ffp) eupVar.by.a();
        assistantSetupForSetupWizardActivity.J = eupVar.g();
        assistantSetupForSetupWizardActivity.K = (gtu) eupVar.bE.a();
        assistantSetupForSetupWizardActivity.L = etbVar.f();
        assistantSetupForSetupWizardActivity.M = (zyh) eupVar.A.a();
        assistantSetupForSetupWizardActivity.N = (zyh) eupVar.m.a();
        assistantSetupForSetupWizardActivity.O = (agte) eupVar.bW.a();
        assistantSetupForSetupWizardActivity.P = eupVar.ov;
        assistantSetupForSetupWizardActivity.Q = etbVar.d();
        assistantSetupForSetupWizardActivity.R = eupVar.fU;
        assistantSetupForSetupWizardActivity.S = eupVar.ow;
        assistantSetupForSetupWizardActivity.ba = (fcu) eupVar.fb.a();
        assistantSetupForSetupWizardActivity.T = eupVar.k();
        assistantSetupForSetupWizardActivity.U = (gte) eupVar.bA.a();
        assistantSetupForSetupWizardActivity.V = eupVar.gg;
        assistantSetupForSetupWizardActivity.W = eupVar.ox;
        assistantSetupForSetupWizardActivity.X = eupVar.oy;
        assistantSetupForSetupWizardActivity.Y = eupVar.oz;
        assistantSetupForSetupWizardActivity.Z = etbVar.i();
        assistantSetupForSetupWizardActivity.aa = (idl) eupVar.ga.a();
        assistantSetupForSetupWizardActivity.ab = (idu) eupVar.fZ.a();
        assistantSetupForSetupWizardActivity.ac = eupVar.gN();
        assistantSetupForSetupWizardActivity.ad = (ipe) eupVar.oB.a();
        assistantSetupForSetupWizardActivity.ae = eupVar.ce();
        assistantSetupForSetupWizardActivity.af = (irh) etbVar.g.a();
        assistantSetupForSetupWizardActivity.ag = eupVar.oC;
        assistantSetupForSetupWizardActivity.ah = eupVar.oD;
        assistantSetupForSetupWizardActivity.ai = eupVar.gl;
        assistantSetupForSetupWizardActivity.aj = eupVar.bs();
        assistantSetupForSetupWizardActivity.ak = (vtm) eupVar.hU.a();
        assistantSetupForSetupWizardActivity.al = (ghp) eupVar.ar.a();
        assistantSetupForSetupWizardActivity.am = (ghr) eupVar.fg.a();
        assistantSetupForSetupWizardActivity.an = etbVar.e();
        assistantSetupForSetupWizardActivity.ao = (ffo) eupVar.fu.a();
        assistantSetupForSetupWizardActivity.ap = (Executor) eupVar.aR.a();
        assistantSetupForSetupWizardActivity.aq = eupVar.ge;
        assistantSetupForSetupWizardActivity.bh = eupVar.oE;
        assistantSetupForSetupWizardActivity.bi = (Context) eupVar.n.a();
        assistantSetupForSetupWizardActivity.bj = eupVar.r();
        assistantSetupForSetupWizardActivity.bk = Boolean.valueOf(eupVar.hf());
        assistantSetupForSetupWizardActivity.bl = eupVar.gK();
        assistantSetupForSetupWizardActivity.bm = (ipg) eupVar.oF.a();
    }
}
