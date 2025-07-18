package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdq;
import defpackage.gdx;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, crn.i(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        gdq gdqVar = this.k.d;
        if (gdqVar != null) {
            gdqVar.e(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.c, i, 0);
        String strN = crn.n(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strN;
        if (strN == null) {
            this.a = this.q;
        }
        this.b = crn.n(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = crn.n(typedArrayObtainStyledAttributes, 11, 3);
        this.e = crn.n(typedArrayObtainStyledAttributes, 10, 4);
        this.f = crn.k(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
