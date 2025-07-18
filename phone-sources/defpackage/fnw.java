package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnw {
    public final fsf a;
    public final int b;
    public final int c;
    public final fnv d;
    public final Bundle e;

    public fnw(fsf fsfVar, int i, int i2, fnv fnvVar, Bundle bundle) {
        this.a = fsfVar;
        this.b = i;
        this.c = i2;
        this.d = fnvVar;
        this.e = bundle;
    }

    public final String a() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fnw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        fnw fnwVar = (fnw) obj;
        fnv fnvVar = this.d;
        return (fnvVar == null && fnwVar.d == null) ? this.a.equals(fnwVar.a) : Objects.equals(fnvVar, fnwVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        fsf fsfVar = this.a;
        return "ControllerInfo {pkg=" + fsfVar.b() + ", uid=" + fsfVar.a.c + "}";
    }
}
