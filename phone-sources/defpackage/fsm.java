package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsm implements Parcelable {
    public static final Parcelable.Creator<fsm> CREATOR = new dyy(15);
    public final int a;
    public Object b;
    private final float c;

    public fsm(int i, float f) {
        this.a = i;
        this.c = f;
    }

    public static fsm c(boolean z) {
        return new fsm(1, true != z ? 0.0f : 1.0f);
    }

    public static fsm d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new fsm(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static fsm e(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", a.cd(i, "Invalid rating style (", ") for a star rating"));
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new fsm(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static fsm f(boolean z) {
        return new fsm(2, true != z ? 0.0f : 1.0f);
    }

    public static fsm g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new fsm(i, -1.0f);
            default:
                return null;
        }
    }

    public final float a() {
        if (this.a == 6 && i()) {
            return this.c;
        }
        return -1.0f;
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && i()) {
            return this.c;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final boolean h() {
        return this.a == 1 && this.c == 1.0f;
    }

    public final boolean i() {
        return this.c >= 0.0f;
    }

    public final boolean j() {
        return this.a == 2 && this.c == 1.0f;
    }

    public final String toString() {
        float f = this.c;
        String strValueOf = f < 0.0f ? "unrated" : String.valueOf(f);
        return "Rating:style=" + this.a + " rating=" + strValueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.c);
    }
}
