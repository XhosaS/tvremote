package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyj extends sca {
    public View a;

    public final View a() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("containerView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.framework.stream.StreamViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.recycler_view);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.framework.stream.StreamViewBindable"));
        }
    }
}
