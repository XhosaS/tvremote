package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class am {
    public final en a;

    public am(en enVar) {
        this.a = enVar;
    }

    public final boolean b() {
        en enVar = this.a;
        View view = enVar.a.R;
        int iA = view != null ? em.a.a(view) : 0;
        int i = enVar.h;
        if (iA != i) {
            return (iA == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
