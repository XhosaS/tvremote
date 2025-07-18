package defpackage;

import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
class bao {
    static final ViewOutlineProvider a = new bam();
    public static final /* synthetic */ int b = 0;

    public static Object a(View view, float f, float f2, int i) {
        if (i > 0) {
            azq.a(view, i);
        } else {
            view.setOutlineProvider(a);
        }
        ban banVar = new ban();
        banVar.a = view;
        banVar.b = f;
        banVar.c = f2;
        view.setZ(f);
        return banVar;
    }
}
