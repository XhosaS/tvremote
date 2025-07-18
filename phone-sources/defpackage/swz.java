package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swz extends Property {
    public swz(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = sxa.a;
        return Float.valueOf(((sxa) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = sxa.a;
        ((sxa) obj).h = fFloatValue;
    }
}
