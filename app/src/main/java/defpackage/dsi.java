package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsi {
    public final dru a;
    public boolean b = true;
    public drq c;
    public boolean d;
    public boolean e;
    public emk f;
    public dxy g;
    public boolean h;
    public dsm i;
    public boolean j;
    public dtp k;
    public boolean l;
    public String m;
    public dvn n;
    public boolean o;
    public ohv p;

    public dsi(dru druVar) {
        boolean z = ebc.a;
        this.d = true;
        this.e = true;
        this.h = false;
        this.j = false;
        this.k = dta.a;
        this.l = ebc.d;
        this.o = false;
        this.a = druVar;
    }

    public final ComponentTree a() {
        if (this.c == null) {
            this.c = dxn.b(this.a).a;
        }
        if (this.p != null && this.m == null) {
            this.m = this.c.d();
        }
        return new ComponentTree(this);
    }
}
