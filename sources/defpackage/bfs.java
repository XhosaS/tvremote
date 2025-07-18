package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfs {
    public byg a;
    public boolean b;
    public byte c;
    public wz d;
    private Uri e;
    private cmz f;
    private bzs g;

    public bfs() {
        throw null;
    }

    public final bft a() {
        Uri uri;
        cmz cmzVar;
        wz wzVar;
        if (this.g == null) {
            int i = bzs.d;
            this.g = cax.a;
        }
        if (this.c == 3 && (uri = this.e) != null && (cmzVar = this.f) != null && (wzVar = this.d) != null) {
            return new bft(uri, cmzVar, this.a, this.g, wzVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" uri");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.d == null) {
            sb.append(" variantConfig");
        }
        if ((this.c & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = (byte) (this.c | 2);
    }

    public final void c(cmz cmzVar) {
        if (cmzVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = cmzVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.e = uri;
    }

    public bfs(byte[] bArr) {
        this.a = bxw.a;
    }
}
