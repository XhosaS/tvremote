package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbm {
    public static final zbm a;
    public static final zbm b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private String o;

    static {
        zbl zblVar = new zbl();
        zblVar.b();
        a = zblVar.a();
        zbl zblVar2 = new zbl();
        zblVar2.c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        long seconds = timeUnit.toSeconds(2147483647L);
        zblVar2.b = seconds > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) seconds;
        b = zblVar2.a();
    }

    public zbm(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.j = i2;
        this.k = z3;
        this.l = z4;
        this.f = z5;
        this.g = i3;
        this.h = i4;
        this.i = z6;
        this.m = z7;
        this.n = z8;
        this.o = str;
    }

    public final String toString() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        int i = this.e;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.j;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.k) {
            sb.append("private, ");
        }
        if (this.l) {
            sb.append("public, ");
        }
        if (this.f) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.g;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.h;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.i) {
            sb.append("only-if-cached, ");
        }
        if (this.m) {
            sb.append("no-transform, ");
        }
        if (this.n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.o = string;
        return string;
    }
}
