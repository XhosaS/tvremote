package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.katniss.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class je extends BaseAdapter {
    final /* synthetic */ jf a;
    private int b = -1;

    public je(jf jfVar) {
        this.a = jfVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jm getItem(int i) {
        jj jjVar = this.a.c;
        jjVar.i();
        ArrayList arrayList = jjVar.e;
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (jm) arrayList.get(i);
    }

    final void b() {
        jj jjVar = this.a.c;
        jm jmVar = jjVar.k;
        if (jmVar != null) {
            jjVar.i();
            ArrayList arrayList = jjVar.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((jm) arrayList.get(i)) == jmVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        jj jjVar = this.a.c;
        jjVar.i();
        int size = jjVar.e.size();
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
        ((jx) view).e(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
