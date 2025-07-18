package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvu extends bvt {
    private static boolean a = true;

    @Override // defpackage.bvs
    public void b(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
