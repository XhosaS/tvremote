package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekw extends EditText {
    public ekw(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void invalidate() {
    }
}
