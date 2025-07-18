package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyg extends yuk {
    private final yyk a;

    public yyg(yyk yykVar, int i) {
        super(yykVar.size(), i);
        this.a = yykVar;
    }

    @Override // defpackage.yuk
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
