package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import defpackage.cww;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final CompoundButton mView;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    public void applyButtonTint() {
        Drawable buttonDrawable = this.mView.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.mHasButtonTint) {
                    drawableMutate.setTintList(this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    drawableMutate.setTintMode(this.mButtonTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, R.styleable.CompoundButton, i, 0);
        CompoundButton compoundButton = this.mView;
        cww.o(compoundButton, compoundButton.getContext(), R.styleable.CompoundButton, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (tintTypedArrayObtainStyledAttributes.hasValue(1) && (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.mView;
                    compoundButton2.setButtonDrawable(AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.CompoundButton_android_button) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton3 = this.mView;
                compoundButton3.setButtonDrawable(AppCompatResources.getDrawable(compoundButton3.getContext(), resourceId));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(2)) {
                this.mView.setButtonTintList(tintTypedArrayObtainStyledAttributes.getColorStateList(2));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(3)) {
                this.mView.setButtonTintMode(DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(3, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
