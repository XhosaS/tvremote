package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kal;
import defpackage.kkx;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BatchedLogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kal();
    public final List a;

    public BatchedLogErrorParcelable(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchedLogErrorParcelable) {
            return this.a.equals(((BatchedLogErrorParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.v(parcel, 1, list);
        kkx.b(parcel, iA);
    }
}
