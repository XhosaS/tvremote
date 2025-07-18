package defpackage;

import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifa extends iez implements iej {
    private final iea a;
    private final ifc b;
    private Object c;
    private ifb d;
    private int e;

    public ifa(iea ieaVar, ifc ifcVar) {
        this.a = ieaVar;
        this.b = ifcVar;
        this.c = ieaVar.a();
    }

    @Override // defpackage.iez
    public final int a() {
        Object objA = this.a.a();
        this.c = objA;
        return this.b.b(objA);
    }

    @Override // defpackage.iez
    public final int b(int i) {
        return this.b.c(this.c, i);
    }

    @Override // defpackage.iez
    public final long c(int i, long j) {
        return this.b.d(this.c, i) + j;
    }

    @Override // defpackage.iez
    public final void d(int i, RecyclerView.ViewHolder viewHolder) {
        this.b.e(this.c, i, viewHolder);
    }

    @Override // defpackage.iej
    public final void dM() {
        ifb ifbVar = this.d;
        int i = this.e;
        a.ah(i < ifbVar.a && this == ifbVar.b[i], "Wrong RA-part connection");
        if (ifbVar.d) {
            return;
        }
        int i2 = i != 0 ? ifbVar.c[i - 1] : 0;
        int[] iArr = ifbVar.c;
        int i3 = iArr[i];
        int i4 = i3 - i2;
        if (!ifbVar.hasObservers()) {
            ifbVar.a(i, a() - i4);
            return;
        }
        iey ieyVarB = iey.b(i2);
        ieyVarB.a = i4;
        if (!i(true, ieyVarB)) {
            ifbVar.d = true;
            ifbVar.notifyDataSetChanged();
            ieyVarB.c();
        } else {
            int iA = ieyVarB.a();
            iArr[i] = iA;
            ifbVar.a(i + 1, iA - i3);
            ieyVarB.d(ifbVar);
        }
    }

    @Override // defpackage.iez
    public final void e(RecyclerView.ViewHolder viewHolder) {
        this.b.f(viewHolder);
    }

    @Override // defpackage.iez
    public final void f(ifb ifbVar, int i) {
        this.d = ifbVar;
        this.e = i;
    }

    @Override // defpackage.iez
    public final void g() {
        this.a.ea(this);
        dM();
    }

    @Override // defpackage.iez
    public final void h() {
        this.a.ee(this);
    }

    @Override // defpackage.iez
    public final boolean i(boolean z, ListUpdateCallback listUpdateCallback) {
        Object obj = this.c;
        Object objA = z ? this.a.a() : obj;
        if (!this.b.g(obj, objA, listUpdateCallback)) {
            return false;
        }
        this.c = objA;
        return true;
    }
}
