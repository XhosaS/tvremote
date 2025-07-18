package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzc extends oej {
    public final float a;
    public final tll b;
    public final tln c;
    private final int d;
    private final float e;

    public nzc(int i, float f, float f2, tll tllVar, tln tlnVar) {
        this.d = i;
        this.a = f;
        this.e = f2;
        this.b = tllVar;
        this.c = tlnVar;
    }

    @Override // defpackage.oej
    public final float a() {
        return this.e;
    }

    @Override // defpackage.oej
    public final float b() {
        return this.a;
    }

    @Override // defpackage.oej
    public final int c() {
        return this.d;
    }

    @Override // defpackage.oej
    public final tll d() {
        return this.b;
    }

    @Override // defpackage.oej
    public final tln e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oej) {
            oej oejVar = (oej) obj;
            if (this.d == oejVar.c() && Float.floatToIntBits(this.a) == Float.floatToIntBits(oejVar.b()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(oejVar.a())) {
                oejVar.i();
                tll tllVar = this.b;
                if (tllVar != null ? tllVar.equals(oejVar.d()) : oejVar.d() == null) {
                    tln tlnVar = this.c;
                    if (tlnVar != null ? tlnVar.equals(oejVar.e()) : oejVar.e() == null) {
                        oejVar.h();
                        oejVar.j();
                        oejVar.f();
                        oejVar.g();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.d ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ Float.floatToIntBits(this.e);
        tll tllVar = this.b;
        int iHashCode = ((((iFloatToIntBits * 1000003) ^ 1237) * 1000003) ^ (tllVar == null ? 0 : tllVar.hashCode())) * 1000003;
        tln tlnVar = this.c;
        return ((((((iHashCode ^ (tlnVar != null ? tlnVar.hashCode() : 0)) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        tln tlnVar = this.c;
        return "RecyclerConfig{initRangeSize=" + this.d + ", collectionRangeRatio=" + this.a + ", binderRangeRatio=" + this.e + ", recyclerViewItemPrefetch=false, layoutHandlerFactory=" + String.valueOf(this.b) + ", changeSetExecutor=" + String.valueOf(tlnVar) + ", layoutInfo=null, useLegacyVisible=false, cleanupOnDetach=false, enableStableIds=false}";
    }

    @Override // defpackage.oej
    public final void f() {
    }

    @Override // defpackage.oej
    public final void g() {
    }

    @Override // defpackage.oej
    public final void h() {
    }

    @Override // defpackage.oej
    public final void i() {
    }

    @Override // defpackage.oej
    public final void j() {
    }
}
