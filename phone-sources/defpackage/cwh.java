package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwh extends cwj {
    public cwh(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(cwq.e(view));
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        cwq.b(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
