package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abn {
    public final abk a;
    public boolean c;
    public Bundle d;
    public boolean e;
    private final ctj g;
    public final xo f = new xo();
    public final Map b = new LinkedHashMap();

    public abn(abk abkVar, ctj ctjVar) {
        this.a = abkVar;
        this.g = ctjVar;
    }

    public final void a() {
        abk abkVar = this.a;
        if (abkVar.m().a != xb.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.g.a();
        abkVar.m().a(new xd() { // from class: abm
            @Override // defpackage.xd
            public final void a(xf xfVar, xa xaVar) {
            }
        });
        this.c = true;
    }
}
