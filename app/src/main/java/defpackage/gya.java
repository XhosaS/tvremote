package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gya implements aejg {
    public static Context b(Context context, agow agowVar) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            context = context.createWindowContext((Display) agowVar.a(), 2038, null);
            context.getClass();
        } else if (Build.VERSION.SDK_INT == 30) {
            context = context.createDisplayContext((Display) agowVar.a()).createWindowContext(2038, null);
            context.getClass();
        }
        context.getClass();
        return context;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
