package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mq extends yiz implements yjv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ mr d;
    final /* synthetic */ Object e;
    final /* synthetic */ mv f;
    final /* synthetic */ long g;
    final /* synthetic */ yjv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(mr mrVar, Object obj, mv mvVar, long j, yjv yjvVar, yih yihVar) {
        super(1, yihVar);
        this.d = mrVar;
        this.e = obj;
        this.f = mvVar;
        this.g = j;
        this.h = yjvVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new mq(this.d, this.e, this.f, this.g, this.h, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new mq(this.d, this.e, this.f, this.g, this.h, yihVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        mq mqVar;
        Object obj2;
        Object obj3;
        CancellationException cancellationException;
        yio yioVar = yio.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                ybn.f(obj);
                mqVar = this;
            } catch (CancellationException e) {
                cancellationException = e;
                mqVar = this;
                mqVar.d.g();
                throw cancellationException;
            }
        } else {
            ybn.f(obj);
            try {
                mr mrVar = this.d;
                mz mzVar = mrVar.a;
                mzVar.a = (ne) mrVar.g.a.a(this.e);
                mv mvVar = this.f;
                mrVar.i(((oz) mvVar).a);
                mrVar.h(true);
                mz mzVar2 = new mz(mzVar.e, mzVar.a(), hp.i(mzVar.a), mzVar.b, Long.MIN_VALUE, mzVar.d);
                ylb ylbVar = new ylb();
                long j = this.g;
                nw nwVar = new nw(mrVar, mzVar2, this.h, ylbVar, 1);
                this.a = mzVar2;
                this.b = ylbVar;
                this.c = 1;
                mqVar = this;
                try {
                    if (og.g(mzVar2, mvVar, j, nwVar, mqVar) == yioVar) {
                        return yioVar;
                    }
                    obj2 = ylbVar;
                    obj3 = mzVar2;
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    mqVar.d.g();
                    throw cancellationException;
                }
            } catch (CancellationException e3) {
                e = e3;
                mqVar = this;
                cancellationException = e;
                mqVar.d.g();
                throw cancellationException;
            }
        }
        int i = true != ((ylb) obj2).a ? 2 : 1;
        mqVar.d.g();
        return new mw((mz) obj3, i);
    }
}
