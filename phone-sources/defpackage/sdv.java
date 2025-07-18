package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.play.widget.fireball.FireballKnobTagView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdv extends ViewOutlineProvider {
    final /* synthetic */ FireballKnobTagView a;

    public sdv(FireballKnobTagView fireballKnobTagView) {
        this.a = fireballKnobTagView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i = this.a.a;
        int i2 = (width - i) / 2;
        int height = (view.getHeight() - i) / 2;
        outline.setOval(i2, height, view.getWidth() - i2, view.getHeight() - height);
    }
}
