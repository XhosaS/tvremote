package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ko extends View {
    public ko(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
