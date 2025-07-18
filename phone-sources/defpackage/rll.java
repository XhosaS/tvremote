package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rll extends Property {
    public rll(Class cls) {
        super(cls, "backgroundColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Drawable background = ((View) obj).getBackground();
        return Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Integer) obj2).intValue());
    }
}
