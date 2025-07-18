package com.google.android.apps.tvsearch.searchbar.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.katniss.R;
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StreamingTextView extends AppCompatTextView {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/searchbar/widget/StreamingTextView");
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = context.getColor(R.color.search_text_pending_color);
    }

    private final void c(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public final void a(CharSequence charSequence) {
        charSequence.getClass();
        ((zdv) a.b().q("com/google/android/apps/tvsearch/searchbar/widget/StreamingTextView", "setFinalRecognizedText", 30, "StreamingTextView.kt")).x("setFinalRecognizedText(%s)", charSequence);
        c(charSequence);
    }

    public final void b(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (str2.length() > 0) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getPendingColor());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        }
        c(new SpannedString(spannableStringBuilder));
    }

    public int getPendingColor() {
        return this.b;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(StreamingTextView.class.getCanonicalName());
    }

    public void setPendingColor(int i) {
        this.b = i;
    }
}
