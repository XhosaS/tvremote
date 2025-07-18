package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqj implements bqn {
    public final Set a = new LinkedHashSet();

    public bqj(bqo bqoVar) {
        bqoVar.a("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.bqn
    public final Bundle a() {
        Bundle bundleA = ado.a((agpi[]) Arrays.copyOf(new agpi[0], 0));
        List listX = agqq.x(this.a);
        bundleA.putStringArrayList("classes_to_restore", listX instanceof ArrayList ? (ArrayList) listX : new ArrayList<>(listX));
        return bundleA;
    }
}
