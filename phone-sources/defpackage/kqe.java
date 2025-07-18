package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqe implements idb, iej {
    final /* synthetic */ kqf a;
    private final Context b;
    private final ExecutorService c;
    private final lyz d;

    public kqe(kqf kqfVar, Context context, ExecutorService executorService, lyz lyzVar) {
        this.a = kqfVar;
        this.b = context;
        this.d = lyzVar;
        this.c = executorService;
    }

    @Override // defpackage.idb
    public final boolean a() {
        if (ksk.p()) {
            return false;
        }
        lzz lzzVarI = this.a.i(this.c, this.d, this);
        Context context = this.b;
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || applicationRestrictions.keySet().isEmpty()) {
            return lzzVarI.b();
        }
        String[] stringArray = applicationRestrictions.getStringArray("allowed_ids");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return lzzVarI.c(stringArray, applicationRestrictions.getBoolean("allow_unrated", false));
    }

    @Override // defpackage.iej
    public final void dM() {
        a();
    }
}
