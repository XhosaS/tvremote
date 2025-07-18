package com.android.tv.twopanelsettings.slices;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceCategory;
import defpackage.bjh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CustomContentDescriptionPreferenceCategory extends PreferenceCategory {
    public CustomContentDescriptionPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(bjh bjhVar) {
        super.a(bjhVar);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        View view = bjhVar.a;
        view.setAccessibilityLiveRegion(1);
        view.setContentDescription(null);
    }
}
