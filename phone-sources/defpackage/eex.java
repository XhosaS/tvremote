package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eex {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public eex(eey eeyVar) {
        this.a = eeyVar.a;
        this.b = eeyVar.b;
        this.c = eeyVar.c;
        this.d = eeyVar.d;
        this.e = eeyVar.e;
        this.f = eeyVar.f;
        this.g = eeyVar.g;
        this.h = eeyVar.h;
        this.i = eeyVar.i;
    }

    public final eey a() {
        eci.f(this.a, "The uri must be set.");
        return new eey(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }

    public eex() {
        this.c = 1;
        this.e = Collections.EMPTY_MAP;
        this.g = -1L;
    }
}
