package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srd extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public srd(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        srg srgVar = this.a.e;
        if (srgVar != null) {
            srgVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
