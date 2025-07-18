package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class da implements cx {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final mi d = new mi();

    public da(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.cx
    public final void a(cy cyVar) {
        throw null;
    }

    @Override // defpackage.cx
    public final boolean b(cy cyVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.cx
    public final boolean c(cy cyVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.cx
    public final void d(cy cyVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(cy cyVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            db dbVar = (db) arrayList.get(i);
            if (dbVar != null && dbVar.b == cyVar) {
                return dbVar;
            }
        }
        db dbVar2 = new db(this.b, cyVar);
        arrayList.add(dbVar2);
        return dbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        mi miVar = this.d;
        Menu menu2 = (Menu) miVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ej ejVar = new ej(this.b, menu);
        miVar.put(menu, ejVar);
        return ejVar;
    }
}
