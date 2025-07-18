package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxd extends Property {
    public sxd(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = sxf.a;
        return Float.valueOf(((sxf) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        sxf sxfVar = (sxf) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        sxfVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        List list = sxfVar.k;
        sxn sxnVar = (sxn) list.get(0);
        float f2 = sxfVar.f * 1080.0f;
        int[] iArr = sxf.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += sxfVar.c.getInterpolation(sxf.g(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        sxnVar.g = f2 + interpolation;
        TimeInterpolator timeInterpolator = sxfVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(sxf.g(i, 0, 3000)) - timeInterpolator.getInterpolation(sxf.g(i, 3000, 3000));
        sxnVar.a = 0.0f;
        float[] fArr = sxf.b;
        float fD = sil.d(fArr[0], fArr[1], interpolation2);
        sxnVar.b = fD;
        float f3 = sxfVar.g;
        if (f3 > 0.0f) {
            sxnVar.b = fD * (1.0f - f3);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float fG = sxf.g(i, iArr[i3], 100);
            if (fG >= 0.0f && fG <= 1.0f) {
                int i4 = i3 + sxfVar.e;
                int[] iArr2 = sxfVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((sxn) list.get(0)).c = snt.a(timeInterpolator.getInterpolation(fG), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        sxfVar.j.invalidateSelf();
    }
}
