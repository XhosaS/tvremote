package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yt extends bko implements cac {
    public float a;
    public boolean b;

    public yt(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cac
    public final /* bridge */ /* synthetic */ Object cl(Object obj) {
        ze zeVar = obj instanceof ze ? (ze) obj : null;
        if (zeVar == null) {
            zeVar = new ze(null);
        }
        zeVar.a = this.a;
        zeVar.b = this.b;
        return zeVar;
    }
}
