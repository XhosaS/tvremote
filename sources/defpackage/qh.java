package defpackage;

import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qh extends qj {
    public qh(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(qp.e(view));
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        qp.b(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
