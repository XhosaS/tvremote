package defpackage;

import android.content.Intent;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hkk implements gki {
    private final String a;
    public int b;
    public final String c;
    public boolean d;
    private final List e;
    private final String f;
    private final agpc g;

    protected hkk(int i) {
        this.b = i;
        this.a = "";
        this.e = agrd.a;
        this.f = "";
        this.c = "";
        this.g = new agpn(new agum() { // from class: hkj
            @Override // defpackage.agum
            public final Object a() {
                return this.a.i();
            }
        });
    }

    public boolean A() {
        return false;
    }

    public boolean B() {
        return false;
    }

    public int C() {
        return 1;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Intent d();

    public abstract Duration e();

    @Override // defpackage.gki
    public abstract String f();

    public abstract String g();

    public abstract boolean h();

    protected pan i() {
        pan panVar = new pan(c());
        panVar.e(1);
        zoq zoqVar = panVar.b;
        int i = this.b;
        if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zoqVar.y();
        }
        zot zotVar = (zot) zoqVar.b;
        zot zotVar2 = zot.a;
        zotVar.b |= 2;
        zotVar.d = i;
        panVar.f();
        return panVar;
    }

    @Override // defpackage.gki
    public String k() {
        return this.f;
    }

    @Override // defpackage.gki
    public String l() {
        return null;
    }

    @Override // defpackage.gki
    public boolean m() {
        return false;
    }

    public int n() {
        return -1;
    }

    public final pan o() {
        return (pan) this.g.a();
    }

    public String p() {
        return null;
    }

    public String q() {
        return null;
    }

    public String r() {
        return this.a;
    }

    public String s() {
        return this.c;
    }

    public List t() {
        return null;
    }

    public List u() {
        return this.e;
    }

    public List v() {
        return null;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        return false;
    }

    protected hkk() {
        this(0);
    }
}
