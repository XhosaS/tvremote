package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class num extends ocg {
    public static final Parcelable.Creator<num> CREATOR = new nub(5);
    public final Intent a;

    public num(Intent intent) {
        this.a = intent;
    }

    public final Integer a() {
        Intent intent = this.a;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final String b() {
        Intent intent = this.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, this.a, i);
        ocv.x(parcel, iV);
    }
}
