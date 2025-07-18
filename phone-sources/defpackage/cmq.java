package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmq {
    public static final Void a(String str) {
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, yjv yjvVar, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        sb.append(charSequence2);
        int size = list.size();
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
            yjv yjvVar2 = null;
            if (i2 >= size) {
                c = c2;
                break;
            }
            Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            if ((i & 32) == 0) {
                yjvVar2 = yjvVar;
            }
            a.E(sb, obj, yjvVar2);
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static final float e(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float f(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static final int g(int i, int i2, float f) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final void h(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static final float i(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static final Bundle j(yfw... yfwVarArr) {
        Bundle bundle = new Bundle(yfwVarArr.length);
        for (yfw yfwVar : yfwVarArr) {
            String str = (String) yfwVar.a;
            Object obj = yfwVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static float k(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int l(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static FingerprintManager m(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Icon n(androidx.core.graphics.drawable.IconCompat r5, android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmq.n(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
