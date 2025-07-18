package defpackage;

import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qe extends qj {
    public qe(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(qp.f(view));
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        qp.d(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
