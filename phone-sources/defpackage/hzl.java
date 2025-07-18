package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class hzl extends hzp {
    public float b;
    public float c;
    final /* synthetic */ hzr d;

    public hzl(hzr hzrVar, float f, float f2) {
        this.d = hzrVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.hzp
    public void a(String str) {
        hzr hzrVar = this.d;
        if (hzrVar.i()) {
            hzn hznVar = hzrVar.d;
            if (hznVar.b) {
                hzrVar.a.drawText(str, this.b, this.c, hznVar.d);
            }
            hzn hznVar2 = hzrVar.d;
            if (hznVar2.c) {
                hzrVar.a.drawText(str, this.b, this.c, hznVar2.e);
            }
        }
        this.b += hzrVar.d.d.measureText(str);
    }
}
