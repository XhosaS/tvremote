package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpo extends gqa {
    public gpo(Class cls) {
        super(cls);
    }

    @Override // defpackage.gqa
    public final /* bridge */ /* synthetic */ cvi a() {
        if (this.a && this.c.k.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new cvi(this);
    }
}
