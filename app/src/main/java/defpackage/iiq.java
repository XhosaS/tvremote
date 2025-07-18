package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiq extends ijf {
    @Override // defpackage.ats
    public final axd aP() throws Resources.NotFoundException {
        Resources resourcesAY = aY();
        return new axd(dZ().getResources().getString(R.string.assistant_entry_title), dZ().getResources().getString(R.string.assistant_entry_desc) + "\n" + dZ().getResources().getString(R.string.assistant_entry_for_signout_user_desc), null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        axf axfVar = new axf();
        axfVar.a = 2L;
        axfVar.b = dZ().getResources().getString(R.string.assistant_entry_sign_in_yes);
        list.add(axfVar.a());
        axf axfVar2 = new axf();
        axfVar2.a = 20L;
        axfVar2.b = dZ().getResources().getString(R.string.assistant_entry_sign_in_use_without_sign_in);
        list.add(axfVar2.a());
        axf axfVar3 = new axf();
        axfVar3.a = 3L;
        axfVar3.b = dZ().getResources().getString(R.string.assistant_entry_sign_in_skip);
        list.add(axfVar3.a());
    }

    @Override // defpackage.iic
    public final void aS(ayb aybVar, axh axhVar) {
        long j = axhVar.a;
        if (j == 2) {
            aybVar.t.setContentDescription(dZ().getResources().getString(R.string.assistant_entry_sign_in_yes_description));
        } else if (j == 20) {
            aybVar.t.setContentDescription(dZ().getResources().getString(R.string.assistant_entry_sign_in_use_without_sign_in_description));
        } else if (j == 3) {
            aybVar.t.setContentDescription(dZ().getResources().getString(R.string.assistant_entry_sign_in_skip_description));
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
        ycmVar2.c = 1;
        ycmVar2.b = 1 | ycmVar2.b;
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
        if (i == 2) {
            adzd adzdVar = adzd.SIGNED_OUT_ENTRY_SCREEN_SIGN_IN;
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
        if (i == 3) {
            adzd adzdVar2 = adzd.SIGNED_OUT_ENTRY_SCREEN_SKIP;
            aZ(objEp, adzdVar2);
            if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
                yclVar.y();
            }
            ycm ycmVar6 = (ycm) yclVar.b;
            ycmVar6.d = adzdVar2.z;
            ycmVar6.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.c);
            return;
        }
        if (i != 20) {
            return;
        }
        adzd adzdVar3 = adzd.SIGNED_OUT_ENTRY_SCREEN_USE_WITHOUT_SIGN_IN;
        aZ(objEp, adzdVar3);
        if ((Integer.MIN_VALUE & yclVar.b.memoizedSerializedSize) == 0) {
            yclVar.y();
        }
        ycm ycmVar7 = (ycm) yclVar.b;
        ycmVar7.d = adzdVar3.z;
        ycmVar7.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.h);
    }
}
