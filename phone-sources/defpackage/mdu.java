package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mdu extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ mdw f;
    final /* synthetic */ ylb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdu(String str, List list, List list2, mdw mdwVar, ylb ylbVar, yih yihVar) {
        super(2, yihVar);
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = mdwVar;
        this.g = ylbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mdu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new mdu(this.c, this.d, this.e, this.f, this.g, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        mdn mdnVar;
        ylb ylbVar;
        yio yioVar = yio.a;
        int i = this.b;
        if (i == 0) {
            ybn.f(obj);
            mdn mdnVar2 = new mdn(this.c, this.d, this.e);
            ysn ysnVarC = this.f.c();
            this.a = mdnVar2;
            this.b = 1;
            if (ysnVarC.a(mdnVar2, this) != yioVar) {
                mdnVar = mdnVar2;
            }
            return yioVar;
        }
        if (i != 1) {
            ylbVar = (ylb) this.a;
            ybn.f(obj);
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        mdnVar = (mdn) this.a;
        ybn.f(obj);
        ylb ylbVar2 = this.g;
        this.a = ylbVar2;
        this.b = 2;
        Object objZ = mdnVar.e.z(this);
        if (objZ != yioVar) {
            ylbVar = ylbVar2;
            obj = objZ;
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        return yioVar;
    }
}
