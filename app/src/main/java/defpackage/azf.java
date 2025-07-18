package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azf extends Property {
    public azf(Class cls) {
        super(cls, "alpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((azi) obj).a);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        azi aziVar = (azi) obj;
        aziVar.a = ((Float) obj2).floatValue();
        aziVar.a();
        aziVar.j.invalidate();
    }
}
