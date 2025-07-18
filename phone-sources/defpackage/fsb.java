package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsb implements Parcelable {
    public static final Parcelable.Creator<fsb> CREATOR = new dyy(9);
    public final frs a;
    public final long b;
    public MediaSession.QueueItem c;

    public fsb(MediaSession.QueueItem queueItem, frs frsVar, long j) {
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = frsVar;
        this.b = j;
        this.c = queueItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem { Description=" + String.valueOf(this.a) + ", Id=" + this.b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public fsb(Parcel parcel) {
        this.a = frs.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
