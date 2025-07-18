package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glb extends gld {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    nuh k;
    nuh l;

    public glb() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    @Override // defpackage.gli
    public final boolean b() {
        return this.l.r() || this.k.r();
    }

    @Override // defpackage.gli
    public final boolean c(int[] iArr) {
        return this.k.s(iArr) | this.l.s(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public glb(glb glbVar) {
        super(glbVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = glbVar.a;
        this.a = null;
        this.k = glbVar.k;
        this.b = glbVar.b;
        this.c = glbVar.c;
        this.l = glbVar.l;
        this.o = glbVar.o;
        this.d = glbVar.d;
        this.e = glbVar.e;
        this.f = glbVar.f;
        this.g = glbVar.g;
        this.h = glbVar.h;
        this.i = glbVar.i;
        this.j = glbVar.j;
    }
}
