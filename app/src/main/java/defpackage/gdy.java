package defpackage;

import android.content.Intent;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdy implements wlk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/locale/InteractorLocaleChangedReceiver");
    private final jdt b;

    public gdy(jdt jdtVar) {
        jdtVar.getClass();
        this.b = jdtVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        if (agvy.c(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/locale/InteractorLocaleChangedReceiver", "onReceive", 22, "InteractorLocaleChangedReceiver.kt")).x("Handling change in locale to %s.", Locale.getDefault().toLanguageTag());
            this.b.o();
        }
        return zxy.a;
    }
}
