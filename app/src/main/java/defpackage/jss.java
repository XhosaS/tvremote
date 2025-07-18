package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jss extends jtm {
    public final URI a;
    public final yze b;
    public final jth c;
    public final jti d;
    public final int e;

    public jss(URI uri, yze yzeVar, jth jthVar, jti jtiVar, int i) {
        this.a = uri;
        this.b = yzeVar;
        this.c = jthVar;
        this.d = jtiVar;
        this.e = i;
    }

    @Override // defpackage.jtm
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jtm
    public final jth b() {
        return this.c;
    }

    @Override // defpackage.jtm
    public final jti c() {
        return this.d;
    }

    @Override // defpackage.jtm
    public final yze d() {
        return this.b;
    }

    @Override // defpackage.jtm
    public final URI e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtm) {
            jtm jtmVar = (jtm) obj;
            if (this.a.equals(jtmVar.e()) && this.b.equals(jtmVar.d()) && this.c.equals(jtmVar.b())) {
                jtmVar.j();
                if (this.d.equals(jtmVar.c()) && this.e == jtmVar.a()) {
                    jtmVar.i();
                    jtmVar.g();
                    jtmVar.h();
                    jtmVar.f();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1525764945;
    }

    public final String toString() {
        jti jtiVar = this.d;
        jth jthVar = this.c;
        yze yzeVar = this.b;
        return "DownloadRequest{uri=" + this.a.toString() + ", headers=" + String.valueOf(yzeVar) + ", downloadConstraints=" + jthVar.toString() + ", oAuthTokenProvider=null, destination=" + jtiVar.toString() + ", trafficStatsTag=" + this.e + ", cookieJar=null, stateChangeListener=null, stateChangeListenerExecutor=null, progressListener=null}";
    }

    @Override // defpackage.jtm
    public final void f() {
    }

    @Override // defpackage.jtm
    public final void g() {
    }

    @Override // defpackage.jtm
    public final void h() {
    }

    @Override // defpackage.jtm
    public final void i() {
    }

    @Override // defpackage.jtm
    public final void j() {
    }
}
