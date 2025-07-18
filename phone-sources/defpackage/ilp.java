package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilp implements yjv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ilp(ilf ilfVar, String str, wll wllVar, boolean z, long j, int i) {
        this.f = i;
        this.c = ilfVar;
        this.d = str;
        this.e = wllVar;
        this.a = z;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [clx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bol, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            yih yihVar = (yih) obj;
            long j = this.b;
            boolean z = this.a;
            Object obj2 = this.e;
            return ilo.d((ilo) this.c, (String) this.d, (wll) obj2, z, j, yihVar);
        }
        if (i != 1) {
            yih yihVar2 = (yih) obj;
            long j2 = this.b;
            boolean z2 = this.a;
            Object obj3 = this.e;
            return ilu.d((ilu) this.c, (String) this.d, (wll) obj3, z2, j2, yihVar2);
        }
        byu byuVar = (byu) obj;
        awg awgVar = awg.a;
        byuVar.r();
        if (this.a) {
            bnj.y(byuVar, this.c.a(byuVar.n(), (cmi) this.d, this.e), this.b, 0.1f, 56);
        }
        return ygi.a;
    }

    public /* synthetic */ ilp(boolean z, bol bolVar, cmi cmiVar, clx clxVar, long j, int i) {
        this.f = i;
        this.a = z;
        this.c = bolVar;
        this.d = cmiVar;
        this.e = clxVar;
        this.b = j;
    }
}
