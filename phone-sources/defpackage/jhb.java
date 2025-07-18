package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhb extends sca {
    public ComposeView a;
    public ComposeView b;
    public TextView c;
    public MaterialButton d;
    public ImageView e;

    public final ImageView a() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView;
        }
        yks.c("iconImageView");
        return null;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        yks.c("aiOverviewButtonTitleView");
        return null;
    }

    public final ComposeView d() {
        ComposeView composeView = this.a;
        if (composeView != null) {
            return composeView;
        }
        yks.c("aiBackground");
        return null;
    }

    public final ComposeView e() {
        ComposeView composeView = this.b;
        if (composeView != null) {
            return composeView;
        }
        yks.c("nonAiBackground");
        return null;
    }

    public final MaterialButton f() {
        MaterialButton materialButton = this.d;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("aiOverviewButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ComposeView) p(R.id.ai_background);
            try {
                this.b = (ComposeView) p(R.id.non_ai_background);
                try {
                    this.c = (TextView) p(R.id.button_title);
                    try {
                        this.d = (MaterialButton) p(R.id.button);
                        try {
                            this.e = (ImageView) p(R.id.icon);
                        } catch (scr unused) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
                        }
                    } catch (scr unused2) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
                    }
                } catch (scr unused3) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button_title", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
                }
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "non_ai_background", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
            }
        } catch (scr unused5) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "ai_background", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
        }
    }
}
