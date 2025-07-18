package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqe extends yiz implements yjz {
    int a;
    final /* synthetic */ Context b;
    final /* synthetic */ cil c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqe(Context context, cil cilVar, boolean z, String str, yih yihVar) {
        super(2, yihVar);
        this.b = context;
        this.c = cilVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pqe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        pqe pqeVar = new pqe(this.b, this.c, this.d, this.e, yihVar);
        pqeVar.f = obj;
        return pqeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i != 0) {
            return obj;
        }
        yow yowVar = (yow) this.f;
        yqg yqgVar = new yqg(null);
        pqf pqfVar = pqf.a;
        CancellationSignal cancellationSignal = new CancellationSignal();
        ykr.q(yowVar, yqgVar, 0, new pqb(null, 0), 2).r(new kij(cancellationSignal, 19));
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            throw new IllegalStateException("No content resolver");
        }
        cil cilVar = this.c;
        yil yilVarC = yowVar.c();
        pqd pqdVar = new pqd(this.d, context, contentResolver, this.e, cancellationSignal, cilVar, yqgVar, null);
        this.a = 1;
        Object objL = ykr.l(yilVarC, pqdVar, this);
        return objL == yioVar ? yioVar : objL;
    }
}
