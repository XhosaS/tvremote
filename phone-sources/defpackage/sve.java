package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sve {
    public int a;
    public int b;
    public int c;
    public int d;

    public sve(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a(View view) {
        view.setPaddingRelative(this.a, this.b, this.c, this.d);
    }

    public sve(sve sveVar) {
        this.a = sveVar.a;
        this.b = sveVar.b;
        this.c = sveVar.c;
        this.d = sveVar.d;
    }
}
