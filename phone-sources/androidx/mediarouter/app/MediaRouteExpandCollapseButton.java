package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    final AnimationDrawable a;
    final AnimationDrawable b;
    final String c;
    final String d;
    boolean e;
    View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.a = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.b = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(MediaRouterThemeHelper.c(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.c = string;
        this.d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteExpandCollapseButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                boolean z = mediaRouteExpandCollapseButton.e;
                mediaRouteExpandCollapseButton.e = !z;
                if (z) {
                    AnimationDrawable animationDrawable3 = mediaRouteExpandCollapseButton.b;
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable3);
                    animationDrawable3.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.c);
                } else {
                    AnimationDrawable animationDrawable4 = mediaRouteExpandCollapseButton.a;
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable4);
                    animationDrawable4.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }
}
