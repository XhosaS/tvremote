package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhu extends sca {
    public View a;
    public ImageView b;
    public View c;
    public ImageView d;
    public TextView e;
    public final kuw f;

    public jhu() {
        throw null;
    }

    public final View a() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        yks.c("iconShopContainer");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.button);
            try {
                this.b = (ImageView) p(R.id.icon);
                try {
                    this.c = p(R.id.icon_shop_container);
                    try {
                        this.d = (ImageView) p(R.id.icon_shop);
                        try {
                            this.e = (TextView) p(R.id.button_title);
                            try {
                            } catch (scr unused) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button_subtitle", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
                            }
                        } catch (scr unused2) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button_title", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
                        }
                    } catch (scr unused3) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon_shop", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
                    }
                } catch (scr unused4) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon_shop_container", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
                }
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
            }
        } catch (scr unused6) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ProviderIconFilledButtonViewBindable"));
        }
    }

    public jhu(kuw kuwVar) {
        this.f = kuwVar;
    }
}
