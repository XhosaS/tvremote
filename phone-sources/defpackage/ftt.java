package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftt extends dyk {
    public final /* synthetic */ ftu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftt(ftu ftuVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.b = ftuVar;
    }

    @Override // defpackage.dyk
    public final void b(int i) {
        this.b.c.a.post(new csl(this, i, 6));
    }

    @Override // defpackage.dyk
    public final void c(int i) {
        this.b.c.a.post(new csl(this, i, 5));
    }
}
