package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qq {
    public static int A(Parcel parcel, int i) {
        L(parcel, i, 4);
        return parcel.readInt();
    }

    public static int B(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int C(Parcel parcel) {
        int i = parcel.readInt();
        int iB = B(parcel, i);
        int iZ = z(i);
        int iDataPosition = parcel.dataPosition();
        if (iZ != 20293) {
            throw new aji("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iB + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new aji(b.f(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long D(Parcel parcel, int i) {
        L(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle E(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iB);
        return bundle;
    }

    public static IBinder F(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iB);
        return strongBinder;
    }

    public static Parcelable G(Parcel parcel, int i, Parcelable.Creator creator) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iB);
        return parcelable;
    }

    public static String H(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iB);
        return string;
    }

    public static ArrayList I(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iB);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList J(Parcel parcel, int i, Parcelable.Creator creator) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iB);
        return arrayListCreateTypedArrayList;
    }

    public static void K(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new aji(b.e(i, "Overread allowed size end="), parcel);
        }
    }

    public static void L(Parcel parcel, int i, int i2) {
        int iB = B(parcel, i);
        if (iB == i2) {
            return;
        }
        throw new aji("Expected size " + i2 + " got " + iB + " (0x" + Integer.toHexString(iB) + ")", parcel);
    }

    public static void M(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i));
    }

    public static boolean N(Parcel parcel, int i) {
        L(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] O(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iB);
        return bArrCreateByteArray;
    }

    public static int[] P(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iB);
        return iArrCreateIntArray;
    }

    public static Object[] Q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iB);
        return objArrCreateTypedArray;
    }

    public static String[] R(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iB);
        return strArrCreateStringArray;
    }

    public static byte[][] S(Parcel parcel, int i) {
        int iB = B(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iB);
        return bArr;
    }

    private static void T(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Activity activity, xa xaVar) {
        xaVar.getClass();
        if (activity instanceof xg) {
            ((xg) activity).a().b(xaVar);
        } else if (activity instanceof xf) {
            xc xcVarM = ((xf) activity).m();
            if (xcVarM instanceof xc) {
                xcVarM.b(xaVar);
            }
        }
    }

    public static void d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            xo xoVar = xp.Companion;
            xo.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new xq(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static xb e(xb xbVar, xb xbVar2) {
        xbVar.getClass();
        return (xbVar2 == null || xbVar2.compareTo(xbVar) >= 0) ? xbVar : xbVar2;
    }

    public static void f(Context context) {
        try {
            qp.p(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static boolean g(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int h(Parcel parcel) {
        return i(parcel, 20293);
    }

    public static int i(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void j(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void k(Parcel parcel, int i, boolean z) {
        l(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void l(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void m(Parcel parcel, int i, int i2) {
        l(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void n(Parcel parcel, int i, long j) {
        l(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void o(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeBundle(bundle);
        j(parcel, i2);
    }

    public static void p(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeByteArray(bArr);
        j(parcel, i2);
    }

    public static void q(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        j(parcel, i2);
    }

    public static void r(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeStrongBinder(iBinder);
        j(parcel, i2);
    }

    public static void s(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeIntArray(iArr);
        j(parcel, i2);
    }

    public static void t(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int i3 = i(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        j(parcel, i3);
    }

    public static void u(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeString(str);
        j(parcel, i2);
    }

    public static void v(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeStringArray(strArr);
        j(parcel, i2);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i(parcel, i);
        parcel.writeStringList(list);
        j(parcel, i2);
    }

    public static void x(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int i3 = i(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                T(parcel, parcelable, i2);
            }
        }
        j(parcel, i3);
    }

    public static void y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                T(parcel, parcelable, 0);
            }
        }
        j(parcel, i2);
    }

    public static int z(int i) {
        return (char) i;
    }
}
