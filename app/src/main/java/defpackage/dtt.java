package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class dtt {
    public static drf a;
    public static dud b;
    public static dwc c;
    public static dss d;
    public static dum e;
    public static dun f;
    public static dye g;
    public static dwy h;
    public static dxd i;
    private static dte j;

    public static void a(dtu dtuVar, View view, MotionEvent motionEvent) {
        dyd.a();
        if (j == null) {
            j = new dte();
        }
        dte dteVar = j;
        dteVar.b = motionEvent;
        dteVar.a = view;
        dtuVar.b.n().x(dtuVar, j);
        dte dteVar2 = j;
        dteVar2.b = null;
        dteVar2.a = null;
    }
}
