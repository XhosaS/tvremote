package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvp implements View.OnHoverListener {
    final /* synthetic */ PlayHeaderListLayout a;

    public mvp(PlayHeaderListLayout playHeaderListLayout) {
        this.a = playHeaderListLayout;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return this.a.x();
    }
}
