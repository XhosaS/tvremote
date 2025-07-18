package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxu implements Parcelable {
    public static final Parcelable.Creator<jxu> CREATOR = new geb(6);
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public jxu(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxu)) {
            return false;
        }
        jxu jxuVar = (jxu) obj;
        return yks.e(this.a, jxuVar.a) && yks.e(this.b, jxuVar.b) && yks.e(this.c, jxuVar.c) && yks.e(this.d, jxuVar.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        CharSequence charSequence2 = this.b;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        int i = iHashCode * 31;
        CharSequence charSequence3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.d;
        return iHashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmationDialogFragmentModel(titleText=" + ((Object) this.a) + ", descriptionText=" + ((Object) this.b) + ", positiveButtonText=" + ((Object) this.c) + ", negativeButtonText=" + ((Object) this.d) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        TextUtils.writeToParcel(this.a, parcel, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        TextUtils.writeToParcel(this.d, parcel, i);
    }

    public jxu() {
        this(null, null, null, null);
    }
}
