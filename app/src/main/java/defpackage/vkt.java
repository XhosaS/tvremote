package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkt extends dny {
    private final vkr a;

    public vkt(vkr vkrVar) {
        this.a = vkrVar;
    }

    @Override // defpackage.dny, defpackage.doa
    public final void c(Context context, cyg cygVar, cyt cytVar) {
        this.a.c(context, cygVar, cytVar);
        cytVar.a.c(vpq.class, InputStream.class, new vks());
    }
}
