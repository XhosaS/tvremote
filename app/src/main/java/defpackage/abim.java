package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abim implements Serializable, abxf, abij, abil {
    public static final abim sm = new abim(-1);
    private final int sn;

    public abim(int i) {
        this.sn = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != sm) {
            return this.sn;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.sn);
    }
}
