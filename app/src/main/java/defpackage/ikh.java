package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikh extends ijm {
    private static final zdy ah = zdy.h("com/google/android/apps/tvsearch/setup/fragment/VoiceMatchFragment");
    private boolean ai;
    public ggk d;
    public agow e;
    public boolean f = true;

    private final void aW(boolean z) {
        Bundle bundle = this.n;
        if (bundle == null || TextUtils.isEmpty(bundle.getString("setup:key_account_name"))) {
            ((zdv) ((zdv) ah.c()).q("com/google/android/apps/tvsearch/setup/fragment/VoiceMatchFragment", "auditRecordMoment", 293, "VoiceMatchFragment.java")).u("No account name is specified in the arguments");
            return;
        }
        ggk ggkVar = this.d;
        String string = bundle.getString("setup:key_account_name");
        String string2 = bundle.getString("setup:key_account_gaia_id");
        yyk yykVarQ = yyk.q(Integer.valueOf(R.string.voice_match_setup_screen_title), Integer.valueOf(R.string.voice_match_setup_screen_description_1), Integer.valueOf(R.string.voice_match_setup_screen_description_2));
        string.getClass();
        yykVarQ.getClass();
        abje abjeVar = abje.a;
        abjd abjdVar = new abjd();
        abkp abkpVar = abkp.a;
        abko abkoVar = new abko();
        abim abimVar = abim.gm;
        if ((abkoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abkoVar.y();
        }
        abkp abkpVar2 = (abkp) abkoVar.b;
        abkpVar2.c = abimVar.a();
        abkpVar2.b |= 1;
        abkk abkkVar = abkk.a;
        abkj abkjVar = new abkj();
        abja abjaVar = abja.a;
        abiz abizVar = new abiz();
        abizVar.a(yykVarQ);
        if ((abkjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abkjVar.y();
        }
        abkk abkkVar2 = (abkk) abkjVar.b;
        abja abjaVar2 = (abja) abizVar.v();
        abjaVar2.getClass();
        abkkVar2.c = abjaVar2;
        abkkVar2.b |= 512;
        abkk abkkVar3 = (abkk) abkjVar.v();
        if ((abkoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abkoVar.y();
        }
        abkp abkpVar3 = (abkp) abkoVar.b;
        abkkVar3.getClass();
        abkpVar3.d = abkkVar3;
        abkpVar3.b |= 8;
        abkp abkpVar4 = (abkp) abkoVar.v();
        if ((abjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjdVar.y();
        }
        abje abjeVar2 = (abje) abjdVar.b;
        abkpVar4.getClass();
        abjeVar2.f = abkpVar4;
        abjeVar2.b |= 8;
        abjm abjmVar = abjm.a;
        abjl abjlVar = new abjl();
        if ((abjlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjlVar.y();
        }
        abjm abjmVar2 = (abjm) abjlVar.b;
        abjmVar2.c = 92;
        abjmVar2.b |= 1;
        abjo abjoVar = abjo.a;
        abjn abjnVar = new abjn();
        abki abkiVar = abki.a;
        abjp abjpVar = new abjp();
        abkh abkhVar = abkh.a;
        abkg abkgVar = new abkg();
        abkn abknVar = abkn.a;
        abkl abklVar = new abkl();
        int i = true != z ? 3 : 2;
        if ((abklVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abklVar.y();
        }
        abkn abknVar2 = (abkn) abklVar.b;
        abknVar2.c = i - 1;
        abknVar2.b |= 1;
        if ((abkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abkgVar.y();
        }
        abkh abkhVar2 = (abkh) abkgVar.b;
        abkn abknVar3 = (abkn) abklVar.v();
        abknVar3.getClass();
        abkhVar2.c = abknVar3;
        abkhVar2.b |= 1;
        if ((abjpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjpVar.y();
        }
        abki abkiVar2 = (abki) abjpVar.b;
        abkh abkhVar3 = (abkh) abkgVar.v();
        abkhVar3.getClass();
        abkiVar2.c = abkhVar3;
        abkiVar2.b = 1;
        if ((abjnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjnVar.y();
        }
        abjo abjoVar2 = (abjo) abjnVar.b;
        abki abkiVar3 = (abki) abjpVar.v();
        abkiVar3.getClass();
        abjoVar2.c = abkiVar3;
        abjoVar2.b |= 4;
        abjo abjoVar3 = (abjo) abjnVar.v();
        if ((abjlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjlVar.y();
        }
        abjm abjmVar3 = (abjm) abjlVar.b;
        abjoVar3.getClass();
        abjmVar3.d = abjoVar3;
        abjmVar3.b |= 2;
        abjm abjmVar4 = (abjm) abjlVar.v();
        if ((abjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abjdVar.y();
        }
        abje abjeVar3 = (abje) abjdVar.b;
        abjmVar4.getClass();
        abjeVar3.e = abjmVar4;
        abjeVar3.b |= 4;
        ggr ggrVar = (ggr) ggkVar;
        ahal.e(ggrVar.a, null, 0, new ggp(ggrVar, string, string2, abjdVar, null), 3);
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return this.an.g() ? new ikf() : new ikq(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new ikg(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        return new axd(dZ().getResources().getString(R.string.voice_match_setup_screen_title), dZ().getResources().getString(R.string.voice_match_setup_screen_description_1), null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        Bundle bundle = this.n;
        if (bundle != null) {
            this.ai = bundle.getBoolean("setup:neutral_consent_button", false);
        }
        if (this.ai) {
            dZ();
            axf axfVar = new axf(null);
            axfVar.a = 3L;
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar.b(8, 8);
            list.add(axfVar.a());
        }
        dZ();
        axf axfVar2 = new axf(null);
        axfVar2.a = 1L;
        axfVar2.b = dZ().getResources().getString(R.string.voice_match_setup_view_more);
        list.add(axfVar2.a());
        dZ();
        axf axfVar3 = new axf(null);
        axfVar3.a = 2L;
        axfVar3.b = dZ().getResources().getString(R.string.voice_match_setup_no);
        list.add(axfVar3.a());
    }

    @Override // defpackage.ikr
    protected final void aT() {
        View view;
        TextView textView;
        super.aT();
        if (this.al != gph.a || (view = this.R) == null || (textView = (TextView) view.findViewById(R.id.guidance_description_2)) == null) {
            return;
        }
        textView.setFocusable(true);
    }

    public final void aV() {
        this.f = false;
        aE(1L).b = dZ().getResources().getString(R.string.voice_match_setup_yes);
        aJ(l(1L));
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        if (this.an.g()) {
            view.setBackground(this.an.b(dZ()));
        }
        ScrollView scrollView = (ScrollView) view.requireViewById(R.id.main_container_scroll);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ike(this, scrollView));
        if (this.al == gph.a) {
            TextView textView = (TextView) view.requireViewById(R.id.guidance_description_2);
            textView.setVisibility(0);
            textView.setText(dZ().getResources().getString(R.string.voice_match_setup_screen_description_2));
        }
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
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.c = 10;
        ycmVar2.b |= 1;
        boolean z = this.ai;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = z;
        int i = (int) axhVar.a;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            aW(false);
            adzd adzdVar = adzd.VOICE_MATCH_NO;
            aZ(objEp, adzdVar);
            if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
                yclVar.y();
            }
            ycm ycmVar4 = (ycm) yclVar.b;
            ycmVar4.d = adzdVar.z;
            ycmVar4.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.c);
            return;
        }
        if (((Boolean) this.e.a()).booleanValue()) {
            if (this.f) {
                ((ScrollView) cP().requireViewById(R.id.main_container_scroll)).fullScroll(130);
                aV();
                return;
            }
            aW(true);
            adzd adzdVar2 = adzd.VOICE_MATCH_YES;
            aZ(objEp, adzdVar2);
            if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
                yclVar.y();
            }
            ycm ycmVar5 = (ycm) yclVar.b;
            ycmVar5.d = adzdVar2.z;
            ycmVar5.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.b);
            return;
        }
        if (bb()) {
            ((ScrollView) cP().requireViewById(R.id.main_container_scroll)).fullScroll(130);
            aV();
            return;
        }
        aW(true);
        adzd adzdVar3 = adzd.VOICE_MATCH_YES;
        aZ(objEp, adzdVar3);
        if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
            yclVar.y();
        }
        ycm ycmVar6 = (ycm) yclVar.b;
        ycmVar6.d = adzdVar3.z;
        ycmVar6.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.b);
    }
}
