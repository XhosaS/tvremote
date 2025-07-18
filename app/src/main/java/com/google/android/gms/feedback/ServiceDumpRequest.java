package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.kkx;
import defpackage.knd;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ServiceDumpRequest extends AbstractSafeParcelable {
    public static final knd CREATOR = new knd();
    final String a;
    final String b;
    final String[] c;
    final int d;
    final boolean e;

    public ServiceDumpRequest(String str, String str2, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.b(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDumpRequest serviceDumpRequest = (ServiceDumpRequest) obj;
            if (this.e == serviceDumpRequest.e && this.d == serviceDumpRequest.d && this.a.equals(serviceDumpRequest.a) && this.b.equals(serviceDumpRequest.b) && Arrays.equals(this.c, serviceDumpRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.s(parcel, 3, this.c);
        kkx.f(parcel, 4, this.d);
        kkx.c(parcel, 5, this.e);
        kkx.r(parcel, 6, this.b);
        kkx.b(parcel, iA);
    }
}
