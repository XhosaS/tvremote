package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class usn extends cv {
    private static final ImmutableList c = ImmutableList.of("Hosts", "Services");
    private final ArrayList d;

    public usn(cr crVar, ArrayList arrayList) {
        super(crVar);
        this.d = arrayList;
    }

    @Override // defpackage.cv
    public final bv b(int i) {
        Bundle bundle = new Bundle();
        if (i == 0) {
            bundle.putParcelableArrayList("configs_to_display", this.d);
            usm usmVar = new usm();
            usmVar.setArguments(bundle);
            return usmVar;
        }
        if (i != 1) {
            throw new IllegalStateException(a.cf(i, "No fragment for index: "));
        }
        bundle.putParcelableArrayList("configs_to_display", this.d);
        usv usvVar = new usv();
        usvVar.setArguments(bundle);
        return usvVar;
    }

    @Override // defpackage.gll
    public final int j() {
        return c.size();
    }

    @Override // defpackage.gll
    public final CharSequence l(int i) {
        return (CharSequence) c.get(i);
    }
}
