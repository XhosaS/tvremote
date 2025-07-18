package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yy {
    public final yo b;
    public final ArrayList a = new ArrayList();
    private final yx c = new yx();

    public yy(yo yoVar) {
        this.b = yoVar;
    }

    public final void a(yo yoVar) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        int size = yoVar.aJ.size();
        for (int i = 0; i < size; i++) {
            yn ynVar = (yn) yoVar.aJ.get(i);
            int[] iArr = ynVar.ar;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(ynVar);
            }
        }
        yoVar.b.b = true;
    }

    public final boolean b(zs zsVar, yn ynVar, int i) {
        int[] iArr = ynVar.ar;
        int i2 = iArr[0];
        yx yxVar = this.c;
        yxVar.i = i2;
        yxVar.j = iArr[1];
        yxVar.a = ynVar.h();
        yxVar.b = ynVar.g();
        yxVar.g = false;
        yxVar.h = i;
        int i3 = yxVar.i;
        int i4 = yxVar.j;
        boolean z = i3 == 3 && ynVar.Y > 0.0f;
        boolean z2 = i4 == 3 && ynVar.Y > 0.0f;
        if (z && ynVar.v[0] == 4) {
            yxVar.i = 1;
        }
        if (z2 && ynVar.v[1] == 4) {
            yxVar.j = 1;
        }
        zsVar.a(ynVar, yxVar);
        ynVar.B(yxVar.c);
        ynVar.x(yxVar.d);
        ynVar.G = yxVar.f;
        ynVar.u(yxVar.e);
        yxVar.h = 0;
        return yxVar.g;
    }

    public final void c(yo yoVar, int i, int i2, int i3) {
        int i4 = yoVar.ad;
        int i5 = yoVar.ae;
        yoVar.A(0);
        yoVar.z(0);
        yoVar.B(i2);
        yoVar.x(i3);
        yoVar.A(i4);
        yoVar.z(i5);
        yo yoVar2 = this.b;
        yoVar2.c = i;
        yoVar2.c();
    }
}
