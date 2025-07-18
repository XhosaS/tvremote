package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwe extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwe(dlv dlvVar, Context context, int[] iArr, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = dlvVar;
        this.c = context;
        this.d = iArr;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((dwe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((dwe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            Object obj2 = this.b;
            dlv dlvVar = (dlv) obj2;
            dwe dweVar = new dwe(dlvVar, (Context) this.c, (int[]) this.d, yihVar, 1);
            dweVar.e = obj;
            return dweVar;
        }
        Object obj3 = this.b;
        dve dveVar = (dve) obj3;
        dwe dweVar2 = new dwe(dveVar, (dvd) this.c, (yjz) this.d, yihVar, 0);
        dweVar2.e = obj;
        return dweVar2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.f == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                yow yowVar = (yow) this.e;
                yot yotVar = ypk.a;
                yqp yqpVarI = yxi.a.i();
                dwd dwdVar = new dwd((dve) this.b, (dvd) this.c, yowVar, this.d, null);
                this.a = 1;
                if (ykr.l(yqpVarI, dwdVar, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar2 = (yow) this.e;
            Object obj2 = this.b;
            Context context = (Context) this.c;
            dlv dlvVar = (dlv) obj2;
            dlvVar.b(yowVar2, context);
            int[] iArr = (int[]) this.d;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(ykr.o(yowVar2, null, new qjn(dlvVar, context, i2, (yih) null, 1), 3));
            }
            this.a = 1;
            if (ykn.x(arrayList, this) == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwe(dve dveVar, dvd dvdVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = dveVar;
        this.c = dvdVar;
        this.d = yjzVar;
    }
}
