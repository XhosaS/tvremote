package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class diu implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ diu(String str, djo djoVar, djh djhVar, boolean z, dit ditVar, int i, int i2, int i3) {
        this.h = i3;
        this.d = str;
        this.e = djoVar;
        this.f = djhVar;
        this.a = z;
        this.g = ditVar;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [djo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [djo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v0, types: [djh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [djh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [djh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            int i3 = this.b;
            Object obj3 = this.g;
            boolean z = this.a;
            ?? r2 = this.f;
            crn.w((String) this.d, this.e, r2, z, (dit) obj3, i3, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            int i4 = this.c;
            int i5 = this.b;
            Object obj4 = this.g;
            boolean z2 = this.a;
            ?? r22 = this.f;
            crn.v((String) this.d, this.e, r22, z2, (dit) obj4, i5, baoVar2, bdi.n(i4 | 1));
            return ygi.a;
        }
        if (i != 2) {
            bao baoVar3 = (bao) obj;
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.b | 1);
            int i6 = this.c;
            ?? r7 = this.d;
            boolean z3 = this.a;
            Object obj5 = this.f;
            ((kuw) this.e).a((arl) this.g, (arl) obj5, z3, r7, baoVar3, iN, i6);
            return ygi.a;
        }
        bao baoVar4 = (bao) obj;
        ((Integer) obj2).intValue();
        int i7 = this.c;
        int i8 = this.b;
        Object obj6 = this.g;
        boolean z4 = this.a;
        ?? r23 = this.f;
        crn.x((String) this.e, this.d, r23, z4, (dit) obj6, i8, baoVar4, bdi.n(i7 | 1));
        return ygi.a;
    }

    public /* synthetic */ diu(String str, yjk yjkVar, djh djhVar, boolean z, dit ditVar, int i, int i2, int i3) {
        this.h = i3;
        this.e = str;
        this.d = yjkVar;
        this.f = djhVar;
        this.a = z;
        this.g = ditVar;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ diu(kuw kuwVar, arl arlVar, arl arlVar2, boolean z, yjz yjzVar, int i, int i2, int i3) {
        this.h = i3;
        this.e = kuwVar;
        this.g = arlVar;
        this.f = arlVar2;
        this.a = z;
        this.d = yjzVar;
        this.b = i;
        this.c = i2;
    }
}
