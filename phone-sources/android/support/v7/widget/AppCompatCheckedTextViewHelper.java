package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import defpackage.cww;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        Drawable checkMarkDrawable = this.mView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.mHasCheckMarkTint) {
                    drawableMutate.setTintList(this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    drawableMutate.setTintMode(this.mCheckMarkTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, R.styleable.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.mView;
        cww.o(checkedTextView, checkedTextView.getContext(), R.styleable.CheckedTextView, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (tintTypedArrayObtainStyledAttributes.hasValue(1) && (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(1, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(AppCompatResources.getDrawable(checkedTextView2.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.CheckedTextView_android_checkMark) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.mView;
                checkedTextView3.setCheckMarkDrawable(AppCompatResources.getDrawable(checkedTextView3.getContext(), resourceId));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(2)) {
                this.mView.setCheckMarkTintList(tintTypedArrayObtainStyledAttributes.getColorStateList(2));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(3)) {
                this.mView.setCheckMarkTintMode(DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(3, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
