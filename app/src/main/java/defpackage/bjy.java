package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjy extends agtu implements agvb {
    int a;
    final /* synthetic */ bkd b;
    final /* synthetic */ Uri c;
    final /* synthetic */ InputEvent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjy(bkd bkdVar, Uri uri, InputEvent inputEvent, agsw agswVar) {
        super(2, agswVar);
        this.b = bkdVar;
        this.c = uri;
        this.d = inputEvent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bjy) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            bkd bkdVar = this.b;
            Uri uri = this.c;
            InputEvent inputEvent = this.d;
            this.a = 1;
            if (bkdVar.a.d(uri, inputEvent, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bjy(this.b, this.c, this.d, agswVar);
    }
}
