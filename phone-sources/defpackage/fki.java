package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fki {
    public fki() {
    }

    public static int A(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long B(edi ediVar, int i, int i2) {
        ediVar.K(i);
        if (ediVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iE = ediVar.e();
        if ((8388608 & iE) != 0 || ((iE >> 8) & 8191) != i2 || (iE & 32) == 0 || ediVar.j() < 7 || ediVar.a() < 7 || (ediVar.j() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ediVar.F(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }

    public static int C(edh edhVar, int i, int i2, int i3) {
        a.H(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        udo.b(udo.b(i4, i5), 1 << i3);
        if (edhVar.a() < i) {
            return -1;
        }
        int iD = edhVar.d(i);
        if (iD != i4) {
            return iD;
        }
        if (edhVar.a() < i2) {
            return -1;
        }
        int iD2 = edhVar.d(i2);
        int i6 = iD + iD2;
        if (iD2 != i5) {
            return i6;
        }
        if (edhVar.a() < i3) {
            return -1;
        }
        return i6 + edhVar.d(i3);
    }

    public static void D(edh edhVar) {
        edhVar.n(3);
        edhVar.n(8);
        boolean zP = edhVar.p();
        boolean zP2 = edhVar.p();
        if (zP) {
            edhVar.n(5);
        }
        if (zP2) {
            edhVar.n(6);
        }
    }

    public static void E(edh edhVar) {
        int iD;
        int iD2 = edhVar.d(2);
        if (iD2 == 0) {
            edhVar.n(6);
            return;
        }
        int iC = C(edhVar, 5, 8, 16) + 1;
        if (iD2 == 1) {
            edhVar.n(iC * 7);
            return;
        }
        if (iD2 == 2) {
            boolean zP = edhVar.p();
            int i = true != zP ? 5 : 1;
            int i2 = true == zP ? 7 : 5;
            int i3 = true == zP ? 8 : 6;
            int i4 = 0;
            while (i4 < iC) {
                if (edhVar.p()) {
                    edhVar.n(7);
                    iD = 0;
                } else {
                    if (edhVar.d(2) == 3 && edhVar.d(i2) * i != 0) {
                        edhVar.m();
                    }
                    iD = edhVar.d(i3) * i;
                    if (iD != 0 && iD != 180) {
                        edhVar.m();
                    }
                    edhVar.m();
                }
                if (iD != 0 && iD != 180 && edhVar.p()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static boolean F(edh edhVar) {
        edhVar.n(3);
        boolean zP = edhVar.p();
        if (zP) {
            edhVar.n(13);
        }
        return zP;
    }

    public static fkp G(fkp fkpVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (fkpVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (fkp) map.get(strArr[0]);
            }
            if (length2 > 1) {
                fkp fkpVar2 = new fkp();
                while (i < length2) {
                    fkpVar2.d((fkp) map.get(strArr[i]));
                    i++;
                }
                return fkpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fkpVar.d((fkp) map.get(strArr[0]));
                return fkpVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    fkpVar.d((fkp) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return fkpVar;
    }

    public static int H(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static ead I(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrAu = edt.au(str, "=");
            if (strArrAu.length != 2) {
                edb.e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrAu[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ffw.d(new edi(Base64.decode(strArrAu[1], 0))));
                } catch (RuntimeException e) {
                    edb.f("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new fgy(strArrAu[0], strArrAu[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ead(arrayList);
    }

    public static boolean J(int i, edi ediVar, boolean z) throws eaf {
        if (ediVar.a() < 7) {
            if (z) {
                return false;
            }
            throw new eaf("too short header: " + ediVar.a(), null, true, 1);
        }
        if (ediVar.j() != i) {
            if (z) {
                return false;
            }
            throw new eaf("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null, true, 1);
        }
        if (ediVar.j() == 118 && ediVar.j() == 111 && ediVar.j() == 114 && ediVar.j() == 98 && ediVar.j() == 105 && ediVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new eaf("expected characters 'vorbis'", null, true, 1);
    }

    public static int[] K(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int L(fel felVar, dyu dyuVar, int i, boolean z) {
        return felVar.g(dyuVar, i, z);
    }

    public static void M(fel felVar, edi ediVar, int i) {
        felVar.d(ediVar, i, 0);
    }

    public static int N(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static long O(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? WVMediaCrypto.TYPE << (i4 & 1) : (i4 & 3) == 3 ? 60000 : WVMediaCrypto.TYPE << r6);
    }

    public static List P(byte[] bArr) {
        long jN = N(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(bg(bf(jN)));
        arrayList.add(bg(bf(3840L)));
        return arrayList;
    }

    public static boolean Q(long j, long j2) {
        return j - j2 <= bf(3840L) / 1000;
    }

    public static ead R(fdq fdqVar, boolean z) {
        ead eadVarD = new dhq((char[]) null).D(fdqVar, z ? null : fgh.a);
        if (eadVarD == null || eadVarD.a() == 0) {
            return null;
        }
        return eadVarD;
    }

    public static fse S(edi ediVar) {
        ediVar.L(1);
        int iL = ediVar.l();
        long j = ediVar.b;
        long j2 = iL;
        int i = iL / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jQ = ediVar.q();
            if (jQ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jQ;
            jArrCopyOf2[i2] = ediVar.q();
            ediVar.L(2);
            i2++;
        }
        ediVar.L((int) ((j + j2) - ediVar.b));
        return new fse(jArrCopyOf, jArrCopyOf2);
    }

    public static int T(edi ediVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ediVar.j() + 1;
            case 7:
                return ediVar.n() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static int U(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:0: B:3:0x0001->B:14:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[EDGE_INSN: B:17:0x003c->B:15:0x003c BREAK  A[LOOP:0: B:3:0x0001->B:14:0x003a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int V(defpackage.fdq r9, byte[] r10, int r11, int r12) {
        /*
            r0 = 0
        L1:
            if (r0 >= r12) goto L3c
            int r1 = r11 + r0
            int r5 = r12 - r0
            r2 = r9
            fdi r2 = (defpackage.fdi) r2
            r2.h(r5)
            int r3 = r2.e
            int r4 = r2.d
            int r3 = r3 - r4
            r8 = -1
            if (r3 != 0) goto L27
            byte[] r3 = r2.c
            r6 = 0
            r7 = 1
            int r3 = r2.b(r3, r4, r5, r6, r7)
            if (r3 != r8) goto L21
            r3 = r8
            goto L37
        L21:
            int r4 = r2.e
            int r4 = r4 + r3
            r2.e = r4
            goto L2b
        L27:
            int r3 = java.lang.Math.min(r5, r3)
        L2b:
            byte[] r4 = r2.c
            int r5 = r2.d
            java.lang.System.arraycopy(r4, r5, r10, r1, r3)
            int r1 = r2.d
            int r1 = r1 + r3
            r2.d = r1
        L37:
            if (r3 != r8) goto L3a
            goto L3c
        L3a:
            int r0 = r0 + r3
            goto L1
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fki.V(fdq, byte[], int, int):int");
    }

    public static void W(boolean z, String str) throws eaf {
        if (!z) {
            throw new eaf(str, null, true, 1);
        }
    }

    public static boolean X(fdq fdqVar, byte[] bArr, int i, int i2) {
        try {
            fdqVar.j(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean Y(fdq fdqVar, int i) {
        try {
            fdqVar.l(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean Z(fdq fdqVar, byte[] bArr, int i, boolean z) throws EOFException {
        try {
            return fdqVar.n(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static fix a(fji fjiVar, byte[] bArr, int i) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        fjiVar.c(bArr, 0, i, fjh.a, new ecq() { // from class: fje
            @Override // defpackage.ecq
            public final void a(Object obj) {
                builder.add((ImmutableList.Builder) obj);
            }
        });
        return new fiu(builder.build());
    }

    public static int aA(gpx gpxVar) {
        gpxVar.getClass();
        int iOrdinal = gpxVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new yfu();
                    }
                }
            }
        }
        return i;
    }

    public static gpx aB(int i) {
        if (i == 0) {
            return gpx.a;
        }
        if (i == 1) {
            return gpx.b;
        }
        if (i == 2) {
            return gpx.c;
        }
        if (i == 3) {
            return gpx.d;
        }
        if (i == 4) {
            return gpx.e;
        }
        if (i == 5) {
            return gpx.f;
        }
        throw new IllegalArgumentException(a.cd(i, "Could not convert ", " to State"));
    }

    public static gvm aC(byte[] bArr) {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new gvm((Object) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (IllegalArgumentException e) {
                        gpn.b();
                        Log.w(gvm.a, "Ignoring adding capability '" + i6 + '\'', e);
                    }
                }
                int[] iArr3 = gvn.a;
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = iArr3[i7];
                    if (!yfm.bb(iArr2, i8)) {
                        try {
                            builder.removeCapability(i8);
                        } catch (IllegalArgumentException e2) {
                            gpn.b();
                            Log.w(gvm.a, "Ignoring removing default capability '" + i8 + '\'', e2);
                        }
                    }
                }
                for (int i9 = 0; i9 < i; i9++) {
                    builder.addTransportType(iArr[i9]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                gvm gvmVar = new gvm(networkRequestBuild);
                wef.v(objectInputStream, null);
                wef.v(byteArrayInputStream, null);
                return gvmVar;
            } finally {
            }
        } finally {
        }
    }

    public static Set aD(byte[] bArr) {
        ObjectInputStream objectInputStream;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z = objectInputStream.readBoolean();
                    uri.getClass();
                    linkedHashSet.add(new got(uri, z));
                }
                wef.v(objectInputStream, null);
                wef.v(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static byte[] aE(gvm gvmVar) {
        Object obj;
        int[] iArrAt;
        int[] iArrAt2;
        if (Build.VERSION.SDK_INT < 28 || (obj = gvmVar.b) == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArr = gvn.a;
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrAt = ((NetworkRequest) obj).getTransportTypes();
                    iArrAt.getClass();
                } else {
                    int[] iArr2 = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr2[i];
                        if (((NetworkRequest) obj).hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    iArrAt = yfm.at(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrAt2 = ((NetworkRequest) obj).getCapabilities();
                    iArrAt2.getClass();
                } else {
                    int[] iArr3 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 30; i3++) {
                        int i4 = iArr3[i3];
                        if (((NetworkRequest) obj).hasCapability(i4)) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    iArrAt2 = yfm.at(arrayList2);
                }
                objectOutputStream.writeInt(iArrAt.length);
                for (int i5 : iArrAt) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(iArrAt2.length);
                for (int i6 : iArrAt2) {
                    objectOutputStream.writeInt(i6);
                }
                wef.v(objectOutputStream, null);
                wef.v(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static byte[] aF(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    got gotVar = (got) it.next();
                    objectOutputStream.writeUTF(gotVar.a.toString());
                    objectOutputStream.writeBoolean(gotVar.b);
                }
                wef.v(objectOutputStream, null);
                wef.v(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static int aG(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static int aH(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + ((Object) aW(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static int aI(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static int aJ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.cd(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static int aK(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.cd(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int aL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.cd(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static gun aM(guw guwVar) {
        guwVar.getClass();
        return new gun(guwVar.b, guwVar.s);
    }

    public static long aN(boolean z, int i, int i2, long j, long j2, int i3, boolean z2, long j3, long j4, long j5, long j6) {
        int i4;
        long jN;
        if (i2 == 0) {
            throw null;
        }
        if (j6 != Long.MAX_VALUE && z2) {
            return i3 == 0 ? j6 : ykn.m(j6, j2 + 900000);
        }
        if (z) {
            jN = ykn.n(i2 == 2 ? j * i : (long) Math.scalb(j, i - 1), 18000000L);
        } else {
            if (!z2) {
                if (j2 == -1) {
                    return Long.MAX_VALUE;
                }
                return j2 + j3;
            }
            if (i3 == 0) {
                j2 += j3;
                i4 = 0;
            } else {
                j2 += j5;
                i4 = i3;
            }
            if (j4 == j5 || i4 != 0) {
                return j2;
            }
            jN = j5 - j4;
        }
        return j2 + jN;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fse aO(defpackage.zcj r21, defpackage.gzg r22, java.util.Date r23, java.lang.String r24, java.util.Date r25, java.lang.String r26, java.util.Date r27, long r28, long r30, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fki.aO(zcj, gzg, java.util.Date, java.lang.String, java.util.Date, java.lang.String, java.util.Date, long, long, java.lang.String, int):fse");
    }

    public static guj aP(gun gunVar, int i) {
        return new guj(gunVar.a, gunVar.b, i);
    }

    public static void aQ(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            gpn.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            gpn.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }

    public static File aR(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static gqw aS(boolean z) {
        gqx gqxVar = new gqx();
        return z ? new gqy(gqxVar) : gqxVar;
    }

    public static gqw aT() {
        return aS(true);
    }

    public static uhp aU(Executor executor, yjk yjkVar) {
        return cqv.w(new gqd(executor, yjkVar, 0));
    }

    public static gpz aV(Context context) {
        context.getClass();
        return grs.h(context);
    }

    public static /* synthetic */ String aW(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public static void aX(final Object obj, final riv rivVar, final bkp bkpVar, yjv yjvVar, bkd bkdVar, final buo buoVar, float f, int i, final yka ykaVar, bao baoVar, final int i2, final int i3) {
        int i4;
        riv rivVar2;
        bkd bkdVar2;
        float f2;
        int i5;
        yjv yjvVar2;
        float f3;
        bao baoVar2;
        bkd bkdVar3;
        final bkd bkdVar4;
        final float f4;
        final yjv yjvVar3;
        final int i6;
        rivVar.getClass();
        ykaVar.getClass();
        bao baoVarD = baoVar.d(1166576943);
        if ((i2 & 6) == 0) {
            i4 = (true != baoVarD.H(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            rivVar2 = rivVar;
            i4 |= true != baoVarD.H(rivVar2) ? 128 : 256;
        } else {
            rivVar2 = rivVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i7 = i4 | 1794048;
        if ((12582912 & i2) == 0) {
            i7 |= true != baoVarD.F(buoVar) ? 4194304 : 8388608;
        }
        int i8 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((i3 & 48) == 0) {
            i8 |= true == baoVarD.H(ykaVar) ? 32 : 16;
        }
        int i9 = i8;
        int i10 = i7 | 905969664;
        if ((306783379 & i10) == 306783378 && (i9 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjvVar3 = yjvVar;
            bkdVar4 = bkdVar;
            f4 = f;
            baoVar2 = baoVarD;
            i6 = i;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                yjv yjvVar4 = gxa.a;
                bkdVar2 = bkb.e;
                f2 = 1.0f;
                i5 = 1;
                yjvVar2 = yjvVar4;
            } else {
                baoVarD.t();
                yjvVar2 = yjvVar;
                bkdVar2 = bkdVar;
                f2 = f;
                i5 = i;
            }
            baoVarD.m();
            gzu gzuVarAq = aq(gxj.b(obj, baoVarD), buoVar, baoVarD);
            int i11 = i10 >> 9;
            gxa gxaVarAY = aY(gzuVarAq, rivVar2, yjvVar2, buoVar, i5, baoVarD);
            yjv yjvVar5 = yjvVar2;
            int i12 = i5;
            hak hakVar = gzuVarAq.u;
            if (hakVar instanceof gxe) {
                bkd bkdVar5 = bkdVar2;
                baoVarD.x(-1380126636);
                f3 = f2;
                baoVar2 = baoVarD;
                wv.i(bkpVar, bkdVar5, true, bga.k(-2086024075, new gxi(hakVar, ykaVar, gxaVarAY, bkdVar5, buoVar, f3), baoVarD), baoVar2, (i11 & 14) | 3456 | ((i10 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                bkdVar3 = bkdVar5;
                ((bas) baoVar2).aa();
            } else {
                baoVarD.x(-1380768739);
                bvt bvtVarA = xo.a(bkdVar2, true);
                int iK = a.k(zy.p(baoVarD));
                bas basVar = (bas) baoVarD;
                bhu bhuVarAi = basVar.ai();
                bkp bkpVarC = bdi.C(baoVarD, bkpVar);
                yjk yjkVar = bxt.a;
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA, bxt.d);
                beb.a(baoVarD, bhuVarAi, bxt.c);
                yjz yjzVar = bxt.e;
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    basVar.ae(numValueOf);
                    baoVarD.i(numValueOf, yjzVar);
                }
                beb.a(baoVarD, bkpVarC, bxt.b);
                bkd bkdVar6 = bkdVar2;
                float f5 = f2;
                ykaVar.a(new gxg(xs.a, gxaVarAY, bkdVar6, buoVar, f5), baoVarD, Integer.valueOf(i9 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                baoVarD.o();
                basVar.aa();
                bkdVar3 = bkdVar6;
                f3 = f5;
                baoVar2 = baoVarD;
            }
            bkdVar4 = bkdVar3;
            f4 = f3;
            yjvVar3 = yjvVar5;
            i6 = i12;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: gxh
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar3 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    riv rivVar3 = rivVar;
                    bkp bkpVar2 = bkpVar;
                    yjv yjvVar6 = yjvVar3;
                    bkd bkdVar7 = bkdVar4;
                    buo buoVar2 = buoVar;
                    float f6 = f4;
                    int i13 = i6;
                    int i14 = i2;
                    fki.aX(obj4, rivVar3, bkpVar2, yjvVar6, bkdVar7, buoVar2, f6, i13, ykaVar, baoVar3, bdi.n(i14 | 1), bdi.n(i3));
                    return ygi.a;
                }
            };
        }
    }

    public static gxa aY(Object obj, riv rivVar, yjv yjvVar, buo buoVar, int i, bao baoVar) {
        baoVar.x(-2020614074);
        gzu gzuVarB = gxj.b(obj, baoVar);
        Object obj2 = gzuVarB.b;
        if (obj2 instanceof gzs) {
            bk("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new yfs();
        }
        if (obj2 instanceof bng) {
            ao("ImageBitmap");
            throw new yfs();
        }
        if (obj2 instanceof bqm) {
            ao("ImageVector");
            throw new yfs();
        }
        if (obj2 instanceof bqh) {
            ao("Painter");
            throw new yfs();
        }
        if (gzuVarB.c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        baoVar.x(1849434622);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (objT == ban.a) {
            objT = new gxa(gzuVarB, rivVar);
            basVar.ae(objT);
        }
        gxa gxaVar = (gxa) objT;
        basVar.aa();
        yjvVar.getClass();
        gxaVar.b = yjvVar;
        buoVar.getClass();
        gxaVar.c = buoVar;
        gxaVar.d = i;
        gxaVar.e = ((Boolean) baoVar.f(cde.a)).booleanValue();
        gxaVar.h.b(rivVar);
        gzuVarB.getClass();
        gxaVar.g.b(gzuVarB);
        gxaVar.cb();
        basVar.aa();
        return gxaVar;
    }

    public static void aZ(final Object obj, final riv rivVar, final bkp bkpVar, yjv yjvVar, bkd bkdVar, final buo buoVar, float f, int i, bao baoVar, final int i2, final int i3) {
        int i4;
        riv rivVar2;
        yjv yjvVar2;
        float f2;
        bkd bkdVar2;
        int i5;
        final bkd bkdVar3;
        final float f3;
        final yjv yjvVar3;
        final int i6;
        rivVar.getClass();
        bao baoVarD = baoVar.d(-2030202961);
        if ((i2 & 6) == 0) {
            i4 = (true != baoVarD.H(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            rivVar2 = rivVar;
            i4 |= true != baoVarD.H(rivVar2) ? 128 : 256;
        } else {
            rivVar2 = rivVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i7 = i4 | 1794048;
        if ((12582912 & i2) == 0) {
            i7 |= true != baoVarD.F(buoVar) ? 4194304 : 8388608;
        }
        int i8 = (i3 & 6) == 0 ? i3 | 2 : i3;
        int i9 = i7 | 905969664;
        if ((306783379 & i9) == 306783378 && (i8 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            yjvVar3 = yjvVar;
            bkdVar3 = bkdVar;
            f3 = f;
            i6 = i;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                yjvVar2 = gxa.a;
                f2 = 1.0f;
                bkdVar2 = bkb.e;
                i5 = 1;
            } else {
                baoVarD.t();
                yjvVar2 = yjvVar;
                bkdVar2 = bkdVar;
                f2 = f;
                i5 = i;
            }
            baoVarD.m();
            gzu gzuVarAq = aq(gxj.b(obj, baoVarD), buoVar, baoVarD);
            int i10 = i9 >> 9;
            riv rivVar3 = rivVar2;
            yjv yjvVar4 = yjvVar2;
            gxa gxaVarAY = aY(gzuVarAq, rivVar3, yjvVar4, buoVar, i5, baoVarD);
            int i11 = i5;
            hak hakVar = gzuVarAq.u;
            bkd bkdVar4 = bkdVar2;
            float f4 = f2;
            ap(hakVar instanceof gxe ? bkpVar.a((bkp) hakVar) : bkpVar, gxaVarAY, bkdVar4, buoVar, f4, baoVarD, ((i9 << 3) & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10));
            bkdVar3 = bkdVar4;
            f3 = f4;
            yjvVar3 = yjvVar4;
            i6 = i11;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: gwo
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar2 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    riv rivVar4 = rivVar;
                    bkp bkpVar2 = bkpVar;
                    yjv yjvVar5 = yjvVar3;
                    bkd bkdVar5 = bkdVar3;
                    buo buoVar2 = buoVar;
                    float f5 = f3;
                    int i12 = i2;
                    fki.aZ(obj4, rivVar4, bkpVar2, yjvVar5, bkdVar5, buoVar2, f5, i6, baoVar2, bdi.n(i12 | 1), bdi.n(i3));
                    return ygi.a;
                }
            };
        }
    }

    public static void aa(long j, edi ediVar, fel[] felVarArr) {
        int iE;
        while (true) {
            if (ediVar.a() <= 1) {
                return;
            }
            int iBh = bh(ediVar);
            int iBh2 = bh(ediVar);
            int i = ediVar.b + iBh2;
            if (iBh2 == -1 || iBh2 > ediVar.a()) {
                edb.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i = ediVar.c;
            } else if (iBh == 4 && iBh2 >= 8) {
                int iJ = ediVar.j();
                int iN = ediVar.n();
                if (iN == 49) {
                    iE = ediVar.e();
                    iN = 49;
                } else {
                    iE = 0;
                }
                int iJ2 = ediVar.j();
                if (iN == 47) {
                    ediVar.L(1);
                    iN = 47;
                }
                boolean z = iJ == 181 && (iN == 49 || iN == 47) && iJ2 == 3;
                if (iN == 49) {
                    z &= iE == 1195456820;
                }
                if (z) {
                    ab(j, ediVar, felVarArr);
                }
            }
            ediVar.K(i);
        }
    }

    public static void ab(long j, edi ediVar, fel[] felVarArr) {
        int iJ = ediVar.j();
        if ((iJ & 64) != 0) {
            int i = iJ & 31;
            ediVar.L(1);
            int i2 = ediVar.b;
            for (fel felVar : felVarArr) {
                int i3 = i * 3;
                ediVar.K(i2);
                felVar.c(ediVar, i3);
                a.ab(j != -9223372036854775807L);
                felVar.e(j, 1, i3, 0, null);
            }
        }
    }

    public static boolean ac(edi ediVar, fdu fduVar, boolean z, rsj rsjVar) {
        try {
            long jT = ediVar.t();
            if (!z) {
                jT *= fduVar.b;
            }
            rsjVar.a = jT;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean ad(defpackage.edi r23, defpackage.fdu r24, int r25, defpackage.rsj r26) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fki.ad(edi, fdu, int, rsj):boolean");
    }

    public static void ae(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            edb.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static boolean af(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static fht ag(ezf ezfVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iT = ezfVar.t();
        int i = 0;
        for (int i2 = 0; i2 < iT; i2++) {
            if (ezfVar.v(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new fht(1, 0, iT, i);
    }

    public static obk ah(byte[] bArr, int i) {
        ArrayList arrayListBj;
        int iE;
        edi ediVar = new edi(bArr);
        try {
            ediVar.L(4);
            iE = ediVar.e();
            ediVar.K(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (iE == 1886547818) {
            ediVar.L(8);
            int i2 = ediVar.b;
            int i3 = ediVar.c;
            while (i2 < i3) {
                int iE2 = ediVar.e() + i2;
                if (iE2 > i2 && iE2 <= i3) {
                    int iE3 = ediVar.e();
                    if (iE3 != 2037673328 && iE3 != 1836279920) {
                        ediVar.K(iE2);
                        i2 = iE2;
                    }
                    ediVar.J(iE2);
                    arrayListBj = bj(ediVar);
                    break;
                }
                break;
            }
            arrayListBj = null;
        } else {
            arrayListBj = bj(ediVar);
        }
        if (arrayListBj != null) {
            int size = arrayListBj.size();
            if (size == 1) {
                dhq dhqVar = (dhq) arrayListBj.get(0);
                return new obk(dhqVar, dhqVar, i);
            }
            if (size == 2) {
                return new obk((dhq) arrayListBj.get(0), (dhq) arrayListBj.get(1), i);
            }
        }
        return null;
    }

    public static dhq ai(edi ediVar, boolean z, boolean z2) throws eaf {
        if (z) {
            J(3, ediVar, false);
        }
        ediVar.y((int) ediVar.p());
        long jP = ediVar.p();
        String[] strArr = new String[(int) jP];
        for (int i = 0; i < jP; i++) {
            strArr[i] = ediVar.y((int) ediVar.p());
        }
        if (z2 && (ediVar.j() & 1) == 0) {
            throw new eaf("framing bit expected to be set", null, true, 1);
        }
        return new dhq(strArr);
    }

    public static boolean aj(String str) {
        return ylh.y("Content-Length", str, true) || ylh.y("Content-Encoding", str, true) || ylh.y("Content-Type", str, true);
    }

    public static boolean ak(String str) {
        return (ylh.y("Connection", str, true) || ylh.y("Keep-Alive", str, true) || ylh.y("Proxy-Authenticate", str, true) || ylh.y("Proxy-Authorization", str, true) || ylh.y("TE", str, true) || ylh.y("Trailers", str, true) || ylh.y("Transfer-Encoding", str, true) || ylh.y("Upgrade", str, true)) ? false : true;
    }

    public static gxu al(zgm zgmVar, Context context) {
        return new gxw(zgmVar, hat.a(context), null);
    }

    public static gxu am(zhe zheVar, zgr zgrVar, String str, Closeable closeable) {
        zgrVar.getClass();
        return new gxt(zheVar, zgrVar, str, closeable);
    }

    public static double an(int i, int i2, int i3, int i4, int i5) {
        double d = i2;
        double d2 = i3 / i;
        double d3 = i4 / d;
        return i5 + (-1) != 0 ? Math.min(d2, d3) : Math.max(d2, d3);
    }

    static /* synthetic */ void ao(String str) {
        bk(str, a.cg(str, "If you wish to display this ", ", use androidx.compose.foundation.Image."));
    }

    public static void ap(final bkp bkpVar, final bqh bqhVar, final bkd bkdVar, final buo buoVar, final float f, bao baoVar, final int i) {
        int i2;
        bkpVar.getClass();
        bqhVar.getClass();
        bkdVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(10290533);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(bqhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkdVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(buoVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.C(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 524288 : 1048576;
        }
        if ((i2 & 599187) == 599186 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = bga.x(bkpVar).a(new gxf(bqhVar, bkdVar, buoVar, f));
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = xn.g;
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            basVar.aa();
            int iK = a.k(zy.p(baoVarD));
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            bhu bhuVarAi = basVar.ai();
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            beb.a(baoVarD, bkpVarC, bxt.b);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: gwn
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    bqh bqhVar2 = bqhVar;
                    bkd bkdVar2 = bkdVar;
                    buo buoVar2 = buoVar;
                    fki.ap(bkpVar2, bqhVar2, bkdVar2, buoVar2, f, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static gzu aq(gzu gzuVar, buo buoVar, bao baoVar) {
        hak hahVar;
        gzuVar.getClass();
        buoVar.getClass();
        baoVar.x(402368983);
        if (gzuVar.w.a == null) {
            if (yks.e(buoVar, bun.d)) {
                hahVar = new hah(haj.a);
            } else {
                baoVar.x(1849434622);
                bas basVar = (bas) baoVar;
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = new gxe();
                    basVar.ae(objT);
                }
                hahVar = (gxe) objT;
                basVar.aa();
            }
            gzs gzsVarA = gzu.a(gzuVar);
            gzsVarA.d(hahVar);
            gzuVar = gzsVarA.a();
        }
        ((bas) baoVar).aa();
        return gzuVar;
    }

    public static void ar(gyy gyyVar, Class cls, List list) {
        list.add(new yfw(gyyVar, cls));
    }

    public static void as(gyh gyhVar, Class cls, List list) {
        list.add(new yfw(gyhVar, cls));
    }

    public static void at(gyv gyvVar, Class cls, List list) {
        list.add(new yfw(gyvVar, cls));
    }

    public static int au(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.z().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        av(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    public static void av(WorkDatabase workDatabase, String str, int i) {
        workDatabase.z().b(new gue(str, Long.valueOf(i)));
    }

    public static guw aw(List list, guw guwVar) throws Throwable {
        guw guwVarF;
        list.getClass();
        boolean zB = guwVar.f.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zB2 = guwVar.f.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zB3 = guwVar.f.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (!zB && zB2 && zB3) {
            String str = guwVar.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gli.A(guwVar.f, linkedHashMap);
            gli.D("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str, linkedHashMap);
            guwVarF = guw.f(guwVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", gli.y(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            guwVarF = guwVar;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return guwVarF;
        }
        gou gouVar = guwVarF.k;
        String str2 = guwVarF.d;
        if (yks.e(str2, ConstraintTrackingWorker.class.getName())) {
            return guwVarF;
        }
        if (!gouVar.e && !gouVar.f) {
            return guwVarF;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        gli.A(guwVarF.f, linkedHashMap2);
        gli.D("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2, linkedHashMap2);
        gox goxVarY = gli.y(linkedHashMap2);
        String name = ConstraintTrackingWorker.class.getName();
        name.getClass();
        return guw.f(guwVarF, null, null, name, goxVarY, 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    public static void ax(grs grsVar, String str) {
        gsb gsbVarA;
        WorkDatabase workDatabase = grsVar.c;
        workDatabase.getClass();
        gux guxVarD = workDatabase.D();
        gub gubVarY = workDatabase.y();
        List listT = yfm.t(str);
        while (!listT.isEmpty()) {
            String str2 = (String) yfm.E(listT);
            gpx gpxVarB = guxVarD.b(str2);
            if (gpxVarB != gpx.c && gpxVarB != gpx.d) {
                guxVarD.A(str2);
            }
            listT.addAll(gubVarY.a(str2));
        }
        gqr gqrVar = grsVar.e;
        gqrVar.getClass();
        synchronized (gqrVar.i) {
            gpn.b();
            gqrVar.g.add(str);
            gsbVarA = gqrVar.a(str);
        }
        gqr.f(gsbVarA, 1);
        Iterator it = grsVar.d.iterator();
        while (it.hasNext()) {
            ((gqt) it.next()).b(str);
        }
    }

    public static void ay(String str, grs grsVar) {
        str.getClass();
        WorkDatabase workDatabase = grsVar.c;
        workDatabase.getClass();
        workDatabase.q(new bd((Object) workDatabase, (Object) str, (Object) grsVar, 15, (char[]) null));
    }

    public static void az(grs grsVar) {
        gqv.a(grsVar.h, grsVar.c, grsVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.fix r17, defpackage.fjh r18, defpackage.ecq r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            long r5 = r1.b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r9 = 0
            if (r3 != 0) goto L14
            r10 = r9
            goto L2e
        L14:
            int r4 = r0.b(r5)
            r7 = -1
            if (r4 != r7) goto L1f
            int r4 = r0.a()
        L1f:
            if (r4 <= 0) goto L2d
            int r7 = r4 + (-1)
            long r10 = r0.c(r7)
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 != 0) goto L2d
            r10 = r7
            goto L2e
        L2d:
            r10 = r4
        L2e:
            if (r3 == 0) goto L53
            int r3 = r0.a()
            if (r10 >= r3) goto L53
            java.util.List r4 = r0.e(r5)
            long r7 = r0.c(r10)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L53
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L53
            long r7 = r7 - r5
            fit r3 = new fit
            r3.<init>(r4, r5, r7)
            r2.a(r3)
            r3 = 1
            goto L54
        L53:
            r3 = r9
        L54:
            r4 = r10
        L55:
            int r7 = r0.a()
            if (r4 >= r7) goto L61
            be(r0, r4, r2)
            int r4 = r4 + 1
            goto L55
        L61:
            boolean r1 = r1.c
            if (r1 == 0) goto L89
            if (r3 == 0) goto L69
            int r10 = r10 + (-1)
        L69:
            if (r9 >= r10) goto L71
            be(r0, r9, r2)
            int r9 = r9 + 1
            goto L69
        L71:
            if (r3 == 0) goto L89
            fit r11 = new fit
            java.util.List r12 = r0.e(r5)
            long r13 = r0.c(r10)
            long r0 = r0.c(r10)
            long r15 = r5 - r0
            r11.<init>(r12, r13, r15)
            r2.a(r11)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fki.b(fix, fjh, ecq):void");
    }

    public static cb ba(gqw gqwVar, guw guwVar) {
        guwVar.getClass();
        return gqwVar.d(aM(guwVar));
    }

    public static gps bb(gli gliVar, final String str, final Executor executor, final yjk yjkVar) {
        executor.getClass();
        final dvv dvvVar = new dvv(gps.b);
        return new gpt(cqv.w(new coo() { // from class: gpu
            @Override // defpackage.coo
            public final Object a(com comVar) {
                executor.execute(new ejr(str, yjkVar, dvvVar, comVar, 9));
                return ygi.a;
            }
        }));
    }

    public static void bc(fse fseVar, cb cbVar) {
        cbVar.getClass();
        fseVar.M(cbVar, -512);
    }

    public static gxu bd(zgm zgmVar, Context context, fki fkiVar) {
        return new gxw(zgmVar, hat.a(context), fkiVar);
    }

    private static void be(fix fixVar, int i, ecq ecqVar) {
        long jC = fixVar.c(i);
        List listE = fixVar.e(jC);
        if (listE.isEmpty()) {
            return;
        }
        if (i == fixVar.a() - 1) {
            throw new IllegalStateException();
        }
        long jC2 = fixVar.c(i + 1) - fixVar.c(i);
        if (jC2 > 0) {
            ecqVar.a(new fit(listE, jC, jC2));
        }
    }

    private static long bf(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] bg(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static int bh(edi ediVar) {
        int i = 0;
        while (ediVar.a() != 0) {
            int iJ = ediVar.j();
            i += iJ;
            if (iJ != 255) {
                return i;
            }
        }
        return -1;
    }

    private static int bi(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList bj(defpackage.edi r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fki.bj(edi):java.util.ArrayList");
    }

    private static void bk(String str, String str2) {
        throw new IllegalArgumentException(a.cz(str2, str, "Unsupported type: ", ". "));
    }

    public static byte[] c(List list, long j) {
        ArrayList<? extends Parcelable> arrayListB = ecm.b(list, new eyt(4));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static UUID d(byte[] bArr) {
        rld rldVarN = n(bArr);
        if (rldVarN == null) {
            return null;
        }
        return (UUID) rldVarN.c;
    }

    public static byte[] e(UUID uuid, byte[] bArr) {
        return f(uuid, null, bArr);
    }

    public static byte[] f(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || (length = bArr.length) == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] g(byte[] bArr, UUID uuid) {
        rld rldVarN = n(bArr);
        if (rldVarN == null) {
            return null;
        }
        Object obj = rldVarN.c;
        if (uuid.equals(obj)) {
            return (byte[]) rldVarN.d;
        }
        edb.e("PsshAtomUtil", "UUID mismatch. Expected: " + String.valueOf(uuid) + ", got: " + obj.toString() + ".");
        return null;
    }

    public static String h(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((fif) it.next()).a.g.Y;
            if (eae.p(str2)) {
                return "video/mp4";
            }
            if (eae.l(str2)) {
                z = true;
            } else if (eae.n(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static int i(edi ediVar) {
        int iE = ediVar.e();
        if (ediVar.e() == 1684108385) {
            ediVar.L(8);
            int i = iE - 16;
            if (i == 1) {
                return ediVar.j();
            }
            if (i == 2) {
                return ediVar.n();
            }
            if (i == 3) {
                return ediVar.l();
            }
            if (i == 4 && (ediVar.d() & 128) == 0) {
                return ediVar.m();
            }
        }
        edb.e("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static fgi j(int i, String str, edi ediVar, boolean z, boolean z2) {
        int i2 = i(ediVar);
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new fgn(str, null, ImmutableList.of(Integer.toString(i2))) : new fgf("und", str, Integer.toString(i2));
        }
        edb.e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(edy.e(i)));
        return null;
    }

    public static fgn k(int i, String str, edi ediVar) {
        int iE = ediVar.e();
        if (ediVar.e() == 1684108385 && iE >= 22) {
            ediVar.L(10);
            int iN = ediVar.n();
            if (iN > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iN);
                String string = sb.toString();
                int iN2 = ediVar.n();
                if (iN2 > 0) {
                    string = string + "/" + iN2;
                }
                return new fgn(str, null, ImmutableList.of(string));
            }
        }
        edb.e("MetadataUtil", "Failed to parse index/count attribute: ".concat(edy.e(i)));
        return null;
    }

    public static fgn l(int i, String str, edi ediVar) {
        int iE = ediVar.e();
        if (ediVar.e() == 1684108385) {
            ediVar.L(8);
            return new fgn(str, null, ImmutableList.of(ediVar.x(iE - 16)));
        }
        edb.e("MetadataUtil", "Failed to parse text attribute: ".concat(edy.e(i)));
        return null;
    }

    public static long m(fea feaVar, long j) {
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return edt.A((j * feaVar.g) - 1, feaVar.d);
    }

    public static rld n(byte[] bArr) {
        UUID[] uuidArr;
        edi ediVar = new edi(bArr);
        if (ediVar.c < 32) {
            return null;
        }
        ediVar.K(0);
        int iA = ediVar.a();
        int iE = ediVar.e();
        if (iE != iA) {
            edb.e("PsshAtomUtil", a.ce(iA, iE, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int iE2 = ediVar.e();
        if (iE2 != 1886614376) {
            edb.e("PsshAtomUtil", a.cf(iE2, "Atom type is not pssh: "));
            return null;
        }
        int iB = fhs.b(ediVar.e());
        if (iB > 1) {
            edb.e("PsshAtomUtil", a.cf(iB, "Unsupported pssh version: "));
            return null;
        }
        UUID uuid = new UUID(ediVar.q(), ediVar.q());
        if (iB == 1) {
            int iM = ediVar.m();
            uuidArr = new UUID[iM];
            for (int i = 0; i < iM; i++) {
                uuidArr[i] = new UUID(ediVar.q(), ediVar.q());
            }
        } else {
            uuidArr = null;
        }
        int iM2 = ediVar.m();
        int iA2 = ediVar.a();
        if (iM2 != iA2) {
            edb.e("PsshAtomUtil", a.ce(iA2, iM2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[iM2];
        ediVar.F(bArr2, 0, iM2);
        return new rld(uuid, iB, bArr2, uuidArr);
    }

    public static void o(List list, Set set) {
        for (int i = 0; i < list.size(); i++) {
            set.add(new fqw(((Integer) list.get(i)).intValue()));
        }
    }

    public static void p(Set set) {
        o(fqw.a, set);
    }

    public static fqr q(eah eahVar, int i, fqz fqzVar, ean eanVar, ean eanVar2, int i2, eai eaiVar, int i3, boolean z, eay eayVar, int i4, ebo eboVar, eab eabVar, float f, dyo dyoVar, ecb ecbVar, dyx dyxVar, boolean z2, int i5, boolean z3, boolean z4, int i6, int i7, eab eabVar2, long j, long j2, long j3, ebh ebhVar, ebf ebfVar) {
        fqz fqzVar2;
        boolean z5 = true;
        if (eayVar.q()) {
            fqzVar2 = fqzVar;
        } else {
            fqzVar2 = fqzVar;
            if (fqzVar2.f.f >= eayVar.c()) {
                z5 = false;
            }
        }
        a.ab(z5);
        return new fqr(eahVar, i, fqzVar2, eanVar, eanVar2, i2, eaiVar, i3, z, eboVar, eayVar, i4, eabVar, f, dyoVar, ecbVar, dyxVar, z2, i5, i6, i7, z3, z4, eabVar2, j, j2, j3, ebhVar, ebfVar);
    }

    public static eak r(eak eakVar, eak eakVar2) {
        if (eakVar == null || eakVar2 == null) {
            return eak.a;
        }
        int[] iArr = eaj.a;
        rin rinVar = new rin(null, null);
        for (int i = 0; i < eakVar.b(); i++) {
            if (eakVar2.d(eakVar.a(i))) {
                rinVar.j(eakVar.a(i));
            }
        }
        return eaj.a(rinVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(eao eaoVar, fnx fnxVar) {
        int i = fnxVar.b;
        if (i == -1) {
            if (eaoVar.q(20)) {
                ImmutableList immutableList = fnxVar.a;
                ((fqt) eaoVar).aC();
                ((dzg) eaoVar).a.ao(immutableList);
                return;
            }
            ImmutableList immutableList2 = fnxVar.a;
            if (immutableList2.isEmpty()) {
                return;
            }
            dzy dzyVar = (dzy) immutableList2.get(0);
            ((fqt) eaoVar).aC();
            ((dyq) ((dzg) eaoVar).a).ao(ImmutableList.of(dzyVar));
            return;
        }
        if (eaoVar.q(20)) {
            ImmutableList immutableList3 = fnxVar.a;
            long j = fnxVar.c;
            ((fqt) eaoVar).aC();
            ((dzg) eaoVar).a.aa(immutableList3, i, j);
            return;
        }
        ImmutableList immutableList4 = fnxVar.a;
        if (immutableList4.isEmpty()) {
            return;
        }
        dzy dzyVar2 = (dzy) immutableList4.get(0);
        long j2 = fnxVar.c;
        ((fqt) eaoVar).aC();
        ((dyq) ((dzg) eaoVar).a).aa(ImmutableList.of(dzyVar2), 0, j2);
    }

    public static uhp t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((dzy) it.next()).c == null) {
                return sfy.B(new UnsupportedOperationException());
            }
        }
        return sfy.C(list);
    }

    public static fnu u(fny fnyVar) {
        boolean z = fnyVar instanceof fnp;
        return new fnu(z ? fnu.b : fnu.a, fnu.c, null, null);
    }

    public static uhp v() {
        return sfy.C(new fra(-6));
    }

    public static uhp w() {
        return sfy.B(new UnsupportedOperationException());
    }

    public static uhp x() {
        return sfy.C(new fra(-6));
    }

    public static uhp y() {
        return sfy.C(new fra(-6));
    }

    public static uhp z(fnt fntVar, List list, final int i, final long j) {
        return edt.Q(fntVar.g(list), new ufw() { // from class: fns
            @Override // defpackage.ufw
            public final uhp a(Object obj) {
                return sfy.C(new fnx((List) obj, i, j));
            }
        });
    }

    public fki(short[] sArr) {
    }

    public fki(List list) {
        DesugarCollections.unmodifiableList(list);
    }

    public fki(char[] cArr, byte[] bArr, byte[] bArr2) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }
}
