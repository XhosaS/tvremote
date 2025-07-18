package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class owf implements nfb {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ owf(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.nfb
    public final nfc a(eay eayVar, int i) {
        if (this.d != 0) {
            return new lnh((lnk) this.b, (String) this.c, i, this.a);
        }
        eayVar.getClass();
        boolean z = this.a;
        return new owg((String) this.b, this.c, z);
    }
}
