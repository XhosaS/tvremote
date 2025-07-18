package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdr extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdr(fv fvVar, yjz yjzVar, ft ftVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = fvVar;
        this.d = yjzVar;
        this.c = ftVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((mdr) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((mdr) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            return new mdr((fv) this.e, (yjz) this.d, (ft) this.c, yihVar, 1);
        }
        Object obj2 = this.c;
        return new mdr((mdw) obj2, (String) this.d, (lul) this.e, yihVar, 0);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, ysm] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        Object obj2;
        Object obj3;
        boolean z = true;
        if (this.f != 0) {
            yio yioVar = yio.a;
            if (this.b == 0) {
                ybn.f(obj);
                if (((fv) this.e).b) {
                    ylb ylbVar = new ylb();
                    ?? r2 = this.d;
                    ipi ipiVar = new ipi(new yst(((ft) this.c).c, z), new avj(ylbVar, (yih) null, 1), 11);
                    this.a = ylbVar;
                    this.b = 1;
                    if (r2.a(ipiVar, this) == yioVar) {
                        return yioVar;
                    }
                    obj3 = ylbVar;
                }
                return ygi.a;
            }
            obj3 = this.a;
            ybn.f(obj);
            if (!((ylb) obj3).a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.b != 0) {
            obj2 = this.a;
            try {
                ybn.f(obj);
            } catch (CancellationException e) {
                cancellationException = e;
                krd.d("Error sending watchlist sync task for user account.", cancellationException);
                return Boolean.valueOf(((ylb) obj2).a);
            }
        } else {
            ybn.f(obj);
            ylb ylbVar2 = new ylb();
            try {
                Object obj4 = this.c;
                yqe yqeVarQ = ykr.q(((mdw) obj4).b, new yov("sendChannel-sync"), 0, new mdq((String) this.d, (lul) this.e, (mdw) obj4, ylbVar2, null), 2);
                this.a = ylbVar2;
                this.b = 1;
                if (yqeVarQ.p(this) == yioVar2) {
                    return yioVar2;
                }
                obj2 = ylbVar2;
            } catch (CancellationException e2) {
                cancellationException = e2;
                obj2 = ylbVar2;
                krd.d("Error sending watchlist sync task for user account.", cancellationException);
                return Boolean.valueOf(((ylb) obj2).a);
            }
        }
        return Boolean.valueOf(((ylb) obj2).a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdr(mdw mdwVar, String str, lul lulVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = mdwVar;
        this.d = str;
        this.e = lulVar;
    }
}
