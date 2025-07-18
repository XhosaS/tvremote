package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwg {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public int f;
    public Uri g;
    public String h;
    public String i;
    public Uri j;
    public String k;
    public String l;
    public String m;
    public byte n;

    public final void a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null clientStateUri");
        }
        this.g = uri;
    }

    public final void b(int i) {
        this.f = i;
        this.n = (byte) (this.n | 4);
    }

    public final void c(boolean z) {
        this.e = z;
        this.n = (byte) (this.n | 2);
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.j = uri;
    }

    public final void e(boolean z) {
        this.d = z;
        this.n = (byte) (this.n | 1);
    }
}
