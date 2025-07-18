package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.play.widget.fireball.FireballTextTagView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdz extends ViewOutlineProvider {
    final /* synthetic */ FireballTextTagView a;

    public sdz(FireballTextTagView fireballTextTagView) {
        this.a = fireballTextTagView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a.b;
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i < 0 ? view.getHeight() * 0.5f : i);
    }
}
