package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btd extends ContentObserver {
    final /* synthetic */ Context a;
    final /* synthetic */ btf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btd(btf btfVar, Context context) {
        super(null);
        this.a = context;
        this.b = btfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context = this.a;
        btf btfVar = this.b;
        String strN = atg.n(context);
        if (Objects.equals(btfVar.b, strN)) {
            return;
        }
        btfVar.b = strN;
        ((cbs) btf.a.e().j("com/google/android/tv/remote/service/features/AssistantPackageObserver$1", "onChange", 39, "AssistantPackageObserver.java")).t("Assistant package name is now %s", btfVar.b);
        btfVar.a();
    }
}
