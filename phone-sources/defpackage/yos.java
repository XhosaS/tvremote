package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yos {
    public static final yil a(yil yilVar, yil yilVar2) {
        return !e(yilVar2) ? yilVar.plus(yilVar2) : d(yilVar, yilVar2, false);
    }

    public static final yil b(yow yowVar, yil yilVar) {
        yil yilVarD = d(yowVar.c(), yilVar, true);
        yil yilVarPlus = yoy.a ? yilVarD.plus(new you(yoy.c.incrementAndGet())) : yilVarD;
        yot yotVar = ypk.a;
        return (yilVarD == yotVar || yilVarD.get(yii.k) != null) ? yilVarPlus : yilVarPlus.plus(yotVar);
    }

    public static final yrg c(yih yihVar, yil yilVar, Object obj) {
        yrg yrgVar = null;
        if (!(yihVar instanceof yiw)) {
            return null;
        }
        if (yilVar.get(yrh.a) != null) {
            yiw callerFrame = (yiw) yihVar;
            while (true) {
                if ((callerFrame instanceof yph) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof yrg) {
                    yrgVar = (yrg) callerFrame;
                    break;
                }
            }
            if (yrgVar != null) {
                yrgVar.f(yilVar, obj);
            }
        }
        return yrgVar;
    }

    private static final yil d(yil yilVar, yil yilVar2, final boolean z) {
        boolean zE = e(yilVar);
        boolean zE2 = e(yilVar2);
        if (!zE && !zE2) {
            return yilVar.plus(yilVar2);
        }
        final ylf ylfVar = new ylf();
        ylfVar.a = yilVar2;
        yim yimVar = yim.a;
        yil yilVar3 = (yil) yilVar.fold(yimVar, new yjz() { // from class: yor
            @Override // defpackage.yjz
            public final Object a(Object obj, Object obj2) {
                yil yilVar4 = (yil) obj;
                yij yijVar = (yij) obj2;
                if (!(yijVar instanceof yop)) {
                    return yilVar4.plus(yijVar);
                }
                ylf ylfVar2 = ylfVar;
                if (((yil) ylfVar2.a).get(yijVar.getKey()) == null) {
                    return yilVar4.plus(z ? ((yop) yijVar).a() : (yop) yijVar);
                }
                ylfVar2.a = ((yil) ylfVar2.a).minusKey(yijVar.getKey());
                return yilVar4.plus(((yop) yijVar).b());
            }
        });
        if (zE2) {
            ylfVar.a = ((yil) ylfVar.a).fold(yimVar, new dsc(16));
        }
        return yilVar3.plus((yil) ylfVar.a);
    }

    private static final boolean e(yil yilVar) {
        return ((Boolean) yilVar.fold(false, new dsc(15))).booleanValue();
    }
}
