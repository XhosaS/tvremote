package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxx extends Property {
    public sxx(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = sxy.a;
        return Float.valueOf(((sxy) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        sxy sxyVar = (sxy) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        sxyVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = sxyVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            sxn sxnVar = (sxn) list.get(i);
            int[] iArr = sxy.b;
            int i3 = i + i;
            int i4 = iArr[i3];
            int[] iArr2 = sxy.a;
            float fG = sxy.g(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = sxyVar.c;
            sxnVar.a = cmq.k(interpolatorArr[i3].getInterpolation(fG), 0.0f, 1.0f);
            int i5 = i3 + 1;
            sxnVar.b = cmq.k(interpolatorArr[i5].getInterpolation(sxy.g(i2, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
            i++;
        }
        if (sxyVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sxn) it.next()).c = sxyVar.d.e[sxyVar.e];
            }
            sxyVar.f = false;
        }
        sxyVar.j.invalidateSelf();
    }
}
