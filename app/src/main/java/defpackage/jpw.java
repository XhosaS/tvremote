package defpackage;

import android.util.FloatProperty;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpw extends FloatProperty {
    public jpw() {
        super("Logo Height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((LogoView) obj).a.b());
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        logoView.c(logoView.a.d(), f);
    }
}
