package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bly extends bko implements bmb {
    public yjv a;
    private bmp b;

    public bly(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bmb
    public final void ck(bmp bmpVar) {
        if (yks.e(this.b, bmpVar)) {
            return;
        }
        this.b = bmpVar;
        this.a.a(bmpVar);
    }
}
