package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swy extends Property {
    public swy(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = sxa.a;
        return Float.valueOf(((sxa) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        sxa sxaVar = (sxa) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        sxaVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        List list = sxaVar.k;
        sxn sxnVar = (sxn) list.get(0);
        float f2 = sxaVar.g * 1520.0f;
        sxnVar.a = (-20.0f) + f2;
        sxnVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float fG = sxa.g(i, sxa.a[i2], 667);
            float f3 = sxnVar.b;
            dup dupVar = sxaVar.d;
            sxnVar.b = f3 + (dupVar.getInterpolation(fG) * 250.0f);
            sxnVar.a += dupVar.getInterpolation(sxa.g(i, sxa.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = sxnVar.a;
        float f5 = sxnVar.b;
        float f6 = f4 + ((f5 - f4) * sxaVar.h);
        sxnVar.a = f6;
        sxnVar.a = f6 / 360.0f;
        sxnVar.b = f5 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float fG2 = sxa.g(i, sxa.c[i3], 333);
            if (fG2 > 0.0f && fG2 < 1.0f) {
                int i4 = i3 + sxaVar.f;
                int[] iArr = sxaVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((sxn) list.get(0)).c = snt.a(sxaVar.d.getInterpolation(fG2), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        sxaVar.j.invalidateSelf();
    }
}
