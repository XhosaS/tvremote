package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
class ix {
    final Context a;
    public wx b;

    public ix(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof adl)) {
            return menuItem;
        }
        adl adlVar = (adl) menuItem;
        if (this.b == null) {
            this.b = new wx(0);
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(adlVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        jr jrVar = new jr(this.a, adlVar);
        this.b.put(adlVar, jrVar);
        return jrVar;
    }
}
