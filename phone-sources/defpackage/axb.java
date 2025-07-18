package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axb extends yiz implements yjz {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(auv auvVar, float f, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = auvVar;
        this.b = f;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((axb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((axb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 2) {
            return ((axb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((axb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.d;
        if (i == 0) {
            return new axb((axc) this.c, this.b, yihVar, 0);
        }
        if (i == 1) {
            return new axb((auv) this.c, this.b, yihVar, 1);
        }
        if (i != 2) {
            return new axb((mr) this.c, this.b, yihVar, 3);
        }
        return new axb((axc) this.c, this.b, yihVar, 2, null);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object objBW;
        int i = this.d;
        if (i == 0) {
            yio yioVar = yio.a;
            if (this.a == 0) {
                ybn.f(obj);
                axc axcVar = (axc) this.c;
                mr mrVar = axcVar.e;
                if (mrVar != null) {
                    Float f = new Float(this.b);
                    my myVar = axcVar.c ? awt.a : axcVar.b;
                    this.a = 1;
                    obj = mr.j(mrVar, f, myVar, null, this, 12);
                    if (obj == yioVar) {
                        return yioVar;
                    }
                }
                return ygi.a;
            }
            ybn.f(obj);
            return ygi.a;
        }
        if (i == 1) {
            Object obj2 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj3 = this.c;
                float f2 = this.b;
                this.a = 1;
                ayd aydVar = ((auv) obj3).b;
                Object objH = aydVar.h();
                Object objG = aydVar.g(aydVar.d(), objH, f2);
                if (((Boolean) aydVar.b.a(objG)).booleanValue()) {
                    objBW = a.bW(aydVar, objG, f2, this);
                    if (objBW != obj2) {
                        objBW = ygi.a;
                    }
                } else {
                    objBW = a.bW(aydVar, objH, f2, this);
                    if (objBW != obj2) {
                        objBW = ygi.a;
                    }
                }
                if (objBW != obj2) {
                    objBW = ygi.a;
                }
                if (objBW == obj2) {
                    return obj2;
                }
            }
            return ygi.a;
        }
        if (i != 2) {
            yio yioVar2 = yio.a;
            int i2 = this.a;
            ybn.f(obj);
            if (i2 == 0) {
                Object obj4 = this.c;
                float f3 = this.b;
                Float f4 = new Float(f3);
                mr mrVar2 = (mr) obj4;
                my myVar2 = ((Number) mrVar2.d()).floatValue() < f3 ? axj.a : axj.b;
                this.a = 1;
                if (mr.j(mrVar2, f4, myVar2, null, this, 12) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        yio yioVar3 = yio.a;
        if (this.a == 0) {
            ybn.f(obj);
            axc axcVar2 = (axc) this.c;
            mr mrVar3 = axcVar2.d;
            if (mrVar3 != null) {
                Float f5 = new Float(this.b);
                my myVar3 = axcVar2.c ? awt.a : axcVar2.b;
                this.a = 1;
                obj = mr.j(mrVar3, f5, myVar3, null, this, 12);
                if (obj == yioVar3) {
                    return yioVar3;
                }
            }
            return ygi.a;
        }
        ybn.f(obj);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(axc axcVar, float f, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = axcVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(axc axcVar, float f, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.c = axcVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(mr mrVar, float f, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = mrVar;
        this.b = f;
    }
}
