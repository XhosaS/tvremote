package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class agv extends agz {
    public agv(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.agz
    public final /* synthetic */ Object a(View view) {
        return ahf.a(view);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void b(View view, Object obj) {
        ahf.c(view, (CharSequence) obj);
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
