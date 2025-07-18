package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsd implements Parcelable {
    public static final Parcelable.Creator<fsd> CREATOR = new dyy(11);
    public final MediaSession.Token b;
    public frn c;
    public final Object a = new Object();
    public glk d = null;

    public fsd(MediaSession.Token token, frn frnVar) {
        this.b = token;
        this.c = frnVar;
    }

    public final frn a() {
        frn frnVar;
        synchronized (this.a) {
            frnVar = this.c;
        }
        return frnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fsd) {
            return this.b.equals(((fsd) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
