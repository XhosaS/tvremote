package defpackage;

import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyc {
    public CronetProvider a;
    public aiad b;

    public final boolean equals(Object obj) {
        return (obj instanceof ahyc) && this.a.equals(((ahyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
