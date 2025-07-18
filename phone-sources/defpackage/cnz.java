package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnz extends cqv {
    public cnz() {
        super(null);
    }

    @Override // defpackage.cqv
    public final void a(View view, int i, int i2) {
        view.setSystemGestureExclusionRects(yfm.t(new Rect(0, 0, i, i2)));
    }
}
