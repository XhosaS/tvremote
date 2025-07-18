package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.play.search.PlaySearchSuggestionsList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thd extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ PlaySearchSuggestionsList c;

    public thd(PlaySearchSuggestionsList playSearchSuggestionsList, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = playSearchSuggestionsList;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        PlaySearchSuggestionsList playSearchSuggestionsList = this.c;
        playSearchSuggestionsList.a.getLayoutParams().height = this.a + ((int) (this.b * f));
        playSearchSuggestionsList.a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
