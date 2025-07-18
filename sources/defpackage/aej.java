package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aej extends ajh {
    public static final Parcelable.Creator CREATOR = new e(17);
    public final String a;
    public final int b;
    public int c;

    public aej(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aej)) {
            return false;
        }
        aej aejVar = (aej) obj;
        return Objects.equals(this.a, aejVar.a) && this.b == aejVar.b && this.c == aejVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.u(parcel, 1, this.a);
        qq.m(parcel, 2, this.b);
        qq.m(parcel, 3, this.c);
        qq.j(parcel, iH);
    }
}
