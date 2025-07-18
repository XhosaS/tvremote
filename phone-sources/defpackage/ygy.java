package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygy extends ygp implements RandomAccess {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ygy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ygk
    public final int a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? ((char[]) this.a).length : ((double[]) this.a).length : ((float[]) this.a).length : ((long[]) this.a).length : ((int[]) this.a).length : ((byte[]) this.a).length : ((short[]) this.a).length;
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.b;
        if (i == 0) {
            if (obj instanceof Short) {
                if (yfm.aS((short[]) this.a, ((Number) obj).shortValue()) >= 0) {
                    return true;
                }
            }
            return false;
        }
        if (i == 1) {
            if (obj instanceof Byte) {
                if (yfm.aN((byte[]) this.a, ((Number) obj).byteValue()) >= 0) {
                    return true;
                }
            }
            return false;
        }
        if (i == 2) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return yfm.bb((int[]) this.a, ((Number) obj).intValue());
        }
        if (i == 3) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return yfm.bc((long[]) this.a, ((Number) obj).longValue());
        }
        if (i != 4) {
            if (i != 5) {
                if (obj instanceof Character) {
                    if (yfm.aO((char[]) this.a, ((Character) obj).charValue()) >= 0) {
                        return true;
                    }
                }
                return false;
            }
            if (!(obj instanceof Double)) {
                return false;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            Object obj2 = this.a;
            int i2 = 0;
            while (true) {
                double[] dArr = (double[]) obj2;
                if (i2 >= dArr.length) {
                    return false;
                }
                if (Double.doubleToLongBits(dArr[i2]) == Double.doubleToLongBits(dDoubleValue)) {
                    return true;
                }
                i2++;
            }
        } else {
            if (!(obj instanceof Float)) {
                return false;
            }
            float fFloatValue = ((Number) obj).floatValue();
            Object obj3 = this.a;
            int i3 = 0;
            while (true) {
                float[] fArr = (float[]) obj3;
                if (i3 >= fArr.length) {
                    return false;
                }
                if (Float.floatToIntBits(fArr[i3]) == Float.floatToIntBits(fFloatValue)) {
                    return true;
                }
                i3++;
            }
        }
    }

    @Override // defpackage.ygp, java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2 = this.b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? Character.valueOf(((char[]) this.a)[i]) : Double.valueOf(((double[]) this.a)[i]) : Float.valueOf(((float[]) this.a)[i]) : Long.valueOf(((long[]) this.a)[i]) : Integer.valueOf(((int[]) this.a)[i]) : Byte.valueOf(((byte[]) this.a)[i]) : Short.valueOf(((short[]) this.a)[i]);
    }

    @Override // defpackage.ygp, java.util.List
    public final int indexOf(Object obj) {
        int i = this.b;
        if (i == 0) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return yfm.aS((short[]) this.a, ((Number) obj).shortValue());
        }
        if (i == 1) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return yfm.aN((byte[]) this.a, ((Number) obj).byteValue());
        }
        if (i == 2) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return yfm.aP((int[]) this.a, ((Number) obj).intValue());
        }
        if (i == 3) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return yfm.aQ((long[]) this.a, ((Number) obj).longValue());
        }
        int i2 = 0;
        if (i != 4) {
            if (i != 5) {
                if (!(obj instanceof Character)) {
                    return -1;
                }
                return yfm.aO((char[]) this.a, ((Character) obj).charValue());
            }
            if (!(obj instanceof Double)) {
                return -1;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            Object obj2 = this.a;
            while (true) {
                double[] dArr = (double[]) obj2;
                if (i2 >= dArr.length) {
                    return -1;
                }
                if (Double.doubleToLongBits(dArr[i2]) == Double.doubleToLongBits(dDoubleValue)) {
                    return i2;
                }
                i2++;
            }
        } else {
            if (!(obj instanceof Float)) {
                return -1;
            }
            float fFloatValue = ((Number) obj).floatValue();
            Object obj3 = this.a;
            while (true) {
                float[] fArr = (float[]) obj3;
                if (i2 >= fArr.length) {
                    return -1;
                }
                if (Float.floatToIntBits(fArr[i2]) == Float.floatToIntBits(fFloatValue)) {
                    return i2;
                }
                i2++;
            }
        }
    }

    @Override // defpackage.ygk, java.util.Collection
    public final boolean isEmpty() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? ((char[]) this.a).length == 0 : ((double[]) this.a).length == 0 : ((float[]) this.a).length == 0 : ((long[]) this.a).length == 0 : ((int[]) this.a).length == 0 : ((byte[]) this.a).length == 0 : ((short[]) this.a).length == 0;
    }

    @Override // defpackage.ygp, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (!(obj instanceof Character)) {
                                    return -1;
                                }
                                char cCharValue = ((Character) obj).charValue();
                                char[] cArr = (char[]) this.a;
                                int length = cArr.length - 1;
                                if (length < 0) {
                                    return -1;
                                }
                                while (true) {
                                    int i2 = length - 1;
                                    if (cCharValue == cArr[length]) {
                                        return length;
                                    }
                                    if (i2 < 0) {
                                        return -1;
                                    }
                                    length = i2;
                                }
                            } else {
                                if (!(obj instanceof Double)) {
                                    return -1;
                                }
                                double dDoubleValue = ((Number) obj).doubleValue();
                                double[] dArr = (double[]) this.a;
                                int length2 = dArr.length - 1;
                                if (length2 < 0) {
                                    return -1;
                                }
                                while (true) {
                                    int i3 = length2 - 1;
                                    if (Double.doubleToLongBits(dArr[length2]) == Double.doubleToLongBits(dDoubleValue)) {
                                        return length2;
                                    }
                                    if (i3 < 0) {
                                        return -1;
                                    }
                                    length2 = i3;
                                }
                            }
                        } else {
                            if (!(obj instanceof Float)) {
                                return -1;
                            }
                            float fFloatValue = ((Number) obj).floatValue();
                            float[] fArr = (float[]) this.a;
                            int length3 = fArr.length - 1;
                            if (length3 < 0) {
                                return -1;
                            }
                            while (true) {
                                int i4 = length3 - 1;
                                if (Float.floatToIntBits(fArr[length3]) == Float.floatToIntBits(fFloatValue)) {
                                    return length3;
                                }
                                if (i4 < 0) {
                                    return -1;
                                }
                                length3 = i4;
                            }
                        }
                    } else {
                        if (!(obj instanceof Long)) {
                            return -1;
                        }
                        long jLongValue = ((Number) obj).longValue();
                        long[] jArr = (long[]) this.a;
                        int length4 = jArr.length - 1;
                        if (length4 < 0) {
                            return -1;
                        }
                        while (true) {
                            int i5 = length4 - 1;
                            if (jLongValue == jArr[length4]) {
                                return length4;
                            }
                            if (i5 < 0) {
                                return -1;
                            }
                            length4 = i5;
                        }
                    }
                } else {
                    if (!(obj instanceof Integer)) {
                        return -1;
                    }
                    int iIntValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) this.a;
                    int length5 = iArr.length - 1;
                    if (length5 < 0) {
                        return -1;
                    }
                    while (true) {
                        int i6 = length5 - 1;
                        if (iIntValue == iArr[length5]) {
                            return length5;
                        }
                        if (i6 < 0) {
                            return -1;
                        }
                        length5 = i6;
                    }
                }
            } else {
                if (!(obj instanceof Byte)) {
                    return -1;
                }
                byte bByteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) this.a;
                int length6 = bArr.length - 1;
                if (length6 < 0) {
                    return -1;
                }
                while (true) {
                    int i7 = length6 - 1;
                    if (bByteValue == bArr[length6]) {
                        return length6;
                    }
                    if (i7 < 0) {
                        return -1;
                    }
                    length6 = i7;
                }
            }
        } else {
            if (!(obj instanceof Short)) {
                return -1;
            }
            short sShortValue = ((Number) obj).shortValue();
            short[] sArr = (short[]) this.a;
            int length7 = sArr.length - 1;
            if (length7 < 0) {
                return -1;
            }
            while (true) {
                int i8 = length7 - 1;
                if (sShortValue == sArr[length7]) {
                    return length7;
                }
                if (i8 < 0) {
                    return -1;
                }
                length7 = i8;
            }
        }
    }
}
