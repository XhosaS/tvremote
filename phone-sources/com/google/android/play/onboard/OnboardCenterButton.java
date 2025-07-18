package com.google.android.play.onboard;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.thp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OnboardCenterButton extends FrameLayout {
    private final int a;
    private Button b;
    private final Rect c;
    private final Rect d;

    public OnboardCenterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelSize(R.dimen.play_onboard__onboard_v2_touch_extension);
        this.c = new Rect();
        this.d = new Rect();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (Button) findViewById(R.id.play_onboard_center_button);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b.getVisibility() == 8) {
            return;
        }
        Button button = this.b;
        Rect rect = this.c;
        button.getHitRect(rect);
        int i5 = this.a;
        rect.left -= i5;
        rect.top -= i5;
        rect.right += i5;
        rect.bottom += i5;
        Rect rect2 = this.d;
        if (rect2.equals(rect)) {
            return;
        }
        setTouchDelegate(new thp(rect, this.b));
        rect2.set(rect);
    }
}
