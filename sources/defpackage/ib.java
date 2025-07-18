package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ib extends hf {
    final int c;
    final int d;
    public ia e;
    private MenuItem f;

    public ib(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.hf, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        dr drVar;
        int headersCount;
        ia iaVar;
        ia iaVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                drVar = (dr) headerViewListAdapter.getWrappedAdapter();
            } else {
                drVar = (dr) adapter;
                headersCount = 0;
            }
            dw item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= drVar.getCount()) ? null : drVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                du duVar = drVar.a;
                if (menuItem != null && (iaVar2 = ((ic) this.e).b) != null) {
                    ((dn) iaVar2).a.a.removeCallbacksAndMessages(duVar);
                }
                this.f = item;
                if (item != null && (iaVar = ((ic) this.e).b) != null) {
                    dn dnVar = (dn) iaVar;
                    ViewOnKeyListenerC0000do viewOnKeyListenerC0000do = dnVar.a;
                    Handler handler = viewOnKeyListenerC0000do.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = viewOnKeyListenerC0000do.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (duVar == ((bda) list.get(i2)).c) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new rj(dnVar, i3 < list.size() ? (bda) list.get(i3) : null, (MenuItem) item, duVar, 1), duVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (dr) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (dr) adapter).a.i(false);
        return true;
    }
}
