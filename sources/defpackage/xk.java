package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class xk {
    public static final Object a = new Object();
    public final Object b = new Object();
    public final ls c = new ls();
    public int d = 0;
    public boolean e;
    public volatile Object f;
    public volatile Object g;
    public int h;
    public final Runnable i;
    private boolean j;
    private boolean k;

    public xk() {
        Object obj = a;
        this.g = obj;
        this.i = new ki(this, 12, null);
        this.f = obj;
        this.h = -1;
    }

    public static void a(String str) {
        li.a();
        if (!li.b()) {
            throw new IllegalStateException(b.c(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void h(xj xjVar) {
        if (xjVar.c) {
            if (!xjVar.d()) {
                xjVar.e(false);
                return;
            }
            int i = xjVar.d;
            int i2 = this.h;
            if (i < i2) {
                xjVar.d = i2;
                yj yjVar = xjVar.f;
                Object obj = this.f;
                if (yh.b(2)) {
                    Log.v("LoaderManager", "  onLoadFinished in " + yjVar.a + ": " + yo.e(obj));
                }
                yjVar.b = true;
                beg begVar = yjVar.c;
                begVar.Z.clear();
                begVar.Z.addAll((List) obj);
                begVar.Z.notifyDataSetChanged();
            }
        }
    }

    final void b(xj xjVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (xjVar != null) {
                h(xjVar);
            } else {
                lp lpVarE = this.c.e();
                while (lpVarE.hasNext()) {
                    h((xj) ((lo) lpVarE.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            xjVar = null;
        }
    }

    public void e(Object obj) {
        throw null;
    }

    public final void f(xf xfVar, yj yjVar) {
        Object obj;
        a("observe");
        if (xfVar.m().a == xb.a) {
            return;
        }
        xi xiVar = new xi(this, xfVar, yjVar);
        ls lsVar = this.c;
        lo loVarA = lsVar.a(yjVar);
        if (loVarA != null) {
            obj = loVarA.b;
        } else {
            lsVar.d(yjVar, xiVar);
            obj = null;
        }
        xj xjVar = (xj) obj;
        if (xjVar != null && !xjVar.c(xfVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xjVar == null) {
            xfVar.m().a(xiVar);
        }
    }

    public void g(yj yjVar) {
        a("removeObserver");
        xj xjVar = (xj) this.c.b(yjVar);
        if (xjVar == null) {
            return;
        }
        xjVar.b();
        xjVar.e(false);
    }

    protected void c() {
    }

    protected void d() {
    }
}
