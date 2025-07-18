package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jf implements AdapterView.OnItemClickListener, jw {
    Context a;
    public LayoutInflater b;
    jj c;
    public ExpandedMenuView d;
    public jv e;
    public je f;

    public jf(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new je(this);
        }
        return this.f;
    }

    @Override // defpackage.jw
    public final void c(Context context, jj jjVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = jjVar;
        je jeVar = this.f;
        if (jeVar != null) {
            jeVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jw
    public final void d(jj jjVar, boolean z) {
        jv jvVar = this.e;
        if (jvVar != null) {
            jvVar.a(jjVar, z);
        }
    }

    @Override // defpackage.jw
    public final void e(jv jvVar) {
        throw null;
    }

    @Override // defpackage.jw
    public final boolean g() {
        return false;
    }

    @Override // defpackage.jw
    public final boolean h(ke keVar) {
        if (!keVar.hasVisibleItems()) {
            return false;
        }
        jk jkVar = new jk(keVar);
        jj jjVar = jkVar.a;
        Context context = jjVar.a;
        gb gbVar = new gb(context);
        jkVar.c = new jf(gbVar.getContext());
        jf jfVar = jkVar.c;
        jfVar.e = jkVar;
        jjVar.f(jfVar, context);
        ListAdapter listAdapterA = jkVar.c.a();
        fx fxVar = gbVar.a;
        fxVar.m = listAdapterA;
        fxVar.n = jkVar;
        View view = jjVar.i;
        if (view != null) {
            fxVar.e = view;
        } else {
            fxVar.c = jjVar.h;
            gbVar.setTitle(jjVar.g);
        }
        fxVar.k = jkVar;
        jkVar.b = gbVar.create();
        jkVar.b.setOnDismissListener(jkVar);
        WindowManager.LayoutParams attributes = jkVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        jkVar.b.show();
        jv jvVar = this.e;
        if (jvVar == null) {
            return true;
        }
        jvVar.b(keVar);
        return true;
    }

    @Override // defpackage.jw
    public final boolean i(jm jmVar) {
        return false;
    }

    @Override // defpackage.jw
    public final boolean j(jm jmVar) {
        return false;
    }

    @Override // defpackage.jw
    public final void l() {
        je jeVar = this.f;
        if (jeVar != null) {
            jeVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.x(this.f.getItem(i), this, 0);
    }
}
