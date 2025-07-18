package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iim extends ijb {
    public static final zdy d = zdy.h("com/google/android/apps/tvsearch/setup/fragment/AssistantOptInFragment");
    public static final yyk e = yyk.q(2990L, 3340L, 1728L);
    public static final yyk f = yyk.q(3880L, 1710L, 1100L);
    public int ah = 0;
    private int ai;
    private boolean ao;

    public static String aU(List list) {
        Iterator it = list.iterator();
        String strConcat = "";
        while (it.hasNext()) {
            strConcat = strConcat.concat("<p>" + ((String) it.next()) + "</p>");
        }
        return strConcat;
    }

    @Override // defpackage.ats
    public final int aB() {
        return R.style.AssistantUdcGuidedStepV2p2;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new iii(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new iil(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        return new axd(null, null, null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        if (!aV()) {
            axf axfVar = new axf();
            axfVar.a = 3003L;
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_continue_button);
            list.add(axfVar.a());
            return;
        }
        ylw ylwVarAS = aS();
        if (ylwVarAS == null) {
            return;
        }
        Bundle bundle = this.n;
        if (bundle != null) {
            this.ao = bundle.getBoolean("setup:neutral_consent_button", false);
        }
        if (this.ao) {
            s();
            axf axfVar2 = new axf(null);
            axfVar2.a = 5000L;
            axfVar2.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar2.b(8, 8);
            list.add(axfVar2.a());
            this.ai = list.size() - 1;
        } else {
            this.ai = list.size();
        }
        axf axfVar3 = new axf();
        axfVar3.a = 3001L;
        axfVar3.b = Html.fromHtml(ylwVarAS.d, 0);
        list.add(axfVar3.a());
        axf axfVar4 = new axf();
        axfVar4.a = 3002L;
        axfVar4.b = Html.fromHtml(ylwVarAS.e, 0);
        list.add(axfVar4.a());
        ylv ylvVar = ylwVarAS.c;
        if (ylvVar == null) {
            ylvVar = ylv.a;
        }
        if (ylvVar.e.size() > 0) {
            ylv ylvVar2 = ylwVarAS.c;
            if (ylvVar2 == null) {
                ylvVar2 = ylv.a;
            }
            ymn ymnVar = (ymn) ylvVar2.e.get(0);
            axf axfVar5 = new axf();
            axfVar5.a = 3004L;
            axfVar5.b = Html.fromHtml(ymnVar.d, 0);
            list.add(axfVar5.a());
        }
    }

    public final ylw aS() {
        byte[] byteArray;
        byte bByteValue;
        Bundle bundle = this.n;
        if (bundle != null && (byteArray = bundle.getByteArray("omniconsent_text")) != null) {
            try {
                abxd abxdVarH = abxd.h(ylx.a, byteArray, 0, byteArray.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                ylx ylxVar = (ylx) abxdVarH;
                if (ylxVar.c.size() > 0) {
                    return (ylw) ylxVar.c.get(0);
                }
                ylw ylwVar = ylxVar.b;
                return ylwVar == null ? ylw.a : ylwVar;
            } catch (abxv e2) {
                ((zdv) ((zdv) ((zdv) d.c()).p(e2)).q("com/google/android/apps/tvsearch/setup/fragment/AssistantOptInFragment", "getConsentUi", (char) 267, "AssistantOptInFragment.java")).u("InvalidProtocolBufferException in getConsentUi method");
            }
        }
        return null;
    }

    public final boolean aV() {
        Bundle bundle = this.n;
        return bundle != null && bundle.getBoolean("ask_for_consent");
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        du(this.ai);
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        ioy ioyVar;
        Object objEp = ep();
        if (objEp instanceof ioy) {
            ioyVar = (ioy) objEp;
        } else if (!feo.b(objEp, ioy.class)) {
            return;
        } else {
            ioyVar = (ioy) feo.a(objEp);
        }
        int i = (int) axhVar.a;
        if (this.n == null) {
            return;
        }
        ylw ylwVarAS = aS();
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.c = 4;
        ycmVar2.b |= 1;
        boolean z = this.ao;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = z;
        if (i == 3001 || i == 3003) {
            adzd adzdVar = adzd.OPT_IN_SCREEN_OPT_IN;
            aZ(objEp, adzdVar);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yclVar.y();
            }
            ycm ycmVar4 = (ycm) yclVar.b;
            ycmVar4.d = adzdVar.z;
            ycmVar4.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.b);
            return;
        }
        if (i == 3002) {
            adzd adzdVar2 = adzd.OPT_IN_SCREEN_NO_THANKS;
            aZ(objEp, adzdVar2);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yclVar.y();
            }
            ycm ycmVar5 = (ycm) yclVar.b;
            ycmVar5.d = adzdVar2.z;
            ycmVar5.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.c);
            return;
        }
        if (i == 3004) {
            ylv ylvVar = ylwVarAS.c;
            if (ylvVar == null) {
                ylvVar = ylv.a;
            }
            if (ylvVar.e.size() > 0) {
                ylv ylvVar2 = ylwVarAS.c;
                if (ylvVar2 == null) {
                    ylvVar2 = ylv.a;
                }
                ymn ymnVar = (ymn) ylvVar2.e.get(0);
                bc(aU(ymnVar.c), aU(ymnVar.e), ee(), this.ak);
            }
        }
    }
}
