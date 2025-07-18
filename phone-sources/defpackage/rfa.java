package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfa {
    public int a;
    public String b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    private int j;
    private int k;
    private boolean l;

    public rfa() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final rfc a() {
        String str;
        ?? r9;
        Object obj;
        if (this.c == 15 && (str = this.b) != null && (r9 = this.e) != 0 && (obj = this.g) != null) {
            int i = this.j;
            Object obj2 = this.d;
            int i2 = this.a;
            int i3 = this.k;
            Object obj3 = this.f;
            rfc rfcVar = new rfc(i, (Drawable) obj2, i2, str, i3, r9, (dvs) obj3, this.l, (rez) obj, (tst) this.h, (tst) this.i);
            int i4 = rfcVar.c;
            sij.x((i4 != -1) ^ (rfcVar.b != null), "Either icon id or icon drawable must be specified");
            return rfcVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.c & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.b == null) {
            sb.append(" label");
        }
        if ((this.c & 4) == 0) {
            sb.append(" veId");
        }
        if (this.e == null) {
            sb.append(" onClickListener");
        }
        if ((this.c & 8) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (this.g == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(rez rezVar) {
        if (rezVar == null) {
            throw new NullPointerException("Null actionType");
        }
        this.g = rezVar;
    }

    public final void c(tst tstVar) {
        if (tstVar == null) {
            throw new NullPointerException("Null availabilityChecker");
        }
        this.h = tstVar;
    }

    public final void d(int i) {
        this.a = i;
        this.c = (byte) (this.c | 2);
    }

    public final void e(int i) {
        this.j = i;
        this.c = (byte) (this.c | 1);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.b = str;
    }

    public final void g(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            throw new NullPointerException("Null onClickListener");
        }
        this.e = onClickListener;
    }

    public final void h(int i) {
        this.k = i;
        this.c = (byte) (this.c | 4);
    }

    public final void i(boolean z) {
        this.l = z;
        this.c = (byte) (this.c | 8);
    }

    public final lof j() {
        Object obj;
        if ((this.c & 4) == 0) {
            throw new IllegalStateException("Property \"getItemType\" has not been set");
        }
        a.ab(this.k != 0);
        Object obj2 = this.g;
        if (obj2 == null) {
            throw new IllegalStateException("Property \"getItemId\" has not been set");
        }
        Object obj3 = this.d;
        if (obj3 == null) {
            throw new IllegalStateException("Property \"getReferrerUri\" has not been set");
        }
        if (this.c == 15 && (obj = this.h) != null) {
            return new loe((String) obj2, (String) this.i, this.b, this.j, (String) obj, this.a, this.k, (ksn) this.f, (Uri) obj3, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" getItemId");
        }
        if ((1 & this.c) == 0) {
            sb.append(" getFilteringType");
        }
        if (this.h == null) {
            sb.append(" getReferrer");
        }
        if ((this.c & 2) == 0) {
            sb.append(" getEventSource");
        }
        if ((this.c & 4) == 0) {
            sb.append(" getItemType");
        }
        if (this.d == null) {
            sb.append(" getReferrerUri");
        }
        if ((this.c & 8) == 0) {
            sb.append(" suppressPostSuccessAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int k() {
        if ((this.c & 2) != 0) {
            return this.a;
        }
        throw new IllegalStateException("Property \"getEventSource\" has not been set");
    }

    public final String l() {
        Object obj = this.h;
        if (obj != null) {
            return (String) obj;
        }
        throw new IllegalStateException("Property \"getReferrer\" has not been set");
    }

    public final void m(int i) {
        this.j = i;
        this.c = (byte) (this.c | 1);
    }

    public final void n(int i) {
        this.k = i;
        this.c = (byte) (this.c | 4);
    }

    public final void o(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null getReferrerUri");
        }
        this.d = uri;
    }

    public final void p(String str) {
        n(6);
        this.g = str;
        this.i = null;
        this.b = null;
        o(log.a(kfw.y(k(), l()), (ieg) this.e, log.a.buildUpon().appendEncodedPath("movies/details").appendQueryParameter("id", str)));
    }

    public final void q(boolean z) {
        this.l = z;
        this.c = (byte) (this.c | 8);
    }

    public rfa(rfc rfcVar) {
        trk trkVar = trk.a;
        this.h = trkVar;
        this.i = trkVar;
        this.j = rfcVar.a;
        this.d = rfcVar.b;
        this.a = rfcVar.c;
        this.b = rfcVar.d;
        this.k = rfcVar.e;
        this.e = rfcVar.f;
        this.f = rfcVar.g;
        this.l = rfcVar.h;
        this.g = rfcVar.i;
        this.h = rfcVar.j;
        this.i = rfcVar.k;
        this.c = (byte) 15;
    }

    public rfa(byte[] bArr) {
        trk trkVar = trk.a;
        this.h = trkVar;
        this.i = trkVar;
    }

    public rfa(char[] cArr) {
        this.e = ieg.a;
    }
}
