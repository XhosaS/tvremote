package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wl extends Property {
    public wl(Class cls) {
        super(cls, "streamPosition");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((wm) obj).b);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        wm wmVar = (wm) obj;
        wmVar.b = ((Integer) obj2).intValue();
        wmVar.invalidate();
    }
}
