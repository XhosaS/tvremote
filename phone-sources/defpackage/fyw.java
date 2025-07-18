package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fyw {
    public boolean a;
    public fyx b;

    public fyw(boolean z) {
        this.a = z;
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c(fyv fyvVar) {
        throw null;
    }

    public void d(fyv fyvVar) {
        throw null;
    }

    public final void e() {
        fyx fyxVar = this.b;
        if (fyxVar != null) {
            List list = fyxVar.a;
            if (list.contains(this)) {
                a();
                list.remove(this);
            }
            fyxVar.b.remove(this);
            fyxVar.c.remove(this);
            this.b = null;
            fyxVar.d();
        }
    }
}
