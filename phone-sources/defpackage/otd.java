package defpackage;

import android.content.res.TypedArray;
import android.os.Looper;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otd {
    private static final TypedValue a = new TypedValue();
    private static final ThreadLocal b = new ThreadLocal();

    public static int a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (c(iFloatToIntBits)) {
            return iFloatToIntBits;
        }
        throw new IllegalArgumentException("Float length " + f + " out of range or NaN");
    }

    public static int b(TypedArray typedArray, String str, int i, boolean z) {
        TypedValue typedValue;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            typedValue = a;
        } else {
            ThreadLocal threadLocal = b;
            TypedValue typedValue2 = (TypedValue) threadLocal.get();
            if (typedValue2 == null) {
                typedValue2 = new TypedValue();
                threadLocal.set(typedValue2);
            }
            typedValue = typedValue2;
        }
        if (!typedArray.getValue(i, typedValue)) {
            throw new IllegalArgumentException(hhh.d(str, typedArray, ": missing "));
        }
        int i2 = typedValue.type;
        if (i2 == 4) {
            float f = typedValue.getFloat();
            if (z && f < 0.0f) {
                throw new IllegalArgumentException(hhh.d(str, typedArray, ": negative float length not allowed for size attribute "));
            }
            iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(typedValue.getFloat()) : 0;
            if (c(iFloatToIntBits)) {
                return iFloatToIntBits;
            }
            throw new IllegalArgumentException(hhh.d(str, typedArray, ": out-of-range float length for "));
        }
        if (i2 == 5) {
            float dimension = typedValue.getDimension(typedArray.getResources().getDisplayMetrics());
            if (!z || dimension >= 1.0f) {
                iFloatToIntBits = Math.round(dimension);
            } else {
                if (dimension < 0.0f) {
                    throw new IllegalArgumentException(hhh.d(str, typedArray, ": negative dimen length not allowed for size attribute "));
                }
                if (dimension != 0.0f) {
                    iFloatToIntBits = 1;
                }
            }
            if (iFloatToIntBits < -16777216 || iFloatToIntBits > 16777215) {
                throw new IllegalArgumentException(hhh.d(str, typedArray, ": out-of-range dimension length for "));
            }
            return iFloatToIntBits;
        }
        if (i2 != 16 && i2 != 17) {
            throw new IllegalArgumentException(typedArray.getPositionDescription() + ": unaccepted value for " + str + ": " + String.valueOf(typedValue.coerceToString()));
        }
        int i3 = typedValue.data;
        int i4 = i3 & (-16777216);
        if (i4 == 2130706432 || (z && i4 == -16777216)) {
            return i3;
        }
        throw new IllegalArgumentException(typedArray.getPositionDescription() + ": invalid enum value " + i3 + " for " + str);
    }

    public static boolean c(int i) {
        int i2 = i & (-16777216);
        return (i2 == Integer.MIN_VALUE || i2 == -16777216 || i2 == 0 || i2 == 2130706432) ? false : true;
    }

    public static boolean d(int i) {
        int i2 = i & (-16777216);
        return i2 == -16777216 || i2 == 0;
    }
}
