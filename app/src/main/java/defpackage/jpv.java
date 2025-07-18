package defpackage;

import android.util.FloatProperty;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpv extends FloatProperty {
    public jpv() {
        super("Logo Width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((LogoView) obj).a.d());
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        logoView.c(f, logoView.a.b());
    }
}
