package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzq extends hzp {
    public float a = 0.0f;
    final /* synthetic */ hzr b;

    public hzq(hzr hzrVar) {
        this.b = hzrVar;
    }

    @Override // defpackage.hzp
    public final void a(String str) {
        this.a += this.b.d.d.measureText(str);
    }
}
