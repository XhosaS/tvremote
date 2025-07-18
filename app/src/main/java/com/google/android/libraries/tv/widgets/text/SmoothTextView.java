package com.google.android.libraries.tv.widgets.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.color.ViewTinter;
import defpackage.ajr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SmoothTextView extends AppCompatTextView implements ViewTinter.TextTinter {
    public SmoothTextView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ int getBackgroundAlpha() {
        return ViewTinter.CC.$default$getBackgroundAlpha(this);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ int getBackgroundTint() {
        return ViewTinter.CC.$default$getBackgroundTint(this);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter.TextTinter
    public /* synthetic */ int getDrawableTint() {
        return ViewTinter.CC.a(getCompoundDrawableTintList());
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ int getForegroundColor() {
        return ViewTinter.CC.$default$getForegroundColor(this);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ int getForegroundTint() {
        return ViewTinter.CC.$default$getForegroundTint(this);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ float getScale() {
        return ViewTinter.CC.$default$getScale(this);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter.TextTinter
    public /* synthetic */ int getTextColor() {
        return ViewTinter.CC.a(getTextColors());
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ float getTranslationStart() {
        return ViewTinter.CC.$default$getTranslationStart(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ajr ajrVar = new ajr(accessibilityNodeInfo);
        if (hasOnClickListeners()) {
            String string = getContext().getString(R.string.role_description_button);
            AccessibilityNodeInfo accessibilityNodeInfo2 = ajrVar.a;
            accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
            accessibilityNodeInfo2.setSelected(false);
        }
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setBackgroundAlpha(int i) {
        ViewTinter.CC.$default$setBackgroundAlpha(this, i);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setBackgroundTint(int i) {
        ViewTinter.CC.$default$setBackgroundTint(this, i);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter.TextTinter
    public /* synthetic */ void setDrawableTint(int i) {
        setCompoundDrawableTintList(ColorStateList.valueOf(i));
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setForegroundAlpha(int i) {
        ViewTinter.CC.$default$setForegroundAlpha(this, i);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setForegroundTint(int i) {
        ViewTinter.CC.$default$setForegroundTint(this, i);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setScale(float f) {
        ViewTinter.CC.$default$setScale(this, f);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setShadowColor(int i) {
        ViewTinter.CC.$default$setShadowColor(this, i);
    }

    @Override // com.google.android.libraries.tv.widgets.color.ViewTinter
    public /* synthetic */ void setTranslationStart(float f) {
        ViewTinter.CC.$default$setTranslationStart(this, f);
    }

    public SmoothTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public SmoothTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPaintFlags(getPaintFlags() | 192);
    }
}
