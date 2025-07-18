package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqj extends tqm {
    public adis a;
    public final yqt b;
    public final yqt c;
    public final yqt d;

    public tqj() {
        ypv ypvVar = ypv.a;
        this.b = ypvVar;
        this.c = ypvVar;
        this.d = ypvVar;
    }

    @Override // defpackage.tqm
    public final adis a() {
        adis adisVar = this.a;
        if (adisVar != null) {
            return adisVar;
        }
        throw new IllegalStateException("Property \"format\" has not been set");
    }
}
