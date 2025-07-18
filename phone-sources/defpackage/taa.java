package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taa {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    private final List g = new ArrayList();
    private final List h = new ArrayList();

    public taa() {
        e(0.0f, 0.0f);
    }

    private final void g(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.c;
            float f5 = this.d;
            szw szwVar = new szw(f4, f5, f4, f5);
            szwVar.e = this.e;
            szwVar.f = f3;
            this.h.add(new szu(szwVar));
            this.e = f;
        }
    }

    private final void h(szz szzVar, float f, float f2) {
        g(f);
        this.h.add(szzVar);
        this.e = f2;
    }

    final szz a(Matrix matrix) {
        g(this.f);
        return new szt(new ArrayList(this.h), new Matrix(matrix));
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        szw szwVar = new szw(f, f2, f3, f4);
        szwVar.e = f5;
        szwVar.f = f6;
        this.g.add(szwVar);
        szu szuVar = new szu(szwVar);
        boolean z = f6 < 0.0f;
        float f7 = z ? (f5 + 180.0f) % 360.0f : f5;
        float f8 = f5 + f6;
        h(szuVar, f7, z ? (180.0f + f8) % 360.0f : f8);
        double d = f8;
        this.c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    public final void c(Matrix matrix, Path path) {
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((szy) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        szx szxVar = new szx();
        szxVar.a = f;
        szxVar.b = f2;
        this.g.add(szxVar);
        szv szvVar = new szv(szxVar, this.c, this.d);
        h(szvVar, szvVar.b() + 270.0f, szvVar.b() + 270.0f);
        this.c = f;
        this.d = f2;
    }

    public final void e(float f, float f2) {
        f(f, f2, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
