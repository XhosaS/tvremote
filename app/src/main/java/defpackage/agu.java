package defpackage;

import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class agu extends agz {
    public agu(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.agz
    public final /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ahf.f(view));
    }

    @Override // defpackage.agz
    public final /* synthetic */ void b(View view, Object obj) {
        ahf.d(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
