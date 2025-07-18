package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bc {
    public final C0038do a;

    public bc(C0038do c0038do) {
        this.a = c0038do;
    }

    public final boolean b() {
        C0038do c0038do = this.a;
        View view = c0038do.a.mView;
        int iBz = view != null ? a.bz(view) : 0;
        int i = c0038do.h;
        if (iBz != i) {
            return (iBz == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
