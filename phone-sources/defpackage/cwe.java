package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwe extends cwj {
    public cwe(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(cwq.f(view));
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        cwq.d(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
