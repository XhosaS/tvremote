package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class bwm extends bwn {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public bwm() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public final void a() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.bwn
    public final boolean b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((bwn) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.bwn
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((bwn) arrayList.get(i)).c(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public bwm(bwm bwmVar, we weVar) {
        bwo bwkVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = bwmVar.c;
        this.d = bwmVar.d;
        this.e = bwmVar.e;
        this.f = bwmVar.f;
        this.g = bwmVar.g;
        this.h = bwmVar.h;
        this.i = bwmVar.i;
        int[] iArr = bwmVar.l;
        this.l = null;
        String str = bwmVar.m;
        this.m = str;
        int i = bwmVar.k;
        this.k = 0;
        if (str != null) {
            weVar.put(str, this);
        }
        matrix.set(bwmVar.j);
        ArrayList arrayList = bwmVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof bwm) {
                this.b.add(new bwm((bwm) obj, weVar));
            } else {
                if (obj instanceof bwl) {
                    bwkVar = new bwl((bwl) obj);
                } else if (obj instanceof bwk) {
                    bwkVar = new bwk((bwk) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(bwkVar);
                Object obj2 = bwkVar.n;
                if (obj2 != null) {
                    weVar.put(obj2, bwkVar);
                }
            }
        }
    }
}
