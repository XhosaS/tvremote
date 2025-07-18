package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bhy;
import defpackage.bhz;
import defpackage.bil;
import defpackage.bji;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String E;
    private boolean F;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, acp.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable cu() {
        Parcelable parcelableCu = super.cu();
        if (this.w) {
            return parcelableCu;
        }
        SavedState savedState = new SavedState(parcelableCu);
        savedState.a = this.i;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final Object cv(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void e(CharSequence[] charSequenceArr) {
        this.g = charSequenceArr;
    }

    public void f(int i) {
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            n(charSequenceArr[i].toString());
        }
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        n(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        n(r((String) obj));
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
        bil bilVar = this.D;
        if (bilVar != null) {
            return bilVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.E;
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

    public final void n(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.F) {
            return;
        }
        this.i = str;
        this.F = true;
        T(str);
        if (zEquals) {
            return;
        }
        d();
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bhy();
        String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.e, i, 0);
        this.g = acp.h(typedArrayObtainStyledAttributes, 2, 0);
        this.h = acp.h(typedArrayObtainStyledAttributes, 3, 1);
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (bhz.a == null) {
                bhz.a = new bhz();
            }
            this.D = bhz.a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bji.g, i, 0);
        this.E = acp.f(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
