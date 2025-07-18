package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbz extends ccv {
    public cbz(Class cls) {
        super(cls);
    }

    @Override // defpackage.ccv
    public final /* bridge */ /* synthetic */ ccw a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new cca(this);
    }
}
