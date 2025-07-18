package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezq implements gyi {
    private final Context a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public ezq(Context context) {
        context.getClass();
        this.a = context;
        this.b = gyx.D;
        this.c = hag.a;
        this.d = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        this.a.registerReceiver(new ezo(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
