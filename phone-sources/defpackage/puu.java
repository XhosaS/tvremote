package defpackage;

import android.content.Intent;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class puu extends yiz implements yjz {
    int a;
    final /* synthetic */ puv b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ qen e;
    final /* synthetic */ ImmutableList f;
    final /* synthetic */ vmo g;
    final /* synthetic */ Intent h;
    final /* synthetic */ vht i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puu(puv puvVar, int i, String str, qen qenVar, ImmutableList immutableList, vmo vmoVar, Intent intent, vht vhtVar, yih yihVar) {
        super(2, yihVar);
        this.b = puvVar;
        this.c = i;
        this.d = str;
        this.e = qenVar;
        this.f = immutableList;
        this.g = vmoVar;
        this.h = intent;
        this.i = vhtVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((puu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new puu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            pxf pxfVar = (pxf) this.b.c.b();
            pvr pvrVarA = pvs.a();
            pvrVarA.f();
            pvrVarA.e(this.c);
            pvrVarA.a = this.d;
            pvrVarA.b = this.e;
            pvrVarA.g(this.f);
            pvrVarA.d(this.g);
            pvrVarA.d = this.h;
            pvrVarA.f = new pvu(this.i, null, null, false, 14);
            pvrVarA.b(true);
            pvs pvsVarA = pvrVarA.a();
            this.a = 1;
            if (pxfVar.b(pvsVarA, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
