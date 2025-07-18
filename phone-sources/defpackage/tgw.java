package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgw {
    public int b;
    public View.OnClickListener e;
    public final ArrayList a = new ArrayList();
    public int c = 1;
    public String d = "";

    public final void a(tgx tgxVar) {
        this.a.add(tgxVar);
    }

    public final void b(boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgx) arrayList.get(size)).e(this.d, z);
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgx) arrayList.get(size)).a(this.d);
            }
        }
    }

    public final void d(tgx tgxVar) {
        this.a.remove(tgxVar);
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgx) arrayList.get(size)).d(i);
            }
        }
    }

    public final void f(String str) {
        g(str, true);
    }

    public final void g(String str, boolean z) {
        if (this.d.equals(str)) {
            return;
        }
        this.d = str;
        b(z);
    }

    public final void h() {
        e(this.c);
    }

    public final boolean i() {
        return this.b == this.c;
    }
}
