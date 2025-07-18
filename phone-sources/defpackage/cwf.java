package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwf extends cwj {
    public cwf(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ Object a(View view) {
        return cwq.a(view);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void b(View view, Object obj) {
        cwq.c(view, (CharSequence) obj);
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
