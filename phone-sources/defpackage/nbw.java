package defpackage;

import android.util.FloatProperty;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nbw extends FloatProperty {
    public nbw() {
        super("Logo Height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = nby.f;
        return Float.valueOf(((nby) obj).a.k);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        nby nbyVar = (nby) obj;
        int i = nby.f;
        nbyVar.d(nbyVar.a.j, f);
    }
}
