package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rp extends Property {
    public rp(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).a);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        SwitchCompat switchCompat = (SwitchCompat) obj;
        switchCompat.a = ((Float) obj2).floatValue();
        switchCompat.invalidate();
    }
}
