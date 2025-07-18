package defpackage;

import android.util.FloatProperty;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvs extends FloatProperty {
    public uvs() {
        super("transitionAlpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getTransitionAlpha());
    }

    public final /* synthetic */ void setValue(Object obj, float f) {
        ((View) obj).setTransitionAlpha(f);
    }
}
