package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agz extends ActionMode.Callback2 implements ActionMode.Callback {
    private final cvi a;

    public agz(cvi cviVar) {
        this.a = cviVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.m(menu);
        return menu.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ago, java.lang.Object] */
    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.a();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yjk] */
    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        bmy bmyVar = (bmy) this.a.c.a();
        rect.set(Math.round(bmyVar.b), Math.round(bmyVar.c), Math.round(bmyVar.d), Math.round(bmyVar.e));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.m(menu);
    }
}
