package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ex implements Parcelable {
    public static final Parcelable.Creator<ex> CREATOR = new av(13);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public PlaybackState.CustomAction e;

    public ex(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }

    public ex(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt();
        this.d = parcel.readBundle(eu.class.getClassLoader());
    }
}
