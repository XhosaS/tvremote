package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggf implements AutoCloseable {
    public final String a;
    public final yjz b;
    public final yft c = new yga(new gem(this, 4));
    public final cb d;

    public ggf(cb cbVar, String str, yjz yjzVar) {
        this.d = cbVar;
        this.a = str;
        this.b = yjzVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yft yftVar = this.c;
        if (yftVar.b()) {
            ((gic) yftVar.a()).close();
        }
    }
}
