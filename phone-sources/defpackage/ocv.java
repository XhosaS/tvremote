package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.StrictMode;
import android.service.notification.StatusBarNotification;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ocv {
    public static File a;
    private static Context b;
    private static Boolean c;

    public ocv() {
    }

    public static void A(Parcel parcel, int i, float f) {
        bK(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void B(Parcel parcel, int i, int i2) {
        bK(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void C(Parcel parcel, int i, long j) {
        bK(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void D(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        bK(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void E(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeBundle(bundle);
        x(parcel, iW);
    }

    public static void F(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeByteArray(bArr);
        x(parcel, iW);
    }

    public static void G(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        x(parcel, iW);
    }

    public static void H(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeStrongBinder(iBinder);
        x(parcel, iW);
    }

    public static void I(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeIntArray(iArr);
        x(parcel, iW);
    }

    public static void J(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        bK(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void K(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeLongArray(jArr);
        x(parcel, iW);
    }

    public static void L(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iW = w(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        x(parcel, iW);
    }

    public static void M(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        bK(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void N(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iW = w(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        x(parcel, iW);
    }

    public static void O(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeString(str);
        x(parcel, iW);
    }

    public static void P(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeStringArray(strArr);
        x(parcel, iW);
    }

    public static void Q(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeStringList(list);
        x(parcel, iW);
    }

    public static void R(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iW = w(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                bL(parcel, parcelable, i2);
            }
        }
        x(parcel, iW);
    }

    public static void S(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iW = w(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                bL(parcel, parcelable, 0);
            }
        }
        x(parcel, iW);
    }

    public static double T(Parcel parcel, int i) {
        bM(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float U(Parcel parcel, int i) {
        bM(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int V(int i) {
        return (char) i;
    }

    public static int W(Parcel parcel) {
        return parcel.readInt();
    }

    public static int X(Parcel parcel, int i) {
        bM(parcel, i, 4);
        return parcel.readInt();
    }

    public static int Y(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int Z(Parcel parcel) {
        int i = parcel.readInt();
        int iY = Y(parcel, i);
        int iV = V(i);
        int iDataPosition = parcel.dataPosition();
        if (iV != 20293) {
            throw new och("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iY + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new och(a.ce(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static void aA(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void aB(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void aC() {
        if (!e()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void aD(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void aE(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void aF(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void aG(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static onz aH(nwx nwxVar) {
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        nwxVar.g(new obw(nwxVar, kwyVar, 0));
        return (onz) kwyVar.a;
    }

    public static boolean aI(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!a.Q(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static String aJ(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void aK(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    public static nwk aL(Status status) {
        return status.h != null ? new nxa(status) : new nwk(status);
    }

    public static String aM(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.cf(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static nwl aN(nwn nwnVar, boolean z) {
        nwl nwlVar = new nwl(nwnVar);
        nwlVar.c = z;
        return nwlVar;
    }

    public static Object aP(Class cls, String str, rbi... rbiVarArr) {
        return aQ(cls, str, null, rbiVarArr);
    }

    public static Object aQ(Class cls, String str, Object obj, rbi... rbiVarArr) {
        int length = rbiVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < rbiVarArr.length; i++) {
            rbi rbiVar = rbiVarArr[i];
            rbiVar.getClass();
            clsArr[i] = (Class) rbiVar.b;
            objArr[i] = rbiVarArr[i].a;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
    }

    public static void aR(Status status, kwy kwyVar) {
        aS(status, null, kwyVar);
    }

    public static void aS(Status status, Object obj, kwy kwyVar) {
        if (status.b()) {
            kwyVar.u(obj);
        } else {
            kwyVar.t(aL(status));
        }
    }

    public static void aT(Status status, Object obj, kwy kwyVar) {
        if (status.b()) {
            kwyVar.w(obj);
        } else {
            kwyVar.v(aL(status));
        }
    }

    public static String aU(qen qenVar) {
        if (qenVar != null) {
            return Long.valueOf(qenVar.a).toString();
        }
        return null;
    }

    public static String aV(List list) {
        return yfm.ax(list, ", ", null, null, new oun(11), 30);
    }

    public static StatusBarNotification[] aW(NotificationManager notificationManager) {
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            activeNotifications.getClass();
            return activeNotifications;
        } catch (RuntimeException unused) {
            return new StatusBarNotification[0];
        }
    }

    public static int aX(vlo vloVar) {
        int iOrdinal = vloVar.ordinal();
        if (iOrdinal == 1) {
            return 7;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        if (iOrdinal != 5) {
            return iOrdinal != 8 ? 1 : 6;
        }
        return 5;
    }

    public static pxg aY(qen qenVar) {
        qenVar.getClass();
        return new pxc(qenVar);
    }

    public static pxg aZ(qen qenVar) {
        return qenVar != null ? aY(qenVar) : pxd.a;
    }

    public static long aa(Parcel parcel, int i) {
        bM(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle ab(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iY);
        return bundle;
    }

    public static IBinder ac(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iY);
        return strongBinder;
    }

    public static Parcelable ad(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iY);
        return parcelable;
    }

    public static Boolean ae(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        if (iY == 0) {
            return null;
        }
        bN(parcel, iY, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Integer af(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        if (iY == 0) {
            return null;
        }
        bN(parcel, iY, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long ag(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        if (iY == 0) {
            return null;
        }
        bN(parcel, iY, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String ah(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iY);
        return string;
    }

    public static ArrayList ai(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iY);
        return arrayList;
    }

    public static ArrayList aj(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iY);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList ak(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return arrayListCreateTypedArrayList;
    }

    public static void al(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new och(a.cf(i, "Overread allowed size end="), parcel);
        }
    }

    public static void am(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Y(parcel, i));
    }

    public static boolean an(Parcel parcel, int i) {
        bM(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ao(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iY);
        return bArrCreateByteArray;
    }

    public static int[] ap(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iY);
        return iArrCreateIntArray;
    }

    public static long[] aq(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iY);
        return jArrCreateLongArray;
    }

    public static Object[] ar(Parcel parcel, int i, Parcelable.Creator creator) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iY);
        return objArrCreateTypedArray;
    }

    public static String[] as(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iY);
        return strArrCreateStringArray;
    }

    public static byte[][] at(Parcel parcel, int i) {
        int iY = Y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iY == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iY);
        return bArr;
    }

    public static void au(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void av(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void aw(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void ax() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void ay() {
        az("Must not be called on the main application thread");
    }

    public static void az(String str) {
        if (e()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tpo bA(uzr uzrVar) {
        if (uzrVar.b.isEmpty()) {
            return null;
        }
        tpl tplVar = ((uzs) uzrVar.b.get(0)).b;
        if (tplVar == null) {
            tplVar = tpl.a;
        }
        vun<tpo> vunVar = tplVar.d;
        if (vunVar.isEmpty()) {
            return null;
        }
        for (tpo tpoVar : vunVar) {
            if ((tpoVar.b & 1) != 0) {
                tpm tpmVar = tpoVar.c;
                if (tpmVar == null) {
                    tpmVar = tpm.a;
                }
                if (tpmVar.b) {
                    return tpoVar;
                }
            }
        }
        return (tpo) vunVar.get(0);
    }

    public static void bB(InputStream inputStream) throws IOException {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static float bC(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float bD(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static FontFamily.Builder bI(Context context, ppv ppvVar, pqa pqaVar, CancellationSignal cancellationSignal) {
        context.getClass();
        ppvVar.getClass();
        pqaVar.getClass();
        ParcelFileDescriptor parcelFileDescriptor = sgg.e(context, ppvVar.a, cancellationSignal, yks.e(context.getPackageName(), "com.google.android.gms") ? sgf.b : sgf.a()).getParcelFileDescriptor();
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            Font fontBuild = new Font.Builder(parcelFileDescriptor).setWeight(ppvVar.c).setSlant(ppvVar.d ? 1 : 0).setTtcIndex(ppvVar.b).setFontVariationSettings(ppz.a(pqaVar.b, context)).build();
            fontBuild.getClass();
            FontFamily.Builder builder = new FontFamily.Builder(fontBuild);
            wef.v(parcelFileDescriptor, null);
            return builder;
        } finally {
        }
    }

    public static void bJ(yjk yjkVar, bkp bkpVar, long j, long j2, bpt bptVar, bpt bptVar2, float f, float f2, yjv yjvVar, float f3, float f4, bao baoVar, int i, int i2) {
        yjk yjkVar2;
        int i3;
        bkp bkpVar2;
        long j3;
        long j4;
        bpt bptVar3;
        bpt bptVar4;
        float f5;
        float f6;
        yjv yjvVar2;
        float f7;
        float f8;
        bao baoVar2;
        bpt bptVar5;
        bpt bptVar6;
        float f9;
        float f10;
        yjv yjvVar3;
        float f11;
        float f12;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-2003487780);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i3 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 16 : 32;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i3 |= true != baoVarD.E(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i3 |= true != baoVarD.E(j4) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= 268435456;
        }
        int i4 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            bptVar5 = bptVar;
            bptVar6 = bptVar2;
            f9 = f;
            f10 = f2;
            yjvVar3 = yjvVar;
            f11 = f3;
            f12 = f4;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                float f13 = ppd.a;
                baoVarD.x(123275540);
                bcp bcpVar = ccq.d;
                int i5 = 26;
                float f14 = 0.0f;
                int i6 = 1;
                bpt bptVar7 = new bpt(((clx) baoVarD.f(bcpVar)).cr(4.0f), f14, i6, 0, i5);
                bas basVar = (bas) baoVarD;
                basVar.aa();
                baoVarD.x(-1817860076);
                bpt bptVar8 = new bpt(((clx) baoVarD.f(bcpVar)).cr(4.0f), f14, i6, 0, i5);
                basVar.aa();
                float f15 = ppd.c;
                bptVar3 = bptVar8;
                bptVar4 = bptVar7;
                f5 = f15;
                f6 = ppd.b;
                yjvVar2 = ppd.d;
                f7 = ppd.a;
                f8 = f7;
            } else {
                baoVarD.t();
                bptVar4 = bptVar;
                bptVar3 = bptVar2;
                f5 = f;
                f6 = f2;
                yjvVar2 = yjvVar;
                f7 = f3;
                f8 = f4;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            axj.a(yjkVar2, bkpVar2, j3, j4, bptVar4, bptVar3, f5, f6, yjvVar2, f7, f8, baoVar2, i3 & 8190, 0);
            bptVar5 = bptVar4;
            bptVar6 = bptVar3;
            f9 = f5;
            f10 = f6;
            yjvVar3 = yjvVar2;
            f11 = f7;
            f12 = f8;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ppe(yjkVar, bkpVar, j, j2, bptVar5, bptVar6, f9, f10, yjvVar3, f11, f12, i, i2, 0);
        }
    }

    private static void bK(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void bL(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static void bM(Parcel parcel, int i, int i2) {
        int iY = Y(parcel, i);
        if (iY == i2) {
            return;
        }
        throw new och("Expected size " + i2 + " got " + iY + " (0x" + Integer.toHexString(iY) + ")", parcel);
    }

    private static void bN(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new och("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static List ba(List list) {
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qis) it.next()).a);
        }
        return arrayList;
    }

    public static List bb(boolean z, List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (z == set.contains(((qis) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean bc(qis qisVar) {
        return qisVar.t == 3 || qisVar.b == vll.DELETED;
    }

    public static /* synthetic */ pwh bd(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (pwh) vucVarO;
    }

    public static void be(long j, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        pwh pwhVar = (pwh) vtwVar.b;
        pwh pwhVar2 = pwh.a;
        pwhVar.c = j;
    }

    public static void bf(long j, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        pwh pwhVar = (pwh) vtwVar.b;
        pwh pwhVar2 = pwh.a;
        pwhVar.b = j;
    }

    public static int bg(qis qisVar) {
        qisVar.getClass();
        vlz vlzVar = qisVar.l.x;
        if (vlzVar == null) {
            vlzVar = vlz.a;
        }
        vly vlyVar = vlzVar.c;
        if (vlyVar == null) {
            vlyVar = vly.a;
        }
        return vlyVar.b;
    }

    public static int bh(qis qisVar) {
        qisVar.getClass();
        vly vlyVar = qisVar.l.w;
        if (vlyVar == null) {
            vlyVar = vly.a;
        }
        return vlyVar.b;
    }

    public static String bi(qis qisVar) {
        qisVar.getClass();
        vlz vlzVar = qisVar.l.x;
        if (vlzVar == null) {
            vlzVar = vlz.a;
        }
        String str = vlzVar.b;
        str.getClass();
        return str;
    }

    public static int bj(qis qisVar) {
        qisVar.getClass();
        vlz vlzVar = qisVar.l.x;
        if (vlzVar == null) {
            vlzVar = vlz.a;
        }
        vly vlyVar = vlzVar.c;
        if (vlyVar == null) {
            vlyVar = vly.a;
        }
        int iBm = a.bm(vlyVar.c);
        if (iBm == 0) {
            return 1;
        }
        return iBm;
    }

    public static void bk(qis qisVar) {
        qisVar.getClass();
        vly vlyVar = qisVar.l.w;
        if (vlyVar == null) {
            vlyVar = vly.a;
        }
        a.bm(vlyVar.c);
    }

    public static ptm bl(qir qirVar) {
        String str;
        int i;
        String str2;
        String str3;
        vmo vmoVar;
        String str4;
        viu viuVar;
        vtl vtlVar;
        qirVar.getClass();
        qio qioVar = new qio();
        qioVar.l();
        qioVar.q("");
        qioVar.k("");
        qioVar.r(1);
        qioVar.p(vmo.a);
        qioVar.e = vsl.a;
        qioVar.n("");
        qioVar.m(viu.a);
        qioVar.o(vxd.a);
        qioVar.k(qirVar.a);
        qioVar.r(qirVar.i);
        qioVar.l();
        String str5 = qirVar.b;
        if (str5 == null) {
            throw new NullPointerException("Null text");
        }
        qioVar.b = str5;
        qioVar.q(qirVar.c);
        qioVar.p(qirVar.d);
        qioVar.n(qirVar.f);
        qioVar.m(qirVar.g);
        qioVar.o(qirVar.h);
        qioVar.e = qirVar.e;
        if (qioVar.i == 1 && (str = qioVar.a) != null && (i = qioVar.j) != 0 && (str2 = qioVar.b) != null && (str3 = qioVar.c) != null && (vmoVar = qioVar.d) != null && (str4 = qioVar.f) != null && (viuVar = qioVar.g) != null && (vtlVar = qioVar.h) != null) {
            return new ptm(str, i, str2, str3, vmoVar, qioVar.e, str4, viuVar, vtlVar);
        }
        StringBuilder sb = new StringBuilder();
        if (qioVar.a == null) {
            sb.append(" actionId");
        }
        if (qioVar.j == 0) {
            sb.append(" builtInActionType");
        }
        if (qioVar.i == 0) {
            sb.append(" iconResourceId");
        }
        if (qioVar.b == null) {
            sb.append(" text");
        }
        if (qioVar.c == null) {
            sb.append(" url");
        }
        if (qioVar.d == null) {
            sb.append(" threadStateUpdate");
        }
        if (qioVar.f == null) {
            sb.append(" replyHintText");
        }
        if (qioVar.g == null) {
            sb.append(" preferenceKey");
        }
        if (qioVar.h == null) {
            sb.append(" snoozeDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static ptn bm(qis qisVar) {
        qisVar.getClass();
        List list = qisVar.r;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bl((qir) it.next()));
        }
        vnz vnzVar = qisVar.q;
        int i = qisVar.u;
        long j = qisVar.p;
        long j2 = qisVar.o;
        long j3 = qisVar.h;
        String str = qisVar.n;
        String str2 = qisVar.j;
        vsl vslVar = qisVar.g;
        String str3 = qisVar.f;
        long j4 = qisVar.e;
        List list2 = qisVar.m;
        vld vldVar = qisVar.l;
        long j5 = qisVar.d;
        long j6 = qisVar.c;
        int i2 = qisVar.t;
        int i3 = qisVar.s;
        vll vllVar = qisVar.b;
        return new ptn(qisVar.a, qisVar.v, vllVar, i3, i2, j6, j5, vldVar, list2, j4, str3, vslVar, str2, str, j2, j, j3, i, vnzVar, arrayList, qisVar.i, qisVar.k);
    }

    public static List bn(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bm((qis) it.next()));
        }
        return arrayList;
    }

    public static qpv bo(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION");
        if (string == null || string.length() == 0) {
            return null;
        }
        return osk.M(string);
    }

    public static void bp(Bundle bundle, qen qenVar) {
        if (qenVar == null) {
            return;
        }
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", osk.O(qenVar.b()));
    }

    public static vig bq(pvt pvtVar) {
        vtw vtwVarM = vig.a.m();
        vtwVarM.getClass();
        if (pvtVar instanceof pvw) {
            int i = ((pvw) pvtVar).a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vig vigVar = (vig) vtwVarM.b;
            vigVar.b = 1;
            vigVar.c = Integer.valueOf(i);
        } else {
            if (!(pvtVar instanceof pvv)) {
                throw new yfu();
            }
            vtw vtwVarM2 = vif.a.m();
            vtwVarM2.getClass();
            pvv pvvVar = (pvv) pvtVar;
            String str = pvvVar.b;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            vif vifVar = (vif) vucVar;
            vifVar.b = 1 | vifVar.b;
            vifVar.c = str;
            int i2 = pvvVar.a;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vif vifVar2 = (vif) vtwVarM2.b;
            vifVar2.b |= 2;
            vifVar2.d = i2;
            vuc vucVarO = vtwVarM2.r();
            vucVarO.getClass();
            vif vifVar3 = (vif) vucVarO;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vig vigVar2 = (vig) vtwVarM.b;
            vigVar2.c = vifVar3;
            vigVar2.b = 2;
        }
        vuc vucVarO2 = vtwVarM.r();
        vucVarO2.getClass();
        return (vig) vucVarO2;
    }

    public static int br(Bundle bundle) {
        return a.bm(bundle.getInt("chime.richCollapsedView"));
    }

    public static boolean bs(Intent intent) {
        return qcb.e(intent) != null;
    }

    public static boolean bt(vmo vmoVar) {
        vmoVar.getClass();
        vll vllVarB = vll.b(vmoVar.d);
        if (vllVarB == null) {
            vllVarB = vll.DELETION_STATUS_UNKNOWN;
        }
        if (vllVarB == vll.DELETED) {
            return true;
        }
        int iBm = a.bm(vmoVar.f);
        return iBm != 0 && iBm == 3;
    }

    public static /* synthetic */ String bu(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NOTIFY" : "DROP" : "UNKNOWN_PREFERENCE";
    }

    public static int bv(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 2;
        }
        return 3;
    }

    public static char bw(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static boolean bx(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            return (c2 >= 'A' && c2 <= 'Z') || c2 == '_';
        }
        return true;
    }

    public static boolean by(int i) {
        return i == 1 || i == 0;
    }

    public static void bz(int i, String str, String str2) {
        int i2 = prz.a;
        if (i == 0 && TextUtils.equals(str.toUpperCase(Locale.US), "SELECT")) {
            throw new SecurityException("Subquery is not allowed in selection: ".concat(str2));
        }
    }

    public static StrictMode.VmPolicy.Builder d(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static boolean e() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static int i(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static synchronized boolean j(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = b;
        if (context2 != null && (bool = c) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        c = null;
        if (f()) {
            c = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                c = true;
            } catch (ClassNotFoundException unused) {
                c = false;
            }
        }
        b = applicationContext;
        return c.booleanValue();
    }

    public static void k(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    public static void l(String str, Throwable th) {
        String strM = m();
        if (Log.isLoggable(strM, 5)) {
            Log.w(strM, str, th);
        }
    }

    public static String m() {
        return Build.VERSION.SDK_INT < 26 ? "PeopleClient".substring(0, Math.min(12, 23)) : "PeopleClient";
    }

    public static ExecutorService n(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService o(ThreadFactory threadFactory) {
        return n(1, threadFactory);
    }

    public static ExecutorService p(int i) {
        return n(i, Executors.defaultThreadFactory());
    }

    public static nwl q() {
        ocv ocvVar = oge.a;
        nwn nwnVar = new nwn(-1, -1, 0, true);
        Parcelable.Creator<nwl> creator = nwl.CREATOR;
        return aN(nwnVar, false);
    }

    public static void r(Context context) {
        try {
            aF(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String s(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean t(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static oci u(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        aF(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        parcelObtain.setDataPosition(0);
        oci ociVar = (oci) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return ociVar;
    }

    public static int v(Parcel parcel) {
        return w(parcel, 20293);
    }

    public static int w(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void x(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void y(Parcel parcel, int i, boolean z) {
        bK(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void z(Parcel parcel, int i, double d) {
        bK(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public nwj a(Context context, Looper looper, oav oavVar, Object obj, nyc nycVar, nzw nzwVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public nwj b(Context context, Looper looper, oav oavVar, Object obj, nws nwsVar, nwt nwtVar) {
        return a(context, looper, oavVar, obj, nwsVar, nwtVar);
    }

    public void bE(int i) {
        throw null;
    }

    public void bF() {
        throw null;
    }

    public List c(Object obj) {
        return Collections.EMPTY_LIST;
    }

    public ocv(short[] sArr) {
    }

    public ocv(byte[] bArr, char[] cArr) {
        new Random();
    }

    public ocv(Context context) {
        new nsz(context, "PROFILE_SYNC_VERBOSE", null);
    }

    public ocv(ttm ttmVar) {
        sij.l(ttmVar);
    }

    public ocv(xbw xbwVar, pva pvaVar, nsf nsfVar, pvg pvgVar, osk oskVar, Random random) {
        xbwVar.getClass();
        pvaVar.getClass();
        nsfVar.getClass();
        pvgVar.getClass();
        oskVar.getClass();
        random.getClass();
        new yyk();
    }

    public ocv(qbd qbdVar) {
        qbdVar.getClass();
    }

    public ocv(qei qeiVar, byte[] bArr) {
        qeiVar.getClass();
    }

    public ocv(qei qeiVar, pyg pygVar) {
        qeiVar.getClass();
        pygVar.getClass();
    }

    public ocv(qei qeiVar) {
        qeiVar.getClass();
    }

    public void aO() {
    }

    public void bG() {
    }

    public void bH() {
    }
}
