package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kkx {
    public static int a(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void b(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        e(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, float f) {
        e(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void e(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void f(Parcel parcel, int i, int i2) {
        e(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void g(Parcel parcel, int i, long j) {
        e(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void h(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        e(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void i(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeBundle(bundle);
        b(parcel, iA);
    }

    public static void j(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeByteArray(bArr);
        b(parcel, iA);
    }

    public static void k(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        b(parcel, iA);
    }

    public static void l(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeStrongBinder(iBinder);
        b(parcel, iA);
    }

    public static void m(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeIntArray(iArr);
        b(parcel, iA);
    }

    public static void n(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iA = a(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        b(parcel, iA);
    }

    public static void o(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        e(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void p(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        e(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void q(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iA = a(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        b(parcel, iA);
    }

    public static void r(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeString(str);
        b(parcel, iA);
    }

    public static void s(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeStringArray(strArr);
        b(parcel, iA);
    }

    public static void t(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeStringList(list);
        b(parcel, iA);
    }

    public static void u(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iA = a(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, parcelable, i2);
            }
        }
        b(parcel, iA);
    }

    public static void v(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iA = a(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, parcelable, 0);
            }
        }
        b(parcel, iA);
    }

    private static void w(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
