package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwt implements Parcelable {
    public final int a;
    public final int b;

    public kwt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwt) {
            kwt kwtVar = (kwt) obj;
            if (this.b == kwtVar.b && this.a == kwtVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bw(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "SubscriptionDetails{recurringPeriodUnit=" + Integer.toString(this.b - 2) + ", recurringPeriodCount=" + this.a + "}";
    }

    public kwt(int i, int i2) {
        this.b = i;
        this.a = i2;
    }
}
