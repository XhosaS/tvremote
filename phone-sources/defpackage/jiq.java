package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jiq implements sch {
    public final /* synthetic */ sbx a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ixi c;
    public final /* synthetic */ scf d;
    private final /* synthetic */ int e;

    public /* synthetic */ jiq(jir jirVar, wni wniVar, jil jilVar, jiv jivVar, int i) {
        this.e = i;
        this.a = jirVar;
        this.b = wniVar;
        this.c = jilVar;
        this.d = jivVar;
    }

    /* JADX WARN: Type inference failed for: r11v19, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        kiw kiwVarG;
        cr supportFragmentManager;
        int i = this.e;
        if (i == 0) {
            jiv jivVar = (jiv) this.d;
            ((jir) this.a).d(view, (wni) this.b, false, (jil) this.c, jivVar);
            jivVar.r(false);
            return;
        }
        if (i == 1) {
            jiv jivVar2 = (jiv) this.d;
            ((jir) this.a).d(view, (wni) this.b, true, (jil) this.c, jivVar2);
            jivVar2.r(false);
            return;
        }
        if (i == 2) {
            jlw jlwVar = (jlw) this.a;
            jeg jegVar = null;
            if (jlwVar.p) {
                TextureView textureView = jlwVar.j;
                if (textureView == null) {
                    yks.c("exoPlayerView");
                    textureView = null;
                }
                textureView.setVisibility(8);
                jlwVar.d().setAlpha(0.6f);
                jlwVar.l.removeCallbacksAndMessages(null);
                jlwVar.e();
            }
            ixi ixiVar = this.c;
            ((jma) this.d).s(!((ylb) this.b).a);
            jlwVar.c.c(view);
            itk itkVar = jlwVar.e;
            ith ithVarE = itkVar.e();
            if (ithVarE != null && !((iua) ithVarE).d) {
                vtw vtwVarM = wpm.a.m();
                vtwVarM.getClass();
                vtw vtwVarM2 = wpl.a.m();
                vtwVarM2.getClass();
                wni wniVar = ((wvd) ixiVar.b).b;
                if (wniVar == null) {
                    wniVar = wni.a;
                }
                wniVar.getClass();
                wxe.t(wniVar, vtwVarM2);
                vxr.y(wxe.s(vtwVarM2), vtwVarM);
                itkVar.m(vxr.w(vtwVarM));
                jlwVar.t.e.c(true);
                return;
            }
            if (jlwVar.d.V()) {
                jlwVar.f(view, (jlu) ixiVar);
                return;
            }
            if (!((Boolean) xld.a.et(((xld) jlwVar.f).b)).booleanValue()) {
                jlwVar.f(view, (jlu) ixiVar);
                return;
            }
            dxd dxdVarM = ihz.M(view);
            jeg jegVar2 = dxdVarM instanceof jeg ? (jeg) dxdVarM : null;
            if (jegVar2 == null) {
                LayoutInflater.Factory factoryN = ihz.N(view);
                if (factoryN instanceof jeg) {
                    jegVar = (jeg) factoryN;
                }
            } else {
                jegVar = jegVar2;
            }
            if (jegVar != null) {
                wni wniVar2 = ((wvd) ixiVar.b).b;
                if (wniVar2 == null) {
                    wniVar2 = wni.a;
                }
                wniVar2.getClass();
                jegVar.a(wniVar2);
                return;
            }
            return;
        }
        ixi ixiVar2 = this.c;
        jrs jrsVar = (jrs) ixiVar2;
        if (!jrsVar.k()) {
            ?? r11 = this.b;
            scf scfVar = this.d;
            boolean z = !jrsVar.d;
            jrsVar.d = z;
            ((jrw) scfVar).r(z);
            if (r11 != 0) {
                return;
            }
            return;
        }
        wtf wtfVar = (wtf) ixiVar2.b;
        wkp wkpVar = wtfVar.c;
        if (wkpVar == null) {
            wkpVar = wkp.a;
        }
        wph wphVar = wkpVar.c;
        if (wphVar == null) {
            wphVar = wph.a;
        }
        if ((wphVar.b == 2 ? (wpe) wphVar.c : wpe.a).b != 2) {
            wkp wkpVar2 = wtfVar.c;
            if (wkpVar2 == null) {
                wkpVar2 = wkp.a;
            }
            wph wphVar2 = wkpVar2.c;
            if (wphVar2 == null) {
                wphVar2 = wph.a;
            }
            if ((wphVar2.b == 2 ? (wpe) wphVar2.c : wpe.a).b != 1 || (kiwVarG = jbr.g(view)) == null) {
                return;
            }
            wkp wkpVar3 = wtfVar.c;
            if (wkpVar3 == null) {
                wkpVar3 = wkp.a;
            }
            wph wphVar3 = wkpVar3.c;
            if (wphVar3 == null) {
                wphVar3 = wph.a;
            }
            wpe wpeVar = wphVar3.b == 2 ? (wpe) wphVar3.c : wpe.a;
            wls wlsVar = wpeVar.b == 1 ? (wls) wpeVar.c : wls.a;
            wlsVar.getClass();
            String str = wlsVar.b;
            str.getClass();
            kiwVarG.L(str);
            return;
        }
        by byVarN = ihz.N(view);
        if (byVarN == null || (supportFragmentManager = byVarN.getSupportFragmentManager()) == null) {
            return;
        }
        sbx sbxVar = this.a;
        String str2 = jrsVar.i().b;
        str2.getClass();
        Uri uriAY = ((jrt) sbxVar).b.aY();
        uriAY.getClass();
        wkp wkpVar4 = wtfVar.c;
        if (wkpVar4 == null) {
            wkpVar4 = wkp.a;
        }
        wph wphVar4 = wkpVar4.c;
        if (wphVar4 == null) {
            wphVar4 = wph.a;
        }
        wpe wpeVar2 = wphVar4.b == 2 ? (wpe) wphVar4.c : wpe.a;
        wpg wpgVar = wpeVar2.b == 2 ? (wpg) wpeVar2.c : wpg.a;
        wpgVar.getClass();
        mnt mntVar = new mnt();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("service_name", str2);
        bundle.putString("action_uri", uriAY.toString());
        hju.I(bundle, "prompt_message", wpgVar);
        mntVar.setArguments(bundle);
        mntVar.show(supportFragmentManager, "linked_service_dialog_tag");
    }

    public /* synthetic */ jiq(jlw jlwVar, jma jmaVar, ylb ylbVar, jlu jluVar, int i) {
        this.e = i;
        this.a = jlwVar;
        this.d = jmaVar;
        this.b = ylbVar;
        this.c = jluVar;
    }

    public /* synthetic */ jiq(jrs jrsVar, jrw jrwVar, Map map, jrt jrtVar, int i) {
        this.e = i;
        this.c = jrsVar;
        this.d = jrwVar;
        this.b = map;
        this.a = jrtVar;
    }
}
