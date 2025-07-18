package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lio extends lcn {
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private bke f;
    private Boolean g;
    private Integer h;
    private static final String[] b = {"firebase_", "google_", "ga_"};
    public static final String[] a = {"_err"};

    public lio(lbk lbkVar) {
        super(lbkVar);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    static MessageDigest E() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList G(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.a);
            bundle.putString("origin", conditionalUserPropertyParcel.b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.d);
            bundle.putString("name", conditionalUserPropertyParcel.c.b);
            Object objA = conditionalUserPropertyParcel.c.a();
            kkk.k(objA);
            lcp.b(bundle, objA);
            bundle.putBoolean("active", conditionalUserPropertyParcel.e);
            String str = conditionalUserPropertyParcel.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.a);
                EventParams eventParams = eventParcel.b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.a);
                EventParams eventParams2 = eventParcel2.b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.c.c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.a);
                EventParams eventParams3 = eventParcel3.b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void J(lez lezVar, Bundle bundle, boolean z) {
        if (bundle != null && lezVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = lezVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = lezVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", lezVar.c);
                return;
            }
            z = false;
        }
        if (bundle != null && lezVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean Y(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean am(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean an(String str) {
        kkk.h(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean ao(Context context) {
        ActivityInfo receiverInfo;
        kkk.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean av(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private final int ax(String str) {
        int i = "_ldl".equals(str) ? 2048 : "_id".equals(str) ? 256 : "_lgclid".equals(str) ? 100 : 36;
        ktx ktxVar = this.y.d;
        return i;
    }

    private final Object ay(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return D(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleAu = au((Bundle) parcelable);
                if (!bundleAu.isEmpty()) {
                    arrayList.add(bundleAu);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static long t(byte[] bArr) {
        kkk.k(bArr);
        int length = bArr.length;
        int i = 0;
        kkk.f(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    final Object A(String str, Object obj) {
        if ("_ev".equals(str)) {
            return ay(this.y.d.d(null, false), obj, true, true);
        }
        return ay(am(str) ? this.y.d.d(null, false) : this.y.d.c(null, false), obj, false, true);
    }

    final Object B(String str, Object obj) {
        return "_ldl".equals(str) ? ay(ax(str), obj, true, false) : ay(ax(str), obj, false, false);
    }

    final String C() {
        byte[] bArr = new byte[16];
        F().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String D(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    final SecureRandom F() {
        g();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    final void H(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    final void I(Bundle bundle, int i, String str, Object obj) {
        if (W(bundle, i)) {
            ktx ktxVar = this.y.d;
            bundle.putString("_ev", D(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final void K(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                lbk lbkVar = this.y;
                lio lioVar = lbkVar.i;
                lbkVar.m(lioVar);
                lioVar.N(bundle, str, bundle2.get(str));
            }
        }
    }

    final void L(lac lacVar, int i) {
        Bundle bundle = lacVar.d;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (an(str) && (i2 = i2 + 1) > i) {
                lbk lbkVar = this.y;
                if (!lbkVar.d.t(null, kzg.bf) || !z) {
                    String strA = a.a(i, "Event can't contain more than ", " params");
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    kzz kzzVar = labVar.e;
                    String str2 = lacVar.a;
                    kzu kzuVar = lbkVar.j;
                    kzzVar.c(strA, kzuVar.c(str2), kzuVar.b(bundle));
                    W(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    final void M(lin linVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        W(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        linVar.a(str, "_err", bundle);
    }

    final void N(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.h.c("Not putting event parameter. Invalid value type. name, type", lbkVar.j.d(str), simpleName);
        }
    }

    public final void O(krc krcVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning boolean value to wrapper", e);
        }
    }

    public final void P(krc krcVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning bundle list to wrapper", e);
        }
    }

    public final void Q(krc krcVar, Bundle bundle) {
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning bundle value to wrapper", e);
        }
    }

    public final void R(krc krcVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning byte array to wrapper", e);
        }
    }

    public final void S(krc krcVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning int value to wrapper", e);
        }
    }

    public final void T(krc krcVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning long value to wrapper", e);
        }
    }

    public final void U(krc krcVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Error returning string value to wrapper", e);
        }
    }

    final void V(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int iK;
        String str4;
        int iD;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        lbk lbkVar2 = ktxVar.y;
        lio lioVar = lbkVar2.i;
        lbkVar2.m(lioVar);
        int i = true != lioVar.as(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iK = !z ? k(str5) : 0;
                if (iK == 0) {
                    iK = j(str5);
                }
            } else {
                iK = 0;
            }
            if (iK != 0) {
                I(bundle, iK, str5, iK == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (aj(bundle.get(str5))) {
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.h.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iD = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iD = d(str, str2, str5, bundle.get(str5), bundle, list2, z, false);
                }
                if (iD != 0 && !"_ev".equals(str5)) {
                    I(bundle, iD, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (an(str5) && !Y(str5, lcv.d)) {
                    int i3 = i2 + 1;
                    if (!as(231100000)) {
                        lab labVar2 = lbkVar.f;
                        lbkVar.o(labVar2);
                        kzz kzzVar = labVar2.e;
                        kzu kzuVar = lbkVar.j;
                        kzzVar.c("Item array not supported on client's version of Google Play Services (Android Only)", kzuVar.c(str2), kzuVar.b(bundle));
                        W(bundle, 23);
                        bundle.remove(str5);
                    } else if (i3 > i) {
                        if (!ktxVar.t(str4, kzg.bf) || !z2) {
                            lab labVar3 = lbkVar.f;
                            lbkVar.o(labVar3);
                            kzz kzzVar2 = labVar3.e;
                            String strA = a.a(i, "Item can't contain more than ", " item-scoped custom params");
                            kzu kzuVar2 = lbkVar.j;
                            kzzVar2.c(strA, kzuVar2.c(str2), kzuVar2.b(bundle));
                        }
                        W(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        i2 = i3;
                        z2 = true;
                    }
                    list2 = list;
                    i2 = i3;
                }
            }
            list2 = list;
        }
    }

    final boolean W(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    final boolean X(String str) {
        String str2 = (String) kzg.ar.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    final boolean Z(String str) {
        if (TextUtils.isEmpty(str)) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        kkk.k(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        lbk lbkVar2 = this.y;
        lab labVar2 = lbkVar2.f;
        lbkVar2.o(labVar2);
        labVar2.e.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", lab.b(str));
        return false;
    }

    @Override // defpackage.lcn
    protected final boolean a() {
        return true;
    }

    final boolean aa(String str, int i, String str2) {
        if (str2 == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        lbk lbkVar2 = this.y;
        lab labVar2 = lbkVar2.f;
        lbkVar2.o(labVar2);
        labVar2.e.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    final boolean ab(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.e.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = b;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.e.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Y(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Y(str2, strArr2)) {
            return true;
        }
        lbk lbkVar3 = this.y;
        lab labVar3 = lbkVar3.f;
        lbkVar3.o(labVar3);
        labVar3.e.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean ad(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.h.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final boolean ae(String str, String str2) {
        if (str2 == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                lbk lbkVar3 = this.y;
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                labVar3.e.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                lbk lbkVar4 = this.y;
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                labVar4.e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean af(String str, String str2) {
        if (str2 == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.e.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                lbk lbkVar4 = this.y;
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                labVar4.e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ag() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.g
            if (r0 != 0) goto L63
            bke r0 = r5.z()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            zyd r0 = r0.b()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L38 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L3c java.util.concurrent.CancellationException -> L3e
            xs r0 = (defpackage.xs) r0     // Catch: java.util.concurrent.TimeoutException -> L38 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L3c java.util.concurrent.CancellationException -> L3e
            xn r0 = r0.b     // Catch: java.util.concurrent.TimeoutException -> L38 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L3c java.util.concurrent.CancellationException -> L3e
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = r0.get(r3, r2)     // Catch: java.util.concurrent.TimeoutException -> L38 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L3c java.util.concurrent.CancellationException -> L3e
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.util.concurrent.TimeoutException -> L38 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L3c java.util.concurrent.CancellationException -> L3e
            if (r0 == 0) goto L30
            int r2 = r0.intValue()     // Catch: java.util.concurrent.TimeoutException -> L28 java.lang.InterruptedException -> L2a java.util.concurrent.ExecutionException -> L2c java.util.concurrent.CancellationException -> L2e
            r3 = 1
            if (r2 != r3) goto L30
            goto L31
        L28:
            r2 = move-exception
            goto L41
        L2a:
            r2 = move-exception
            goto L41
        L2c:
            r2 = move-exception
            goto L41
        L2e:
            r2 = move-exception
            goto L41
        L30:
            r3 = r1
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.util.concurrent.TimeoutException -> L28 java.lang.InterruptedException -> L2a java.util.concurrent.ExecutionException -> L2c java.util.concurrent.CancellationException -> L2e
            r5.g = r2     // Catch: java.util.concurrent.TimeoutException -> L28 java.lang.InterruptedException -> L2a java.util.concurrent.ExecutionException -> L2c java.util.concurrent.CancellationException -> L2e
            goto L55
        L38:
            r0 = move-exception
            goto L3f
        L3a:
            r0 = move-exception
            goto L3f
        L3c:
            r0 = move-exception
            goto L3f
        L3e:
            r0 = move-exception
        L3f:
            r2 = r0
            r0 = 0
        L41:
            lbk r3 = r5.y
            lab r4 = r3.f
            r3.o(r4)
            kzz r3 = r4.f
            java.lang.String r4 = "Measurement manager api exception"
            r3.b(r4, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.g = r1
        L55:
            lbk r1 = r5.y
            lab r2 = r1.f
            r1.o(r2)
            kzz r1 = r2.k
            java.lang.String r2 = "Measurement manager api status result"
            r1.b(r2, r0)
        L63:
            java.lang.Boolean r0 = r5.g
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lio.ag():boolean");
    }

    final boolean ah(String str) {
        g();
        lbk lbkVar = this.y;
        if (kmb.a.a(lbkVar.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.b("Permission not granted", str);
        return false;
    }

    final boolean ai(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        lbk lbkVar = this.y;
        String strB = lbkVar.d.B("debug.firebase.analytics.app");
        kts ktsVar = lbkVar.c;
        return strB.equals(str);
    }

    final boolean aj(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean ak(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = kmb.a.a(context).b(str, 64);
            if (packageInfoB == null || packageInfoB.signatures == null || packageInfoB.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoB.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Error obtaining certificate", e2);
            return true;
        }
    }

    final boolean al() {
        g();
        return s() == 1;
    }

    final boolean ap(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            kkk.k(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    final byte[] aq(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    final EventParcel ar(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (f(str2) != 0) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Invalid conditional property event name", lbkVar.j.e(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleY = y(str, str2, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleY = au(bundleY);
        }
        kkk.k(bundleY);
        return new EventParcel(str2, new EventParams(bundleY), str3, j);
    }

    public final boolean as(int i) {
        Boolean bool = this.y.k().c;
        if (n() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int at() {
        return kcy.d.g(this.y.a, 12451000);
    }

    final Bundle au(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objA = A(str, bundle.get(str));
                if (objA == null) {
                    lbk lbkVar = this.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.h.b("Param value can't be null", lbkVar.j.d(str));
                } else {
                    N(bundle2, str, objA);
                }
            }
        }
        return bundle2;
    }

    public final URL aw(String str, String str2, long j, String str3) {
        try {
            kkk.h(str2);
            kkk.h(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 129017L, Integer.valueOf(n())), str2, str, Long.valueOf(j));
            if (str.equals(this.y.d.B("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int d(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lio.d(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final int e(String str, Object obj) {
        return "_ldl".equals(str) ? ad("user property referrer", str, ax(str), obj) : ad("user property", str, ax(str), obj) ? 0 : 7;
    }

    final int f(String str) {
        if (!ae("event", str)) {
            return 2;
        }
        if (!ab("event", lcu.a, lcu.b, str)) {
            return 13;
        }
        ktx ktxVar = this.y.d;
        return !aa("event", 40, str) ? 2 : 0;
    }

    @Override // defpackage.lcn
    protected final void i() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(jNextLong);
    }

    final int j(String str) {
        if (!ae("event param", str)) {
            return 3;
        }
        if (!ab("event param", null, null, str)) {
            return 14;
        }
        ktx ktxVar = this.y.d;
        return !aa("event param", 40, str) ? 3 : 0;
    }

    final int k(String str) {
        if (!af("event param", str)) {
            return 3;
        }
        if (!ab("event param", null, null, str)) {
            return 14;
        }
        ktx ktxVar = this.y.d;
        return !aa("event param", 40, str) ? 3 : 0;
    }

    final int l(String str) {
        if (!ae("user property", str)) {
            return 6;
        }
        if (!ab("user property", lcw.a, null, str)) {
            return 15;
        }
        ktx ktxVar = this.y.d;
        return !aa("user property", 24, str) ? 6 : 0;
    }

    final int m() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final int n() {
        if (this.h == null) {
            int i = kcy.c;
            this.h = Integer.valueOf(kdu.a(this.y.a) / 1000);
        }
        return this.h.intValue();
    }

    final long s() {
        long j;
        g();
        if (!X(this.y.e().i())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            int iM = m();
            ktx ktxVar = this.y.d;
            j = iM < ((Integer) kzg.al.a(null)).intValue() ? 16L : 0L;
        }
        if (!ah("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0 && !ag()) {
            j = 64;
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final long v() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            klk klkVar = this.y.B;
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = jNextLong + i;
        }
        return j;
    }

    public final long w(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    final Bundle x(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final Bundle y(String str, String str2, Bundle bundle, List list, boolean z) {
        int iK;
        String str3;
        List list2 = list;
        boolean zY = Y(str2, lcu.d);
        String str4 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        int iE = ktxVar.e();
        int i = 0;
        boolean z2 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iK = !z ? k(str5) : 0;
                if (iK == 0) {
                    iK = j(str5);
                }
            } else {
                iK = 0;
            }
            if (iK != 0) {
                I(bundle2, iK, str5, iK == 3 ? str5 : str4);
                bundle2.remove(str5);
            } else {
                int iD = d(str, str2, str5, bundle.get(str5), bundle2, list2, z, zY);
                if (iD == 17) {
                    I(bundle2, 17, str5, false);
                } else if (iD != 0 && !"_ev".equals(str5)) {
                    I(bundle2, iD, iD == 21 ? str2 : str5, bundle.get(str5));
                    bundle2.remove(str5);
                }
                if (an(str5)) {
                    int i2 = i + 1;
                    if (i2 > iE) {
                        if (ktxVar.t(str4, kzg.bf) && z2) {
                            str3 = str4;
                        } else {
                            String strA = a.a(iE, "Event can't contain more than ", " params");
                            lab labVar = lbkVar.f;
                            lbkVar.o(labVar);
                            kzz kzzVar = labVar.e;
                            kzu kzuVar = lbkVar.j;
                            str3 = str4;
                            kzzVar.c(strA, kzuVar.c(str2), kzuVar.b(bundle));
                        }
                        W(bundle2, 5);
                        bundle2.remove(str5);
                        z2 = true;
                        list2 = list;
                        i = i2;
                        str4 = str3;
                    } else {
                        list2 = list;
                        i = i2;
                    }
                }
            }
            str3 = str4;
            list2 = list;
            str4 = str3;
        }
        return bundle2;
    }

    final bke z() {
        if (this.f == null) {
            final Context context = this.y.a;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            bjr bjrVar = bjr.a;
            sb.append(bjrVar.a());
            Log.d("MeasurementManager", sb.toString());
            Object bkjVar = bjrVar.a() >= 5 ? new bkj(context) : bjrVar.b() >= 9 ? bjs.a.a(context, new agux() { // from class: bkg
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    ((Context) obj).getClass();
                    return new bki(context);
                }
            }) : null;
            this.f = bkjVar != null ? new bkd((bkh) bkjVar) : null;
        }
        return this.f;
    }
}
