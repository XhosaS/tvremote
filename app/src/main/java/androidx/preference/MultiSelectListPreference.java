package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bic;
import defpackage.bji;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = acp.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.f, iB, 0);
        this.g = acp.h(typedArrayObtainStyledAttributes, 2, 0);
        this.h = acp.h(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
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
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        k(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(s((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (Q() && !set.equals(s(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.s, set);
            super.K(editorB);
        }
        d();
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bic();
        Set a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            Set set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
