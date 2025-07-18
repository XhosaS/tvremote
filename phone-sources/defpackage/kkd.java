package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballKnobTagView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkd extends ViewOutlineProvider {
    final /* synthetic */ FireballKnobTagView a;

    public kkd(FireballKnobTagView fireballKnobTagView) {
        this.a = fireballKnobTagView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        int width = view.getWidth();
        int i = this.a.a;
        int i2 = (width - i) / 2;
        int height = (view.getHeight() - i) / 2;
        outline.setOval(i2, height, view.getWidth() - i2, view.getHeight() - height);
    }
}
