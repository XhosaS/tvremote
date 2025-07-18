package com.google.android.libraries.social.peoplekit.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.ras;
import defpackage.shm;
import defpackage.shn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InfoIconButton extends RelativeLayout {
    private TextView a;
    private AppCompatImageView b;
    private shm c;

    public InfoIconButton(Context context) {
        super(context);
        a(null);
    }

    private final void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int resourceId;
        shm shmVar = shm.GM3;
        this.c = shmVar;
        int i = shmVar.d;
        if (attributeSet != null) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, shn.a);
            if (typedArrayObtainStyledAttributes.getInt(3, shmVar.c) == 0) {
                shmVar = shm.GM2;
            }
            this.c = shmVar;
            i = shmVar.d;
        } else {
            typedArrayObtainStyledAttributes = null;
        }
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.peoplekit_info_icon_title);
        if (typedArrayObtainStyledAttributes != null) {
            int[] iArr = shn.a;
            if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0 && resourceId != 0) {
                this.a.setTextAppearance(resourceId);
            }
            if (typedArrayObtainStyledAttributes.hasValue(1) && (colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(1)) != null) {
                this.a.setTextColor(colorStateList2);
            }
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.peoplekit_info_icon_view);
        this.b = appCompatImageView;
        appCompatImageView.setOnClickListener(new ras(4));
        if (typedArrayObtainStyledAttributes != null) {
            int[] iArr2 = shn.a;
            if (typedArrayObtainStyledAttributes.hasValue(2) && (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2)) != null) {
                this.b.setImageTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void setLabelFor(int i) {
        this.a.setLabelFor(i);
    }

    public InfoIconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public InfoIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    public InfoIconButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet);
    }
}
