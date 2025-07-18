package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxl extends Property {
    public sxl(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((sxm) obj).f());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((sxm) obj).i(((Float) obj2).floatValue());
    }
}
