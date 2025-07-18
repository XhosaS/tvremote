package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwg extends cwj {
    public cwg(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ Object a(View view) {
        return cws.b(view);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void b(View view, Object obj) {
        cws.c(view, (CharSequence) obj);
    }

    @Override // defpackage.cwj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
