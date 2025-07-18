package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reo {
    public tst a;
    public Object b;
    private boolean c;
    private byte d;

    public reo() {
        throw null;
    }

    public final rep a() {
        if (this.d != 1) {
            throw new IllegalStateException("Missing required properties: hasCaptionStyle");
        }
        return new rep((tst) this.b, this.a, this.c);
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final mwf c() {
        ?? r0;
        if (this.d == 1 && (r0 = this.b) != 0) {
            return new mwf(r0, this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.d == 0) {
            sb.append(" isPrimary");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.b = charSequence;
    }

    public reo(byte[] bArr) {
        trk trkVar = trk.a;
        this.b = trkVar;
        this.a = trkVar;
    }

    public reo(byte[] bArr, byte[] bArr2) {
        this.a = trk.a;
    }
}
