package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myq {
    public tst a;
    public String b;
    public idb c;
    private int d;
    private byte e;

    public myq() {
        throw null;
    }

    public final myr a() {
        String str;
        idb idbVar;
        if (this.e == 1 && (str = this.b) != null && (idbVar = this.c) != null) {
            return new myr(this.d, this.a, str, idbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" sectionHeight");
        }
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.c == null) {
            sb.append(" isTrailerPlaying");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public myq(byte[] bArr) {
        this.a = trk.a;
    }
}
