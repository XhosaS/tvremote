package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
class dl {
    final Context a;
    public mi b;

    public dl(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof og)) {
            return menuItem;
        }
        og ogVar = (og) menuItem;
        if (this.b == null) {
            this.b = new mi();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(ogVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        eb ebVar = new eb(this.a, ogVar);
        this.b.put(ogVar, ebVar);
        return ebVar;
    }
}
