package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zco extends yzj {
    static final zco b = new zco(new zby());
    final transient zby c;
    private final transient int d;
    private transient yzq e;

    public zco(zby zbyVar) {
        this.c = zbyVar;
        long jC = 0;
        for (int i = 0; i < zbyVar.c; i++) {
            jC += zbyVar.c(i);
        }
        this.d = ztm.d(jC);
    }

    @Override // defpackage.zbp
    public final int a(Object obj) {
        return this.c.b(obj);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.yzj, defpackage.zbp
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final yzq i() {
        yzq yzqVar = this.e;
        if (yzqVar != null) {
            return yzqVar;
        }
        zcm zcmVar = new zcm(this);
        this.e = zcmVar;
        return zcmVar;
    }

    @Override // defpackage.yzj
    public final zbo p(int i) {
        return this.c.h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.zbp
    public final int size() {
        return this.d;
    }

    @Override // defpackage.yzj, defpackage.yxy
    public Object writeReplace() {
        return new zcn(this);
    }
}
