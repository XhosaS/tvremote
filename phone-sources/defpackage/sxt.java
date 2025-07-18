package defpackage;

import android.util.Property;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxt extends Property {
    public sxt(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = sxu.f;
        return Float.valueOf(((sxu) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        sxu sxuVar = (sxu) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        sxuVar.e = fFloatValue;
        List list = sxuVar.k;
        ((sxn) list.get(0)).a = 0.0f;
        sxn sxnVar = (sxn) list.get(0);
        sxn sxnVar2 = (sxn) list.get(1);
        dup dupVar = sxuVar.a;
        float fG = sxu.g((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = dupVar.getInterpolation(fG);
        sxnVar2.a = interpolation;
        sxnVar.b = interpolation;
        sxn sxnVar3 = (sxn) list.get(1);
        sxn sxnVar4 = (sxn) list.get(2);
        float interpolation2 = dupVar.getInterpolation(fG + 0.49925038f);
        sxnVar4.a = interpolation2;
        sxnVar3.b = interpolation2;
        ((sxn) list.get(2)).b = 1.0f;
        if (sxuVar.d && ((sxn) list.get(1)).b < 1.0f) {
            ((sxn) list.get(2)).c = ((sxn) list.get(1)).c;
            ((sxn) list.get(1)).c = ((sxn) list.get(0)).c;
            ((sxn) list.get(0)).c = sxuVar.b.e[sxuVar.c];
            sxuVar.d = false;
        }
        sxuVar.j.invalidateSelf();
    }
}
