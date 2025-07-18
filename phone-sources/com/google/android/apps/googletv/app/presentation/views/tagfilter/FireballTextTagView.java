package com.google.android.apps.googletv.app.presentation.views.tagfilter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import defpackage.kkr;
import defpackage.klb;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FireballTextTagView extends Chip implements kkr {
    public FireballTextTagView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // defpackage.kkr
    public final void a(klb klbVar) {
        String str = null;
        setText(klbVar != null ? klbVar.b : null);
        if (TextUtils.isEmpty(klbVar != null ? klbVar.c : null)) {
            if (klbVar != null) {
                str = klbVar.b;
            }
        } else if (klbVar != null) {
            str = klbVar.c;
        }
        setContentDescription(str);
        boolean z = false;
        if (klbVar != null && klbVar.e()) {
            z = true;
        }
        setChecked(z);
    }

    @Override // defpackage.kkr
    public final void b() {
        setChecked(false);
        setContentDescription(null);
    }

    public FireballTextTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ FireballTextTagView(Context context, AttributeSet attributeSet, int i, ykn yknVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
