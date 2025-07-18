package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgw {
    public final int a;
    public final String b;

    public bgw(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bgw bgwVar = (bgw) obj;
            if (this.a == bgwVar.a && this.b.equals(bgwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(2, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AudioDeviceAttributes: role:output type:" + this.a + " addr:" + this.b;
    }
}
