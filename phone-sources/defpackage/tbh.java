package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbh extends szg {
    private static float b(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float t(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.szg
    public final void i(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fT;
        float fB;
        RectF rectFH = h(tabLayout, view);
        RectF rectFH2 = h(tabLayout, view2);
        if (rectFH.left < rectFH2.left) {
            fT = b(f);
            fB = t(f);
        } else {
            fT = t(f);
            fB = b(f);
        }
        drawable.setBounds(sns.b((int) rectFH.left, (int) rectFH2.left, fT), drawable.getBounds().top, sns.b((int) rectFH.right, (int) rectFH2.right, fB), drawable.getBounds().bottom);
    }
}
