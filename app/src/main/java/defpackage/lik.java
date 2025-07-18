package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lik extends lht {
    public lik(lih lihVar) {
        super(lihVar);
    }

    static boolean F(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    static boolean H(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] J(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lla llaVar = (lla) it.next();
            if (llaVar != null) {
                Bundle bundle = new Bundle();
                for (lla llaVar2 : llaVar.h) {
                    int i = llaVar2.b;
                    if ((i & 2) != 0) {
                        bundle.putString(llaVar2.c, llaVar2.d);
                    } else if ((i & 4) != 0) {
                        bundle.putLong(llaVar2.c, llaVar2.e);
                    } else if ((i & 16) != 0) {
                        bundle.putDouble(llaVar2.c, llaVar2.g);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void L(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                N(builder, str3, string, set);
            }
        }
    }

    private final void M(StringBuilder sb, int i, List list) {
        String strD;
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lla llaVar = (lla) it.next();
            if (llaVar != null) {
                A(sb, i2);
                sb.append("param {\n");
                if ((llaVar.b & 1) != 0) {
                    strD = this.y.j.d(llaVar.c);
                } else {
                    strD = null;
                }
                C(sb, i2, "name", strD);
                C(sb, i2, "string_value", (llaVar.b & 2) != 0 ? llaVar.d : null);
                C(sb, i2, "int_value", (llaVar.b & 4) != 0 ? Long.valueOf(llaVar.e) : null);
                C(sb, i2, "double_value", (llaVar.b & 16) != 0 ? Double.valueOf(llaVar.g) : null);
                if (llaVar.h.size() > 0) {
                    M(sb, i2, llaVar.h);
                }
                A(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void N(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private final void O(StringBuilder sb, String str, lli lliVar) {
        if (lliVar == null) {
            return;
        }
        A(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (lliVar.c.size() != 0) {
            A(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : lliVar.c) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (lliVar.b.size() != 0) {
            A(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : lliVar.b) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (lliVar.d.size() != 0) {
            A(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (lku lkuVar : lliVar.d) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append((lkuVar.b & 1) != 0 ? Integer.valueOf(lkuVar.c) : null);
                sb.append(":");
                sb.append((lkuVar.b & 2) != 0 ? Long.valueOf(lkuVar.d) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (lliVar.e.size() != 0) {
            A(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (llk llkVar : lliVar.e) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append((llkVar.b & 1) != 0 ? Integer.valueOf(llkVar.c) : null);
                sb.append(": [");
                Iterator it = llkVar.d.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        A(sb, 3);
        sb.append("}\n");
    }

    static int a(lld lldVar, String str) {
        for (int i = 0; i < ((lle) lldVar.b).f.size(); i++) {
            if (str.equals(((llu) ((lle) lldVar.b).f.get(i)).d)) {
                return i;
            }
        }
        return -1;
    }

    static abyq o(abyq abyqVar, byte[] bArr) {
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        return generatedRegistry != null ? abyqVar.l(bArr, generatedRegistry) : abyqVar.k(bArr);
    }

    static List w(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public final void A(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public final void B(StringBuilder sb, int i, String str, liy liyVar) {
        if (liyVar == null) {
            return;
        }
        A(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if ((liyVar.b & 1) != 0) {
            int iA = lix.a(liyVar.c);
            C(sb, i, "comparison_type", (iA == 0 || iA == 1) ? "UNKNOWN_COMPARISON_TYPE" : iA != 2 ? iA != 3 ? iA != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        if ((liyVar.b & 2) != 0) {
            C(sb, i, "match_as_float", Boolean.valueOf(liyVar.d));
        }
        if ((liyVar.b & 4) != 0) {
            C(sb, i, "comparison_value", liyVar.e);
        }
        if ((liyVar.b & 8) != 0) {
            C(sb, i, "min_comparison_value", liyVar.f);
        }
        if ((liyVar.b & 16) != 0) {
            C(sb, i, "max_comparison_value", liyVar.g);
        }
        A(sb, i);
        sb.append("}\n");
    }

    public final void C(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        A(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    final void D(lkz lkzVar, Object obj) {
        kkk.k(obj);
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar = (lla) lkzVar.b;
        lla llaVar2 = lla.a;
        llaVar.b &= -3;
        llaVar.d = lla.a.d;
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar3 = (lla) lkzVar.b;
        llaVar3.b &= -5;
        llaVar3.e = 0L;
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar4 = (lla) lkzVar.b;
        llaVar4.b &= -17;
        llaVar4.g = 0.0d;
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        ((lla) lkzVar.b).h = abzb.b;
        if (obj instanceof String) {
            String str = (String) obj;
            if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lkzVar.y();
            }
            lla llaVar5 = (lla) lkzVar.b;
            str.getClass();
            llaVar5.b |= 2;
            llaVar5.d = str;
            return;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lkzVar.y();
            }
            lla llaVar6 = (lla) lkzVar.b;
            llaVar6.b |= 4;
            llaVar6.e = jLongValue;
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lkzVar.y();
            }
            lla llaVar7 = (lla) lkzVar.b;
            llaVar7.b |= 16;
            llaVar7.g = dDoubleValue;
            return;
        }
        if (!(obj instanceof Bundle[])) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                lkz lkzVar2 = new lkz();
                for (String str2 : bundle.keySet()) {
                    lkz lkzVar3 = new lkz();
                    if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        lkzVar3.y();
                    }
                    lla llaVar8 = (lla) lkzVar3.b;
                    str2.getClass();
                    llaVar8.b |= 1;
                    llaVar8.c = str2;
                    Object obj2 = bundle.get(str2);
                    if (obj2 instanceof Long) {
                        long jLongValue2 = ((Long) obj2).longValue();
                        if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkzVar3.y();
                        }
                        lla llaVar9 = (lla) lkzVar3.b;
                        llaVar9.b |= 4;
                        llaVar9.e = jLongValue2;
                    } else if (obj2 instanceof String) {
                        String str3 = (String) obj2;
                        if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkzVar3.y();
                        }
                        lla llaVar10 = (lla) lkzVar3.b;
                        str3.getClass();
                        llaVar10.b |= 2;
                        llaVar10.d = str3;
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkzVar3.y();
                        }
                        lla llaVar11 = (lla) lkzVar3.b;
                        llaVar11.b |= 16;
                        llaVar11.g = dDoubleValue2;
                    }
                    if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        lkzVar2.y();
                    }
                    lla llaVar12 = (lla) lkzVar2.b;
                    lla llaVar13 = (lla) lkzVar3.v();
                    llaVar13.getClass();
                    abxs abxsVar = llaVar12.h;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        llaVar12.h = abxsVar.d(size + size);
                    }
                    llaVar12.h.add(llaVar13);
                }
                if (((lla) lkzVar2.b).h.size() > 0) {
                    arrayList.add((lla) lkzVar2.v());
                }
            }
        }
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar14 = (lla) lkzVar.b;
        abxs abxsVar2 = llaVar14.h;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            llaVar14.h = abxsVar2.d(size2 + size2);
        }
        abus.m(arrayList, llaVar14.h);
    }

    final void E(llt lltVar, Object obj) {
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar = (llu) lltVar.b;
        llu lluVar2 = llu.a;
        lluVar.b &= -5;
        lluVar.e = llu.a.e;
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar3 = (llu) lltVar.b;
        lluVar3.b &= -9;
        lluVar3.f = 0L;
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar4 = (llu) lltVar.b;
        lluVar4.b &= -33;
        lluVar4.h = 0.0d;
        if (obj instanceof String) {
            String str = (String) obj;
            if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lltVar.y();
            }
            llu lluVar5 = (llu) lltVar.b;
            lluVar5.b |= 4;
            lluVar5.e = str;
            return;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lltVar.y();
            }
            llu lluVar6 = (llu) lltVar.b;
            lluVar6.b |= 8;
            lluVar6.f = jLongValue;
            return;
        }
        if (!(obj instanceof Double)) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Ignoring invalid (type) user attribute value", obj);
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar7 = (llu) lltVar.b;
        lluVar7.b |= 32;
        lluVar7.h = dDoubleValue;
    }

    final boolean G(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        klk klkVar = this.y.B;
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    final byte[] I(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Failed to gzip content", e);
            throw e;
        }
    }

    final boolean K(AppMetadata appMetadata) {
        kkk.k(appMetadata);
        return !TextUtils.isEmpty(appMetadata.b);
    }

    final long d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return e(str.getBytes(Charset.forName("UTF-8")));
    }

    final long e(byte[] bArr) {
        kkk.k(bArr);
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        lioVar.g();
        MessageDigest messageDigestE = lio.E();
        if (messageDigestE != null) {
            return lio.t(messageDigestE.digest(bArr));
        }
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.c.a("Failed to get MD5");
        return 0L;
    }

    final Bundle f(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lla llaVar = (lla) it.next();
            String str = llaVar.c;
            int i = llaVar.b;
            if ((i & 16) != 0) {
                bundle.putDouble(str, llaVar.g);
            } else if ((i & 8) != 0) {
                bundle.putFloat(str, llaVar.f);
            } else if ((i & 2) != 0) {
                bundle.putString(str, llaVar.d);
            } else if ((i & 4) != 0) {
                bundle.putLong(str, llaVar.e);
            }
        }
        return bundle;
    }

    final Bundle i(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(i((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    final Parcelable j(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (kkv unused) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    final EventParcel k(eqh eqhVar) {
        Object obj;
        Bundle bundleI = i(eqhVar.c, true);
        String string = (!bundleI.containsKey("_o") || (obj = bundleI.get("_o")) == null) ? "app" : obj.toString();
        String strB = lcu.b(eqhVar.a);
        if (strB == null) {
            strB = eqhVar.a;
        }
        return new EventParcel(strB, new EventParams(bundleI), string, eqhVar.b);
    }

    final TriggerUriParcel l(String str, lld lldVar, lkv lkvVar, String str2) {
        Iterator it;
        long j;
        int iIndexOf;
        aeuw.a.eV();
        kzf kzfVar = kzg.aP;
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        if (!ktxVar.t(str, kzfVar)) {
            return null;
        }
        klk klkVar = lbkVar.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = ktxVar.r(str, kzg.au).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            str3.getClass();
            if (!hashSet.add(str3)) {
                Objects.toString(str3);
                throw new IllegalArgumentException("duplicate element: ".concat(str3));
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        lhv lhvVar = this.m.j;
        String strH = lhvVar.ae().h(str);
        Uri.Builder builder = new Uri.Builder();
        ktx ktxVar2 = lhvVar.y.d;
        builder.scheme(ktxVar2.r(str, kzg.an));
        if (TextUtils.isEmpty(strH)) {
            builder.authority(ktxVar2.r(str, kzg.ao));
        } else {
            builder.authority(strH + "." + ktxVar2.r(str, kzg.ao));
        }
        builder.path(ktxVar2.r(str, kzg.ap));
        N(builder, "gmp_app_id", ((lle) lldVar.b).B, setUnmodifiableSet);
        kts ktsVar = ktxVar.y.c;
        N(builder, "gmp_version", "129017", setUnmodifiableSet);
        String str4 = ((lle) lldVar.b).x;
        kzf kzfVar2 = kzg.aS;
        if (ktxVar.t(str, kzfVar2) && ae().q(str)) {
            str4 = "";
        }
        N(builder, "app_instance_id", str4, setUnmodifiableSet);
        N(builder, "rdid", ((lle) lldVar.b).v, setUnmodifiableSet);
        N(builder, "bundle_id", ((lle) lldVar.b).r, setUnmodifiableSet);
        String str5 = ((lkw) lkvVar.b).d;
        String strA = lcu.a(str5);
        if (true != TextUtils.isEmpty(strA)) {
            str5 = strA;
        }
        N(builder, "app_event_name", str5, setUnmodifiableSet);
        N(builder, "app_version", String.valueOf(((lle) lldVar.b).F), setUnmodifiableSet);
        String strSubstring = ((lle) lldVar.b).m;
        if (ktxVar.t(str, kzfVar2) && ae().r(str) && !TextUtils.isEmpty(strSubstring) && (iIndexOf = strSubstring.indexOf(".")) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        N(builder, "os_version", strSubstring, setUnmodifiableSet);
        N(builder, "timestamp", String.valueOf(((lkw) lkvVar.b).e), setUnmodifiableSet);
        if (((lle) lldVar.b).w) {
            N(builder, "lat", "1", setUnmodifiableSet);
        }
        N(builder, "privacy_sandbox_version", String.valueOf(((lle) lldVar.b).X), setUnmodifiableSet);
        N(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        N(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        N(builder, "request_uuid", str2, setUnmodifiableSet);
        List<lla> listUnmodifiableList = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c);
        Bundle bundle = new Bundle();
        for (lla llaVar : listUnmodifiableList) {
            String str6 = llaVar.c;
            int i = llaVar.b;
            if ((i & 16) != 0) {
                bundle.putString(str6, String.valueOf(llaVar.g));
            } else if ((i & 8) != 0) {
                bundle.putString(str6, String.valueOf(llaVar.f));
            } else if ((i & 2) != 0) {
                bundle.putString(str6, llaVar.d);
            } else if ((i & 4) != 0) {
                bundle.putString(str6, String.valueOf(llaVar.e));
            }
        }
        L(builder, ktxVar.r(str, kzg.at).split("\\|"), bundle, setUnmodifiableSet);
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((lle) lldVar.b).f);
        Bundle bundle2 = new Bundle();
        Iterator it2 = listUnmodifiableList2.iterator();
        while (it2.hasNext()) {
            llu lluVar = (llu) it2.next();
            String str7 = lluVar.d;
            int i2 = lluVar.b;
            if ((i2 & 32) != 0) {
                it = it2;
                j = jCurrentTimeMillis;
                bundle2.putString(str7, String.valueOf(lluVar.h));
            } else {
                it = it2;
                j = jCurrentTimeMillis;
                if ((i2 & 16) != 0) {
                    bundle2.putString(str7, String.valueOf(lluVar.g));
                } else if ((i2 & 4) != 0) {
                    bundle2.putString(str7, lluVar.e);
                } else if ((i2 & 8) != 0) {
                    bundle2.putString(str7, String.valueOf(lluVar.f));
                }
            }
            it2 = it;
            jCurrentTimeMillis = j;
        }
        long j2 = jCurrentTimeMillis;
        L(builder, ktxVar.r(str, kzg.as).split("\\|"), bundle2, setUnmodifiableSet);
        N(builder, "dma", true != ((lle) lldVar.b).V ? "0" : "1", setUnmodifiableSet);
        if (!((lle) lldVar.b).W.isEmpty()) {
            N(builder, "dma_cps", ((lle) lldVar.b).W, setUnmodifiableSet);
        }
        lle lleVar = (lle) lldVar.b;
        if ((lleVar.c & 16777216) != 0) {
            lkg lkgVar = lleVar.aa;
            if (lkgVar == null) {
                lkgVar = lkg.a;
            }
            if (!lkgVar.c.isEmpty()) {
                N(builder, "dl_gclid", lkgVar.c, setUnmodifiableSet);
            }
            if (!lkgVar.d.isEmpty()) {
                N(builder, "dl_gbraid", lkgVar.d, setUnmodifiableSet);
            }
            if (!lkgVar.e.isEmpty()) {
                N(builder, "dl_gs", lkgVar.e, setUnmodifiableSet);
            }
            long j3 = lkgVar.f;
            if (j3 > 0) {
                N(builder, "dl_ss_ts", String.valueOf(j3), setUnmodifiableSet);
            }
            if (!lkgVar.g.isEmpty()) {
                N(builder, "mr_gclid", lkgVar.g, setUnmodifiableSet);
            }
            if (!lkgVar.h.isEmpty()) {
                N(builder, "mr_gbraid", lkgVar.h, setUnmodifiableSet);
            }
            if (!lkgVar.i.isEmpty()) {
                N(builder, "mr_gs", lkgVar.i, setUnmodifiableSet);
            }
            long j4 = lkgVar.j;
            if (j4 > 0) {
                N(builder, "mr_click_ts", String.valueOf(j4), setUnmodifiableSet);
            }
        }
        return new TriggerUriParcel(builder.build().toString(), j2, 1);
    }

    final lkw m(kum kumVar) {
        lkw lkwVar = lkw.a;
        lkv lkvVar = new lkv();
        if ((lkvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkvVar.y();
        }
        long j = kumVar.e;
        lkw lkwVar2 = (lkw) lkvVar.b;
        lkwVar2.b |= 4;
        lkwVar2.f = j;
        EventParams eventParams = kumVar.f;
        kuo kuoVar = new kuo(eventParams);
        while (kuoVar.hasNext()) {
            String next = kuoVar.next();
            lla llaVar = lla.a;
            lkz lkzVar = new lkz();
            if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lkzVar.y();
            }
            lla llaVar2 = (lla) lkzVar.b;
            next.getClass();
            llaVar2.b |= 1;
            llaVar2.c = next;
            Object obj = eventParams.a.get(next);
            kkk.k(obj);
            D(lkzVar, obj);
            lkvVar.b(lkzVar);
        }
        String str = kumVar.c;
        if (!TextUtils.isEmpty(str) && eventParams.a.get("_o") == null) {
            lla llaVar3 = lla.a;
            lkz lkzVar2 = new lkz();
            if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lkzVar2.y();
            }
            lla llaVar4 = (lla) lkzVar2.b;
            llaVar4.b |= 1;
            llaVar4.c = "_o";
            if ((Integer.MIN_VALUE & lkzVar2.b.memoizedSerializedSize) == 0) {
                lkzVar2.y();
            }
            lla llaVar5 = (lla) lkzVar2.b;
            str.getClass();
            llaVar5.b |= 2;
            llaVar5.d = str;
            lkvVar.c((lla) lkzVar2.v());
        }
        return (lkw) lkvVar.v();
    }

    final lla n(lkw lkwVar, String str) {
        for (lla llaVar : lkwVar.c) {
            if (llaVar.c.equals(str)) {
                return llaVar;
            }
        }
        return null;
    }

    final Object p(lkw lkwVar, String str) {
        lla llaVarN = n(lkwVar, str);
        if (llaVarN == null) {
            return null;
        }
        return r(llaVarN);
    }

    final Object q(lkw lkwVar, String str, Object obj) {
        Object objP = p(lkwVar, str);
        return objP == null ? obj : objP;
    }

    public final Object r(lla llaVar) {
        int i = llaVar.b;
        if ((i & 2) != 0) {
            return llaVar.d;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(llaVar.e);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(llaVar.g);
        }
        if (llaVar.h.size() > 0) {
            return J(llaVar.h);
        }
        return null;
    }

    final String s(llc llcVar) {
        if (llcVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if ((llcVar.b & 2) != 0) {
            C(sb, 0, "upload_subdomain", llcVar.e);
        }
        if ((llcVar.b & 1) != 0) {
            C(sb, 0, "sgtm_join_id", llcVar.d);
        }
        for (lle lleVar : llcVar.c) {
            if (lleVar != null) {
                A(sb, 1);
                sb.append("bundle {\n");
                if ((lleVar.b & 1) != 0) {
                    C(sb, 1, "protocol_version", Integer.valueOf(lleVar.d));
                }
                aevf.a.eV();
                lbk lbkVar = this.y;
                String str = lleVar.r;
                kzf kzfVar = kzg.aM;
                ktx ktxVar = lbkVar.d;
                if (ktxVar.t(str, kzfVar) && (lleVar.c & 8192) != 0) {
                    C(sb, 1, "session_stitching_token", lleVar.P);
                }
                C(sb, 1, "platform", lleVar.l);
                if ((lleVar.b & 16384) != 0) {
                    C(sb, 1, "gmp_version", Long.valueOf(lleVar.t));
                }
                if ((lleVar.b & 32768) != 0) {
                    C(sb, 1, "uploading_gmp_version", Long.valueOf(lleVar.u));
                }
                if ((lleVar.c & 16) != 0) {
                    C(sb, 1, "dynamite_version", Long.valueOf(lleVar.M));
                }
                if ((lleVar.b & 536870912) != 0) {
                    C(sb, 1, "config_version", Long.valueOf(lleVar.H));
                }
                C(sb, 1, "gmp_app_id", lleVar.B);
                C(sb, 1, "app_id", lleVar.r);
                C(sb, 1, "app_version", lleVar.s);
                if ((lleVar.b & 33554432) != 0) {
                    C(sb, 1, "app_version_major", Integer.valueOf(lleVar.F));
                }
                C(sb, 1, "firebase_instance_id", lleVar.E);
                if ((lleVar.b & 524288) != 0) {
                    C(sb, 1, "dev_cert_hash", Long.valueOf(lleVar.y));
                }
                C(sb, 1, "app_store", lleVar.q);
                if ((lleVar.b & 2) != 0) {
                    C(sb, 1, "upload_timestamp_millis", Long.valueOf(lleVar.g));
                }
                if ((lleVar.b & 4) != 0) {
                    C(sb, 1, "start_timestamp_millis", Long.valueOf(lleVar.h));
                }
                if ((lleVar.b & 8) != 0) {
                    C(sb, 1, "end_timestamp_millis", Long.valueOf(lleVar.i));
                }
                if ((lleVar.b & 16) != 0) {
                    C(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(lleVar.j));
                }
                if ((lleVar.b & 32) != 0) {
                    C(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(lleVar.k));
                }
                C(sb, 1, "app_instance_id", lleVar.x);
                C(sb, 1, "resettable_device_id", lleVar.v);
                C(sb, 1, "ds_id", lleVar.I);
                if ((lleVar.b & 131072) != 0) {
                    C(sb, 1, "limited_ad_tracking", Boolean.valueOf(lleVar.w));
                }
                C(sb, 1, "os_version", lleVar.m);
                C(sb, 1, "device_model", lleVar.n);
                C(sb, 1, "user_default_language", lleVar.o);
                if ((lleVar.b & 1024) != 0) {
                    C(sb, 1, "time_zone_offset_minutes", Integer.valueOf(lleVar.p));
                }
                if ((lleVar.b & 1048576) != 0) {
                    C(sb, 1, "bundle_sequential_index", Integer.valueOf(lleVar.z));
                }
                if ((lleVar.c & 8388608) != 0) {
                    C(sb, 1, "delivery_index", Integer.valueOf(lleVar.Z));
                }
                if ((lleVar.b & 8388608) != 0) {
                    C(sb, 1, "service_upload", Boolean.valueOf(lleVar.C));
                }
                C(sb, 1, "health_monitor", lleVar.A);
                if ((lleVar.c & 2) != 0) {
                    C(sb, 1, "retry_counter", Integer.valueOf(lleVar.J));
                }
                if ((lleVar.c & 128) != 0) {
                    C(sb, 1, "consent_signals", lleVar.O);
                }
                if ((lleVar.c & 262144) != 0) {
                    C(sb, 1, "is_dma_region", Boolean.valueOf(lleVar.V));
                }
                if ((lleVar.c & 524288) != 0) {
                    C(sb, 1, "core_platform_services", lleVar.W);
                }
                if ((lleVar.c & 131072) != 0) {
                    C(sb, 1, "consent_diagnostics", lleVar.U);
                }
                if ((lleVar.c & 32768) != 0) {
                    C(sb, 1, "target_os_version", Long.valueOf(lleVar.S));
                }
                aeuw.a.eV();
                if (ktxVar.t(lleVar.r, kzg.aP)) {
                    C(sb, 1, "ad_services_version", Integer.valueOf(lleVar.X));
                    if ((lleVar.c & 4194304) != 0) {
                        lki lkiVar = lleVar.Y;
                        if (lkiVar == null) {
                            lkiVar = lki.a;
                        }
                        if (lkiVar != null) {
                            A(sb, 2);
                            sb.append("attribution_eligibility_status {\n");
                            C(sb, 2, "eligible", Boolean.valueOf(lkiVar.c));
                            C(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(lkiVar.d));
                            C(sb, 2, "pre_r", Boolean.valueOf(lkiVar.e));
                            C(sb, 2, "r_extensions_too_old", Boolean.valueOf(lkiVar.f));
                            C(sb, 2, "adservices_extension_too_old", Boolean.valueOf(lkiVar.g));
                            C(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(lkiVar.h));
                            C(sb, 2, "measurement_manager_disabled", Boolean.valueOf(lkiVar.i));
                            A(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                if ((lleVar.c & 16777216) != 0) {
                    lkg lkgVar = lleVar.aa;
                    if (lkgVar == null) {
                        lkgVar = lkg.a;
                    }
                    A(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if ((lkgVar.b & 1) != 0) {
                        C(sb, 2, "deep_link_gclid", lkgVar.c);
                    }
                    if ((lkgVar.b & 2) != 0) {
                        C(sb, 2, "deep_link_gbraid", lkgVar.d);
                    }
                    if ((lkgVar.b & 4) != 0) {
                        C(sb, 2, "deep_link_gad_source", lkgVar.e);
                    }
                    if ((lkgVar.b & 8) != 0) {
                        C(sb, 2, "deep_link_session_millis", Long.valueOf(lkgVar.f));
                    }
                    if ((lkgVar.b & 16) != 0) {
                        C(sb, 2, "market_referrer_gclid", lkgVar.g);
                    }
                    if ((lkgVar.b & 32) != 0) {
                        C(sb, 2, "market_referrer_gbraid", lkgVar.h);
                    }
                    if ((lkgVar.b & 64) != 0) {
                        C(sb, 2, "market_referrer_gad_source", lkgVar.i);
                    }
                    if ((lkgVar.b & 128) != 0) {
                        C(sb, 2, "market_referrer_click_millis", Long.valueOf(lkgVar.j));
                    }
                    A(sb, 2);
                    sb.append("}\n");
                }
                if ((lleVar.c & 134217728) != 0) {
                    C(sb, 1, "batching_timestamp_millis", Long.valueOf(lleVar.ac));
                }
                if ((lleVar.c & 67108864) != 0) {
                    lls llsVar = lleVar.ab;
                    if (llsVar == null) {
                        llsVar = lls.a;
                    }
                    A(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int iA = llr.a(llsVar.c);
                    C(sb, 2, "upload_type", (iA == 0 || iA == 1) ? "UPLOAD_TYPE_UNKNOWN" : iA != 2 ? iA != 3 ? iA != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD");
                    lln llnVarB = lln.b(llsVar.d);
                    if (llnVarB == null) {
                        llnVarB = lln.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                    }
                    C(sb, 2, "client_upload_eligibility", llnVarB.name());
                    int iA2 = llp.a(llsVar.e);
                    C(sb, 2, "service_upload_eligibility", (iA2 == 0 || iA2 == 1) ? "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN" : iA2 != 2 ? iA2 != 3 ? iA2 != 4 ? iA2 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE");
                    A(sb, 2);
                    sb.append("}\n");
                }
                if ((lleVar.c & 536870912) != 0) {
                    lks lksVar = lleVar.ae;
                    if (lksVar == null) {
                        lksVar = lks.a;
                    }
                    A(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (lkp lkpVar : lksVar.b) {
                        A(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int iA3 = lkn.a(lkpVar.c);
                        C(sb, 3, "type", (iA3 == 0 || iA3 == 1) ? "CONSENT_TYPE_UNSPECIFIED" : iA3 != 2 ? iA3 != 3 ? iA3 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE");
                        int iA4 = lkr.a(lkpVar.d);
                        C(sb, 3, "mode", (iA4 == 0 || iA4 == 1) ? "NOT_LIMITED" : iA4 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE");
                        A(sb, 3);
                        sb.append("}\n");
                    }
                    A(sb, 2);
                    sb.append("}\n");
                }
                abxs<llu> abxsVar = lleVar.f;
                if (abxsVar != null) {
                    for (llu lluVar : abxsVar) {
                        if (lluVar != null) {
                            A(sb, 2);
                            sb.append("user_property {\n");
                            C(sb, 2, "set_timestamp_millis", (lluVar.b & 1) != 0 ? Long.valueOf(lluVar.c) : null);
                            C(sb, 2, "name", lbkVar.j.e(lluVar.d));
                            C(sb, 2, "string_value", lluVar.e);
                            C(sb, 2, "int_value", (lluVar.b & 8) != 0 ? Long.valueOf(lluVar.f) : null);
                            C(sb, 2, "double_value", (lluVar.b & 32) != 0 ? Double.valueOf(lluVar.h) : null);
                            A(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                abxs<lkk> abxsVar2 = lleVar.D;
                if (abxsVar2 != null) {
                    for (lkk lkkVar : abxsVar2) {
                        if (lkkVar != null) {
                            A(sb, 2);
                            sb.append("audience_membership {\n");
                            if ((lkkVar.b & 1) != 0) {
                                C(sb, 2, "audience_id", Integer.valueOf(lkkVar.c));
                            }
                            if ((lkkVar.b & 8) != 0) {
                                C(sb, 2, "new_audience", Boolean.valueOf(lkkVar.f));
                            }
                            lli lliVar = lkkVar.d;
                            if (lliVar == null) {
                                lliVar = lli.a;
                            }
                            O(sb, "current_data", lliVar);
                            if ((lkkVar.b & 4) != 0) {
                                lli lliVar2 = lkkVar.e;
                                if (lliVar2 == null) {
                                    lliVar2 = lli.a;
                                }
                                O(sb, "previous_data", lliVar2);
                            }
                            A(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                abxs<lkw> abxsVar3 = lleVar.e;
                if (abxsVar3 != null) {
                    for (lkw lkwVar : abxsVar3) {
                        if (lkwVar != null) {
                            A(sb, 2);
                            sb.append("event {\n");
                            C(sb, 2, "name", lbkVar.j.c(lkwVar.d));
                            if ((lkwVar.b & 2) != 0) {
                                C(sb, 2, "timestamp_millis", Long.valueOf(lkwVar.e));
                            }
                            if ((lkwVar.b & 4) != 0) {
                                C(sb, 2, "previous_timestamp_millis", Long.valueOf(lkwVar.f));
                            }
                            if ((lkwVar.b & 8) != 0) {
                                C(sb, 2, "count", Integer.valueOf(lkwVar.g));
                            }
                            if (lkwVar.c.size() != 0) {
                                M(sb, 2, lkwVar.c);
                            }
                            A(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                A(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final String t(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    final List v(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.f.b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    lbk lbkVar2 = this.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.f.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final Map x(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(x((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(x((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(x((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void y(lkv lkvVar, String str, Object obj) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c);
        int i = 0;
        while (true) {
            if (i >= listUnmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((lla) listUnmodifiableList.get(i)).c)) {
                break;
            } else {
                i++;
            }
        }
        lla llaVar = lla.a;
        lkz lkzVar = new lkz();
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar2 = (lla) lkzVar.b;
        llaVar2.b |= 1;
        llaVar2.c = str;
        long jLongValue = ((Long) obj).longValue();
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar3 = (lla) lkzVar.b;
        llaVar3.b |= 4;
        llaVar3.e = jLongValue;
        if (i >= 0) {
            lkvVar.e(i, lkzVar);
        } else {
            lkvVar.b(lkzVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.StringBuilder r6, int r7, defpackage.liu r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lik.z(java.lang.StringBuilder, int, liu):void");
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
