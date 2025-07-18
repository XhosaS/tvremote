package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vd extends qm {
    final /* synthetic */ FadeAndShortSlide a;

    public vd(FadeAndShortSlide fadeAndShortSlide) {
        this.a = fadeAndShortSlide;
    }

    @Override // defpackage.qm
    public final float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int height = iArr[1] + (view.getHeight() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.a.getEpicenter();
        return height < (epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY()) ? view.getTranslationY() - fadeAndShortSlide.b(viewGroup) : view.getTranslationY() + fadeAndShortSlide.b(viewGroup);
    }
}
