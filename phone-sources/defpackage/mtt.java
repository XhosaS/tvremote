package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtt {
    public ksy a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public int i;
    public int j;
    public String k;
    public boolean l;
    public idy m;
    public mit n;
    public lio o;
    public String p;
    public Uri q;
    public int r;
    public int s;
    public boolean t;
    public ieg u;
    public ieg v;
    public ieg w;
    public short x;

    public final void a(boolean z) {
        this.l = z;
        this.x = (short) (this.x | 64);
    }

    public final void b(int i) {
        this.b = i;
        this.x = (short) (this.x | 1);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null directPlayButtonContentDescription");
        }
        this.p = str;
    }

    public final void d(boolean z) {
        this.h = z;
        this.x = (short) (this.x | 4);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null starRating");
        }
        this.k = str;
    }

    public final void f(int i) {
        this.i = i;
        this.x = (short) (this.x | 8);
    }

    public final void g(int i) {
        this.j = i;
        this.x = (short) (this.x | 16);
    }

    public final void h(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null uiElementNodeResult");
        }
        this.u = iegVar;
    }
}
