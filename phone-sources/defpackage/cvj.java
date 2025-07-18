package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.play.search.PlaySearchToolbar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvj implements MenuItem.OnActionExpandListener {
    final /* synthetic */ PlaySearchToolbar a;

    public cvj(PlaySearchToolbar playSearchToolbar) {
        this.a = playSearchToolbar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.a.i = -1;
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        PlaySearchToolbar playSearchToolbar = this.a;
        View viewFindViewById = playSearchToolbar.findViewById(menuItem.getItemId());
        if (viewFindViewById != null) {
            Rect rect = new Rect();
            viewFindViewById.getGlobalVisibleRect(rect);
            playSearchToolbar.c.c = new Point(new Point(rect.centerX(), rect.centerY()));
        }
        playSearchToolbar.i = menuItem.getItemId();
        playSearchToolbar.c(true);
        return true;
    }
}
