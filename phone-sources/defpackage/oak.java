package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oak extends ocg {
    public static final Parcelable.Creator<oak> CREATOR = new nub(18);
    final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public oak(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof oak)) {
            oak oakVar = (oak) obj;
            if (a.Q(this.b, oakVar.b) && this.c == oakVar.c && this.d == oakVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.c), Integer.valueOf(this.d), this.b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.B(parcel, 3, this.c);
        ocv.B(parcel, 4, this.d);
        ocv.x(parcel, iV);
    }

    public oak(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
