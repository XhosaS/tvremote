package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kkw {
    public static float a(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int b(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt();
    }

    public static int c(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int d(Parcel parcel) {
        int i = parcel.readInt();
        int iC = c(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new kkv("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iC + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new kkv(a.k(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long e(Parcel parcel, int i) {
        q(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle f(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC);
        return bundle;
    }

    public static IBinder g(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iC);
        return strongBinder;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC);
        return parcelable;
    }

    public static Boolean i(Parcel parcel, int i) {
        int iC = c(parcel, i);
        if (iC == 0) {
            return null;
        }
        y(parcel, iC, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Integer j(Parcel parcel, int i) {
        int iC = c(parcel, i);
        if (iC == 0) {
            return null;
        }
        y(parcel, iC, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long k(Parcel parcel, int i) {
        int iC = c(parcel, i);
        if (iC == 0) {
            return null;
        }
        y(parcel, iC, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String l(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC);
        return string;
    }

    public static ArrayList m(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iC);
        return arrayList;
    }

    public static ArrayList n(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateTypedArrayList;
    }

    public static void p(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new kkv(a.b(i, "Overread allowed size end="), parcel);
        }
    }

    public static void q(Parcel parcel, int i, int i2) {
        int iC = c(parcel, i);
        if (iC == i2) {
            return;
        }
        throw new kkv("Expected size " + i2 + " got " + iC + " (0x" + Integer.toHexString(iC) + ")", parcel);
    }

    public static void r(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + c(parcel, i));
    }

    public static boolean s(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] t(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC);
        return bArrCreateByteArray;
    }

    public static int[] u(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iC);
        return iArrCreateIntArray;
    }

    public static Object[] v(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return objArrCreateTypedArray;
    }

    public static String[] w(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iC);
        return strArrCreateStringArray;
    }

    public static byte[][] x(Parcel parcel, int i) {
        int iC = c(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iC);
        return bArr;
    }

    public static void y(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new kkv("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }
}
