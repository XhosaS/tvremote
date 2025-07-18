package com.google.android.libraries.play.widget.clusterheader;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.sdk;
import defpackage.sdn;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class ClusterHeaderView extends LinearLayout {
    private final TextView a;
    public final ImageView b;
    public final ImageView c;
    public boolean d;
    private final TextView e;
    private final int f;
    private final Rect g;

    public ClusterHeaderView(Context context) {
        this(context, null);
    }

    public final void a(sdk sdkVar) {
        int i = sdk.c;
        ImageView imageView = this.b;
        if (((sdk) imageView.getTag(R.id.play__image_binder)) != sdkVar) {
            if (sdkVar != null && sdkVar.a > 0) {
                throw new IllegalStateException("Trying to bind an already bound ImageBinder");
            }
            sdk sdkVar2 = (sdk) imageView.getTag(R.id.play__image_binder);
            if (sdkVar2 != null) {
                sdkVar2.a(null);
            }
            if (sdkVar != null) {
                sdkVar.a(imageView);
                int[] iArr = cww.a;
                if (imageView.isAttachedToWindow()) {
                    sdkVar.b(2);
                    if (imageView.isLaidOut() || (imageView.getMeasuredHeight() > 0 && imageView.getMeasuredWidth() > 0)) {
                        sdkVar.b(3);
                    }
                }
            }
        }
        imageView.setVisibility(sdkVar == null ? 8 : 0);
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.e.setVisibility(8);
            return;
        }
        TextView textView = this.e;
        textView.setVisibility(0);
        textView.setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            setClickable(false);
            setBackgroundResource(0);
            this.c.setVisibility(8);
        } else {
            Rect rect = this.g;
            rect.set(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            setBackgroundResource(this.f);
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
            this.c.setVisibility(true != this.d ? 0 : 8);
        }
    }

    public ClusterHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClusterHeaderView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Resources resources = getResources();
        setOrientation(0);
        setGravity(16);
        setFocusable(true);
        setMinimumHeight(resources.getDimensionPixelSize(R.dimen.abc_action_button_min_height_material));
        this.d = false;
        LayoutInflater.from(context).inflate(R.layout.cluster_header, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.replay__clusterheader__icon);
        this.a = (TextView) findViewById(R.id.replay__clusterheader__title);
        this.e = (TextView) findViewById(R.id.replay__clusterheader__subtitle);
        this.c = (ImageView) findViewById(R.id.replay__clusterheader__more);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        this.f = typedValue.resourceId;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.replay__clusterheader__horizontal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.replay__clusterheader__vertical_padding);
        setPadding(getPaddingLeft() + dimensionPixelSize, getPaddingTop() + dimensionPixelSize2, dimensionPixelSize + getPaddingRight(), dimensionPixelSize2 + getPaddingBottom());
        this.g = new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        cww.q(this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sdn.a, i, 0);
        c(typedArrayObtainStyledAttributes.getString(1));
        b(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
