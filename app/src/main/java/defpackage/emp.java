package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public class emp {
    public final int a;
    public final Rect b;
    public boolean c = false;
    private Rect d;
    private final emp e;

    public emp(int i, Rect rect, emp empVar) {
        this.a = i;
        this.b = new Rect(rect);
        this.e = empVar;
        if (empVar != null) {
            a(this, empVar);
        }
    }

    private static void a(emp empVar, emp empVar2) {
        boolean z;
        if (empVar2 == null) {
            return;
        }
        Rect rect = empVar.b;
        boolean z2 = true;
        if (empVar.c) {
            empVar2.c = true;
        }
        Rect rect2 = empVar2.b;
        if (rect.top < rect2.top) {
            b(empVar2);
            rect2.top = rect.top;
            z = true;
        } else {
            z = false;
        }
        if (rect.bottom > rect2.bottom) {
            b(empVar2);
            rect2.bottom = rect.bottom;
            z = true;
        }
        if (rect.left < rect2.left) {
            b(empVar2);
            rect2.left = rect.left;
        } else {
            z2 = z;
        }
        if (rect.right > rect2.right) {
            b(empVar2);
            rect2.right = rect.right;
        } else if (!z2) {
            return;
        }
        a(empVar2, empVar2.e);
    }

    private static void b(emp empVar) {
        if (empVar.d == null) {
            empVar.d = new Rect(empVar.b);
        }
    }
}
