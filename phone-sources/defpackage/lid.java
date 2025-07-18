package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lid implements Parcelable {
    public final long b;
    public static final lid a = new lid(-1);
    private static final AtomicLong c = new AtomicLong(Math.abs(new SecureRandom().nextLong() / 1000) * 1000);
    public static final Parcelable.Creator<lid> CREATOR = new jbu(13);

    private lid(long j) {
        this.b = j;
    }

    public static lid a() {
        while (true) {
            long andIncrement = c.getAndIncrement();
            if (andIncrement != 0 && andIncrement != -1) {
                return new lid(andIncrement);
            }
        }
    }

    public static lid b(Intent intent) {
        lid lidVar = (lid) intent.getParcelableExtra("parent_event_id");
        return lidVar != null ? lidVar : a;
    }

    public static lid c(lid lidVar) {
        return lidVar != null ? lidVar : a;
    }

    public final String d() {
        return Long.toString(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return super.toString() + " " + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }

    public lid(Parcel parcel) {
        this.b = parcel.readLong();
    }
}
