package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikb extends ijk {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/setup/fragment/PromotionsOptInFragment");
    private boolean e;

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return this.an.g() ? new ijz() : new ikq(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new ika(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        Resources resourcesAY = aY();
        return new axd(dZ().getResources().getString(R.string.assistant_promotions_opt_in_title), dZ().getResources().getString(R.string.assistant_promotions_opt_in_description), null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        Bundle bundle = this.n;
        if (bundle != null) {
            this.e = bundle.getBoolean("setup:neutral_consent_button", false);
        }
        if (this.e) {
            s();
            axf axfVar = new axf(null);
            axfVar.a = 3L;
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar.b(8, 8);
            list.add(axfVar.a());
        }
        axf axfVar2 = new axf();
        axfVar2.a = 1L;
        axfVar2.b = dZ().getResources().getString(R.string.assistant_promotions_opt_in_yes);
        list.add(axfVar2.a());
        axf axfVar3 = new axf();
        axfVar3.a = 2L;
        axfVar3.b = dZ().getResources().getString(R.string.assistant_promotions_opt_in_no);
        list.add(axfVar3.a());
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
        ycmVar2.c = 9;
        ycmVar2.b |= 1;
        boolean z = this.e;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = z;
        int i = (int) axhVar.a;
        if (i == 1) {
            adzd adzdVar = adzd.PROMOTIONS_OPT_IN_SCREEN_YES;
            aZ(objEp, adzdVar);
            if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
                yclVar.y();
            }
            ycm ycmVar4 = (ycm) yclVar.b;
            ycmVar4.d = adzdVar.z;
            ycmVar4.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.b);
            return;
        }
        if (i != 2) {
            ((zdv) ((zdv) d.c()).q("com/google/android/apps/tvsearch/setup/fragment/PromotionsOptInFragment", "onGuidedActionClicked", 170, "PromotionsOptInFragment.java")).u("An impossible choice selected!");
            return;
        }
        adzd adzdVar2 = adzd.PROMOTIONS_OPT_IN_SCREEN_NO;
        aZ(objEp, adzdVar2);
        if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
            yclVar.y();
        }
        ycm ycmVar5 = (ycm) yclVar.b;
        ycmVar5.d = adzdVar2.z;
        ycmVar5.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.c);
    }
}
