package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slq {
    public final Context a;
    public final Executor b;
    public final String c;
    public final Set d;
    public final boolean e;
    public SharedPreferences f;
    public final zft g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    public slq(slp slpVar) {
        this.a = slpVar.a;
        this.b = slpVar.c;
        this.c = (String) slpVar.d;
        this.d = slpVar.e;
        this.g = (zft) slpVar.f;
        this.e = slpVar.b;
    }
}
