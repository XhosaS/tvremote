package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
class bax extends Property {
    public bax(Class cls) {
        super(cls, "streamPosition");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((baz) obj).g);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        baz bazVar = (baz) obj;
        bazVar.g = ((Integer) obj2).intValue();
        bazVar.invalidate();
    }
}
