package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwj {
    private static final float a = Resources.getSystem().getDisplayMetrics().density * 20.0f;

    public final void a(sca scaVar, wkv wkvVar, int i, boolean z, boolean z2, boolean z3, boolean z4) throws scr {
        GradientDrawable.Orientation orientation;
        if (wkvVar == null || yks.e(wkvVar, wkv.a)) {
            return;
        }
        View viewP = scaVar.p(i);
        int i2 = wkvVar.b;
        if (i2 == 2) {
            ColorDrawable colorDrawable = new ColorDrawable(((Integer) wkvVar.c).intValue());
            if (z4) {
                colorDrawable = new ColorDrawable(0);
            }
            if (!z) {
                if (z2) {
                    viewP.setBackground(new LayerDrawable(new Drawable[]{colorDrawable, new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, Color.parseColor("#40000000")}), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, Color.parseColor("#40000000")})}));
                    return;
                } else {
                    viewP.setBackground(colorDrawable);
                    return;
                }
            }
            ColorDrawable colorDrawable2 = new ColorDrawable(Color.parseColor("#A3000000"));
            float f = z3 ? a : 0.0f;
            szp szpVar = new szp();
            szpVar.h(f);
            szk szkVar = new szk(new szq(szpVar));
            szkVar.N(ColorStateList.valueOf(colorDrawable.getColor()));
            viewP.setBackground(new LayerDrawable(new Drawable[]{szkVar, colorDrawable2}));
            viewP.setClipToOutline(true);
            return;
        }
        if (i2 == 3) {
        } else {
            wku wkuVar = wku.a;
        }
        int[] iArr = {(wkvVar.b == 3 ? (wku) wkvVar.c : wku.a).d, (wkvVar.b == 3 ? (wku) wkvVar.c : wku.a).e};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        int i3 = wkvVar.b;
        if ((i3 == 3 ? (wku) wkvVar.c : wku.a).b == 6) {
            wku wkuVar2 = i3 == 3 ? (wku) wkvVar.c : wku.a;
            gradientDrawable.setGradientRadius((wkuVar2.b == 6 ? (wks) wkuVar2.c : wks.a).b);
            gradientDrawable.setGradientType(1);
        } else {
            if ((i3 == 3 ? (wku) wkvVar.c : wku.a).b == 5) {
                gradientDrawable.setGradientType(0);
                wku wkuVar3 = wkvVar.b == 3 ? (wku) wkvVar.c : wku.a;
                switch ((a.bi((wkuVar3.b == 5 ? (wkr) wkuVar3.c : wkr.a).b) != 0 ? r6 : 1) - 2) {
                    case 1:
                        orientation = GradientDrawable.Orientation.BL_TR;
                        break;
                    case 2:
                        orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                        break;
                    case 3:
                        orientation = GradientDrawable.Orientation.BR_TL;
                        break;
                    case 4:
                        orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        break;
                    case 5:
                        orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                        break;
                    case 6:
                        orientation = GradientDrawable.Orientation.TL_BR;
                        break;
                    case 7:
                        orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                        break;
                    case 8:
                        orientation = GradientDrawable.Orientation.TR_BL;
                        break;
                    default:
                        krd.c("Unknown Gradient Orientation");
                        orientation = GradientDrawable.Orientation.TR_BL;
                        break;
                }
                gradientDrawable.setOrientation(orientation);
            } else {
                if ((i3 == 3 ? (wku) wkvVar.c : wku.a).b == 7) {
                    gradientDrawable.setGradientType(2);
                }
            }
        }
        viewP.setBackground(gradientDrawable);
    }
}
