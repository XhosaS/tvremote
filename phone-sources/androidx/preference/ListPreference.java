package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gcs;
import defpackage.gct;
import defpackage.gdd;
import defpackage.gdx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String G;
    private boolean H;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, crn.i(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dE() {
        Parcelable parcelableDE = super.dE();
        if (this.x) {
            return parcelableDE;
        }
        gcs gcsVar = new gcs(parcelableDE);
        gcsVar.a = this.i;
        return gcsVar;
    }

    @Override // androidx.preference.Preference
    protected final Object dF(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void e(CharSequence[] charSequenceArr) {
        this.g = charSequenceArr;
    }

    public void f(int i) {
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            o(charSequenceArr[i].toString());
        }
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gcs.class)) {
            super.g(parcelable);
            return;
        }
        gcs gcsVar = (gcs) parcelable;
        super.g(gcsVar.getSuperState());
        o(gcsVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(s((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        gdd gddVar = this.E;
        if (gddVar != null) {
            return gddVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.G;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceM)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.G = null;
        } else {
            this.G = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.H) {
            return;
        }
        this.i = str;
        this.H = true;
        P(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.e, i, 0);
        this.g = crn.q(typedArrayObtainStyledAttributes, 2, 0);
        this.h = crn.q(typedArrayObtainStyledAttributes, 3, 1);
        if (crn.o(typedArrayObtainStyledAttributes, 4, 4, false)) {
            if (gct.a == null) {
                gct.a = new gct(0);
            }
            F(gct.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, gdx.g, i, 0);
        this.G = crn.n(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
