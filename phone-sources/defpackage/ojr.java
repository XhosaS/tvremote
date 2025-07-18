package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojr extends ocg {
    public static final Parcelable.Creator<ojr> CREATOR = new oee(4);
    public final int a;
    public final Bundle b;

    public ojr(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final ImmutableMap a() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            builder.put(new Account(str, "com.google"), Integer.valueOf(bundle.getInt(str)));
        }
        return builder.buildOrThrow();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojr)) {
            return false;
        }
        ojr ojrVar = (ojr) obj;
        return this.a == ojrVar.a && a.Q(a(), ojrVar.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.E(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
