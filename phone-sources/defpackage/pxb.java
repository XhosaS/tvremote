package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxb {
    private pxg a;
    private qdo b;
    private boolean c;
    private boolean d;
    private byte e;

    public final pxh a() {
        int i = ~this.e;
        if ((i & 3) == 0) {
            return new pxh(this.a, this.b, null, null, this.c, this.d, i & R.styleable.AppCompatTheme_windowMinWidthMajor);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" notificationTarget");
        }
        if ((this.e & 2) == 0) {
            sb.append(" timeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.e = (byte) (this.e | 64);
    }

    public final void c() {
        this.d = true;
        this.e = (byte) (this.e | 32);
    }

    public final void d() {
        this.c = true;
        this.e = (byte) (this.e | 16);
    }

    public final void e(qdo qdoVar) {
        if (qdoVar == null) {
            throw new NullPointerException("Null timeout");
        }
        this.b = qdoVar;
        this.e = (byte) (this.e | 2);
    }

    public final void f(pxg pxgVar) {
        if (pxgVar == null) {
            throw new NullPointerException("Null notificationTarget");
        }
        this.a = pxgVar;
        this.e = (byte) (this.e | 1);
    }
}
