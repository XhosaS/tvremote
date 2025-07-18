package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rls extends Property {
    public rls(Class cls) {
        super(cls, "alpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getAlpha());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setAlpha(((Float) obj2).floatValue());
    }
}
