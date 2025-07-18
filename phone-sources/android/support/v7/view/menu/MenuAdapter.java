package android.support.v7.view.menu;

import android.support.v7.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import defpackage.fb;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {
    fb mAdapterMenu;
    private int mExpandedIndex = -1;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(fb fbVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.mOverflowOnly = z;
        this.mInflater = layoutInflater;
        this.mAdapterMenu = fbVar;
        this.mItemLayoutRes = i;
        findExpandedIndex();
    }

    public void findExpandedIndex() {
        fb fbVar = this.mAdapterMenu;
        MenuItemImpl menuItemImpl = fbVar.j;
        if (menuItemImpl != null) {
            ArrayList arrayListE = fbVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) arrayListE.get(i)) == menuItemImpl) {
                    this.mExpandedIndex = i;
                    return;
                }
            }
        }
        this.mExpandedIndex = -1;
    }

    public fb getAdapterMenu() {
        return this.mAdapterMenu;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mExpandedIndex < 0 ? (this.mOverflowOnly ? this.mAdapterMenu.e() : this.mAdapterMenu.f()).size() : r0.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }

    @Override // android.widget.Adapter
    public MenuItemImpl getItem(int i) {
        ArrayList arrayListE = this.mOverflowOnly ? this.mAdapterMenu.e() : this.mAdapterMenu.f();
        int i2 = this.mExpandedIndex;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemImpl) arrayListE.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(this.mItemLayoutRes, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.mAdapterMenu.y() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.mForceShowIcon) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }
}
