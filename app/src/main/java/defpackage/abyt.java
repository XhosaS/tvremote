package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyt implements abzj {
    public static final int[] a = new int[0];
    public static final Unsafe b = acah.d();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final MessageLite g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final acaa m;
    private final abwm n;
    private final abyd o;
    private final abym p;

    public abyt(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, int[] iArr2, int i3, int i4, abyd abydVar, acaa acaaVar, abwm abwmVar, abym abymVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = messageLite instanceof abxd;
        boolean z = false;
        if (abwmVar != null && (messageLite instanceof abwz)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.o = abydVar;
        this.m = acaaVar;
        this.n = abwmVar;
        this.g = messageLite;
        this.p = abymVar;
    }

    private final Object A(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object B(Object obj, int i) {
        abzj abzjVarY = y(i);
        int iV = v(i) & 1048575;
        if (!N(obj, i)) {
            return abzjVarY.e();
        }
        Object object = b.getObject(obj, iV);
        if (Q(object)) {
            return object;
        }
        Object objE = abzjVarY.e();
        if (object != null) {
            abzjVarY.h(objE, object);
        }
        return objE;
    }

    private final Object C(Object obj, int i, int i2) {
        abzj abzjVarY = y(i2);
        if (!R(obj, i, i2)) {
            return abzjVarY.e();
        }
        Object object = b.getObject(obj, v(i2) & 1048575);
        if (Q(object)) {
            return object;
        }
        Object objE = abzjVarY.e();
        if (object != null) {
            abzjVarY.h(objE, object);
        }
        return objE;
    }

    private static void D(Object obj) {
        if (!Q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void E(Object obj, Object obj2, int i) {
        if (N(obj2, i)) {
            int iV = v(i) & 1048575;
            Unsafe unsafe = b;
            long j = iV;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.c[i] + " is present but null: " + obj2.toString());
            }
            abzj abzjVarY = y(i);
            if (!N(obj, i)) {
                if (Q(object)) {
                    Object objE = abzjVarY.e();
                    abzjVarY.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                H(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!Q(object2)) {
                Object objE2 = abzjVarY.e();
                abzjVarY.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            abzjVarY.h(object2, object);
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        int[] iArr = this.c;
        int i2 = iArr[i];
        if (R(obj2, i2, i)) {
            int iV = v(i) & 1048575;
            Unsafe unsafe = b;
            long j = iV;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            abzj abzjVarY = y(i);
            if (!R(obj, i2, i)) {
                if (Q(object)) {
                    Object objE = abzjVarY.e();
                    abzjVarY.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                I(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!Q(object2)) {
                Object objE2 = abzjVarY.e();
                abzjVarY.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            abzjVarY.h(object2, object);
        }
    }

    private final void G(Object obj, int i, abzd abzdVar) {
        long j = i & 1048575;
        if (M(i)) {
            acah.a.a.putObject(obj, j, abzdVar.v());
        } else if (this.i) {
            acah.a.a.putObject(obj, j, abzdVar.u());
        } else {
            acah.a.a.putObject(obj, j, abzdVar.o());
        }
    }

    private final void H(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        Unsafe unsafe = acah.a.a;
        unsafe.putInt(obj, j, (1 << (iS >>> 20)) | unsafe.getInt(obj, j));
    }

    private final void I(Object obj, int i, int i2) {
        acah.a.a.putInt(obj, s(i2) & 1048575, i);
    }

    private final void J(Object obj, int i, Object obj2) {
        b.putObject(obj, v(i) & 1048575, obj2);
        H(obj, i);
    }

    private final void K(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, v(i2) & 1048575, obj2);
        I(obj, i, i2);
    }

    private final boolean L(Object obj, Object obj2, int i) {
        return N(obj, i) == N(obj2, i);
    }

    private static boolean M(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean N(Object obj, int i) {
        int iS = s(i);
        long j = iS & 1048575;
        if (j != 1048575) {
            return (acah.a.a.getInt(obj, j) & (1 << (iS >>> 20))) != 0;
        }
        int iV = v(i);
        long j2 = iV & 1048575;
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(acah.a.b(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(acah.a.c(obj, j2)) != 0;
            case 2:
                return acah.a.a.getLong(obj, j2) != 0;
            case 3:
                return acah.a.a.getLong(obj, j2) != 0;
            case 4:
                return acah.a.a.getInt(obj, j2) != 0;
            case 5:
                return acah.a.a.getLong(obj, j2) != 0;
            case 6:
                return acah.a.a.getInt(obj, j2) != 0;
            case 7:
                return acah.a.i(obj, j2);
            case 8:
                Object object = acah.a.a.getObject(obj, j2);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof abvo) {
                    return !abvo.b.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return acah.a.a.getObject(obj, j2) != null;
            case 10:
                return !abvo.b.equals(acah.a.a.getObject(obj, j2));
            case 11:
                return acah.a.a.getInt(obj, j2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return acah.a.a.getInt(obj, j2) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return acah.a.a.getInt(obj, j2) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return acah.a.a.getLong(obj, j2) != 0;
            case 15:
                return acah.a.a.getInt(obj, j2) != 0;
            case 16:
                return acah.a.a.getLong(obj, j2) != 0;
            case 17:
                return acah.a.a.getObject(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean O(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? N(obj, i) : (i3 & i4) != 0;
    }

    private static boolean P(Object obj, int i, abzj abzjVar) {
        return abzjVar.l(acah.a.a.getObject(obj, i & 1048575));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((obj instanceof abxd) && (((abxd) obj).memoizedSerializedSize & Integer.MIN_VALUE) == 0) ? false : true;
    }

    private final boolean R(Object obj, int i, int i2) {
        return acah.a.a.getInt(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean S(Object obj, long j) {
        return ((Boolean) acah.a.a.getObject(obj, j)).booleanValue();
    }

    private final void T(int i, Object obj, abwa abwaVar) {
        if (obj instanceof String) {
            abwaVar.a.t(i, (String) obj);
        } else {
            abwaVar.a.h(i, (abvo) obj);
        }
    }

    static acab d(Object obj) {
        abxd abxdVar = (abxd) obj;
        acab acabVar = abxdVar.unknownFields;
        if (acabVar != acab.a) {
            return acabVar;
        }
        acab acabVar2 = new acab();
        abxdVar.unknownFields = acabVar2;
        return acabVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) acah.a.a.getObject(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) acah.a.a.getObject(obj, j)).floatValue();
    }

    private final int p(byte[] bArr, int i, int i2, acap acapVar, Class cls, abuz abuzVar) {
        acap acapVar2 = acap.DOUBLE;
        switch (acapVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                abuzVar.c = Double.valueOf(Double.longBitsToDouble(abva.y(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                abuzVar.c = Float.valueOf(Float.intBitsToFloat(abva.b(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iU = abva.u(bArr, i, abuzVar);
                abuzVar.c = Long.valueOf(abuzVar.b);
                return iU;
            case 4:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int iR = abva.r(bArr, i, abuzVar);
                abuzVar.c = Integer.valueOf(abuzVar.a);
                return iR;
            case 5:
            case 15:
                int i5 = i + 8;
                abuzVar.c = Long.valueOf(abva.y(bArr, i));
                return i5;
            case 6:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i6 = i + 4;
                abuzVar.c = Integer.valueOf(abva.b(bArr, i));
                return i6;
            case 7:
                int iU2 = abva.u(bArr, i, abuzVar);
                abuzVar.c = Boolean.valueOf(abuzVar.b != 0);
                return iU2;
            case 8:
                return abva.p(bArr, i, abuzVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return abva.d(abza.a.a(cls), bArr, i, i2, abuzVar);
            case 11:
                return abva.a(bArr, i, abuzVar);
            case 16:
                int iR2 = abva.r(bArr, i, abuzVar);
                abuzVar.c = Integer.valueOf(abvt.H(abuzVar.a));
                return iR2;
            case 17:
                int iU3 = abva.u(bArr, i, abuzVar);
                abuzVar.c = Long.valueOf(abvt.J(abuzVar.b));
                return iU3;
        }
    }

    private static int q(Object obj, long j) {
        return ((Integer) acah.a.a.getObject(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int[] iArr = this.c;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(Object obj, long j) {
        return ((Long) acah.a.a.getObject(obj, j)).longValue();
    }

    private final abxh x(int i) {
        int i2 = i / 3;
        return (abxh) this.d[i2 + i2 + 1];
    }

    private final abzj y(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        abzj abzjVar = (abzj) objArr[i3];
        if (abzjVar != null) {
            return abzjVar;
        }
        abzj abzjVarA = abza.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = abzjVarA;
        return abzjVarA;
    }

    private final Object z(Object obj, int i, Object obj2, acaa acaaVar, Object obj3) {
        abxh abxhVarX;
        int i2 = this.c[i];
        Object object = acah.a.a.getObject(obj, v(i) & 1048575);
        if (object == null || (abxhVarX = x(i)) == null) {
            return obj2;
        }
        abyj abyjVar = ((abyk) A(i)).a;
        Iterator it = ((abyl) object).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!abxhVarX.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = acaaVar.a(obj3);
                }
                int iA = abyk.a(abyjVar, entry.getKey(), entry.getValue());
                abvo abvoVar = abvo.b;
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                try {
                    abyk.b(abvwVar, abyjVar, entry.getKey(), entry.getValue());
                    acaaVar.f(obj2, i2, abvk.a(abvwVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0557  */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.a(java.lang.Object):int");
    }

    @Override // defpackage.abzj
    public final int b(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                int iHashCode = (i4 * 53) + ((abxd) obj).unknownFields.hashCode();
                return this.h ? (iHashCode * 53) + ((abwz) obj).n.b.hashCode() : iHashCode;
            }
            int iV = v(i3);
            int i5 = 1048575 & iV;
            int iU = u(iV);
            int i6 = iArr[i3];
            long j = i5;
            int iHashCode2 = 37;
            switch (iU) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(acah.a.b(obj, j));
                    Charset charset = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(acah.a.c(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = acah.a.a.getLong(obj, j);
                    Charset charset2 = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = acah.a.a.getLong(obj, j);
                    Charset charset3 = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = acah.a.a.getLong(obj, j);
                    Charset charset4 = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    iFloatToIntBits = abxt.a(acah.a.i(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    iFloatToIntBits = ((String) acah.a.a.getObject(obj, j)).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object object = acah.a.a.getObject(obj, j);
                    if (object != null) {
                        iHashCode2 = object.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i = i4 * 53;
                    jDoubleToLongBits = acah.a.a.getLong(obj, j);
                    Charset charset5 = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getInt(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = acah.a.a.getLong(obj, j);
                    Charset charset6 = abxt.a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object object2 = acah.a.a.getObject(obj, j);
                    if (object2 != null) {
                        iHashCode2 = object2.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(n(obj, j));
                        Charset charset7 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 52:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(o(obj, j));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 53:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = w(obj, j);
                        Charset charset8 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 54:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = w(obj, j);
                        Charset charset9 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 55:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 56:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = w(obj, j);
                        Charset charset10 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 57:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 58:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = abxt.a(S(obj, j));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 59:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = ((String) acah.a.a.getObject(obj, j)).hashCode();
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 60:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 61:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 62:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 63:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 64:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 65:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = w(obj, j);
                        Charset charset11 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 66:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = q(obj, j);
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 67:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        jDoubleToLongBits = w(obj, j);
                        Charset charset12 = abxt.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                        break;
                    }
                case 68:
                    if (!R(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        iFloatToIntBits = acah.a.a.getObject(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.abuz r39) {
        /*
            Method dump skipped, instructions count: 3910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.c(java.lang.Object, byte[], int, int, int, abuz):int");
    }

    @Override // defpackage.abzj
    public final Object e() {
        return (abxd) ((abxd) this.g).cM(4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = Q(r9)
            if (r0 != 0) goto L8
            goto L9b
        L8:
            boolean r0 = r9 instanceof defpackage.abxd
            r1 = 0
            if (r0 == 0) goto L1f
            r0 = r9
            abxd r0 = (defpackage.abxd) r0
            int r2 = r0.memoizedSerializedSize
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r3
            r0.memoizedSerializedSize = r2
            r0.memoizedHashCode = r1
            r0.memoizedSerializedSize = r3
        L1f:
            int[] r0 = r8.c
            r2 = r1
        L22:
            int r3 = r0.length
            if (r2 >= r3) goto L8d
            int r3 = r8.v(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = u(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L77
            r6 = 60
            if (r3 == r6) goto L61
            r6 = 68
            if (r3 == r6) goto L61
            switch(r3) {
                case 17: goto L77;
                case 18: goto L53;
                case 19: goto L53;
                case 20: goto L53;
                case 21: goto L53;
                case 22: goto L53;
                case 23: goto L53;
                case 24: goto L53;
                case 25: goto L53;
                case 26: goto L53;
                case 27: goto L53;
                case 28: goto L53;
                case 29: goto L53;
                case 30: goto L53;
                case 31: goto L53;
                case 32: goto L53;
                case 33: goto L53;
                case 34: goto L53;
                case 35: goto L53;
                case 36: goto L53;
                case 37: goto L53;
                case 38: goto L53;
                case 39: goto L53;
                case 40: goto L53;
                case 41: goto L53;
                case 42: goto L53;
                case 43: goto L53;
                case 44: goto L53;
                case 45: goto L53;
                case 46: goto L53;
                case 47: goto L53;
                case 48: goto L53;
                case 49: goto L53;
                case 50: goto L42;
                default: goto L41;
            }
        L41:
            goto L8a
        L42:
            sun.misc.Unsafe r3 = defpackage.abyt.b
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L8a
            r7 = r6
            abyl r7 = (defpackage.abyl) r7
            r7.b = r1
            r3.putObject(r9, r4, r6)
            goto L8a
        L53:
            acag r3 = defpackage.acah.a
            sun.misc.Unsafe r3 = r3.a
            java.lang.Object r3 = r3.getObject(r9, r4)
            abxs r3 = (defpackage.abxs) r3
            r3.b()
            goto L8a
        L61:
            r3 = r0[r2]
            boolean r3 = r8.R(r9, r3, r2)
            if (r3 == 0) goto L8a
            abzj r3 = r8.y(r2)
            sun.misc.Unsafe r6 = defpackage.abyt.b
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.g(r4)
            goto L8a
        L77:
            boolean r3 = r8.N(r9, r2)
            if (r3 == 0) goto L8a
            abzj r3 = r8.y(r2)
            sun.misc.Unsafe r6 = defpackage.abyt.b
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.g(r4)
        L8a:
            int r2 = r2 + 3
            goto L22
        L8d:
            acaa r0 = r8.m
            r0.h(r9)
            boolean r0 = r8.h
            if (r0 == 0) goto L9b
            abwm r0 = r8.n
            r0.c(r9)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.g(java.lang.Object):void");
    }

    @Override // defpackage.abzj
    public final void h(Object obj, Object obj2) {
        Object obj3;
        D(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                Object obj4 = obj;
                abzk.r(obj4, obj2);
                if (this.h) {
                    abzk.n(this.n, obj4, obj2);
                    return;
                }
                return;
            }
            int iV = v(i);
            int i2 = 1048575 & iV;
            int iU = u(iV);
            int i3 = iArr[i];
            long j = i2;
            switch (iU) {
                case 0:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        acag acagVar = acah.a;
                        acagVar.g(obj3, j, acagVar.b(obj2, j));
                        H(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        acag acagVar2 = acah.a;
                        acagVar2.h(obj3, j, acagVar2.c(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe = acah.a.a;
                        unsafe.putLong(obj3, j, unsafe.getLong(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe2 = acah.a.a;
                        unsafe2.putLong(obj3, j, unsafe2.getLong(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe3 = acah.a.a;
                        unsafe3.putInt(obj3, j, unsafe3.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe4 = acah.a.a;
                        unsafe4.putLong(obj3, j, unsafe4.getLong(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe5 = acah.a.a;
                        unsafe5.putInt(obj3, j, unsafe5.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        acag acagVar3 = acah.a;
                        acagVar3.e(obj3, j, acagVar3.i(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe6 = acah.a.a;
                        unsafe6.putObject(obj3, j, unsafe6.getObject(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 9:
                    obj3 = obj;
                    E(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                case 10:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe7 = acah.a.a;
                        unsafe7.putObject(obj3, j, unsafe7.getObject(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe8 = acah.a.a;
                        unsafe8.putInt(obj3, j, unsafe8.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe9 = acah.a.a;
                        unsafe9.putInt(obj3, j, unsafe9.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe10 = acah.a.a;
                        unsafe10.putInt(obj3, j, unsafe10.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe11 = acah.a.a;
                        unsafe11.putLong(obj3, j, unsafe11.getLong(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (N(obj2, i)) {
                        Unsafe unsafe12 = acah.a.a;
                        unsafe12.putInt(obj3, j, unsafe12.getInt(obj2, j));
                        H(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 16:
                    if (N(obj2, i)) {
                        Unsafe unsafe13 = acah.a.a;
                        obj3 = obj;
                        unsafe13.putLong(obj3, j, unsafe13.getLong(obj2, j));
                        H(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    E(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    Unsafe unsafe14 = acah.a.a;
                    abxs abxsVarD = (abxs) unsafe14.getObject(obj, j);
                    abxs abxsVar = (abxs) unsafe14.getObject(obj2, j);
                    int size = abxsVarD.size();
                    int size2 = abxsVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!abxsVarD.c()) {
                            abxsVarD = abxsVarD.d(size2 + size);
                        }
                        abxsVarD.addAll(abxsVar);
                    }
                    if (size > 0) {
                        abxsVar = abxsVarD;
                    }
                    unsafe14.putObject(obj, j, abxsVar);
                    break;
                case 50:
                    abym abymVar = this.p;
                    acaa acaaVar = abzk.a;
                    Unsafe unsafe15 = acah.a.a;
                    unsafe15.putObject(obj, j, abymVar.a(unsafe15.getObject(obj, j), unsafe15.getObject(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (R(obj2, i3, i)) {
                        Unsafe unsafe16 = acah.a.a;
                        unsafe16.putObject(obj, j, unsafe16.getObject(obj2, j));
                        I(obj, i3, i);
                        break;
                    }
                    break;
                case 60:
                    F(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (R(obj2, i3, i)) {
                        Unsafe unsafe17 = acah.a.a;
                        unsafe17.putObject(obj, j, unsafe17.getObject(obj2, j));
                        I(obj, i3, i);
                        break;
                    }
                    break;
                case 68:
                    F(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x033d, code lost:
    
        r2.put(r11, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0340, code lost:
    
        ((defpackage.abvu) r23).a.A(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x034a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03f1, code lost:
    
        r1 = r15;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03f6, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:285:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08b7 A[LOOP:2: B:296:0x08b3->B:298:0x08b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0877 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0883 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x032c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r22, defpackage.abzd r23, com.google.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.i(java.lang.Object, abzd, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // defpackage.abzj
    public final void j(Object obj, byte[] bArr, int i, int i2, abuz abuzVar) {
        c(obj, bArr, i, i2, 0, abuzVar);
    }

    @Override // defpackage.abzj
    public final boolean k(Object obj, Object obj2) {
        boolean zO;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long j = iV & 1048575;
            switch (u(iV)) {
                case 0:
                    if (L(obj, obj2, i)) {
                        acag acagVar = acah.a;
                        if (Double.doubleToLongBits(acagVar.b(obj, j)) == Double.doubleToLongBits(acagVar.b(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (L(obj, obj2, i)) {
                        acag acagVar2 = acah.a;
                        if (Float.floatToIntBits(acagVar2.c(obj, j)) == Float.floatToIntBits(acagVar2.c(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe = acah.a.a;
                        if (unsafe.getLong(obj, j) == unsafe.getLong(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe2 = acah.a.a;
                        if (unsafe2.getLong(obj, j) == unsafe2.getLong(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe3 = acah.a.a;
                        if (unsafe3.getInt(obj, j) == unsafe3.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe4 = acah.a.a;
                        if (unsafe4.getLong(obj, j) == unsafe4.getLong(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe5 = acah.a.a;
                        if (unsafe5.getInt(obj, j) == unsafe5.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (L(obj, obj2, i)) {
                        acag acagVar3 = acah.a;
                        if (acagVar3.i(obj, j) == acagVar3.i(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe6 = acah.a.a;
                        if (abzk.o(unsafe6.getObject(obj, j), unsafe6.getObject(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe7 = acah.a.a;
                        if (abzk.o(unsafe7.getObject(obj, j), unsafe7.getObject(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe8 = acah.a.a;
                        if (abzk.o(unsafe8.getObject(obj, j), unsafe8.getObject(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe9 = acah.a.a;
                        if (unsafe9.getInt(obj, j) == unsafe9.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe10 = acah.a.a;
                        if (unsafe10.getInt(obj, j) == unsafe10.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe11 = acah.a.a;
                        if (unsafe11.getInt(obj, j) == unsafe11.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe12 = acah.a.a;
                        if (unsafe12.getLong(obj, j) == unsafe12.getLong(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe13 = acah.a.a;
                        if (unsafe13.getInt(obj, j) == unsafe13.getInt(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe14 = acah.a.a;
                        if (unsafe14.getLong(obj, j) == unsafe14.getLong(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (L(obj, obj2, i)) {
                        Unsafe unsafe15 = acah.a.a;
                        if (abzk.o(unsafe15.getObject(obj, j), unsafe15.getObject(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    Unsafe unsafe16 = acah.a.a;
                    zO = abzk.o(unsafe16.getObject(obj, j), unsafe16.getObject(obj2, j));
                    break;
                case 50:
                    Unsafe unsafe17 = acah.a.a;
                    zO = abzk.o(unsafe17.getObject(obj, j), unsafe17.getObject(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    int iS = s(i) & 1048575;
                    Unsafe unsafe18 = acah.a.a;
                    long j2 = iS;
                    if (unsafe18.getInt(obj, j2) != unsafe18.getInt(obj2, j2) || !abzk.o(unsafe18.getObject(obj, j), unsafe18.getObject(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zO) {
                return false;
            }
        }
        if (!((abxd) obj).unknownFields.equals(((abxd) obj2).unknownFields)) {
            return false;
        }
        if (this.h) {
            return ((abwz) obj).n.equals(((abwz) obj2).n);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r22, defpackage.abwa r23) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyt.m(java.lang.Object, abwa):void");
    }
}
