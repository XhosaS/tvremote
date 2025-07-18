package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kbd;
import defpackage.kkx;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kbd();
    public final String a;
    public final int b;
    public int c;

    public LogErrorParcelable(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogErrorParcelable)) {
            return false;
        }
        LogErrorParcelable logErrorParcelable = (LogErrorParcelable) obj;
        return Objects.equals(this.a, logErrorParcelable.a) && this.b == logErrorParcelable.b && this.c == logErrorParcelable.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, this.a);
        kkx.f(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.b(parcel, iA);
    }
}
