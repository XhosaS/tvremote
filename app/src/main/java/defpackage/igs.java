package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igs {
    public final agow a;
    private final Context b;
    private final gmu c;

    public igs(Context context, gmu gmuVar, agow agowVar) {
        context.getClass();
        gmuVar.getClass();
        agowVar.getClass();
        this.b = context;
        this.c = gmuVar;
        this.a = agowVar;
    }

    public final void a(Intent intent, ComponentName componentName) {
        this.c.A();
        intent.setComponent(componentName);
        intent.addFlags(268435456);
        wyo.l(this.b, intent);
    }
}
