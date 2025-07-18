package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qf extends qj {
    public qf(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.qj
    public final /* synthetic */ Object a(View view) {
        return qp.a(view);
    }

    @Override // defpackage.qj
    public final /* synthetic */ void b(View view, Object obj) {
        qp.c(view, (CharSequence) obj);
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
