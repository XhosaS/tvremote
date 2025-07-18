package defpackage;

import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjx extends sca {
    public TextView a;

    public final TextView a() {
        TextView textView = this.a;
        if (textView != null) {
            return textView;
        }
        yks.c("textView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.menuitem.MenuItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (TextView) p(R.id.display_text);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "display_text", "com.google.android.apps.googletv.app.presentation.views.menuitem.MenuItemViewBindable"));
        }
    }
}
