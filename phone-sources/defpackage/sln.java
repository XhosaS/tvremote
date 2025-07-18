package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sln {
    public tst a;
    public ImmutableList.Builder b;
    public ImmutableList c;
    public sma d;
    public boolean e;
    public byte f;
    private Uri g;
    private vvj h;

    public sln() {
        throw null;
    }

    public final slo a() {
        Uri uri;
        vvj vvjVar;
        sma smaVar;
        ImmutableList.Builder builder = this.b;
        if (builder != null) {
            this.c = builder.build();
        } else if (this.c == null) {
            this.c = ImmutableList.of();
        }
        if (this.f == 3 && (uri = this.g) != null && (vvjVar = this.h) != null && (smaVar = this.d) != null) {
            return new slo(uri, vvjVar, this.a, this.c, smaVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" uri");
        }
        if (this.h == null) {
            sb.append(" schema");
        }
        if (this.d == null) {
            sb.append(" variantConfig");
        }
        if ((this.f & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.f & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.f = (byte) (this.f | 2);
    }

    public final void c(vvj vvjVar) {
        if (vvjVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.h = vvjVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.g = uri;
    }

    public sln(byte[] bArr) {
        this.a = trk.a;
    }
}
