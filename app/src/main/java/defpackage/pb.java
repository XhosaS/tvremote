package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pb extends nu {
    final int c;
    final int d;
    public pa e;
    private MenuItem f;

    public pb(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.nu, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        jg jgVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jgVar = (jg) headerViewListAdapter.getWrappedAdapter();
            } else {
                jgVar = (jg) adapter;
                headersCount = 0;
            }
            jm item = null;
            if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < jgVar.getCount()) {
                item = jgVar.getItem(i);
            }
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                jj jjVar = jgVar.a;
                if (menuItem != null) {
                    this.e.b(jjVar);
                }
                this.f = item;
                if (item != null) {
                    this.e.a(jjVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (jg) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (jg) adapter).a.g(false);
        return true;
    }
}
