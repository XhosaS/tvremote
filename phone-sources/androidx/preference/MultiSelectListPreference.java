package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gcw;
import defpackage.gdx;
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
        int i = crn.i(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, i);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.f, i, 0);
        this.g = crn.q(typedArrayObtainStyledAttributes, 2, 0);
        this.h = crn.q(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dE() {
        Parcelable parcelableDE = super.dE();
        if (this.x) {
            return parcelableDE;
        }
        gcw gcwVar = new gcw(parcelableDE);
        gcwVar.a = this.i;
        return gcwVar;
    }

    @Override // androidx.preference.Preference
    protected final Object dF(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gcw.class)) {
            super.g(parcelable);
            return;
        }
        gcw gcwVar = (gcw) parcelable;
        super.g(gcwVar.getSuperState());
        k(gcwVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(t((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (M() && !set.equals(t(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.t, set);
            super.H(editorB);
        }
        d();
    }
}
