package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vc extends qm {
    @Override // defpackage.qm
    public final float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
    }
}
