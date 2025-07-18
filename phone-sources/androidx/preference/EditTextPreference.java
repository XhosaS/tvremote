package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gcp;
import defpackage.gct;
import defpackage.gdx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int i = crn.i(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.d, i, 0);
        if (crn.o(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (gct.b == null) {
                gct.b = new gct(1);
            }
            F(gct.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dE() {
        Parcelable parcelableDE = super.dE();
        if (this.x) {
            return parcelableDE;
        }
        gcp gcpVar = new gcp(parcelableDE);
        gcpVar.a = this.g;
        return gcpVar;
    }

    @Override // androidx.preference.Preference
    protected final Object dF(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gcp.class)) {
            super.g(parcelable);
            return;
        }
        gcp gcpVar = (gcp) parcelable;
        super.g(gcpVar.getSuperState());
        i(gcpVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(s((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        P(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            x(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
