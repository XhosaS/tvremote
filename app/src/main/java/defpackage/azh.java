package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azh extends Property {
    public azh(Class cls) {
        super(cls, "translation_x");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((azi) obj).c);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        azi aziVar = (azi) obj;
        aziVar.c = ((Float) obj2).floatValue() * aziVar.h * aziVar.i;
        aziVar.j.invalidate();
    }
}
