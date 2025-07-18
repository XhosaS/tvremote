package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxd {
    public String a;
    public byte b;
    private kuf c;
    private int d;
    private Uri e;
    private String f;
    private boolean g;
    private boolean h;

    public final mxe a() {
        kuf kufVar;
        Uri uri;
        String str;
        if (this.b == 15 && (kufVar = this.c) != null && (uri = this.e) != null && (str = this.f) != null) {
            return new mxa(kufVar, this.d, uri, str, null, this.a, this.g, this.h, false);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" distributorId");
        }
        if ((this.b & 1) == 0) {
            sb.append(" distributorType");
        }
        if (this.e == null) {
            sb.append(" iconUri");
        }
        if (this.f == null) {
            sb.append(" title");
        }
        if ((this.b & 2) == 0) {
            sb.append(" isAvod");
        }
        if ((this.b & 4) == 0) {
            sb.append(" isFreeTabEnabled");
        }
        if ((this.b & 8) == 0) {
            sb.append(" hasFreeEpisodes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(kuf kufVar) {
        if (kufVar == null) {
            throw new NullPointerException("Null distributorId");
        }
        this.c = kufVar;
    }

    public final void c(int i) {
        this.d = i;
        this.b = (byte) (this.b | 1);
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.e = uri;
    }

    public final void e(boolean z) {
        this.g = z;
        this.b = (byte) (this.b | 2);
    }

    public final void f(boolean z) {
        this.h = z;
        this.b = (byte) (this.b | 4);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f = str;
    }
}
