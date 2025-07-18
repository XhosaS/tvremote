package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ise implements isp {
    private final Context a;
    private final Set b;

    public ise(Context context) {
        context.getClass();
        this.a = context;
        Set setSingleton = Collections.singleton("action.devices.commands.Locate");
        setSingleton.getClass();
        this.b = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        Intent flags = new Intent("com.google.android.tv.FIND_MY_REMOTE").putExtra("activate", !abauVar.g("silence").e() ? 1 : 0).putExtra("reason", "ASSISTANT").setFlags(285212704);
        flags.getClass();
        this.a.sendBroadcast(flags, "com.google.android.tv.permission.FIND_MY_REMOTE");
        return true;
    }
}
