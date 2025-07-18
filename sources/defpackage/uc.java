package defpackage;

import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uc {
    public static final qk m = new qk((char[]) null);
    public static final qk n = new qk((char[]) null);
    public static final qk o = new qk((char[]) null);
    public static final qk p = new qk((char[]) null);
    public static final qk q = new qk((char[]) null);
    public static final qk r = new qk((char[]) null);
    public final Object c;
    public final float f;
    public ud i;
    public float j;
    public boolean k;
    public final qk l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean d = false;
    public long e = 0;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public uc(Object obj, qk qkVar) {
        this.c = obj;
        this.l = qkVar;
        float f = 0.1f;
        if (qkVar != o && qkVar != p && qkVar != q) {
            if (qkVar == r) {
                f = 0.00390625f;
            } else {
                f = 0.002f;
                if (qkVar != m && qkVar != n) {
                    f = 1.0f;
                }
            }
        }
        this.f = f;
        this.i = null;
        this.j = Float.MAX_VALUE;
        this.k = false;
    }

    public static void a(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    final void b(float f) {
        bkc bkcVar = (bkc) this.c;
        float[] fArr = bkcVar.g;
        int i = 0;
        if (fArr != null) {
            int i2 = ((bkb) this.l).a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                byj byjVar = bkcVar.i;
                if (byjVar != null) {
                    float fA = bkcVar.a() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) byjVar.a;
                    int i3 = (int) fA;
                    if (materialButton.d != i3) {
                        materialButton.d = i3;
                        materialButton.g();
                        materialButton.invalidate();
                    }
                }
                bkcVar.invalidateSelf();
            }
        }
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                a(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    throw null;
                }
                i++;
            }
        }
    }
}
