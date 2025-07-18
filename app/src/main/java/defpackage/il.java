package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class il implements ii {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final wx d = new wx(0);

    public il(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.ii
    public final void a(ij ijVar) {
        throw null;
    }

    @Override // defpackage.ii
    public final boolean b(ij ijVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.ii
    public final boolean c(ij ijVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.ii
    public final void d(ij ijVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(ij ijVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            im imVar = (im) arrayList.get(i);
            if (imVar != null && imVar.b == ijVar) {
                return imVar;
            }
        }
        im imVar2 = new im(this.b, ijVar);
        arrayList.add(imVar2);
        return imVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        wx wxVar = this.d;
        Menu menu2 = (Menu) wxVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        jz jzVar = new jz(this.b, menu);
        wxVar.put(menu, jzVar);
        return jzVar;
    }
}
