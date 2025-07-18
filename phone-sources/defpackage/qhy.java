package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhy extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ yyk d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhy(yyk yykVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = yykVar;
        this.e = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((qhy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qhy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.f != 0 ? new qhy(this.d, (yjz) this.e, yihVar, 1) : new qhy(this.d, (yjv) this.e, yihVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [yjv] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [yjz] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        yyk yykVar;
        ?? r3;
        Object obj2;
        Throwable th;
        yyk yykVar2;
        ?? r32;
        Object obj3;
        Throwable th2;
        if (this.f != 0) {
            yio yioVar = yio.a;
            int i = this.c;
            try {
                if (i == 0) {
                    ybn.f(obj);
                    yykVar2 = this.d;
                    Object obj4 = this.e;
                    this.a = yykVar2;
                    this.b = obj4;
                    this.c = 1;
                    if (yykVar2.b(this) != yioVar) {
                        r32 = obj4;
                    }
                    return yioVar;
                }
                if (i != 1) {
                    obj3 = this.a;
                    try {
                        ybn.f(obj);
                        ((yyk) obj3).d();
                        return ygi.a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((yyk) obj3).d();
                        throw th2;
                    }
                }
                Object obj5 = this.b;
                ?? r4 = this.a;
                ybn.f(obj);
                yykVar2 = r4;
                r32 = obj5;
                daz dazVar = new daz((yjz) r32, (yih) null, 4, (char[]) null);
                this.a = yykVar2;
                this.b = null;
                this.c = 2;
                if (yoz.k(dazVar, this) != yioVar) {
                    obj3 = yykVar2;
                    ((yyk) obj3).d();
                    return ygi.a;
                }
                return yioVar;
            } catch (Throwable th4) {
                obj3 = yykVar2;
                th2 = th4;
                ((yyk) obj3).d();
                throw th2;
            }
        }
        yio yioVar2 = yio.a;
        int i2 = this.c;
        try {
            if (i2 == 0) {
                ybn.f(obj);
                yykVar = this.d;
                Object obj6 = this.e;
                this.a = yykVar;
                this.b = obj6;
                this.c = 1;
                if (yykVar.b(this) != yioVar2) {
                    r3 = obj6;
                }
                return yioVar2;
            }
            if (i2 != 1) {
                obj2 = this.a;
                try {
                    ybn.f(obj);
                    ((yyk) obj2).d();
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    ((yyk) obj2).d();
                    throw th;
                }
            }
            Object obj7 = this.b;
            ?? r42 = this.a;
            ybn.f(obj);
            yykVar = r42;
            r3 = obj7;
            this.a = yykVar;
            this.b = null;
            this.c = 2;
            Object objA = r3.a(this);
            if (objA != yioVar2) {
                obj2 = yykVar;
                obj = objA;
                ((yyk) obj2).d();
                return obj;
            }
            return yioVar2;
        } catch (Throwable th6) {
            obj2 = yykVar;
            th = th6;
            ((yyk) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhy(yyk yykVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = yykVar;
        this.e = yjzVar;
    }
}
