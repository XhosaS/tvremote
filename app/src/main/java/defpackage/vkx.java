package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkx extends dny implements dhf {
    private final agow a;

    public vkx(agow agowVar) {
        this.a = agowVar;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return (dhe) this.a.a();
    }

    @Override // defpackage.dny, defpackage.doa
    public final void c(Context context, cyg cygVar, cyt cytVar) {
        cytVar.a.c(vpr.class, Bitmap.class, this);
    }
}
