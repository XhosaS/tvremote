package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tg extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ vc e;
    final /* synthetic */ ybo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(float f, ybo yboVar, vc vcVar, yih yihVar) {
        super(2, yihVar);
        this.d = f;
        this.f = yboVar;
        this.e = vcVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new tg(this.d, this.f, this.e, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        float f;
        mz mzVar;
        Object obj2;
        Object obj3;
        Object objG;
        Object obj4 = yio.a;
        if (this.c != 0) {
            obj3 = this.b;
            obj2 = this.a;
            try {
                ybn.f(obj);
            } catch (CancellationException unused) {
                ((ylc) obj2).a = ((Number) ((mz) obj3).b()).floatValue();
                f = ((ylc) obj2).a;
                return new Float(f);
            }
            f = ((ylc) obj2).a;
        } else {
            ybn.f(obj);
            float f2 = this.d;
            if (Math.abs(f2) > 1.0f) {
                ylc ylcVar = new ylc();
                ylcVar.a = f2;
                ylc ylcVar2 = new ylc();
                mz mzVarK = hp.k(f2, 28);
                try {
                    ybo yboVar = this.f;
                    Object obj5 = yboVar.c;
                    nw nwVar = new nw(ylcVar2, this.e, ylcVar, yboVar, 2);
                    this.a = ylcVar;
                    this.b = mzVarK;
                    this.c = 1;
                    mzVar = mzVarK;
                    try {
                        objG = og.g(mzVar, new nj((cb) obj5, mzVarK.e, mzVarK.a(), mzVarK.a), Long.MIN_VALUE, nwVar, this);
                        if (objG != obj4) {
                            objG = ygi.a;
                        }
                    } catch (CancellationException unused2) {
                        obj2 = ylcVar;
                        obj3 = mzVar;
                        ((ylc) obj2).a = ((Number) ((mz) obj3).b()).floatValue();
                        f = ((ylc) obj2).a;
                        return new Float(f);
                    }
                } catch (CancellationException unused3) {
                    mzVar = mzVarK;
                }
                if (objG == obj4) {
                    return obj4;
                }
                obj2 = ylcVar;
                f = ((ylc) obj2).a;
            } else {
                f = this.d;
            }
        }
        return new Float(f);
    }
}
