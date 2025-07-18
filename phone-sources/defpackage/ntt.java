package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntt extends ocg {
    public static final Parcelable.Creator<ntt> CREATOR = new nub(1);
    public final List a;

    public ntt(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ntt) {
            return this.a.equals(((ntt) obj).a);
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
        int iV = ocv.v(parcel);
        ocv.S(parcel, 1, list);
        ocv.x(parcel, iV);
    }
}
