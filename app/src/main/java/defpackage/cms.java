package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms {
    public static final int a(cah cahVar) {
        cahVar.getClass();
        int iOrdinal = cahVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new agpg();
    }

    public static final int b(ccq ccqVar) {
        ccqVar.getClass();
        int iOrdinal = ccqVar.ordinal();
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
                        throw new agpg();
                    }
                }
            }
        }
        return i;
    }

    public static final cah c(int i) {
        if (i == 0) {
            return cah.a;
        }
        if (i == 1) {
            return cah.b;
        }
        throw new IllegalArgumentException(a.a(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final ccq d(int i) {
        if (i == 0) {
            return ccq.a;
        }
        if (i == 1) {
            return ccq.b;
        }
        if (i == 2) {
            return ccq.c;
        }
        if (i == 3) {
            return ccq.d;
        }
        if (i == 4) {
            return ccq.e;
        }
        if (i == 5) {
            return ccq.f;
        }
        throw new IllegalArgumentException(a.a(i, "Could not convert ", " to State"));
    }

    public static final cnh e(byte[] bArr) {
        if (bArr.length == 0) {
            return new cnh(null);
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
                        cbx.c();
                        Log.w(cnh.a, "Ignoring adding capability '" + i6 + '\'', e);
                    }
                }
                int[] iArr3 = cni.a;
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = iArr3[i7];
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i3) {
                            break;
                        }
                        if (i8 == iArr2[i9]) {
                            if (i9 < 0) {
                                break;
                            }
                        } else {
                            i9++;
                        }
                    }
                    try {
                        builder.removeCapability(i8);
                        break;
                    } catch (IllegalArgumentException e2) {
                        cbx.c();
                        Log.w(cnh.a, "Ignoring removing default capability '" + i8 + '\'', e2);
                    }
                }
                for (int i10 = 0; i10 < i; i10++) {
                    builder.addTransportType(iArr[i10]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                cnh cnhVar = new cnh(networkRequestBuild);
                aguc.a(objectInputStream, null);
                aguc.a(byteArrayInputStream, null);
                return cnhVar;
            } finally {
            }
        } finally {
        }
    }

    public static final Set f(byte[] bArr) {
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
                    linkedHashSet.add(new cap(uri, z));
                }
                aguc.a(objectInputStream, null);
                aguc.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] g(cnh cnhVar) {
        int[] iArrE;
        int[] iArrE2;
        Object obj = cnhVar.b;
        if (obj == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArr = cni.a;
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrE = ((NetworkRequest) obj).getTransportTypes();
                    iArrE.getClass();
                } else {
                    int[] iArr2 = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr2[i];
                        if (((NetworkRequest) obj).hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    iArrE = agqq.E(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrE2 = ((NetworkRequest) obj).getCapabilities();
                    iArrE2.getClass();
                } else {
                    int[] iArr3 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 30; i3++) {
                        int i4 = iArr3[i3];
                        if (((NetworkRequest) obj).hasCapability(i4)) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    iArrE2 = agqq.E(arrayList2);
                }
                objectOutputStream.writeInt(iArrE.length);
                for (int i5 : iArrE) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(iArrE2.length);
                for (int i6 : iArrE2) {
                    objectOutputStream.writeInt(i6);
                }
                aguc.a(objectOutputStream, null);
                aguc.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] h(Set set) {
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
                    cap capVar = (cap) it.next();
                    objectOutputStream.writeUTF(capVar.a.toString());
                    objectOutputStream.writeBoolean(capVar.b);
                }
                aguc.a(objectOutputStream, null);
                aguc.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int i(int i) {
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
                        throw new IllegalArgumentException("Could not convert " + ((Object) cby.a(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static final int j(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static final int k(int i) {
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
            throw new IllegalArgumentException(a.a(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.a(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }
}
