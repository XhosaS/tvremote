package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csh extends crt {
    protected cxb e;
    protected cxb f;
    private final PointF g;
    private final PointF h;
    private final crt i;
    private final crt j;

    public csh(crt crtVar, crt crtVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = crtVar;
        this.j = crtVar2;
        j(this.c);
    }

    @Override // defpackage.crt
    public final /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.crt
    public final /* bridge */ /* synthetic */ Object f(cwz cwzVar, float f) {
        return k(f);
    }

    @Override // defpackage.crt
    public final void j(float f) {
        crt crtVar = this.i;
        crtVar.j(f);
        crt crtVar2 = this.j;
        crtVar2.j(f);
        this.g.set(((Float) crtVar.e()).floatValue(), ((Float) crtVar2.e()).floatValue());
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((cro) list.get(i)).d();
            i++;
        }
    }

    final PointF k(float f) {
        float f2;
        Float f3;
        crt crtVar;
        cwz cwzVarD;
        crt crtVar2;
        cwz cwzVarD2;
        Float f4 = null;
        if (this.e == null || (cwzVarD2 = (crtVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = crtVar2.b();
            Float f5 = cwzVarD2.h;
            f2 = f;
            f3 = (Float) this.e.b(cwzVarD2.g, f5 == null ? cwzVarD2.g : f5.floatValue(), (Float) cwzVarD2.b, (Float) cwzVarD2.c, f, f, fB);
        }
        if (this.f != null && (cwzVarD = (crtVar = this.j).d()) != null) {
            float fB2 = crtVar.b();
            Float f6 = cwzVarD.h;
            f4 = (Float) this.f.b(cwzVarD.g, f6 == null ? cwzVarD.g : f6.floatValue(), (Float) cwzVarD.b, (Float) cwzVarD.c, f2, f2, fB2);
        }
        if (f3 == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
