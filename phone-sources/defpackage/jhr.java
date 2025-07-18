package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhr extends sca {
    public MaterialButton a;
    public View b;
    public ImageView c;
    public MaterialButton d;
    public View e;
    public TextView f;
    public ConstraintLayout g;

    public final View a() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        yks.c("filledBc25ButtonContainer");
        return null;
    }

    public final MaterialButton b() {
        MaterialButton materialButton = this.a;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("filledButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (MaterialButton) p(R.id.button);
            try {
                this.b = p(R.id.bc25_button_icon_container);
                try {
                    this.c = (ImageView) p(R.id.bc25_button_icon);
                    try {
                        this.d = (MaterialButton) p(R.id.bc25_button);
                        try {
                            this.e = p(R.id.bc25_button_container);
                            try {
                                this.f = (TextView) p(R.id.bc25_button_text);
                                try {
                                    this.g = (ConstraintLayout) p(R.id.button_layout);
                                } catch (scr unused) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
                                }
                            } catch (scr unused2) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button_text", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
                            }
                        } catch (scr unused3) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button_container", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
                        }
                    } catch (scr unused4) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
                    }
                } catch (scr unused5) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button_icon", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
                }
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_button_icon_container", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
            }
        } catch (scr unused7) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.FilledButtonViewBindable"));
        }
    }
}
