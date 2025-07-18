package defpackage;

import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjg extends sca {
    public TextView a;
    public TextView b;
    public View c;
    public AppCompatButton d;
    public AppCompatButton e;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (TextView) p(R.id.error_text);
            try {
                this.b = (TextView) p(R.id.error_detailed_text);
                try {
                    this.c = p(R.id.internal_only_section);
                    try {
                        this.d = (AppCompatButton) p(R.id.error_action_button);
                        try {
                            this.e = (AppCompatButton) p(R.id.send_feedback_button);
                        } catch (scr unused) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "send_feedback_button", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
                        }
                    } catch (scr unused2) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_action_button", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
                    }
                } catch (scr unused3) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "internal_only_section", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
                }
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_detailed_text", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
            }
        } catch (scr unused5) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_text", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
        }
    }
}
