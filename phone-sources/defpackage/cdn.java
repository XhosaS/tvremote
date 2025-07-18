package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdn implements caa {
    public final int a;
    public Float b = null;
    public Float c = null;
    public cfa d = null;
    public cfa e = null;
    private final List f;

    public cdn(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.caa
    public final boolean v() {
        return this.f.contains(this);
    }
}
