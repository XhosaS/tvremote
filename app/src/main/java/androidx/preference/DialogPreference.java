package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bjb;
import defpackage.bji;

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
        this(context, attributeSet, acp.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        bjb bjbVar = this.k.e;
        if (bjbVar != null) {
            bjbVar.aD(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.c, i, 0);
        String strF = acp.f(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strF;
        if (strF == null) {
            this.a = this.q;
        }
        this.b = acp.f(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = acp.f(typedArrayObtainStyledAttributes, 11, 3);
        this.e = acp.f(typedArrayObtainStyledAttributes, 10, 4);
        this.f = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
