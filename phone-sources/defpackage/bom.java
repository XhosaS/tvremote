package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bom extends bko implements byl {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public long f;
    public bol g;
    public boolean h;
    public long i;
    public long j;
    public int k;
    public int l = 3;
    public final yjv m = new lk(this, 16);

    public bom(float f, float f2, float f3, float f4, float f5, long j, bol bolVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = bolVar;
        this.h = z;
        this.i = j2;
        this.j = j3;
        this.k = i;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(j);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new lz(bwjVarU, this, 6, null));
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.d + ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.e + ", transformOrigin=" + ((Object) bop.c(this.f)) + ", shape=" + this.g + ", clip=" + this.h + ", renderEffect=null, ambientShadowColor=" + ((Object) bnq.g(this.i)) + ", spotShadowColor=" + ((Object) bnq.g(this.j)) + ", compositingStrategy=" + ((Object) bnu.a(this.k)) + ", blendMode=" + ((Object) bnk.a(this.l)) + ", colorFilter=null)";
    }
}
