package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtr implements ids {
    public final ieg a;
    public final idr b = new idz(0);
    public final mbm c;
    public final idy d;
    public boolean e;
    public boolean f;
    private final mtp g;

    public mtr(Activity activity, ldv ldvVar, ieg iegVar, idy idyVar) {
        this.d = idyVar;
        this.a = iegVar;
        this.g = new mtp(this, new led(activity, ldvVar, new icy(iegVar)), ldvVar, 0);
        this.c = new mbm(activity, new mtq(this));
    }

    private final void g() {
        this.e = false;
        this.f = false;
        this.c.b();
    }

    public final int a() {
        return ((Integer) this.b.a()).intValue();
    }

    public final void b() {
        mtp mtpVar = this.g;
        mtpVar.c = false;
        mtpVar.d = false;
    }

    public final void c() {
        g();
        mtp mtpVar = this.g;
        led ledVar = mtpVar.a;
        ledVar.c();
        ledVar.b();
        if (mtpVar.c) {
            mtpVar.c = false;
            if (mtpVar.f != null || mtpVar.b.r(mtpVar.e)) {
                mtpVar.a(mtpVar.e, mtpVar.f, false);
                return;
            }
        }
        if (mtpVar.d) {
            mtpVar.d = false;
            if (mtpVar.b.r(mtpVar.e)) {
                mtpVar.b(mtpVar.e, mtpVar.f, false);
                return;
            }
        }
        mtr mtrVar = (mtr) mtpVar.g;
        ieg iegVar = mtrVar.a;
        if (iegVar.k()) {
            mtrVar.b.c(1);
            ledVar.e(mtpVar);
        } else {
            mtrVar.b.c(2);
            ledVar.f((ksn) iegVar.g(), mtpVar);
        }
    }

    public final void d() {
        this.c.b();
        this.b.c(8);
    }

    public final void e() {
        g();
        this.b.c(0);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.b.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.b.ee(iejVar);
    }

    public final void f(int i, int i2, Intent intent) {
        this.g.a.g(i, i2, intent);
    }
}
