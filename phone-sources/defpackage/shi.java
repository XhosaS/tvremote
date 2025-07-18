package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shi implements Parcelable {
    public static final Parcelable.Creator<shi> CREATOR = new sct(1);
    public boolean a;
    private long b;
    private long c;

    public shi() {
        this.a = false;
        this.b = 0L;
        this.c = 0L;
    }

    private static final long e() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public final long a() {
        long j = this.c;
        return this.a ? j + (e() - this.b) : j;
    }

    public final void b() {
        if (this.a) {
            this.c += e() - this.b;
            this.a = false;
        }
    }

    public final void c() {
        this.a = false;
        this.b = 0L;
        this.c = 0L;
    }

    public final void d() {
        if (this.a) {
            return;
        }
        this.b = e();
        this.a = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public shi(Parcel parcel) {
        this.a = parcel.readInt() == 1;
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
