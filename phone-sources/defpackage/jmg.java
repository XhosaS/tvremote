package defpackage;

import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmg extends sca {
    public ModelAwareRecyclerView a;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.userfeedback.UserFeedbackViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ModelAwareRecyclerView) p(R.id.tvm_entity_user_feedback_component);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_user_feedback_component", "com.google.android.apps.googletv.app.presentation.components.entity.userfeedback.UserFeedbackViewBindable"));
        }
    }
}
