package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdv extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ mdw c;
    final /* synthetic */ String d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdv(mdw mdwVar, String str, List list, List list2, yih yihVar) {
        super(2, yihVar);
        this.c = mdwVar;
        this.d = str;
        this.e = list;
        this.f = list2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mdv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new mdv(this.c, this.d, this.e, this.f, yihVar);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        Object obj2;
        yio yioVar = yio.a;
        if (this.b != 0) {
            obj2 = this.a;
            try {
                ybn.f(obj);
            } catch (CancellationException e) {
                cancellationException = e;
                krd.d("Error sending watchlist upload task for user account.", cancellationException);
                return Boolean.valueOf(((ylb) obj2).a);
            }
        } else {
            ybn.f(obj);
            ylb ylbVar = new ylb();
            try {
                mdw mdwVar = this.c;
                yqe yqeVarQ = ykr.q(mdwVar.b, new yov("sendChannel-upload"), 0, new mdu(this.d, this.e, this.f, mdwVar, ylbVar, null), 2);
                this.a = ylbVar;
                this.b = 1;
                if (yqeVarQ.p(this) == yioVar) {
                    return yioVar;
                }
                obj2 = ylbVar;
            } catch (CancellationException e2) {
                cancellationException = e2;
                obj2 = ylbVar;
                krd.d("Error sending watchlist upload task for user account.", cancellationException);
                return Boolean.valueOf(((ylb) obj2).a);
            }
        }
        return Boolean.valueOf(((ylb) obj2).a);
    }
}
