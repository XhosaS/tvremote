package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juz extends cuo {
    final /* synthetic */ jva a;

    public juz(jva jvaVar) {
        this.a = jvaVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) throws Resources.NotFoundException {
        view.getClass();
        cyqVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        String string = this.a.a().getResources().getString(R.string.content_description_change_sort_option);
        string.getClass();
        cyqVar.j(new cyp(16, string));
    }
}
