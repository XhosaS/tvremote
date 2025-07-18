package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdt extends hdg {
    protected hhu e;
    protected hhu f;
    private final PointF g;
    private final PointF h;
    private final hdg i;
    private final hdg j;

    public hdt(hdg hdgVar, hdg hdgVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = hdgVar;
        this.j = hdgVar2;
        j(this.c);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        return k(f);
    }

    @Override // defpackage.hdg
    public final void j(float f) {
        hdg hdgVar = this.i;
        hdgVar.j(f);
        hdg hdgVar2 = this.j;
        hdgVar2.j(f);
        this.g.set(((Float) hdgVar.e()).floatValue(), ((Float) hdgVar2.e()).floatValue());
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((hdb) list.get(i)).d();
            i++;
        }
    }

    final PointF k(float f) {
        float f2;
        Float f3;
        hdg hdgVar;
        hhs hhsVarD;
        hdg hdgVar2;
        hhs hhsVarD2;
        Float f4 = null;
        if (this.e == null || (hhsVarD2 = (hdgVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = hdgVar2.b();
            Float f5 = hhsVarD2.h;
            f2 = f;
            f3 = (Float) this.e.b(hhsVarD2.g, f5 == null ? hhsVarD2.g : f5.floatValue(), (Float) hhsVarD2.b, (Float) hhsVarD2.c, f, f, fB);
        }
        if (this.f != null && (hhsVarD = (hdgVar = this.j).d()) != null) {
            float fB2 = hdgVar.b();
            Float f6 = hhsVarD.h;
            f4 = (Float) this.f.b(hhsVarD.g, f6 == null ? hhsVarD.g : f6.floatValue(), (Float) hhsVarD.b, (Float) hhsVarD.c, f2, f2, fB2);
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
