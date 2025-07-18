package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iio extends ijd {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/setup/fragment/AssistantSignInOptInFragment");

    @Override // defpackage.ats
    public final axd aP() {
        Resources resourcesAY = aY();
        return new axd(dZ().getResources().getString(R.string.assistant_signin_opt_in_title), dZ().getResources().getString(R.string.assistant_signin_opt_in_description), null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        axf axfVar = new axf();
        axfVar.a = 2L;
        axfVar.b = dZ().getResources().getString(R.string.assistant_signin_opt_in_continue);
        list.add(axfVar.a());
        axf axfVar2 = new axf();
        axfVar2.a = 1L;
        axfVar2.b = dZ().getResources().getString(R.string.assistant_signin_opt_in_signin);
        list.add(axfVar2.a());
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
        ycmVar2.c = 3;
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
        if (i == 1) {
            adzd adzdVar = adzd.SIGN_IN_OPT_IN_SCREEN_SIGN_IN;
            aZ(objEp, adzdVar);
            if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
                yclVar.y();
            }
            ycm ycmVar5 = (ycm) yclVar.b;
            ycmVar5.d = adzdVar.z;
            ycmVar5.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.b);
            return;
        }
        if (i != 2) {
            ((zdv) ((zdv) d.c()).q("com/google/android/apps/tvsearch/setup/fragment/AssistantSignInOptInFragment", "onGuidedActionClicked", 93, "AssistantSignInOptInFragment.java")).u("An impossible choice selected!");
            return;
        }
        adzd adzdVar2 = adzd.SIGN_IN_OPT_IN_SCREEN_CONTINUE;
        aZ(objEp, adzdVar2);
        if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
            yclVar.y();
        }
        ycm ycmVar6 = (ycm) yclVar.b;
        ycmVar6.d = adzdVar2.z;
        ycmVar6.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.c);
    }
}
