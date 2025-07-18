package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mky implements ofd {
    private final oco a;

    public mky(oco ocoVar) {
        this.a = ocoVar;
    }

    private static int c(dru druVar, acyf acyfVar, oco ocoVar) {
        int i = acyfVar.d;
        if (i != 0) {
            return i;
        }
        Context context = druVar.a;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            ocoVar.b(acsw.LOG_TYPE_INVALID_FIELD, oal.A, "Ripple color (attribute = android.R.attr.colorControlHighlight) not defined in the theme", new Object[0]);
            return 0;
        }
        try {
            return context.getColor(typedValue.resourceId);
        } catch (Resources.NotFoundException e) {
            acwg acwgVar = acwg.a;
            acvx acvxVar = new acvx();
            acsw acswVar = acsw.LOG_TYPE_INVALID_FIELD;
            if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvxVar.y();
            }
            acwg acwgVar2 = (acwg) acvxVar.b;
            acwgVar2.c = acswVar.E;
            acwgVar2.b |= 2;
            String hexString = Integer.toHexString(typedValue.resourceId);
            if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvxVar.y();
            }
            acwg acwgVar3 = (acwg) acvxVar.b;
            hexString.getClass();
            acwgVar3.b |= 256;
            acwgVar3.h = hexString;
            ocoVar.f((acwg) acvxVar.v(), e, new Object[0]);
            return 0;
        }
    }

    private static void d(acyf acyfVar, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        int i = acyfVar.e;
        if (i != 0) {
            rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, i, displayMetrics)));
        }
    }

    @Override // defpackage.ofd
    public final abwk a() {
        return acyf.c;
    }

    @Override // defpackage.ofd
    public final /* bridge */ /* synthetic */ void b(dru druVar, Object obj, ofc ofcVar) {
        acyf acyfVar = (acyf) obj;
        int iC = c(druVar, acyfVar, this.a);
        if (iC == 0) {
            return;
        }
        boolean z = acyfVar.f;
        Drawable drawable = ofcVar.e;
        DisplayMetrics displayMetrics = druVar.a.getResources().getDisplayMetrics();
        mwe mweVar = null;
        if (!z) {
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(iC), null, null);
            d(acyfVar, rippleDrawable, displayMetrics);
            if (drawable == null) {
                ofcVar.e = rippleDrawable;
                return;
            } else {
                ofcVar.e = new LayerDrawable(new Drawable[]{drawable, rippleDrawable});
                return;
            }
        }
        if (drawable == null) {
            mwe mweVar2 = new mwe();
            mweVar2.c = -1;
            mweVar2.d = ofcVar.a;
            drawable = null;
            mweVar = mweVar2;
        }
        RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(iC), drawable, mweVar);
        d(acyfVar, rippleDrawable2, displayMetrics);
        ofcVar.e = rippleDrawable2;
    }
}
