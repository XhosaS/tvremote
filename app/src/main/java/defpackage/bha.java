package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bha {
    public boolean a;
    public bhc b;

    public bha(boolean z) {
        this.a = z;
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c(bgz bgzVar) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public final void e() {
        bhc bhcVar = this.b;
        if (bhcVar != null) {
            List list = bhcVar.a;
            if (list.contains(this)) {
                a();
                list.remove(this);
            }
            bhcVar.b.remove(this);
            bhcVar.c.remove(this);
            this.b = null;
            bhcVar.d();
        }
    }
}
