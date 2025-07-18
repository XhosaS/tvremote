package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class src extends syi {
    final /* synthetic */ Chip a;

    public src(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.syi
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        srg srgVar = chip.e;
        chip.setText(srgVar.q ? srgVar.d : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // defpackage.syi
    public final void a(int i) {
    }
}
