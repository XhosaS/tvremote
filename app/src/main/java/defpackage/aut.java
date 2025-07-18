package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aut extends auw {
    @Override // defpackage.auw
    public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY() + fadeAndShortSlide.b(viewGroup);
    }
}
