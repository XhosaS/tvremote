package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyb implements gtt {
    final /* synthetic */ lyp a;

    public lyb(lyp lypVar) {
        this.a = lypVar;
    }

    @Override // defpackage.gtt
    public final Object a(agsw agswVar) {
        lyp lypVar = this.a;
        eyw eywVar = lypVar.d;
        if (eywVar.l) {
            lypVar.x.v();
        } else if (!eywVar.e()) {
            return agpu.a;
        }
        eywVar.c(30);
        jod jodVar = (jod) lypVar.s.a();
        Intent intentPutExtra = new Intent("android.intent.action.ASSIST").putExtra("android.intent.extra.KEY_EVENT", 219);
        intentPutExtra.getClass();
        jodVar.d(intentPutExtra, null);
        return agpu.a;
    }
}
