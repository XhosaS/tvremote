package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggx implements ghb {
    public final Set a = new LinkedHashSet();

    public ggx(ghc ghcVar) {
        ghcVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.ghb
    public final Bundle saveState() {
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        ghf.d(bundleJ, "classes_to_restore", yfm.al(this.a));
        return bundleJ;
    }
}
