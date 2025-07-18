package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class l {
    public final be a;

    public l(be beVar) {
        this.a = beVar;
    }

    public final boolean b() {
        be beVar = this.a;
        View view = beVar.a.L;
        int iS = view != null ? ii.S(view) : 0;
        int i = beVar.h;
        if (iS != i) {
            return (iS == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
