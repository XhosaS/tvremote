package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byo extends agtu implements agvb {
    int a;
    final /* synthetic */ byp b;
    final /* synthetic */ Activity c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byo(byp bypVar, Activity activity, agsw agswVar) {
        super(2, agswVar);
        this.b = bypVar;
        this.c = activity;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((byo) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            final ahge ahgeVar = (ahge) this.d;
            final afe afeVar = new afe() { // from class: bym
                @Override // defpackage.afe
                public final void accept(Object obj2) {
                    ahgeVar.i((byq) obj2);
                }
            };
            final byp bypVar = this.b;
            bypVar.a.b(this.c, afeVar);
            agum agumVar = new agum() { // from class: byn
                @Override // defpackage.agum
                public final Object a() {
                    bypVar.a.a(afeVar);
                    return agpu.a;
                }
            };
            this.a = 1;
            if (ahgd.a(ahgeVar, agumVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        byo byoVar = new byo(this.b, this.c, agswVar);
        byoVar.d = obj;
        return byoVar;
    }
}
