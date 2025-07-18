package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aby extends aca {
    public int[] a;
    float b;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;
    ael m;
    ael n;

    public aby() {
        this.b = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.n.a;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.m.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    @Override // defpackage.qk
    public final boolean n() {
        return this.n.g() || this.m.g();
    }

    @Override // defpackage.qk
    public final boolean o(int[] iArr) {
        return this.m.h(iArr) | this.n.h(iArr);
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.n.a = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.m.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }

    public aby(aby abyVar) {
        super(abyVar);
        this.b = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = abyVar.a;
        this.a = null;
        this.m = abyVar.m;
        this.b = abyVar.b;
        this.e = abyVar.e;
        this.n = abyVar.n;
        this.q = abyVar.q;
        this.f = abyVar.f;
        this.g = abyVar.g;
        this.h = abyVar.h;
        this.i = abyVar.i;
        this.j = abyVar.j;
        this.k = abyVar.k;
        this.l = abyVar.l;
    }
}
