package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghh {
    public final ghe a;
    public boolean c;
    public Bundle d;
    public boolean e;
    private final yjk h;
    public final gez g = new gez(null);
    public final Map b = new LinkedHashMap();
    public boolean f = true;

    public ghh(ghe gheVar, yjk yjkVar) {
        this.a = gheVar;
        this.h = yjkVar;
    }

    public final void a() {
        ghe gheVar = this.a;
        if (gheVar.getLifecycle().a() != dvd.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.a();
        gheVar.getLifecycle().c(new fe(this, 7));
        this.c = true;
    }
}
