package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfd {
    public byte a;
    private boolean b;

    public rfd() {
    }

    public final rfe a() {
        if (this.a == 3) {
            return new rfe(this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" showSwitchProfileAction");
        }
        if ((this.a & 2) == 0) {
            sb.append(" disableDecorationFeatures");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public rfd(rfe rfeVar) {
        this.b = rfeVar.a;
        this.a = (byte) 3;
    }
}
