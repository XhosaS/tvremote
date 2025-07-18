package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvf extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ ImmutableList c;
    final /* synthetic */ qen d;
    final /* synthetic */ yyh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvf(ImmutableList immutableList, yyh yyhVar, qen qenVar, yih yihVar) {
        super(2, yihVar);
        this.c = immutableList;
        this.e = yyhVar;
        this.d = qenVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pvf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new pvf(this.c, this.e, this.d, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qbr] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object it;
        qis qisVar;
        ?? r2;
        pxh pxhVarA;
        yio yioVar = yio.a;
        if (this.b != 0) {
            it = this.a;
            ybn.f(obj);
        } else {
            ybn.f(obj);
            it = this.c.iterator();
            it.getClass();
        }
        do {
            UnmodifiableIterator unmodifiableIterator = (UnmodifiableIterator) it;
            if (!unmodifiableIterator.hasNext()) {
                return ygi.a;
            }
            qisVar = (qis) unmodifiableIterator.next();
            r2 = this.e.c;
            qisVar.getClass();
            pxb pxbVar = new pxb();
            pxbVar.f(ocv.aY(this.d));
            pxbVar.c();
            pxbVar.d();
            pxbVar.b();
            pxbVar.e(qdo.c());
            pxhVarA = pxbVar.a();
            this.a = it;
            this.b = 1;
        } while (r2.a(qisVar, pxhVarA, this) != yioVar);
        return yioVar;
    }
}
