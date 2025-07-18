package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsk implements Parcelable {
    public static final Parcelable.Creator<fsk> CREATOR = new dyy(14);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public PlaybackState.CustomAction e;

    public fsk(String str, CharSequence charSequence, int i, Bundle bundle) {
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
        Bundle bundle = this.d;
        return "Action:mName='" + String.valueOf(this.b) + ", mIcon=" + this.c + ", mExtras=" + String.valueOf(bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }

    public fsk(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(fse.class.getClassLoader());
    }
}
