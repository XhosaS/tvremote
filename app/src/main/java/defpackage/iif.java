package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iif extends ija {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/setup/fragment/AssistantOptInAmatiFragment");
    private boolean e;

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new iid(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new iie(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        ylw ylwVarAS = aS();
        if (ylwVarAS == null) {
            return new axd("", "", null, null);
        }
        ylv ylvVar = ylwVarAS.c;
        if (ylvVar == null) {
            ylvVar = ylv.a;
        }
        String str = ylvVar.b;
        ylv ylvVar2 = ylwVarAS.c;
        if (ylvVar2 == null) {
            ylvVar2 = ylv.a;
        }
        return new axd(str, ylvVar2.d, null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        ylw ylwVarAS = aS();
        if (ylwVarAS == null) {
            return;
        }
        Bundle bundle = this.n;
        if (bundle != null) {
            this.e = bundle.getBoolean("setup:neutral_consent_button", false);
        }
        if (this.e) {
            s();
            axf axfVar = new axf(null);
            axfVar.a = 5000L;
            axfVar.b(8, 8);
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            list.add(axfVar.a());
        }
        axf axfVar2 = new axf();
        axfVar2.a = 3001L;
        axfVar2.b = Html.fromHtml(ylwVarAS.d, 0);
        list.add(axfVar2.a());
        axf axfVar3 = new axf();
        axfVar3.a = 3002L;
        axfVar3.b = Html.fromHtml(ylwVarAS.e, 0);
        list.add(axfVar3.a());
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
            axf axfVar4 = new axf();
            axfVar4.a = 3003L;
            axfVar4.b = ymnVar.d;
            list.add(axfVar4.a());
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
            } catch (abxv e) {
                ((zdv) ((zdv) ((zdv) d.c()).p(e)).q("com/google/android/apps/tvsearch/setup/fragment/AssistantOptInAmatiFragment", "getConsentUi", 'P', "AssistantOptInAmatiFragment.java")).u("InvalidProtocolBufferException in getConsentUi method");
            }
        }
        return null;
    }

    @Override // defpackage.ikr
    protected final void aT() {
        TextView textView;
        super.aT();
        if (this.al != gph.a || this.R == null || (textView = (TextView) cP().requireViewById(R.id.guidance_description_2)) == null) {
            return;
        }
        textView.setFocusable(true);
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        if (this.an.g()) {
            view.setBackground(this.an.b(dZ()));
        }
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        ioy ioyVar;
        ylw ylwVarAS;
        Object objEp = ep();
        if (objEp instanceof ioy) {
            ioyVar = (ioy) objEp;
        } else if (!feo.b(objEp, ioy.class)) {
            return;
        } else {
            ioyVar = (ioy) feo.a(objEp);
        }
        int i = (int) axhVar.a;
        if (this.n == null || (ylwVarAS = aS()) == null) {
            return;
        }
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.c = 5;
        ycmVar2.b |= 1;
        boolean z = this.e;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = z;
        if (i == 3001) {
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
        if (i == 3003) {
            ylv ylvVar = ylwVarAS.c;
            if (ylvVar == null) {
                ylvVar = ylv.a;
            }
            ymn ymnVar = (ymn) ylvVar.e.get(0);
            String string = Html.fromHtml(ymnVar.b, 0).toString();
            String string2 = Html.fromHtml(TextUtils.join("", ymnVar.c), 0).toString();
            String string3 = Html.fromHtml(TextUtils.join("", ymnVar.e), 0).toString();
            de deVar = this.C;
            ikw ikwVar = new ikw();
            Bundle bundle = new Bundle();
            bundle.putString("info_dialog_title", string);
            bundle.putString("info_dialog_content_header", string2);
            bundle.putString("info_dialog_content_body", string3);
            ikwVar.ae(bundle);
            ikwVar.d = false;
            ikwVar.e = true;
            ab abVar = new ab(deVar);
            abVar.s = true;
            abVar.m(ikwVar, "dialog");
            abVar.e();
        }
    }
}
