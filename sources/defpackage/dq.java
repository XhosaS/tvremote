package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dq implements AdapterView.OnItemClickListener, eg {
    Context a;
    public LayoutInflater b;
    du c;
    public ExpandedMenuView d;
    public ef e;
    public dp f;

    public dq(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new dp(this);
        }
        return this.f;
    }

    @Override // defpackage.eg
    public final void b(Context context, du duVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = duVar;
        dp dpVar = this.f;
        if (dpVar != null) {
            dpVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.eg
    public final void c(du duVar, boolean z) {
        ef efVar = this.e;
        if (efVar != null) {
            efVar.a(duVar, z);
        }
    }

    @Override // defpackage.eg
    public final void d(ef efVar) {
        throw null;
    }

    @Override // defpackage.eg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eg
    public final boolean f(en enVar) {
        if (!enVar.hasVisibleItems()) {
            return false;
        }
        dv dvVar = new dv(enVar);
        du duVar = dvVar.a;
        Context context = duVar.a;
        int iA = bq.a(context, 0);
        bm bmVar = new bm(new ContextThemeWrapper(context, bq.a(context, iA)));
        dvVar.c = new dq(bmVar.a);
        dq dqVar = dvVar.c;
        dqVar.e = dvVar;
        duVar.g(dqVar);
        bmVar.g = dvVar.c.a();
        bmVar.h = dvVar;
        View view = duVar.g;
        if (view != null) {
            bmVar.e = view;
        } else {
            bmVar.c = duVar.f;
            bmVar.d = duVar.e;
        }
        bmVar.f = dvVar;
        dvVar.b = ii.N(bmVar, iA);
        dvVar.b.setOnDismissListener(dvVar);
        WindowManager.LayoutParams attributes = dvVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dvVar.b.show();
        ef efVar = this.e;
        if (efVar == null) {
            return true;
        }
        efVar.b(enVar);
        return true;
    }

    @Override // defpackage.eg
    public final boolean g(dw dwVar) {
        return false;
    }

    @Override // defpackage.eg
    public final boolean h(dw dwVar) {
        return false;
    }

    @Override // defpackage.eg
    public final void i() {
        dp dpVar = this.f;
        if (dpVar != null) {
            dpVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
