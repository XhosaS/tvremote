package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdq extends sca {
    public LinearLayout a;
    public LinearLayout b;
    public ImageView c;
    public View d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public int h = 2;
    public final kuw i;

    public kdq() {
    }

    public final ImageView a() {
        ImageView imageView = this.g;
        if (imageView != null) {
            return imageView;
        }
        yks.c("chevronRightIcon");
        return null;
    }

    public final ImageView b() {
        ImageView imageView = this.c;
        if (imageView != null) {
            return imageView;
        }
        yks.c("watchNowIcon");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (LinearLayout) p(R.id.provider_item);
            try {
                this.b = (LinearLayout) p(R.id.provider_item_layout);
                try {
                    this.c = (ImageView) p(R.id.watch_now_icon);
                    try {
                        this.d = p(R.id.divider_line);
                        try {
                            this.e = (TextView) p(R.id.provider_title);
                            try {
                                this.f = (TextView) p(R.id.provider_cta);
                                try {
                                    this.g = (ImageView) p(R.id.chevron_right_icon);
                                } catch (scr unused) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "chevron_right_icon", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
                                }
                            } catch (scr unused2) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_cta", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
                            }
                        } catch (scr unused3) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_title", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
                        }
                    } catch (scr unused4) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "divider_line", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
                    }
                } catch (scr unused5) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "watch_now_icon", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
                }
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_item_layout", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
            }
        } catch (scr unused7) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_item", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
        }
    }

    public kdq(kuw kuwVar) {
        this.i = kuwVar;
    }
}
