package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iip extends ije {
    @Override // defpackage.ats
    public final axd aP() {
        Resources resourcesAY = aY();
        return new axd(dZ().getResources().getString(R.string.assistant_entry_title), dZ().getResources().getString(R.string.assistant_entry_desc), null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        axf axfVar = new axf();
        axfVar.a = 1L;
        axfVar.b = dZ().getResources().getString(R.string.assistant_setup_continue_button);
        list.add(axfVar.a());
    }

    @Override // defpackage.iic
    public final void aS(ayb aybVar, axh axhVar) {
        if (axhVar.a == 1) {
            aybVar.t.setContentDescription(dZ().getResources().getString(R.string.assistant_setup_continue_description));
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
        if (axhVar.a == 1) {
            adzd adzdVar = adzd.SIGNED_IN_ENTRY_SCREEN_CONTINUE;
            aZ(objEp, adzdVar);
            ycm ycmVar = ycm.a;
            ycl yclVar = new ycl();
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yclVar.y();
            }
            ycm ycmVar2 = (ycm) yclVar.b;
            ycmVar2.c = 2;
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
}
