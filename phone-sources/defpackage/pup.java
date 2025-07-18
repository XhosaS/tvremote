package defpackage;

import android.content.Intent;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pup extends yiz implements yjz {
    int a;
    final /* synthetic */ pur b;
    final /* synthetic */ int c;
    final /* synthetic */ ylf d;
    final /* synthetic */ qen e;
    final /* synthetic */ ImmutableList f;
    final /* synthetic */ vmo g;
    final /* synthetic */ Intent h;
    final /* synthetic */ qrd i;
    final /* synthetic */ vks j;
    final /* synthetic */ vht k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pup(pur purVar, int i, ylf ylfVar, qen qenVar, ImmutableList immutableList, vmo vmoVar, Intent intent, qrd qrdVar, vks vksVar, vht vhtVar, yih yihVar) {
        super(2, yihVar);
        this.b = purVar;
        this.c = i;
        this.d = ylfVar;
        this.e = qenVar;
        this.f = immutableList;
        this.g = vmoVar;
        this.h = intent;
        this.i = qrdVar;
        this.j = vksVar;
        this.k = vhtVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pup) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new pup(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            pur purVar = this.b;
            pvr pvrVarA = pvs.a();
            pvrVarA.f();
            pvrVarA.e(this.c);
            pvrVarA.a = (String) this.d.a;
            pvrVarA.b = this.e;
            pvrVarA.g(this.f);
            pvrVarA.d(this.g);
            pvrVarA.d = this.h;
            pvrVarA.c(this.i);
            pvrVarA.e = this.j;
            pvrVarA.f = new pvu(this.k, null, null, false, 14);
            pvs pvsVarA = pvrVarA.a();
            this.a = 1;
            if (purVar.a.b(pvsVarA, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
