package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ucn {
    private static final Bundle a = new Bundle();
    private ucm b;
    private ucm c;
    private ucm d;
    public final List e = new ArrayList();
    protected final List f = new ArrayList();
    public ucm g;
    private ucm h;

    public ucn() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public void a() {
        ucm ucmVar = this.h;
        if (ucmVar != null) {
            l(ucmVar);
            this.h = null;
        }
        ucm ucmVar2 = this.b;
        int i = 0;
        if (ucmVar2 != null) {
            l(ucmVar2);
            this.b = null;
        }
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof ucu) {
                ((ucu) udeVar).a();
            }
            i++;
        }
    }

    public void b() {
        ucm ucmVar = this.d;
        int i = 0;
        if (ucmVar != null) {
            l(ucmVar);
            this.d = null;
        }
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof ucx) {
                ((ucx) udeVar).a();
            }
            i++;
        }
    }

    public final Bundle d(ude udeVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String strE = e(udeVar);
        return strE != null ? bundle.getBundle(strE) : a;
    }

    public final String e(ude udeVar) {
        if (udeVar instanceof udb) {
            return udeVar instanceof udf ? ((udf) udeVar).a() : udeVar.getClass().getName();
        }
        return null;
    }

    public final void f(Bundle bundle) {
        uci uciVar = new uci(this, bundle);
        m(uciVar);
        this.b = uciVar;
    }

    public final void g() {
        for (ude udeVar : this.e) {
            if (udeVar instanceof ucv) {
                ((ucv) udeVar).a();
            }
        }
    }

    public final void h() {
        uck uckVar = new uck();
        m(uckVar);
        this.d = uckVar;
    }

    public final void i(Bundle bundle) {
        ucl uclVar = new ucl(this, bundle);
        m(uclVar);
        this.h = uclVar;
    }

    public final void j() {
        ucj ucjVar = new ucj();
        m(ucjVar);
        this.c = ucjVar;
    }

    public final void k() {
        ucm ucmVar = this.c;
        int i = 0;
        if (ucmVar != null) {
            l(ucmVar);
            this.c = null;
        }
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof udd) {
                ((udd) udeVar).a();
            }
            i++;
        }
    }

    public final void l(ucm ucmVar) {
        this.f.remove(ucmVar);
    }

    public final void m(ucm ucmVar) {
        uea.c();
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                this.f.add(ucmVar);
                return;
            } else {
                ucmVar.a((ude) list.get(i));
                i++;
            }
        }
    }

    public final void n(ude udeVar) {
        if (udeVar instanceof ubm) {
            ((ubm) udeVar).a();
        }
    }

    public final void o() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof uco) {
                ((uco) udeVar).a();
            }
            i++;
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ucp) {
                ((ucp) udeVar).a();
            }
            i++;
        }
    }

    public final boolean q() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return false;
            }
            ude udeVar = (ude) list.get(i);
            if ((udeVar instanceof ucq) && ((ucq) udeVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final void r() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ucs) {
                ((ucs) udeVar).a();
            }
            i++;
        }
    }

    public final boolean s() {
        int i = 0;
        boolean zA = false;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return zA;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof uct) {
                zA |= ((uct) udeVar).a();
            }
            i++;
        }
    }

    public final boolean t() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return false;
            }
            ude udeVar = (ude) list.get(i);
            if ((udeVar instanceof ucw) && ((ucw) udeVar).a()) {
                return true;
            }
            i++;
        }
    }

    public final boolean u() {
        int i = 0;
        boolean zA = false;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return zA;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ucy) {
                zA |= ((ucy) udeVar).a();
            }
            i++;
        }
    }

    public final void v() {
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ucz) {
                ((ucz) udeVar).a();
            }
            i++;
        }
    }
}
