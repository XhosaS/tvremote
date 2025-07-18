package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.katniss.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikd extends ijl {
    public agow d;

    @Override // defpackage.ats
    public final int aB() {
        return R.style.AssistantUdcGuidedStepV2p2;
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new ikc(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        Resources resourcesAY = aY();
        return new axd(dZ().getResources().getString(R.string.opa_third_party_disclosure_screen_title), null, null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        s();
        axf axfVar = new axf(null);
        axfVar.a = 0L;
        axfVar.b = dZ().getResources().getString(R.string.opa_third_party_disclosure_service_title);
        axfVar.c = dZ().getResources().getString(R.string.opa_third_party_disclosure_service_short_description);
        axfVar.b(4, 4);
        list.add(axfVar.a());
        s();
        axf axfVar2 = new axf(null);
        axfVar2.a = 1L;
        axfVar2.b = dZ().getResources().getString(R.string.opa_third_party_disclosure_screen_continue_button);
        list.add(axfVar2.a());
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        du(1);
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) throws Resources.NotFoundException {
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
        ycmVar2.c = 7;
        ycmVar2.b |= 1;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = false;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar4 = (ycm) yclVar.b;
        ycmVar4.b |= 16;
        ycmVar4.f = false;
        int i = (int) axhVar.a;
        if (i == 0) {
            String string = dZ().getResources().getString(R.string.opa_third_party_disclosure_service_title);
            String str = (String) this.d.a();
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language)) {
                str = String.format(str, language);
            }
            bc(string, dZ().getResources().getString(R.string.opa_third_party_disclosure_service_expanded_description, str), ee(), this.ak);
            return;
        }
        if (i != 1) {
            return;
        }
        adzd adzdVar = adzd.THIRD_PARTY_DISCLOSURE_SCREEN_CONTINUE;
        aZ(objEp, adzdVar);
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar5 = (ycm) yclVar.b;
        ycmVar5.d = adzdVar.z;
        ycmVar5.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.a);
    }
}
