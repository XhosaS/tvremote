package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kld extends sca {
    public View a;
    public View b;

    public final View a() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("displayTextView");
        return null;
    }

    public final View b() {
        View view = this.b;
        if (view != null) {
            return view;
        }
        yks.c("iconButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.display_text);
            try {
                this.b = p(R.id.user_feedback_item);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "user_feedback_item", "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "display_text", "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable"));
        }
    }
}
