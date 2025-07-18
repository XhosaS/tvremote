package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgy {
    static {
        tvn.n("GnpSdk");
    }

    public static final int a(uyc uycVar, Context context) {
        uycVar.getClass();
        int iBm = a.bm(uycVar.m);
        if (iBm != 0 && iBm == 2) {
            return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
        }
        return -1;
    }

    public static final int b(uyc uycVar, Context context) {
        uycVar.getClass();
        int iBm = a.bm(uycVar.m);
        if (iBm == 0) {
            iBm = 1;
        }
        int i = iBm - 1;
        if (i == 1) {
            return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
        }
        if (i != 2) {
            return -1;
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_max_width);
    }
}
