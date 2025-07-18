package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqf {
    public final oqj a;
    public final ImmutableSet.Builder b;

    public oqf() {
        oqr oqrVar = new oqr(1);
        this.b = new ImmutableSet.Builder();
        this.a = oqrVar;
    }

    public final oqg a() {
        sij.x(true, "AppDoctorLogger must be set");
        return new oqg(this);
    }
}
