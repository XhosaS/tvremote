package defpackage;

import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agx extends agz {
    public agx(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.agz
    public final /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ahf.e(view));
    }

    @Override // defpackage.agz
    public final /* synthetic */ void b(View view, Object obj) {
        ahf.b(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
