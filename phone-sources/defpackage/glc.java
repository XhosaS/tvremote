package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glc extends gli {
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

    public glc() {
        super(null);
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

    @Override // defpackage.gli
    public final boolean b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((gli) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.gli
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((gli) arrayList.get(i)).c(iArr);
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

    public glc(glc glcVar, ir irVar) {
        gld glaVar;
        super(null);
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
        this.c = glcVar.c;
        this.d = glcVar.d;
        this.e = glcVar.e;
        this.f = glcVar.f;
        this.g = glcVar.g;
        this.h = glcVar.h;
        this.i = glcVar.i;
        int[] iArr = glcVar.l;
        this.l = null;
        String str = glcVar.m;
        this.m = str;
        int i = glcVar.k;
        this.k = 0;
        if (str != null) {
            irVar.put(str, this);
        }
        matrix.set(glcVar.j);
        ArrayList arrayList = glcVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof glc) {
                this.b.add(new glc((glc) obj, irVar));
            } else {
                if (obj instanceof glb) {
                    glaVar = new glb((glb) obj);
                } else if (obj instanceof gla) {
                    glaVar = new gla((gla) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(glaVar);
                String str2 = glaVar.n;
                if (str2 != null) {
                    irVar.put(str2, glaVar);
                }
            }
        }
    }
}
