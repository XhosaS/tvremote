package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gad extends yiz implements yjz {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gad(yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((gad) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((gad) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((gad) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((gad) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gad) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.c;
        if (i == 0) {
            gad gadVar = new gad(yihVar, 0);
            gadVar.b = obj;
            return gadVar;
        }
        if (i == 1) {
            gad gadVar2 = new gad(yihVar, 1, (byte[]) null);
            gadVar2.b = obj;
            return gadVar2;
        }
        if (i == 2) {
            gad gadVar3 = new gad(yihVar, 2, (char[]) null);
            gadVar3.b = obj;
            return gadVar3;
        }
        if (i != 3) {
            gad gadVar4 = new gad(yihVar, 4, (int[]) null);
            gadVar4.b = obj;
            return gadVar4;
        }
        gad gadVar5 = new gad(yihVar, 3, (short[]) null);
        gadVar5.b = obj;
        return gadVar5;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ysy ysyVar;
        gbq gbqVar;
        yow yowVar;
        int i = this.c;
        if (i == 0) {
            yio yioVar = yio.a;
            int i2 = this.a;
            if (i2 == 0) {
                ybn.f(obj);
                ysyVar = (ysy) this.b;
                gbqVar = null;
            } else {
                if (i2 != 1) {
                    ybn.f(obj);
                    return ygi.a;
                }
                ysyVar = (ysy) this.b;
                ybn.f(obj);
                gbqVar = (gbq) obj;
            }
            Boolean boolValueOf = Boolean.valueOf(gbqVar == gbq.a);
            this.b = null;
            this.a = 2;
            if (ysyVar.emit(boolValueOf, this) == yioVar) {
                return yioVar;
            }
            return ygi.a;
        }
        if (i == 1) {
            yio yioVar2 = yio.a;
            if (this.a != 0) {
                yowVar = (yow) this.b;
                ybn.f(obj);
            } else {
                ybn.f(obj);
                yowVar = (yow) this.b;
            }
            while (yoz.B(yowVar.c())) {
                pl plVar = new pl(10);
                this.b = yowVar;
                this.a = 1;
                if (bcm.e(plVar, this) == yioVar2) {
                    return yioVar2;
                }
            }
            return ygi.a;
        }
        if (i == 2) {
            yio yioVar3 = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                ysy ysyVar2 = (ysy) this.b;
                iaw iawVar = new iaw();
                this.a = 1;
                if (ysyVar2.emit(iawVar, this) == yioVar3) {
                    return yioVar3;
                }
            }
            return ygi.a;
        }
        if (i != 3) {
            yio yioVar4 = yio.a;
            int i3 = this.a;
            ybn.f(obj);
            if (i3 == 0) {
                ysy ysyVar3 = (ysy) this.b;
                ihx ihxVar = new ihx(2);
                this.a = 1;
                if (ysyVar3.emit(ihxVar, this) == yioVar4) {
                    return yioVar4;
                }
            }
            return ygi.a;
        }
        yio yioVar5 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            ysy ysyVar4 = (ysy) this.b;
            ihx ihxVar2 = new ihx(2);
            this.a = 1;
            if (ysyVar4.emit(ihxVar2, this) == yioVar5) {
                return yioVar5;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gad(yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gad(yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gad(yih yihVar, int i, int[] iArr) {
        super(2, yihVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gad(yih yihVar, int i, short[] sArr) {
        super(2, yihVar);
        this.c = i;
    }
}
