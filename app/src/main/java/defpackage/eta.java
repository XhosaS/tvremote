package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eta implements aejl {
    private final eup a;
    private final etb b;
    private final int c;

    public eta(eup eupVar, etb etbVar, int i) {
        this.a = eupVar;
        this.b = etbVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v28, types: [etb] */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.app.Activity] */
    @Override // defpackage.agow
    public final Object a() {
        String str = "Expected activity to be a FragmentActivity: ";
        switch (this.c) {
            case 0:
                Activity activity = this.b.a;
                aeiv.a(activity);
                try {
                    return (bw) activity;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(activity.toString()), e);
                }
            case 1:
                Object objA = this.b.e.a();
                objA.getClass();
                return (ffn) objA;
            case 2:
                eup eupVar = this.a;
                AccessibilityManager accessibilityManagerU = eupVar.u();
                Context context = (Context) eupVar.n.a();
                ahbt ahbtVar = (ahbt) eupVar.q.a();
                etb etbVar = this.b;
                gph gphVarBj = eupVar.bj();
                Activity activity2 = etbVar.a;
                aeiv.a(activity2);
                hka hkaVar = feo.b(activity2, hka.class) ? (hka) feo.a(activity2) : (hka) activity2;
                gyh gyhVarBH = eupVar.bH();
                exl exlVarC = eupVar.C();
                aejl aejlVar = eupVar.cp;
                aejl aejlVar2 = eupVar.cu;
                aejl aejlVar3 = eupVar.eV;
                ezn eznVar = (ezn) eupVar.kl.a();
                aeiv.a(activity2);
                return new ffj(accessibilityManagerU, context, ahbtVar, eupVar.ck, gphVarBj, hkaVar, gyhVarBH, exlVarC, aejlVar, aejlVar2, aejlVar3, eznVar, feo.b(activity2, ffm.class) ? (ffm) feo.a(activity2) : (ffm) activity2, (ffk) eupVar.fu.a(), (idl) eupVar.ga.a(), eupVar.cs(), eupVar.fg, eupVar.ob, aejf.b(eupVar.of));
            case 3:
                eup eupVar2 = this.a;
                eupVar2.bj();
                return new iri((gtu) eupVar2.bE.a(), (idl) eupVar2.ga.a());
            case 4:
                agte agteVar = (agte) this.a.bW.a();
                wit witVar = (wit) this.b.h.a();
                agteVar.getClass();
                witVar.getClass();
                bcg bcgVarEk = witVar.ek();
                bcgVarEk.getClass();
                ahej ahejVar = new ahej();
                bcgVarEk.b(new wjm(ahejVar));
                return new wjn(agteVar, ahejVar);
            case 5:
                Object objG = this.b.a;
                try {
                    yqt yqtVarI = objG == 0 ? ypv.a : yqt.i((bw) objG);
                    str = this.b;
                    objG = yqtVarI.g();
                    if (objG != 0) {
                        return new wis((bw) yqtVarI.c());
                    }
                    wit witVar2 = str.b;
                    witVar2.getClass();
                    return witVar2;
                } catch (ClassCastException e2) {
                    throw new IllegalStateException(str.concat(String.valueOf(String.valueOf(objG))), e2);
                }
            case 6:
                etb etbVar2 = this.b;
                aejl aejlVar4 = etbVar2.h;
                Activity activity3 = etbVar2.a;
                yqt yqtVarH = yqt.h(activity3);
                yqt yqtVarH2 = yqt.h(activity3);
                if (yqtVarH2.g()) {
                    yqw.L(yqtVarH2.c() instanceof tt);
                }
                return new wii(new wih(yqtVarH));
            case 7:
                vgh vghVar = (vgh) this.b.m.a();
                vghVar.getClass();
                return yqt.i(AccountId.b(vghVar.g()));
            case 8:
                etb etbVar3 = this.b;
                wit witVar3 = (wit) etbVar3.h.a();
                vgd vgdVar = (vgd) etbVar3.j.a();
                return new vgj(witVar3, vgdVar);
            case 9:
                return new vgd(new zdd((vgc) this.b.c.oJ.a()));
            case 10:
                return new vgv((wit) this.b.h.a());
            case 11:
                etb etbVar4 = this.b;
                return new vgl((wit) etbVar4.h.a(), (vgd) etbVar4.j.a(), (vgv) etbVar4.k.a(), (wii) etbVar4.l.a());
            default:
                Activity activity4 = this.b.a;
                aeiv.a(activity4);
                return new wjl(activity4, zcp.b);
        }
    }
}
