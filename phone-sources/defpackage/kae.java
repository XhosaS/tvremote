package defpackage;

import android.view.MenuItem;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kae implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kae(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.c != 0) {
            ((agl) this.a).d.a(((cvi) this.b).a);
            return true;
        }
        GtvHomePageActivity.$r8$lambda$fqTPoWgAjMvtK1TCZ7LrUMRIdt0((GtvHomePageActivity) this.a, (wlf) this.b, menuItem);
        return false;
    }
}
