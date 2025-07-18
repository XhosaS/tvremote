package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ury {
    public final String a = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((ury) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(2, 9, this.a);
    }

    public final String toString() {
        return "AudioDeviceAttributes: role:output type:9 addr:".concat(this.a);
    }
}
