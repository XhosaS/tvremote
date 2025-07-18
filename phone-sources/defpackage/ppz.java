package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppz {
    private static final ppw a = new ppw();

    public static final String a(cjh cjhVar, Context context) {
        clw.q(context);
        return yfm.ax(cjhVar.a, null, null, null, new oun(7), 31);
    }

    public static /* synthetic */ ciy b(ciy ciyVar, cjh cjhVar) {
        ciyVar.getClass();
        cjhVar.getClass();
        return Build.VERSION.SDK_INT >= 29 ? ccf.A(new pqa(a, cji.a, new ppy(cjhVar), new ppx(cji.e))) : ciyVar;
    }
}
