package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqw implements rqx {
    public final rqs a;

    public rqw(rpz rpzVar) {
        this.a = new rqt(rpzVar);
    }

    @Override // defpackage.rqx
    public final rqs a(int i, String str) {
        rqs rqsVar = this.a;
        rqsVar.a(i, str);
        return rqsVar;
    }

    @Override // defpackage.rqx
    public final rqs b(abqb abqbVar) {
        rqs rqsVar = this.a;
        rqsVar.b(abqbVar);
        return rqsVar;
    }

    public final /* synthetic */ int c() {
        return ((rqm) ((rqt) this.a).a.a).a;
    }

    @Override // defpackage.rqx
    public final Duration d() {
        throw null;
    }

    @Override // defpackage.rqx
    public final boolean e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rqw) {
            return Objects.equals(this.a, ((rqw) obj).a);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void f(Duration duration) {
        ((rqt) this.a).c = yqt.i(duration);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return ((rqt) this.a).a.b;
    }
}
