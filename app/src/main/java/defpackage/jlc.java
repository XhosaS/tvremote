package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlc extends agtu implements agvb {
    int a;
    final /* synthetic */ jlp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc(jlp jlpVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jlpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jlc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws PackageManager.NameNotFoundException {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        jlp jlpVar = this.b;
        this.a = 1;
        Object objC = jlpVar.e.a.c("", 1, this);
        return objC == agtgVar ? agtgVar : objC;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jlc(this.b, agswVar);
    }
}
