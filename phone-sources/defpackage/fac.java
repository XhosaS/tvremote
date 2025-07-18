package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fac {
    private static final Comparator a = new fab(1);
    private static final Comparator b = new fab(0);
    private final int c;
    private int f;
    private int g;
    private int h;
    private final gmi[] i = new gmi[5];
    private final ArrayList d = new ArrayList();
    private int e = -1;

    public fac(int i) {
        this.c = i;
    }

    public final float a(float f) {
        int i = 0;
        if (this.e != 0) {
            Collections.sort(this.d, b);
            this.e = 0;
        }
        float f2 = f * this.g;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((gmi) arrayList.get(arrayList.size() - 1)).b;
            }
            gmi gmiVar = (gmi) arrayList.get(i);
            i2 += gmiVar.a;
            if (i2 >= f2) {
                return gmiVar.b;
            }
            i++;
        }
    }

    public final void b(int i, float f) {
        gmi gmiVar;
        if (this.e != 1) {
            Collections.sort(this.d, a);
            this.e = 1;
        }
        int i2 = this.h;
        if (i2 > 0) {
            gmi[] gmiVarArr = this.i;
            int i3 = i2 - 1;
            this.h = i3;
            gmiVar = gmiVarArr[i3];
        } else {
            gmiVar = new gmi();
        }
        int i4 = this.f;
        this.f = i4 + 1;
        gmiVar.c = i4;
        gmiVar.a = i;
        gmiVar.b = f;
        ArrayList arrayList = this.d;
        arrayList.add(gmiVar);
        this.g += i;
        while (true) {
            int i5 = this.g;
            int i6 = this.c;
            if (i5 <= i6) {
                return;
            }
            gmi gmiVar2 = (gmi) arrayList.get(0);
            int i7 = gmiVar2.a;
            int i8 = i5 - i6;
            if (i7 <= i8) {
                this.g -= i7;
                arrayList.remove(0);
                int i9 = this.h;
                if (i9 < 5) {
                    gmi[] gmiVarArr2 = this.i;
                    this.h = i9 + 1;
                    gmiVarArr2[i9] = gmiVar2;
                }
            } else {
                gmiVar2.a = i7 - i8;
                this.g -= i8;
            }
        }
    }

    public final void c() {
        this.d.clear();
        this.e = -1;
        this.f = 0;
        this.g = 0;
    }
}
