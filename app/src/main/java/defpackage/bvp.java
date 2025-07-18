package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvp extends Property {
    public bvp(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(bvr.a.a((View) obj));
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        bvr.a.c((View) obj, fFloatValue);
    }
}
