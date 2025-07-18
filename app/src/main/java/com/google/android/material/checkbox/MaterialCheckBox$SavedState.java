package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.a;
import defpackage.uzq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialCheckBox$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new uzq();
    public int a;

    public MaterialCheckBox$SavedState(Parcel parcel) {
        super(parcel);
        this.a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = this.a;
        return a.n(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", hexString, "MaterialCheckBox.SavedState{", " CheckedState=", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.a));
    }

    public MaterialCheckBox$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
