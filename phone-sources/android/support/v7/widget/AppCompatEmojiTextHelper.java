package android.support.v7.widget;

import android.content.res.TypedArray;
import android.support.v7.appcompat.R;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.dhp;
import defpackage.dhq;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final dhq mEmojiTextViewHelper;
    private final TextView mView;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new dhq(textView);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        dhp.i();
        return inputFilterArr;
    }

    public boolean isEnabled() {
        return ((dhp) this.mEmojiTextViewHelper.a).a.a;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setAllCaps(boolean z) {
        dhp.i();
    }

    public void setEnabled(boolean z) {
        dhp.i();
        ((dhp) this.mEmojiTextViewHelper.a).a.a = z;
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        dhp.i();
        return transformationMethod;
    }
}
