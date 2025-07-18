package defpackage;

import android.support.v7.widget.AppCompatButton;
import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgo extends sca {
    public AppCompatButton a;
    public ImageView b;

    public final ImageView a() {
        ImageView imageView = this.b;
        if (imageView != null) {
            return imageView;
        }
        yks.c("iconImage");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (AppCompatButton) p(R.id.action_button);
            try {
                this.b = (ImageView) p(R.id.icon_image);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon_image", "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "action_button", "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable"));
        }
    }
}
