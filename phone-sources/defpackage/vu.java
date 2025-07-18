package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vu implements vc {
    final /* synthetic */ vx a;
    final /* synthetic */ pku b;

    public vu(vx vxVar, pku pkuVar) {
        this.a = vxVar;
        this.b = pkuVar;
    }

    @Override // defpackage.vc
    public final float a(float f) {
        if (Math.abs(f) != 0.0f) {
            vx vxVar = this.a;
            if ((f > 0.0f && !vxVar.a.i()) || ((f < 0.0f && !vxVar.a.h()) || !((Boolean) vxVar.e.a()).booleanValue())) {
                throw new ug();
            }
        }
        vx vxVar2 = this.a;
        return vxVar2.a(vxVar2.b(this.b.E(vxVar2.d(vxVar2.f(f)), 2)));
    }
}
