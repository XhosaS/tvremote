package com.google.android.libraries.play.widget.fireball;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.cyq;
import defpackage.sdv;
import defpackage.seb;
import defpackage.seo;
import defpackage.sfa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FireballKnobTagView extends FrameLayout implements seo {
    public final int a;
    private final int b;
    private final int c;
    private ImageView d;

    public FireballKnobTagView(Context context) {
        this(context, null);
    }

    @Override // defpackage.seo
    public final void a(sfa sfaVar) {
        if (!sfaVar.d()) {
            throw new UnsupportedOperationException();
        }
        setContentDescription(sfaVar.c);
        setSelected(sfaVar.f());
    }

    @Override // defpackage.seo
    public final void b() {
        setContentDescription(null);
        setSelected(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.button);
        this.d = imageView;
        imageView.setImageResource(R.drawable.play__fireball__knob);
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        int i = this.c;
        layoutParams.width = i;
        layoutParams.height = i;
        this.d.setLayoutParams(layoutParams);
        setOutlineProvider(new sdv(this));
        setClipToOutline(true);
        this.d.setImageTintList(ColorStateList.valueOf(this.b));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        cyqVar.i(true != isSelected() ? 262144 : 524288);
        cyqVar.Q(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAccessibilityAction(int r2, android.os.Bundle r3) {
        /*
            r1 = this;
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r2 != r0) goto Lb
            boolean r2 = r1.isSelected()
            if (r2 != 0) goto L17
            r2 = r0
        Lb:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r2 != r0) goto L1c
            boolean r2 = r1.isSelected()
            if (r2 == 0) goto L17
            r2 = r0
            goto L1c
        L17:
            boolean r2 = r1.callOnClick()
            return r2
        L1c:
            boolean r2 = super.performAccessibilityAction(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.play.widget.fireball.FireballKnobTagView.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        this.d.setScaleX(true != z ? 1.0f : -1.0f);
    }

    public FireballKnobTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, seb.a, R.attr.fireballViewStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getColor(3, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.play__fireball__tag_drawable_height));
        this.c = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.play__fireball__outline_height));
        this.a = dimensionPixelSize2;
        typedArrayObtainStyledAttributes.recycle();
        if (dimensionPixelSize > dimensionPixelSize2) {
            throw new IllegalStateException("tagDrawableHeight must be smaller than tagOutlineHeight");
        }
    }
}
