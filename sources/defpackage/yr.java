package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yr implements View.OnClickListener {
    final /* synthetic */ MediaRouteExpandCollapseButton a;

    public yr(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = mediaRouteExpandCollapseButton.e;
        mediaRouteExpandCollapseButton.e = !z;
        if (z) {
            AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.b;
            mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
            animationDrawable.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.c);
        } else {
            AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.a;
            mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
            animationDrawable2.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
