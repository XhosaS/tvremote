package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bht;
import defpackage.bhu;
import defpackage.bji;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = acp.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.d, iB, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (bhu.a == null) {
                bhu.a = new bhu();
            }
            this.D = bhu.a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable cu() {
        Parcelable parcelableCu = super.cu();
        if (this.w) {
            return parcelableCu;
        }
        SavedState savedState = new SavedState(parcelableCu);
        savedState.a = this.g;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final Object cv(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        i(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(r((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        T(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            w(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bht();
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
}
