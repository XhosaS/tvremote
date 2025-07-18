package defpackage;

import android.support.v7.util.ListUpdateCallback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iey implements ListUpdateCallback {
    private static iey b;
    public int a;
    private final List c = new ArrayList();
    private int d;
    private int e;

    private iey() {
    }

    static iey b(int i) {
        iey ieyVar;
        synchronized (iey.class) {
            ieyVar = b;
            b = null;
        }
        if (ieyVar == null) {
            ieyVar = new iey();
        }
        ieyVar.e = i;
        return ieyVar;
    }

    private final iex e() {
        a.ah(this.e != -1, "Illegal call to ListUpdateCallback");
        int i = this.d;
        this.d = i + 1;
        List list = this.c;
        if (list.size() > i) {
            return (iex) list.get(i);
        }
        iex iexVar = new iex();
        list.add(iexVar);
        return iexVar;
    }

    final int a() {
        int i = this.e + this.a;
        this.e = i;
        return i;
    }

    final void c() {
        this.d = 0;
        this.e = -1;
        this.a = 0;
        synchronized (iey.class) {
            b = this;
        }
    }

    final void d(ifb ifbVar) {
        for (int i = 0; i < this.d; i++) {
            iex iexVar = (iex) this.c.get(i);
            int i2 = iexVar.a;
            if (i2 == 1) {
                ifbVar.notifyItemRangeInserted(iexVar.b, iexVar.c);
            } else if (i2 == 2) {
                ifbVar.notifyItemRangeRemoved(iexVar.b, iexVar.c);
            } else if (i2 == 3) {
                ifbVar.notifyItemMoved(iexVar.b, iexVar.c);
            } else if (i2 == 4) {
                ifbVar.notifyItemRangeChanged(iexVar.b, iexVar.c, iexVar.d);
            }
        }
        c();
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public final void onChanged(int i, int i2, Object obj) {
        a.aD(i >= 0 && i < this.a, "onChanged: invalid position");
        a.aD(i2 >= 0 && i + i2 <= this.a, "onChanged: invalid count");
        iex iexVarE = e();
        iexVarE.a = 4;
        iexVarE.b = this.e + i;
        iexVarE.c = i2;
        iexVarE.d = obj;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public final void onInserted(int i, int i2) {
        a.aD(i >= 0 && i <= this.a, "onInserted: invalid position");
        a.aD(i2 >= 0, "onInserted: invalid count");
        iex iexVarE = e();
        iexVarE.a = 1;
        iexVarE.b = this.e + i;
        iexVarE.c = i2;
        iexVarE.d = null;
        this.a += i2;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public final void onMoved(int i, int i2) {
        a.aD(i >= 0 && i < this.a, "onMoved: invalid fromPosition");
        a.aD(i2 >= 0 && i2 < this.a, "onMoved: invalid toPosition");
        iex iexVarE = e();
        iexVarE.a = 3;
        int i3 = this.e;
        iexVarE.b = i + i3;
        iexVarE.c = i3 + i2;
        iexVarE.d = null;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public final void onRemoved(int i, int i2) {
        a.aD(i >= 0 && i < this.a, "onRemoved: invalid position");
        a.aD(i2 >= 0 && i + i2 <= this.a, "onRemoved: invalid count");
        iex iexVarE = e();
        iexVarE.a = 2;
        iexVarE.b = this.e + i;
        iexVarE.c = i2;
        iexVarE.d = null;
        this.a -= i2;
    }
}
