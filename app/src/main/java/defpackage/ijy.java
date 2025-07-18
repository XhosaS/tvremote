package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijy extends ijj {
    private static final zdy ah = zdy.h("com/google/android/apps/tvsearch/setup/fragment/PersonalResultFragment");
    private boolean ai;
    public ggk d;
    public agow e;
    public boolean f = true;
    private int ao = R.string.assistant_personal_result_description_amati_voice_match_off;

    private final void aW(boolean z) {
        Bundle bundle = this.n;
        if (bundle == null || TextUtils.isEmpty(bundle.getString("setup:key_account_name"))) {
            ((zdv) ((zdv) ah.c()).q("com/google/android/apps/tvsearch/setup/fragment/PersonalResultFragment", "auditRecordMoment", 298, "PersonalResultFragment.java")).u("No account name is specified in the arguments");
        } else if (this.al == gph.a) {
            this.d.c(bundle.getString("setup:key_account_name"), bundle.getString("setup:key_account_gaia_id"), yyk.p(Integer.valueOf(R.string.assistant_personal_result_title_amati), Integer.valueOf(this.ao)), z);
        } else {
            this.d.c(bundle.getString("setup:key_account_name"), null, yyk.p(Integer.valueOf(R.string.assistant_personal_result_title), Integer.valueOf(R.string.assistant_personal_result_description)), z);
        }
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return this.an.g() ? new ijw() : new ikq(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new ijx(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        if (this.al != gph.a) {
            Resources resourcesAY = aY();
            return new axd(dZ().getResources().getString(R.string.assistant_personal_result_title), dZ().getResources().getString(R.string.assistant_personal_result_description), null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
        }
        Bundle bundle = this.n;
        if (bundle != null && bundle.getBoolean("setup:voice_match_accepted", false)) {
            this.ao = R.string.assistant_personal_result_description_amati_voice_match_on;
        }
        return new axd(dZ().getResources().getString(R.string.assistant_personal_result_title_amati), dZ().getResources().getString(this.ao), null, null);
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
            axfVar.a = 32003L;
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar.b(8, 8);
            list.add(axfVar.a());
        }
        dZ();
        axf axfVar2 = new axf(null);
        axfVar2.a = 32001L;
        axfVar2.b = dZ().getResources().getString(R.string.assistant_personal_result_view_more);
        list.add(axfVar2.a());
        dZ();
        axf axfVar3 = new axf(null);
        axfVar3.a = 32002L;
        axfVar3.b = dZ().getResources().getString(R.string.assistant_personal_result_skip);
        list.add(axfVar3.a());
    }

    public final void aV() {
        this.f = false;
        aE(32001L).b = dZ().getResources().getString(R.string.assistant_personal_result_allow);
        aJ(l(32001L));
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        if (this.an.g()) {
            view.setBackground(this.an.b(dZ()));
        }
        ScrollView scrollView = (ScrollView) view.requireViewById(R.id.main_container_scroll);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ijv(this, scrollView));
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
        ycmVar2.c = 8;
        ycmVar2.b |= 1;
        boolean z = this.ai;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b = 8 | ycmVar3.b;
        ycmVar3.e = z;
        int i = (int) axhVar.a;
        if (i != 32001) {
            if (i != 32002) {
                return;
            }
            aW(false);
            adzd adzdVar = adzd.PERSONAL_RESULT_SCREEN_SKIP;
            aZ(objEp, adzdVar);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
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
            adzd adzdVar2 = adzd.PERSONAL_RESULT_SCREEN_ALLOW;
            aZ(objEp, adzdVar2);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
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
        adzd adzdVar3 = adzd.PERSONAL_RESULT_SCREEN_ALLOW;
        aZ(objEp, adzdVar3);
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar6 = (ycm) yclVar.b;
        ycmVar6.d = adzdVar3.z;
        ycmVar6.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.b);
    }
}
