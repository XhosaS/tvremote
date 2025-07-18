package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ric {
    public final boolean a;
    public final ImmutableMap b;
    private final ImmutableMap c;

    public ric() {
        throw null;
    }

    public static ric b(Context context) {
        return c(context, trk.a);
    }

    public static ric c(Context context, tst tstVar) {
        boolean zD = d(context);
        ImmutableMap immutableMapE = e(context, tstVar);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (ria riaVar : ria.values()) {
            builder.put(riaVar, Integer.valueOf(context.getColor(zD ? riaVar.e : riaVar.f)));
        }
        return new ric(zD, immutableMapE, builder.buildOrThrow());
    }

    public static boolean d(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    /* JADX WARN: Finally extract failed */
    private static ImmutableMap e(Context context, tst tstVar) {
        rib[] ribVarArrValues = rib.values();
        int length = ribVarArrValues.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ribVarArrValues[i].g;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(rib.class);
        for (int i2 = 0; i2 < ribVarArrValues.length; i2++) {
            try {
                try {
                    rib ribVar = ribVarArrValues[i2];
                    enumMap.put((EnumMap) ribVar, (rib) Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i2, context.getResources().getColor(ribVar.h))));
                } catch (UnsupportedOperationException e) {
                    if (!tstVar.g()) {
                        throw e;
                    }
                    Object objC = tstVar.c();
                    final String packageName = context.getPackageName();
                    final boolean zAi = rrx.ai(context);
                    TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterial3Theme});
                    try {
                        final boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
                        typedArrayObtainStyledAttributes2.recycle();
                        final boolean zD = d(context);
                        final int iMin = Math.min(i2, 3);
                        final boolean zF = f(i2 + 1, typedArrayObtainStyledAttributes, context);
                        final rzy rzyVar = (rzy) objC;
                        ((rzy) objC).p(new Runnable() { // from class: rit
                            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ttm] */
                            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((snf) ((riv) rzyVar.a.get()).j.get()).b(packageName, Boolean.valueOf(zAi), Boolean.valueOf(z), Boolean.valueOf(zD), Integer.valueOf(iMin), Boolean.valueOf(zF));
                            }
                        });
                        throw e;
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes2.recycle();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return Maps.immutableEnumMap(enumMap);
    }

    private static boolean f(int i, TypedArray typedArray, Context context) {
        rib[] ribVarArrValues = rib.values();
        if (i == ribVarArrValues.length) {
            return false;
        }
        try {
            typedArray.getColor(i, context.getResources().getColor(ribVarArrValues[i].h));
            return false;
        } catch (UnsupportedOperationException unused) {
            return true;
        }
    }

    public final int a(ria riaVar) {
        Integer num = (Integer) this.c.get(riaVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ric) {
            ric ricVar = (ric) obj;
            if (this.a == ricVar.a && this.b.equals(ricVar.b) && this.c.equals(ricVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMap = this.c;
        return "OneGoogleColorResolver{isLightTheme=" + this.a + ", colorsMap=" + this.b.toString() + ", googleThemedColorsMap=" + immutableMap.toString() + "}";
    }

    public ric(boolean z, ImmutableMap immutableMap, ImmutableMap immutableMap2) {
        this.a = z;
        if (immutableMap == null) {
            throw new NullPointerException("Null colorsMap");
        }
        this.b = immutableMap;
        if (immutableMap2 == null) {
            throw new NullPointerException("Null googleThemedColorsMap");
        }
        this.c = immutableMap2;
    }
}
