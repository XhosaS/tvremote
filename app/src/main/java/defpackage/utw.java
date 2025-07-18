package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utw implements utx {
    final CharSequence a;

    public utw(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.utx
    public final /* synthetic */ CharSequence a(int i) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof utw) {
            return Objects.equals(this.a, ((utw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
