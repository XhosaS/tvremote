package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpz extends bfj {
    private List j;

    public tpz(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.bfk
    public final /* synthetic */ void e(Object obj) {
        List list = (List) obj;
        this.j = list;
        super.e(list);
    }

    @Override // defpackage.bfk
    public final void f() {
        List list = this.j;
        if (list != null) {
            super.e(list);
            return;
        }
        c();
        this.a = new bfi(this);
        a();
    }
}
