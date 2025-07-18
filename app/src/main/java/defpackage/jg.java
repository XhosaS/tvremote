package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jg extends BaseAdapter {
    public final jj a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public jg(jj jjVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = jjVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jm getItem(int i) {
        ArrayList arrayListE;
        if (this.d) {
            jj jjVar = this.a;
            jjVar.i();
            arrayListE = jjVar.e;
        } else {
            arrayListE = this.a.e();
        }
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (jm) arrayListE.get(i);
    }

    final void b() {
        jj jjVar = this.a;
        jm jmVar = jjVar.k;
        if (jmVar != null) {
            jjVar.i();
            ArrayList arrayList = jjVar.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((jm) arrayList.get(i)) == jmVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListE;
        if (this.d) {
            jj jjVar = this.a;
            jjVar.i();
            arrayListE = jjVar.e;
        } else {
            arrayListE = this.a.e();
        }
        return this.c < 0 ? arrayListE.size() : arrayListE.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.u() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.a;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.c || !z) ? 8 : 0);
        }
        jx jxVar = (jx) view;
        if (this.b) {
            listMenuItemView.d = true;
            listMenuItemView.b = true;
        }
        jxVar.e(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
