package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class va extends qm {
    @Override // defpackage.qm
    public final float s(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int width = iArr[0] + (view.getWidth() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = fadeAndShortSlide.getEpicenter();
        return width < (epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX()) ? view.getTranslationX() - fadeAndShortSlide.a(viewGroup) : view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
    }
}
