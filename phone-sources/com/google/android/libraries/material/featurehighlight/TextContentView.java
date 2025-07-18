package com.google.android.libraries.material.featurehighlight;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextContentView extends ScrollView {
    public TextView a;
    public TextView b;
    public TextView c;
    public ocv d;

    public TextContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScrollBarStyle(33554432);
    }

    public static final void h(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i;
            view.setLayoutParams(layoutParams2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = i;
            view.setLayoutParams(layoutParams3);
        }
    }

    public static final void i(TextView textView, int i) {
        if (i == 0) {
            textView.setTextAlignment(5);
        } else if (i == 1) {
            textView.setTextAlignment(4);
        } else {
            if (i != 2) {
                return;
            }
            textView.setTextAlignment(6);
        }
    }

    public static final void j(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        if (charSequence instanceof Spanned) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final CharSequence a() {
        CharSequence text = this.b.getText();
        return text == null ? "" : text;
    }

    public final CharSequence b() {
        CharSequence text = this.c.getText();
        return text == null ? "" : text;
    }

    public final CharSequence c() {
        CharSequence text = this.a.getText();
        return text == null ? "" : text;
    }

    public final void d(TextView textView, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        try {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i, new int[]{R.attr.lineSpacingExtra});
        } catch (Throwable th) {
            th = th;
            typedArrayObtainStyledAttributes = null;
        }
        try {
            textView.setLineSpacing(typedArrayObtainStyledAttributes.getDimension(0, textView.getLineSpacingExtra()), textView.getLineSpacingMultiplier());
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            th = th2;
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public final boolean e() {
        return this.b.getVisibility() == 0;
    }

    public final boolean f() {
        return this.c.getVisibility() == 0;
    }

    public final boolean g() {
        return this.a.getVisibility() == 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(com.google.android.videos.R.id.featurehighlight_help_text_header_view);
        textView.getClass();
        this.a = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.videos.R.id.featurehighlight_help_text_body_view);
        textView2.getClass();
        this.b = textView2;
        TextView textView3 = (TextView) findViewById(com.google.android.videos.R.id.featurehighlight_dismiss_action_text_view);
        textView3.getClass();
        this.c = textView3;
    }
}
