package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class er implements Parcelable {
    public static final Parcelable.Creator<er> CREATOR = new av(8);
    private final dt a;
    private final long b;

    public er(dt dtVar, long j) {
        if (dtVar == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = dtVar;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public er(Parcel parcel) {
        this.a = dt.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
