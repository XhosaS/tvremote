package androidx.compose.ui.platform;

import defpackage.bko;
import defpackage.bzi;
import defpackage.cdo;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends bzi<cdo> {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new cdo(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((cdo) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return yks.e(this.a, ((TestTagElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
