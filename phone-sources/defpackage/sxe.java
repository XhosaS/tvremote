package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxe extends Property {
    public sxe(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = sxf.a;
        return Float.valueOf(((sxf) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = sxf.a;
        ((sxf) obj).g = fFloatValue;
    }
}
