package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zck {
    public zcj a;
    public int b;
    public String c;
    public zcb d;
    public zcn e;
    public zcl f;
    public zcl g;
    public zcl h;
    public long i;
    public long j;
    public bmd k;
    public upq l;
    private zci m;

    public zck() {
        this.b = -1;
        this.l = new upq((byte[]) null, (byte[]) null);
    }

    public static final void b(String str, zcl zclVar) {
        if (zclVar != null) {
            if (zclVar.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (zclVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (zclVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (zclVar.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }
    }

    public final zcl a() {
        int i = this.b;
        if (i < 0) {
            throw new IllegalStateException(a.cf(i, "code < 0: "));
        }
        zcj zcjVar = this.a;
        if (zcjVar == null) {
            throw new IllegalStateException("request == null");
        }
        zci zciVar = this.m;
        if (zciVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.c;
        if (str != null) {
            return new zcl(zcjVar, zciVar, str, i, this.d, this.l.t(), this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(zcc zccVar) {
        this.l = zccVar.f();
    }

    public final void d(zci zciVar) {
        zciVar.getClass();
        this.m = zciVar;
    }

    public zck(zcl zclVar) {
        this.b = -1;
        this.a = zclVar.a;
        this.m = zclVar.b;
        this.b = zclVar.d;
        this.c = zclVar.c;
        this.d = zclVar.e;
        this.l = zclVar.f.f();
        this.e = zclVar.g;
        this.f = zclVar.h;
        this.g = zclVar.i;
        this.h = zclVar.j;
        this.i = zclVar.k;
        this.j = zclVar.l;
        this.k = zclVar.n;
    }
}
