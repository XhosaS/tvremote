package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eat extends eaq {
    public static final String a = edt.Z(1);
    public static final String b = edt.Z(2);
    public final boolean c;
    private final boolean e;

    public eat() {
        this.e = false;
        this.c = false;
    }

    @Override // defpackage.eaq
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, 3);
        bundle.putBoolean(a, this.e);
        bundle.putBoolean(b, this.c);
        return bundle;
    }

    @Override // defpackage.eaq
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eat)) {
            return false;
        }
        eat eatVar = (eat) obj;
        return this.c == eatVar.c && this.e == eatVar.e;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.e), Boolean.valueOf(this.c));
    }

    public eat(boolean z) {
        this.e = true;
        this.c = z;
    }
}
