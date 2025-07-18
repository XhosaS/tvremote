package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enk {
    public static dzl a;
    public static due b;
    public static duf c;
    private static dux d;
    private static dzi e;
    private static dzk f;

    public static void a(elq elqVar, Object obj) {
        if (d == null) {
            d = new dux();
        }
        if (obj instanceof View) {
            d.a = (View) obj;
        }
        elqVar.d(d);
        d.a = null;
    }

    public static void b(elq elqVar) {
        if (e == null) {
            e = new dzi();
        }
        elqVar.d(e);
    }

    public static void c(elq elqVar, int i, int i2, int i3, int i4, float f2, float f3) {
        if (elqVar == null) {
            return;
        }
        if (f == null) {
            f = new dzk();
        }
        dzk dzkVar = f;
        dzkVar.a = i;
        dzkVar.b = i2;
        dzkVar.c = i4;
        dzkVar.d = i3;
        dzkVar.f = f3;
        dzkVar.e = f2;
        elqVar.d(dzkVar);
    }
}
