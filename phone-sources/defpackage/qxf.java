package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxf extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(Drawable drawable, Drawable drawable2, Drawable drawable3, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = drawable;
        this.a = drawable2;
        this.b = drawable3;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((qxf) create((wfo) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qxf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.e != 0) {
            Object obj2 = this.c;
            Drawable drawable = (Drawable) obj2;
            qxf qxfVar = new qxf(drawable, (Drawable) this.a, (Drawable) this.b, yihVar, 1);
            qxfVar.d = obj;
            return qxfVar;
        }
        Object obj3 = this.a;
        qyc qycVar = (qyc) obj3;
        qxf qxfVar2 = new qxf(qycVar, (vou) this.b, (qxh) this.c, yihVar, 0);
        qxfVar2.d = obj;
        return qxfVar2;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.e != 0) {
            ybn.f(obj);
            wfo wfoVar = (wfo) this.d;
            ((Drawable) this.c).setTint(wfoVar.l());
            ((Drawable) this.a).setTint(wfoVar.l());
            ((Drawable) this.b).setTint(wfoVar.l());
            return ygi.a;
        }
        ybn.f(obj);
        yow yowVar = (yow) this.d;
        Object obj2 = this.a;
        Object obj3 = this.b;
        qxh qxhVar = (qxh) this.c;
        vou vouVar = (vou) obj3;
        qyc qycVar = (qyc) obj2;
        ykr.q(yowVar, null, 0, new qxg(qycVar, vouVar, qxhVar, (yih) null, 1, (byte[]) null), 3);
        vrn vrnVar = vouVar.a;
        qwn qwnVar = qycVar.d.a;
        if (rdd.h(qwnVar, vrnVar) != null) {
            qwnVar.e.f.c();
        }
        qxh.a(qxhVar, null, null, null, null, null, null, null, 255);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(qyc qycVar, vou vouVar, qxh qxhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.a = qycVar;
        this.b = vouVar;
        this.c = qxhVar;
    }
}
