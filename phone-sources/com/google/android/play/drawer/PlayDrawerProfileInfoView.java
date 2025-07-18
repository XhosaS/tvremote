package com.google.android.play.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.play.image.FifeImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayDrawerProfileInfoView extends FrameLayout implements View.OnClickListener {
    private FifeImageView a;
    private View b;
    private FifeImageView c;
    private View d;
    private FifeImageView e;

    public PlayDrawerProfileInfoView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        Resources resources = getResources();
        getLayoutParams().height = resources.getDimensionPixelSize(R.dimen.play_drawer_profile_info_base_height) + rootWindowInsets.getStableInsetTop();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FifeImageView) findViewById(R.id.avatar);
        this.b = findViewById(R.id.secondary_avatar_frame_left);
        this.c = (FifeImageView) findViewById(R.id.secondary_avatar_left);
        this.d = findViewById(R.id.secondary_avatar_frame_right);
        this.e = (FifeImageView) findViewById(R.id.secondary_avatar_right);
        findViewById(R.id.account_info_container);
        this.a.setOnClickListener(this);
        this.b.setOnClickListener(this);
        this.c.setDuplicateParentStateEnabled(true);
        this.d.setOnClickListener(this);
        this.e.setDuplicateParentStateEnabled(true);
    }

    public PlayDrawerProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
