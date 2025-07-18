package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vqu implements zvh {
    final /* synthetic */ zvh a;
    final /* synthetic */ zyd b;

    public vqu(zvh zvhVar, zyd zydVar) {
        this.a = zvhVar;
        this.b = zydVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        return this.a.a();
    }

    public final String toString() {
        zyd zydVar = this.b;
        return this.a.toString() + ", input=[" + String.valueOf(zydVar) + "]";
    }
}
