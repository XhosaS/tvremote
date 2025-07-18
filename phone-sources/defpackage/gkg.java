package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkg extends Property {
    public gkg(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(gki.a((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        gki.c((View) obj, ((Float) obj2).floatValue());
    }
}
