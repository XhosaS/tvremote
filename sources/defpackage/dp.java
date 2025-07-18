package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dp extends BaseAdapter {
    final /* synthetic */ dq a;
    private int b = -1;

    public dp(dq dqVar) {
        this.a = dqVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dw getItem(int i) {
        ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (dw) arrayListE.get(i);
    }

    final void b() {
        du duVar = this.a.c;
        dw dwVar = duVar.i;
        if (dwVar != null) {
            ArrayList arrayListE = duVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((dw) arrayListE.get(i)) == dwVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((eh) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
