package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbi extends szg {
    @Override // defpackage.szg
    public final void i(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFH = h(tabLayout, view);
        float fA = f < 0.5f ? sns.a(1.0f, 0.0f, 0.0f, 0.5f, f) : sns.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFH.left, drawable.getBounds().top, (int) rectFH.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
