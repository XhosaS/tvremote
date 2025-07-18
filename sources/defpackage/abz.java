package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abz extends qk {
    final Matrix a;
    final ArrayList b;
    float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    final Matrix l;
    int m;
    public int[] n;
    public String o;

    public abz() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = new Matrix();
        this.o = null;
    }

    public String getGroupName() {
        return this.o;
    }

    public Matrix getLocalMatrix() {
        return this.l;
    }

    public float getPivotX() {
        return this.f;
    }

    public float getPivotY() {
        return this.g;
    }

    public float getRotation() {
        return this.e;
    }

    public float getScaleX() {
        return this.h;
    }

    public float getScaleY() {
        return this.i;
    }

    public float getTranslateX() {
        return this.j;
    }

    public float getTranslateY() {
        return this.k;
    }

    @Override // defpackage.qk
    public final boolean n() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((qk) arrayList.get(i)).n()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.qk
    public final boolean o(int[] iArr) {
        int i = 0;
        boolean zO = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zO;
            }
            zO |= ((qk) arrayList.get(i)).o(iArr);
            i++;
        }
    }

    public void setPivotX(float f) {
        if (f != this.f) {
            this.f = f;
            x();
        }
    }

    public void setPivotY(float f) {
        if (f != this.g) {
            this.g = f;
            x();
        }
    }

    public void setRotation(float f) {
        if (f != this.e) {
            this.e = f;
            x();
        }
    }

    public void setScaleX(float f) {
        if (f != this.h) {
            this.h = f;
            x();
        }
    }

    public void setScaleY(float f) {
        if (f != this.i) {
            this.i = f;
            x();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.j) {
            this.j = f;
            x();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.k) {
            this.k = f;
            x();
        }
    }

    public final void x() {
        Matrix matrix = this.l;
        matrix.reset();
        matrix.postTranslate(-this.f, -this.g);
        matrix.postScale(this.h, this.i);
        matrix.postRotate(this.e, 0.0f, 0.0f);
        matrix.postTranslate(this.j + this.f, this.k + this.g);
    }

    public abz(abz abzVar, lz lzVar) {
        aca abxVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        Matrix matrix = new Matrix();
        this.l = matrix;
        this.o = null;
        this.e = abzVar.e;
        this.f = abzVar.f;
        this.g = abzVar.g;
        this.h = abzVar.h;
        this.i = abzVar.i;
        this.j = abzVar.j;
        this.k = abzVar.k;
        int[] iArr = abzVar.n;
        this.n = null;
        String str = abzVar.o;
        this.o = str;
        int i = abzVar.m;
        this.m = 0;
        if (str != null) {
            lzVar.put(str, this);
        }
        matrix.set(abzVar.l);
        ArrayList arrayList = abzVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof abz) {
                this.b.add(new abz((abz) obj, lzVar));
            } else {
                if (obj instanceof aby) {
                    abxVar = new aby((aby) obj);
                } else if (obj instanceof abx) {
                    abxVar = new abx((abx) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(abxVar);
                Object obj2 = abxVar.p;
                if (obj2 != null) {
                    lzVar.put(obj2, abxVar);
                }
            }
        }
    }
}
